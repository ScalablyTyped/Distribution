package typings
package reactDashColorLib.libComponentsTwitterTwitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterPickerProps
  extends reactDashColorLib.reactDashColorMod.ColorPickerProps[TwitterPicker] {
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onSwatchHover: js.UndefOr[
    js.Function2[
      /* color */ reactDashColorLib.reactDashColorMod.ColorResult, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var triangle: js.UndefOr[
    reactDashColorLib.reactDashColorLibStrings.hide | reactDashColorLib.reactDashColorLibStrings.`top-left` | reactDashColorLib.reactDashColorLibStrings.`top-right`
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object TwitterPickerProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    colors: js.Array[java.lang.String] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onSwatchHover: (/* color */ reactDashColorLib.reactDashColorMod.ColorResult, /* event */ stdLib.MouseEvent) => scala.Unit = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[TwitterPicker] = null,
    triangle: reactDashColorLib.reactDashColorLibStrings.hide | reactDashColorLib.reactDashColorLibStrings.`top-left` | reactDashColorLib.reactDashColorLibStrings.`top-right` = null,
    width: java.lang.String = null
  ): TwitterPickerProps = {
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
    __obj.asInstanceOf[TwitterPickerProps]
  }
}

