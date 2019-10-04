package typings.reactDashGamepad.reactDashGamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var axis: js.Array[InvertibleAxis | Null]
  var buttonAxis: js.Array[InvertibleAxis | Null]
  var buttons: js.Array[Button | Null]
}

object Layout {
  @scala.inline
  def apply(
    axis: js.Array[InvertibleAxis | Null],
    buttonAxis: js.Array[InvertibleAxis | Null],
    buttons: js.Array[Button | Null]
  ): Layout = {
    val __obj = js.Dynamic.literal(axis = axis, buttonAxis = buttonAxis, buttons = buttons)
  
    __obj.asInstanceOf[Layout]
  }
}

