package typings
package atReachComboboxLib.atReachComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxPopoverProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  var portal: js.UndefOr[scala.Boolean] = js.undefined
}

object ComboboxPopoverProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined
  ): ComboboxPopoverProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    __obj.asInstanceOf[ComboboxPopoverProps]
  }
}

