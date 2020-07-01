package typings.reactColor.alphaMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.anon.PartialClassesAlphaPicker
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaPickerProps extends ColorPickerProps[AlphaPicker] {
  var height: js.UndefOr[String] = js.undefined
  @JSName("styles")
  var styles_AlphaPickerProps: js.UndefOr[PartialClassesAlphaPicker] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object AlphaPickerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: Color = null,
    height: String = null,
    key: Key = null,
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onChangeComplete: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[AlphaPicker]] = js.undefined,
    styles: PartialClassesAlphaPicker = null,
    width: String = null
  ): AlphaPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction2(onChangeComplete))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaPickerProps]
  }
}

