package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandDispatcher extends js.Object {
  def executeCommand(commandId: String, properties: js.Any): js.Any
}

object CommandDispatcher {
  @scala.inline
  def apply(executeCommand: (String, js.Any) => js.Any): CommandDispatcher = {
    val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
    __obj.asInstanceOf[CommandDispatcher]
  }
}

