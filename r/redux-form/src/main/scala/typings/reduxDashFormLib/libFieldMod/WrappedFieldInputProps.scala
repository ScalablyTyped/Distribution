package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldInputProps extends CommonFieldInputProps {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var onBlur: EventOrValueHandler[reactLib.reactMod.FocusEvent[_]]
  var onChange: EventOrValueHandler[reactLib.reactMod.ChangeEvent[_]]
  var value: js.Any
}

object WrappedFieldInputProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    onBlur: EventOrValueHandler[reactLib.reactMod.FocusEvent[_]],
    onChange: EventOrValueHandler[reactLib.reactMod.ChangeEvent[_]],
    onDragStart: EventHandler[reactLib.reactMod.DragEvent[_]],
    onDrop: EventHandler[reactLib.reactMod.DragEvent[_]],
    onFocus: EventHandler[reactLib.reactMod.FocusEvent[_]],
    value: js.Any,
    checked: js.UndefOr[scala.Boolean] = js.undefined
  ): WrappedFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus, value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[WrappedFieldInputProps]
  }
}

