package typings.reactDashColor.reactDashColorMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPickerProps[A] extends ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: ColorChangeHandler
  var pointer: js.UndefOr[ReactNode] = js.undefined
}

object CustomPickerProps {
  @scala.inline
  def apply[A](
    onChange: ColorChangeHandler,
    color: Color = null,
    key: Key = null,
    pointer: ReactNode = null,
    ref: LegacyRef[A] = null
  ): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal(onChange = onChange)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
}

