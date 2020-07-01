package typings.reactColor.twitterMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.anon.PartialClassesTwitterPick
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.reactColor.reactColorStrings.`top-left`
import typings.reactColor.reactColorStrings.`top-right`
import typings.reactColor.reactColorStrings.hide
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterPickerProps extends ColorPickerProps[TwitterPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  @JSName("styles")
  var styles_TwitterPickerProps: js.UndefOr[PartialClassesTwitterPick] = js.undefined
  var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object TwitterPickerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onChangeComplete: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[TwitterPicker]] = js.undefined,
    styles: PartialClassesTwitterPick = null,
    triangle: hide | `top-left` | `top-right` = null,
    width: String = null
  ): TwitterPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction2(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterPickerProps]
  }
}

