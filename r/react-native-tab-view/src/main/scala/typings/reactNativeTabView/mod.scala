package typings.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativeTabView.anon.Bounces
import typings.reactNativeTabView.anon.GestureHandlerProps
import typings.reactNativeTabView.anon.GetAccessibilityLabel
import typings.reactNativeTabView.anon.PressColor
import typings.reactNativeTabView.anon.SceneRendererPropsroutean
import typings.reactNativeTabView.scrollPagerMod.default
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-tab-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SceneMap")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element]]
  
  @JSImport("react-native-tab-view", "ScrollPager")
  @js.native
  class ScrollPager[T /* <: Route */] () extends default[T]
  /* static members */
  object ScrollPager {
    
    @JSImport("react-native-tab-view", "ScrollPager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view", "ScrollPager.defaultProps")
    @js.native
    def defaultProps: Bounces = js.native
    inline def defaultProps_=(x: Bounces): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-tab-view", "TabBar")
  @js.native
  class TabBar[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarMod.default[T]
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
  class TabBarIndicator[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarIndicatorMod.default[T]
  
  @JSImport("react-native-tab-view", "TabBarItem")
  @js.native
  class TabBarItem[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarItemMod.default[T]
  
  @JSImport("react-native-tab-view", "TabView")
  @js.native
  class TabView[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabViewMod.default[T]
  /* static members */
  object TabView {
    
    @JSImport("react-native-tab-view", "TabView")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view", "TabView.defaultProps")
    @js.native
    def defaultProps: GestureHandlerProps = js.native
    inline def defaultProps_=(x: GestureHandlerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-tab-view", "TouchableItem")
  @js.native
  class TouchableItem ()
    extends typings.reactNativeTabView.touchableItemMod.default
  /* static members */
  object TouchableItem {
    
    @JSImport("react-native-tab-view", "TouchableItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view", "TouchableItem.defaultProps")
    @js.native
    def defaultProps: PressColor = js.native
    inline def defaultProps_=(x: PressColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
