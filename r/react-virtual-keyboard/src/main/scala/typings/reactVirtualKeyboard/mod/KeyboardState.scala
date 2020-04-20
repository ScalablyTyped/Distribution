package typings.reactVirtualKeyboard.mod

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
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardState]
  }
}

