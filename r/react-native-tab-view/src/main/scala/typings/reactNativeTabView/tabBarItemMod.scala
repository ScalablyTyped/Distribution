package typings.reactNativeTabView

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Focused
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarItemMod {
  
  @JSImport("react-native-tab-view/lib/typescript/TabBarItem", JSImport.Default)
  @js.native
  open class default[T /* <: Route */] () extends TabBarItem[T]
  
  trait Props[T /* <: Route */] extends StObject {
    
    var activeColor: js.UndefOr[String] = js.undefined
    
    def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
    
    def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
    
    def getLabelText(scene: Scene[T]): js.UndefOr[String]
    
    def getTestID(scene: Scene[T]): js.UndefOr[String]
    
    var inactiveColor: js.UndefOr[String] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var navigationState: NavigationState[T]
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    def onLongPress(): Unit
    
    def onPress(): Unit
    
    var position: AnimatedInterpolation[Double | String]
    
    var pressColor: js.UndefOr[String] = js.undefined
    
    var pressOpacity: js.UndefOr[Double] = js.undefined
    
    var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
    
    var renderIcon: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.undefined
    
    var route: T
    
    var style: StyleProp[ViewStyle]
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      getAccessibilityLabel: Scene[T] => js.UndefOr[String],
      getAccessible: Scene[T] => js.UndefOr[Boolean],
      getLabelText: Scene[T] => js.UndefOr[String],
      getTestID: Scene[T] => js.UndefOr[String],
      navigationState: NavigationState[T],
      onLongPress: () => Unit,
      onPress: () => Unit,
      position: AnimatedInterpolation[Double | String],
      route: T
    ): Props[T] = {
      val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      inline def setGetAccessibilityLabel(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetAccessible(value: Scene[T] => js.UndefOr[Boolean]): Self = StObject.set(x, "getAccessible", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetTestID(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      inline def setPressColorUndefined: Self = StObject.set(x, "pressColor", js.undefined)
      
      inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
      
      inline def setPressOpacityUndefined: Self = StObject.set(x, "pressOpacity", js.undefined)
      
      inline def setRenderBadge(value: /* scene */ Scene[T] => ReactNode): Self = StObject.set(x, "renderBadge", js.Any.fromFunction1(value))
      
      inline def setRenderBadgeUndefined: Self = StObject.set(x, "renderBadge", js.undefined)
      
      inline def setRenderIcon(value: /* scene */ Focused[T] => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setRenderLabel(value: /* scene */ Focused[T] => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TabBarItem[T /* <: Route */]
    extends Component[Props[T], js.Object, Any] {
    
    /* private */ var getActiveOpacity: Any = js.native
    
    /* private */ var getInactiveOpacity: Any = js.native
  }
}
