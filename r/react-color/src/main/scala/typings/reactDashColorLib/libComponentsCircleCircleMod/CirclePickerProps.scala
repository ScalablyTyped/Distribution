package typings
package reactDashColorLib.libComponentsCircleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclePickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[CirclePicker] {
  var circleSize: js.UndefOr[scala.Double] = js.undefined
  var circleSpacing: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* colorResult */ reactDashColorLib.reactDashColorMod.ColorResult, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object CirclePickerProps {
  @scala.inline
  def apply(
    circleSize: scala.Int | scala.Double = null,
    circleSpacing: scala.Int | scala.Double = null,
    color: reactDashColorLib.reactDashColorMod.Color = null,
    colors: js.Array[java.lang.String] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onSwatchHover: (/* colorResult */ reactDashColorLib.reactDashColorMod.ColorResult, /* event */ stdLib.MouseEvent) => scala.Unit = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[CirclePicker] = null,
    width: java.lang.String = null
  ): CirclePickerProps = {
    val __obj = js.Dynamic.literal()
    if (circleSize != null) __obj.updateDynamic("circleSize")(circleSize.asInstanceOf[js.Any])
    if (circleSpacing != null) __obj.updateDynamic("circleSpacing")(circleSpacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CirclePickerProps]
  }
}

