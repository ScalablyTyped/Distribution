package typings
package reactDashMdLib.libTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabsProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var activeTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeTabIndex: js.UndefOr[scala.Double] = js.undefined
  var alignToKeyline: js.UndefOr[scala.Boolean] = js.undefined
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabMod.TabProps]]
  ] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultMedia: js.UndefOr[reactDashMdLib.libDrawersDrawerMod.MediaType] = js.undefined
  var defaultTabIndex: js.UndefOr[scala.Double] = js.undefined
  var desktopMinWidth: js.UndefOr[scala.Double] = js.undefined
  var inactiveTabClassName: js.UndefOr[java.lang.String] = js.undefined
  var nextIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
     * @deprecated
     */
  var nextIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var nextIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onTabChange: js.UndefOr[
    js.Function5[
      /* activeTabIndex */ scala.Double, 
      /* tabId */ reactDashMdLib.libMod.IdPropType, 
      /* tabControlsId */ reactDashMdLib.libMod.IdPropType, 
      /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var overflowMenu: js.UndefOr[scala.Boolean] = js.undefined
  var overflowMenuIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
     * @deprecated
     */
  var overflowMenuIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var overflowMenuIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var overflowMenuLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var previousIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
     * @deprecated
     */
  var previousIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var previousIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var tabId: reactDashMdLib.libMod.IdPropType
}

