package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  val accepted: js.Array[File]
  val attachments: js.Array[File]
}

object FileInfo {
  @scala.inline
  def apply(accepted: js.Array[File], attachments: js.Array[File]): FileInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted, attachments = attachments)
  
    __obj.asInstanceOf[FileInfo]
  }
}

