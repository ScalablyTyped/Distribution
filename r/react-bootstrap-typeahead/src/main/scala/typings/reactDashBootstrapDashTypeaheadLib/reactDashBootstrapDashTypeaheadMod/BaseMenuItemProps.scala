package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMenuItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.li] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseMenuItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.li] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[BaseMenuItemProps]
  }
}

