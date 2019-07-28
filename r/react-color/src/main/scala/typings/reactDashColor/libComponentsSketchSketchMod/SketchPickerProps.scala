package typings.reactDashColor.libComponentsSketchSketchMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPickerProps extends ColorPickerProps[SketchPicker] {
  var disableAlpha: js.UndefOr[Boolean] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var presetColors: js.UndefOr[js.Array[String]] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object SketchPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    disableAlpha: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    presetColors: js.Array[String] = null,
    ref: LegacyRef[SketchPicker] = null,
    width: String = null
  ): SketchPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAlpha)) __obj.updateDynamic("disableAlpha")(disableAlpha)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (presetColors != null) __obj.updateDynamic("presetColors")(presetColors)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SketchPickerProps]
  }
}

