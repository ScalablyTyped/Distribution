package typings
package reactDashMdLib.libButtonsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libButtonsButtonMod.SharedButtonProps because var conflicts: disabled. Inlined tabIndex, iconBefore, `type`, primary, secondary, href, mini, flat, raised, icon, floating, iconClassName, iconChildren, iconEl, svg, forceIconSize, forceIconFontSize, swapTheming, label */ trait ButtonProps
  extends reactDashMdLib.libInksInjectInkMod.InjectedInkProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var fixedPosition: js.UndefOr[FixedPositions] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconSize: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[scala.Boolean] = js.undefined
  var iconBefore: js.UndefOr[scala.Boolean] = js.undefined
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconEl: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  /**
    * @deprecated
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var svg: js.UndefOr[scala.Boolean] = js.undefined
  var swapTheming: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
}

