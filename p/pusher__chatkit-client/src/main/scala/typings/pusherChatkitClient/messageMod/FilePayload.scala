package typings.pusherChatkitClient.messageMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is used when uploading a file.
trait FilePayload extends SendMessagePayload {
  var customData: js.UndefOr[js.Any] = js.undefined
   // Optional if it can be inferred from the file
  var file: Blob
   // Optional if it can be inferred from the file
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object FilePayload {
  @scala.inline
  def apply(file: Blob, customData: js.Any = null, name: String = null, `type`: String = null): FilePayload = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePayload]
  }
}

