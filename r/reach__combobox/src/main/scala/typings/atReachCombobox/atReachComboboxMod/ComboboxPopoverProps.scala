package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxPopoverProps extends HTMLProps[HTMLElement] {
  var portal: js.UndefOr[Boolean] = js.undefined
}

object ComboboxPopoverProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HTMLElement] = null, portal: js.UndefOr[Boolean] = js.undefined): ComboboxPopoverProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    __obj.asInstanceOf[ComboboxPopoverProps]
  }
}

