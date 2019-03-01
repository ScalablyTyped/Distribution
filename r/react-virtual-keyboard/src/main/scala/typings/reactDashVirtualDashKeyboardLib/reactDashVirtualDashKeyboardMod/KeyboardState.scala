package typings
package reactDashVirtualDashKeyboardLib.reactDashVirtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardState extends js.Object {
  var className: java.lang.String
  var value: java.lang.String
}

object KeyboardState {
  @scala.inline
  def apply(className: java.lang.String, value: java.lang.String): KeyboardState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[KeyboardState]
  }
}

