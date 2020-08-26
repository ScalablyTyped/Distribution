package typings.reactEmailEditor.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfo extends js.Object {
  val accepted: js.Array[File] = js.native
  val attachments: js.Array[File] = js.native
}

object FileInfo {
  @scala.inline
  def apply(accepted: js.Array[File], attachments: js.Array[File]): FileInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  implicit class FileInfoOps[Self <: FileInfo] (val x: Self) extends AnyVal {
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
    def setAcceptedVarargs(value: File*): Self = this.set("accepted", js.Array(value :_*))
    @scala.inline
    def setAccepted(value: js.Array[File]): Self = this.set("accepted", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentsVarargs(value: File*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[File]): Self = this.set("attachments", value.asInstanceOf[js.Any])
  }
  
}

