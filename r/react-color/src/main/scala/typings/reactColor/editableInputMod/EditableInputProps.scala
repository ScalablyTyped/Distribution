package typings.reactColor.editableInputMod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableInputProps extends ClassAttributes[EditableInput] {
  var color: js.UndefOr[Color] = js.undefined
  var dragLabel: js.UndefOr[String] = js.undefined
  var dragMax: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
  var style: js.UndefOr[EditableInputStyles] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object EditableInputProps {
  @scala.inline
  def apply(
    color: Color = null,
    dragLabel: String = null,
    dragMax: String = null,
    key: Key = null,
    label: String = null,
    onChange: /* color */ ColorResult => Unit = null,
    ref: LegacyRef[EditableInput] = null,
    style: EditableInputStyles = null,
    value: js.Any = null
  ): EditableInputProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dragLabel != null) __obj.updateDynamic("dragLabel")(dragLabel.asInstanceOf[js.Any])
    if (dragMax != null) __obj.updateDynamic("dragMax")(dragMax.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableInputProps]
  }
}

