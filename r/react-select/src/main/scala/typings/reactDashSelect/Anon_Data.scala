package typings.reactDashSelect

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.reactDashSelect.srcTypesMod.MouseEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var id: Double
  var index: Double
  var isDisabled: Boolean
  var isFocused: Boolean
  var isSelected: Boolean
  var label: String
  var onClick: MouseEventHandler
  var onMouseOver: MouseEventHandler
  var value: js.Any
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Any,
    id: Double,
    index: Double,
    isDisabled: Boolean,
    isFocused: Boolean,
    isSelected: Boolean,
    label: String,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    onMouseOver: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    value: js.Any
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id, index = index, isDisabled = isDisabled, isFocused = isFocused, isSelected = isSelected, label = label, onClick = js.Any.fromFunction1(onClick), onMouseOver = js.Any.fromFunction1(onMouseOver), value = value)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

