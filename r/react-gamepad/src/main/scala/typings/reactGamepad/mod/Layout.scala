package typings.reactGamepad.mod

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
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

