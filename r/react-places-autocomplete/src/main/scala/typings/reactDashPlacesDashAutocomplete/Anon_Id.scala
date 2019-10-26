package typings.reactDashPlacesDashAutocomplete

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TouchEventHandler
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.option
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var key: Double
  var onClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseEnter: MouseEventHandler[Element]
  var onMouseLeave: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var role: option
}

object Anon_Id {
  @scala.inline
  def apply(
    key: Double,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseEnter: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseLeave: MouseEvent[Element, NativeMouseEvent] => Unit,
    onMouseUp: MouseEvent[Element, NativeMouseEvent] => Unit,
    onTouchEnd: TouchEvent[Element] => Unit,
    onTouchStart: TouchEvent[Element] => Unit,
    role: option,
    id: String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(key = key, onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), role = role)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Id]
  }
}

