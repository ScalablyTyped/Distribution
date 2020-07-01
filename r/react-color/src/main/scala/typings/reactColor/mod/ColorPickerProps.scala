package typings.reactColor.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.reactColor.anon.PartialClassesany
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerProps[A] extends ClassAttributes[A] {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
  var styles: js.UndefOr[PartialClassesany] = js.undefined
}

object ColorPickerProps {
  @scala.inline
  def apply[A](
    className: String = null,
    color: Color = null,
    key: Key = null,
    onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onChangeComplete: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[A]] = js.undefined,
    styles: PartialClassesany = null
  ): ColorPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction2(onChangeComplete))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPickerProps[A]]
  }
}

