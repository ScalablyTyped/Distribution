package typings.reactDashColor.libComponentsSwatchesSwatchesMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwatchesPickerProps extends ColorPickerProps[SwatchesPicker] {
  var colors: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SwatchesPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    colors: js.Array[js.Array[String]] = null,
    height: Int | Double = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: LegacyRef[SwatchesPicker] = null,
    width: Int | Double = null
  ): SwatchesPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchesPickerProps]
  }
}

