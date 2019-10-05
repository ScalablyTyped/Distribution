package typings.reactDashColor.libComponentsCircleCircleMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclePickerProps extends ColorPickerProps[CirclePicker] {
  var circleSize: js.UndefOr[Double] = js.undefined
  var circleSpacing: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object CirclePickerProps {
  @scala.inline
  def apply(
    circleSize: Int | Double = null,
    circleSpacing: Int | Double = null,
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: LegacyRef[CirclePicker] = null,
    width: String = null
  ): CirclePickerProps = {
    val __obj = js.Dynamic.literal()
    if (circleSize != null) __obj.updateDynamic("circleSize")(circleSize.asInstanceOf[js.Any])
    if (circleSpacing != null) __obj.updateDynamic("circleSpacing")(circleSpacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CirclePickerProps]
  }
}

