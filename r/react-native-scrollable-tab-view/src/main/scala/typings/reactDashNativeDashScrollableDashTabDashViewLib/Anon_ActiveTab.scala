package typings
package reactDashNativeDashScrollableDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTab extends js.Object {
  var activeTab: js.UndefOr[scala.Double] = js.undefined
  var containerWidth: js.UndefOr[scala.Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ scala.Double, scala.Unit]] = js.undefined
  var scrollValue: js.UndefOr[reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value] = js.undefined
  var tabs: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
}

object Anon_ActiveTab {
  @scala.inline
  def apply(
    activeTab: scala.Int | scala.Double = null,
    containerWidth: scala.Int | scala.Double = null,
    goToPage: js.Function1[/* pageNumber */ scala.Double, scala.Unit] = null,
    scrollValue: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = null,
    tabs: js.Array[reactLib.reactMod.Global.JSXNs.Element] = null
  ): Anon_ActiveTab = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(goToPage)
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    __obj.asInstanceOf[Anon_ActiveTab]
  }
}

