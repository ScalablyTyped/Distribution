package typings
package reactDashColorLib.libComponentsSketchSketchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[SketchPicker] {
  var disableAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.ColorResult, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var presetColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SketchPickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    disableAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onSwatchHover: (/* color */ reactDashColorLib.reactDashColorMod.ColorResult, /* event */ stdLib.MouseEvent) => scala.Unit = null,
    presetColors: js.Array[java.lang.String] = null,
    ref: reactLib.reactMod.LegacyRef[SketchPicker] = null,
    width: java.lang.String = null
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

