package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineContentConfig extends js.Object {
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
    */
  var bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
    */
  var storageClass: js.UndefOr[Input[String]] = js.native
}

object PipelineContentConfig {
  @scala.inline
  def apply(bucket: Input[String] = null, storageClass: Input[String] = null): PipelineContentConfig = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineContentConfig]
  }
}

