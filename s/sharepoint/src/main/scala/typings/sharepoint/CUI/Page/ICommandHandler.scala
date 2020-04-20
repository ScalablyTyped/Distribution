package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandHandler extends js.Object {
  def canHandleCommand(commandId: String): Boolean
  def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean
}

object ICommandHandler {
  @scala.inline
  def apply(canHandleCommand: String => Boolean, handleCommand: (String, js.Any, Double) => Boolean): ICommandHandler = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
    __obj.asInstanceOf[ICommandHandler]
  }
}

