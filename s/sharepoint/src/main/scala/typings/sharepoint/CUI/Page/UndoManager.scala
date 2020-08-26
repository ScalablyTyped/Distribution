package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends ICommandHandler

object UndoManager {
  @scala.inline
  def apply(canHandleCommand: String => Boolean, handleCommand: (String, js.Any, Double) => Boolean): UndoManager = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
    __obj.asInstanceOf[UndoManager]
  }
}

