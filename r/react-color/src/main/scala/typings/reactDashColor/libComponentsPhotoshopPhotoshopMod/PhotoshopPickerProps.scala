package typings.reactDashColor.libComponentsPhotoshopPhotoshopMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[String] = js.undefined
  var onAccept: js.UndefOr[ColorChangeHandler] = js.undefined
  var onCancel: js.UndefOr[ColorChangeHandler] = js.undefined
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    header: String = null,
    key: Key = null,
    onAccept: /* color */ ColorResult => Unit = null,
    onCancel: /* color */ ColorResult => Unit = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    ref: LegacyRef[PhotoshopPicker] = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

