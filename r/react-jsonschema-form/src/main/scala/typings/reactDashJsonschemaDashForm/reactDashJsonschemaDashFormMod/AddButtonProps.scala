package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: String
  var disabled: Boolean
  def onClick(e: MouseEvent[HTMLButtonElement, typings.std.MouseEvent]): Unit
}

object AddButtonProps {
  @scala.inline
  def apply(
    className: String,
    disabled: Boolean,
    onClick: MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className, disabled = disabled, onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[AddButtonProps]
  }
}

