package typings.reactNativeScrollableTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RenderTabProperties = js.Function5[
    /* name */ java.lang.String, 
    /* pageIndex */ scala.Double, 
    /* isTabActive */ scala.Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], 
    /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ typings.reactNative.mod.LayoutChangeEvent, scala.Unit]], 
    typings.react.mod._Global_.JSX.Element
  ]
  type TabBarProps[T] = T with typings.reactNativeScrollableTabView.AnonActiveTab
  type TabProps[T] = T with typings.reactNativeScrollableTabView.AnonTabLabel
}
