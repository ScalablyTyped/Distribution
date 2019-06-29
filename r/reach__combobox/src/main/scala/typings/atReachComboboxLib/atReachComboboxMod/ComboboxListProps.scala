package typings
package atReachComboboxLib.atReachComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxListProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLElement] {
  var persistSelection: js.UndefOr[scala.Boolean] = js.undefined
}

object ComboboxListProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLElement] = null,
    as: java.lang.String = null,
    persistSelection: js.UndefOr[scala.Boolean] = js.undefined
  ): ComboboxListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    __obj.asInstanceOf[ComboboxListProps]
  }
}

