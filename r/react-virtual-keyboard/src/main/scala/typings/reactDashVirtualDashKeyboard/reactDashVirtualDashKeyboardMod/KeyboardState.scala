package typings.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardState extends js.Object {
  var className: String
  var value: String
}

object KeyboardState {
  @scala.inline
  def apply(className: String, value: String): KeyboardState = {
    val __obj = js.Dynamic.literal(className = className, value = value)
  
    __obj.asInstanceOf[KeyboardState]
  }
}

