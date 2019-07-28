package typings.atReachCombobox.atReachComboboxMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxListProps extends HTMLProps[HTMLElement] {
  var persistSelection: js.UndefOr[Boolean] = js.undefined
}

object ComboboxListProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLElement] = null,
    as: String = null,
    persistSelection: js.UndefOr[Boolean] = js.undefined
  ): ComboboxListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    __obj.asInstanceOf[ComboboxListProps]
  }
}

