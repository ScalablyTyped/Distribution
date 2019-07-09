package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var className: java.lang.String
  var disabled: scala.Boolean
  def onClick(e: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent]): scala.Unit
}

object AddButtonProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    disabled: scala.Boolean,
    onClick: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className, disabled = disabled, onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[AddButtonProps]
  }
}

