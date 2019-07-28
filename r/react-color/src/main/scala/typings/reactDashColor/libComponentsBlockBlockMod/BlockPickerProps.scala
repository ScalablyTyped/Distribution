package typings.reactDashColor.libComponentsBlockBlockMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.reactDashColor.reactDashColorStrings.hide
import typings.reactDashColor.reactDashColorStrings.top
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPickerProps extends ColorPickerProps[BlockPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var triangle: js.UndefOr[hide | top] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object BlockPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: LegacyRef[BlockPicker] = null,
    triangle: hide | top = null,
    width: String = null
  ): BlockPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BlockPickerProps]
  }
}

