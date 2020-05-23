package typings.reactColor.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
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
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    ref: js.UndefOr[Null | LegacyRef[A]] = js.undefined
  ): ColorPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPickerProps[A]]
  }
}

