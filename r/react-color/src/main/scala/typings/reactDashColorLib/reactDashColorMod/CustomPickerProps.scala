package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPickerProps[A]
  extends reactLib.reactMod.ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: ColorChangeHandler
  var pointer: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object CustomPickerProps {
  @scala.inline
  def apply[A](
    onChange: ColorChangeHandler,
    color: Color = null,
    key: reactLib.reactMod.Key = null,
    pointer: reactLib.reactMod.ReactNode = null,
    ref: reactLib.reactMod.LegacyRef[A] = null
  ): CustomPickerProps[A] = {
    val __obj = js.Dynamic.literal(onChange = onChange)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPickerProps[A]]
  }
}

