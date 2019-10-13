package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxListProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var persistSelection: js.UndefOr[Boolean] = js.undefined
}

object ComboboxListProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    as: String = null,
    persistSelection: js.UndefOr[Boolean] = js.undefined
  ): ComboboxListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    __obj.asInstanceOf[ComboboxListProps]
  }
}

