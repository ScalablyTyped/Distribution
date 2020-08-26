package typings.pusherChatkitClient.messageMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is used when uploading a file.
@js.native
trait FilePayload extends SendMessagePayload {
  var customData: js.UndefOr[js.Any] = js.native
   // Optional if it can be inferred from the file
  var file: Blob = js.native
   // Optional if it can be inferred from the file
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object FilePayload {
  @scala.inline
  def apply(file: Blob): FilePayload = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePayload]
  }
  @scala.inline
  implicit class FilePayloadOps[Self <: FilePayload] (val x: Self) extends AnyVal {
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
    def setFile(value: Blob): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

