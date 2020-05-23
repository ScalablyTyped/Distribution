package typings.reactColor.githubMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.reactColor.reactColorStrings.`top-left`
import typings.reactColor.reactColorStrings.`top-right`
import typings.reactColor.reactColorStrings.hide
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubPickerProps extends ColorPickerProps[GithubPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
  var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object GithubPickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    colors: js.Array[String] = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    onSwatchHover: (/* color */ ColorResult, /* event */ MouseEvent) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[GithubPicker]] = js.undefined,
    triangle: hide | `top-left` | `top-right` = null,
    width: String = null
  ): GithubPickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onSwatchHover != null) __obj.updateDynamic("onSwatchHover")(js.Any.fromFunction2(onSwatchHover))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubPickerProps]
  }
}

