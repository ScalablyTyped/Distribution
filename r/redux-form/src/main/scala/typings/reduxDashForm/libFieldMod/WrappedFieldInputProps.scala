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
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit,
    value: js.Any,
    checked: js.UndefOr[Boolean] = js.undefined
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus), value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
}

