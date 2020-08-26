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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ScrollPager[T /* <: Route */] () extends default[T]
  
  @js.native
  class TabBar[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarMod.default[T]
  
  @js.native
  class TabBarIndicator[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarIndicatorMod.TabBarIndicator[T]
  
  @js.native
  class TabBarItem[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabBarItemMod.TabBarItem[T]
  
  @js.native
  class TabView[T /* <: Route */] ()
    extends typings.reactNativeTabView.tabViewMod.default[T]
  
  @js.native
  class TouchableItem ()
    extends typings.reactNativeTabView.touchableItemMod.default
  
  def SceneMap[T /* <: js.Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneRendererPropsroutean, Element] = js.native
  /* static members */
  @js.native
  object ScrollPager extends js.Object {
    var defaultProps: Bounces = js.native
  }
  
  /* static members */
  @js.native
  object TabBar extends js.Object {
    var defaultProps: GetAccessibilityLabel = js.native
  }
  
  /* static members */
  @js.native
  object TabView extends js.Object {
    var defaultProps: GestureHandlerProps = js.native
  }
  
  /* static members */
  @js.native
  object TouchableItem extends js.Object {
    var defaultProps: PressColor = js.native
  }
  
}

