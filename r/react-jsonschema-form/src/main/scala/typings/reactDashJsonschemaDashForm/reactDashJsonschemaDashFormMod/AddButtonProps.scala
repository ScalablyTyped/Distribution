package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: String
  var disabled: Boolean
  def onClick(e: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit
}

object AddButtonProps {
  @scala.inline
  def apply(
    className: String,
    disabled: Boolean,
    onClick: typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className, disabled = disabled, onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[AddButtonProps]
  }
}

