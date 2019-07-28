package typings.reduxDashForm.libFieldMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldInputProps extends CommonFieldInputProps {
  var checked: js.UndefOr[Boolean] = js.undefined
  var onBlur: EventOrValueHandler[FocusEvent[_]]
  var onChange: EventOrValueHandler[ChangeEvent[_]]
  var value: js.Any
}

object WrappedFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: EventOrValueHandler[FocusEvent[_]],
    onChange: EventOrValueHandler[ChangeEvent[_]],
    onDragStart: EventHandler[DragEvent[_]],
    onDrop: EventHandler[DragEvent[_]],
    onFocus: EventHandler[FocusEvent[_]],
    value: js.Any,
    checked: js.UndefOr[Boolean] = js.undefined
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus, value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
}

