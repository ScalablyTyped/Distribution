package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTabsProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with RippleComponent {
  var activeTab: js.UndefOr[scala.Double] = js.undefined
  @JSName("onChange")
  var onChange_HeaderTabsProps: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[Header]] = js.undefined
}

object HeaderTabsProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    RippleComponent: RippleComponent = null,
    activeTab: scala.Int | scala.Double = null,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[Header] = null
  ): HeaderTabsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[HeaderTabsProps]
  }
}

