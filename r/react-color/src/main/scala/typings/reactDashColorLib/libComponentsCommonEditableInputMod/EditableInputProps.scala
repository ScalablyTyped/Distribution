package typings
package reactDashColorLib.libComponentsCommonEditableInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableInputProps
  extends reactLib.reactMod.ClassAttributes[EditableInput] {
  var color: js.UndefOr[reactDashColorLib.reactDashColorMod.Color] = js.undefined
  var dragLabel: js.UndefOr[java.lang.String] = js.undefined
  var dragMax: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[reactDashColorLib.reactDashColorMod.ColorChangeHandler] = js.undefined
  var style: js.UndefOr[EditableInputStyles] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object EditableInputProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    dragLabel: java.lang.String = null,
    dragMax: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    label: java.lang.String = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    ref: reactLib.reactMod.LegacyRef[EditableInput] = null,
    style: EditableInputStyles = null,
    value: js.Any = null
  ): EditableInputProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dragLabel != null) __obj.updateDynamic("dragLabel")(dragLabel)
    if (dragMax != null) __obj.updateDynamic("dragMax")(dragMax)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditableInputProps]
  }
}

