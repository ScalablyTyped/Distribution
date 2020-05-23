package typings.reactSelect.typesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/types.PropsWithInnerRef & {  data  :any,   id  :number,   index  :number,   isDisabled  :boolean,   isFocused  :boolean,   isSelected  :boolean,   label  :string,   onClick  :react-select.react-select/src/types.MouseEventHandler,   onMouseOver  :react-select.react-select/src/types.MouseEventHandler,   value  :any} */
trait OptionProps extends js.Object {
  var data: js.Any
  var id: Double
  var index: Double
  /** The inner reference. */
  var innerRef: Ref[_]
  var isDisabled: Boolean
  var isFocused: Boolean
  var isSelected: Boolean
  var label: String
  var onClick: MouseEventHandler
  var onMouseOver: MouseEventHandler
  var value: js.Any
}

object OptionProps {
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
    value: js.Any,
    innerRef: Ref[_] = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseOver = js.Any.fromFunction1(onMouseOver), value = value.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps]
  }
}

