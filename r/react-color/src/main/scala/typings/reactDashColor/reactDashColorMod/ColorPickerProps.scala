package typings.reactDashColor.reactDashColorMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerProps[A] extends ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
}

object ColorPickerProps {
  @scala.inline
  def apply[A](
    color: Color = null,
    key: Key = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null,
    ref: LegacyRef[A] = null
  ): ColorPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPickerProps[A]]
  }
}

