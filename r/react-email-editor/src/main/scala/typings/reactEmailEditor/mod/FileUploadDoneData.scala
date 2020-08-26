package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadDoneData extends js.Object {
  val progress: Double = js.native
  val url: js.UndefOr[String] = js.native
}

object FileUploadDoneData {
  @scala.inline
  def apply(progress: Double): FileUploadDoneData = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadDoneData]
  }
  @scala.inline
  implicit class FileUploadDoneDataOps[Self <: FileUploadDoneData] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

