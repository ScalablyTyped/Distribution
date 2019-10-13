package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxOptionProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  @JSName("value")
  var value_ComboboxOptionProps: String
}

object ComboboxOptionProps {
  @scala.inline
  def apply(
    value: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    children: ReactNode = null
  ): ComboboxOptionProps = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxOptionProps]
  }
}

