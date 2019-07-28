package typings.reactDashNativeDashScrollableDashTabDashView

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNativeDashScrollableDashTabDashView.Anon_ActiveTab
import typings.reactDashNativeDashScrollableDashTabDashView.Anon_TabLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashScrollableDashTabDashViewMod {
  type RenderTabProperties = js.Function5[
    /* name */ String, 
    /* pageIndex */ Double, 
    /* isTabActive */ Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], 
    /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]], 
    Element
  ]
  type TabBarProps[T] = T with Anon_ActiveTab
  type TabProps[T] = T with Anon_TabLabel
}
