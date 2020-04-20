package typings.reactJsonschemaForm.mod

import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: String
  var disabled: Boolean
  def onClick(e: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent]): Unit
}

object AddButtonProps {
  @scala.inline
  def apply(
    className: String,
    disabled: Boolean,
    onClick: typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AddButtonProps]
  }
}

