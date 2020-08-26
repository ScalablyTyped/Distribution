package typings.reactFileUtils.mod

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUpload extends UploadInfo {
  var file: Blob | File = js.native
  var previewUri: js.UndefOr[String] = js.native
}

object ImageUpload {
  @scala.inline
  def apply(file: Blob | File, id: String, state: UploadState): ImageUpload = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUpload]
  }
  @scala.inline
  implicit class ImageUploadOps[Self <: ImageUpload] (val x: Self) extends AnyVal {
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
    def setFile(value: Blob | File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewUri(value: String): Self = this.set("previewUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewUri: Self = this.set("previewUri", js.undefined)
  }
  
}

