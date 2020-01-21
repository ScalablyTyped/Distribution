package typings.reduxForm.fieldMod

import typings.react.mod.ChangeEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
}

