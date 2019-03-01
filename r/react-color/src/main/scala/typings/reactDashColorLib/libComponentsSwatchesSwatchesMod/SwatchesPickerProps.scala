package typings
package reactDashColorLib.libComponentsSwatchesSwatchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwatchesPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[SwatchesPicker] {
  var colors: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.Color, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SwatchesPickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    colors: js.Array[js.Array[java.lang.String]] = null,
    height: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onSwatchHover: js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.Color, 
      /* event */ reactLib.MouseEvent, 
      scala.Unit
    ] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[SwatchesPicker] = null,
    width: scala.Int | scala.Double = null
  ): SwatchesPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(onSwatchHover)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchesPickerProps]
  }
}

