package typings.atPulumiAws.typesOutputMod.elastictranscoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineContentConfig extends js.Object {
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
    */
  var bucket: String
  /**
    * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
    */
  var storageClass: js.UndefOr[String] = js.undefined
}

object PipelineContentConfig {
  @scala.inline
  def apply(bucket: String, storageClass: String = null): PipelineContentConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[PipelineContentConfig]
  }
}

