package typings.reactColor.photoshopMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.anon.PartialClassesPhotoshopPi
import typings.reactColor.mod.Color
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
  var header: js.UndefOr[String] = js.undefined
  var onAccept: js.UndefOr[ColorChangeHandler] = js.undefined
  var onCancel: js.UndefOr[ColorChangeHandler] = js.undefined
  @JSName("styles")
  var styles_PhotoshopPickerProps: js.UndefOr[PartialClassesPhotoshopPi] = js.undefined
}

object PhotoshopPickerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: Color = null,
    header: String = null,
    key: Key = null,
    onAccept: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onCancel: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onChangeComplete: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[PhotoshopPicker]] = js.undefined,
    styles: PartialClassesPhotoshopPi = null
  ): PhotoshopPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction2(onAccept))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction2(onChangeComplete))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerProps]
  }
}

