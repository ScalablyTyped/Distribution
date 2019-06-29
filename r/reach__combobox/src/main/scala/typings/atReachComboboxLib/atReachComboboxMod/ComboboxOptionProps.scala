package typings
package atReachComboboxLib.atReachComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxOptionProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  @JSName("value")
  var value_ComboboxOptionProps: java.lang.String
}

object ComboboxOptionProps {
  @scala.inline
  def apply(
    value: java.lang.String,
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    children: reactLib.reactMod.ReactNode = null
  ): ComboboxOptionProps = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxOptionProps]
  }
}

