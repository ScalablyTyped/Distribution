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
  def apply(): PipelineContentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContentConfig]
  }
  @scala.inline
  implicit class PipelineContentConfigOps[Self <: PipelineContentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setStorageClass(value: Input[String]): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
  }
  
}

