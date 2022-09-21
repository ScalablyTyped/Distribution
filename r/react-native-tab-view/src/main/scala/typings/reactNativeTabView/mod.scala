package typings.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.anon.GetAccessibilityLabel
import typings.reactNativeTabView.anon.SceneRendererPropsroutean
import typings.reactNativeTabView.tabBarMod.default
import typings.reactNativeTabView.tabViewMod.Props
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-tab-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SceneMap[T /* <: Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SceneMap")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element]]
  
  @JSImport("react-native-tab-view", "TabBar")
  @js.native
  open class TabBar[T /* <: Route */] () extends default[T]
  /* static members */
  object TabBar {
    
    @JSImport("react-native-tab-view", "TabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view", "TabBar.defaultProps")
    @js.native
    def defaultProps: GetAccessibilityLabel = js.native
    inline def defaultProps_=(x: GetAccessibilityLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-tab-view", "TabBarIndicator")
  @js.native
  open class TabBarIndicator[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarIndicatorMod.default[T]
  
  @JSImport("react-native-tab-view", "TabBarItem")
  @js.native
  open class TabBarItem[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarItemMod.default[T]
  
  inline def TabView[T /* <: Route */](
    hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStyleStyleSwipeEnabledTabBarPosition: Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabView")(hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStyleStyleSwipeEnabledTabBarPosition.asInstanceOf[js.Any]).asInstanceOf[Element]
}
