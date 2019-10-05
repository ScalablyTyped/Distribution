package typings.atPulumiAws.typesInputMod.elastictranscoder

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineThumbnailConfig extends js.Object {
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
    */
  var bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
    */
  var storageClass: js.UndefOr[Input[String]] = js.undefined
}

object PipelineThumbnailConfig {
  @scala.inline
  def apply(bucket: Input[String] = null, storageClass: Input[String] = null): PipelineThumbnailConfig = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineThumbnailConfig]
  }
}

