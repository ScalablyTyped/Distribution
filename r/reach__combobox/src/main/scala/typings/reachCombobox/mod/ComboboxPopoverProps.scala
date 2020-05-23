package typings.reachCombobox.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxPopoverProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var portal: js.UndefOr[Boolean] = js.undefined
}

object ComboboxPopoverProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    portal: js.UndefOr[Boolean] = js.undefined
  ): ComboboxPopoverProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxPopoverProps]
  }
}

