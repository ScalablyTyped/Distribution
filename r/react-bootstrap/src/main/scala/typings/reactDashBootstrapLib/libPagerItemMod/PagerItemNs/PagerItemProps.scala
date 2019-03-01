package typings
package reactDashBootstrapLib.libPagerItemMod.PagerItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPagerItemMod.PagerItem] {
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var next: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_PagerItemProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var previous: js.UndefOr[scala.Boolean] = js.undefined
}

object PagerItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPagerItemMod.PagerItem] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    next: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    previous: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
  ): PagerItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PagerItemProps]
  }
}

