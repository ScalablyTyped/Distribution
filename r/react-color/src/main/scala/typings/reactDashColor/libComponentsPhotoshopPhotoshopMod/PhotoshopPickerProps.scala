package typings.reactDashColor.libComponentsPhotoshopPhotoshopMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
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
    onAccept: ColorChangeHandler = null,
    onCancel: ColorChangeHandler = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null,
    ref: LegacyRef[PhotoshopPicker] = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(onAccept)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

