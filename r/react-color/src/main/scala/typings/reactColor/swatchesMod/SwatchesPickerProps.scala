package typings.reactColor.swatchesMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
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
    height: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[SwatchesPicker]] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SwatchesPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwatchesPickerProps]
  }
}

