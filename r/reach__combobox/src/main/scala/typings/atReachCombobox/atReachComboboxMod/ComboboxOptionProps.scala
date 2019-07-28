package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxOptionProps extends HTMLProps[HTMLElement] {
  @JSName("value")
  var value_ComboboxOptionProps: String
}

object ComboboxOptionProps {
  @scala.inline
  def apply(value: String, HTMLProps: HTMLProps[HTMLElement] = null, children: ReactNode = null): ComboboxOptionProps = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxOptionProps]
  }
}

