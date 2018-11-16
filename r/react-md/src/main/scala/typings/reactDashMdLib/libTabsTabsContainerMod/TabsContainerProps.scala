package typings
package reactDashMdLib.libTabsTabsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabsContainerProps
  extends reactDashMdLib.libMod.Props
     with // for the `component` prop until refactored out
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var activeTabIndex: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[reactDashMdLib.libTabsTabsMod.TabsProps]] = js.undefined
  var colored: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var defaultTabIndex: js.UndefOr[scala.Double] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  var headerComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var headerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var headerZDepth: js.UndefOr[scala.Double] = js.undefined
  var labelAndIcon: js.UndefOr[scala.Boolean] = js.undefined
  var onTabChange: js.UndefOr[
    js.Function5[
      /* activeTabIndex */ scala.Double, 
      /* tabId */ reactDashMdLib.libMod.IdPropType, 
      /* tabControlsId */ scala.Double | java.lang.String, 
      /* tabChildren */ reactLib.reactMod.ReactNs.ReactNode, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
  var panelComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var panelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var slideClassName: js.UndefOr[java.lang.String] = js.undefined
  var slideStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var swipeableViewsClassName: js.UndefOr[java.lang.String] = js.undefined
  var swipeableViewsProps: js.UndefOr[js.Object] = js.undefined
  var swipeableViewsStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

