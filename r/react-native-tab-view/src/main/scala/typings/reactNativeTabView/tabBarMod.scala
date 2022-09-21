package typings.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Color
import typings.reactNativeTabView.anon.GetAccessibilityLabel
import typings.reactNativeTabView.anon.Key
import typings.reactNativeTabView.typesMod.Event
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import typings.reactNativeTabView.typesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarMod {
  
  @JSImport("react-native-tab-view/lib/typescript/TabBar", JSImport.Default)
  @js.native
  open class default[T /* <: Route */] () extends TabBar[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/TabBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view/lib/typescript/TabBar", "default.defaultProps")
    @js.native
    def defaultProps: GetAccessibilityLabel = js.native
    inline def defaultProps_=(x: GetAccessibilityLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps {
    
    var activeColor: js.UndefOr[String] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
    
    def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
    
    def getLabelText(scene: Scene[T]): js.UndefOr[String]
    
    def getTestID(scene: Scene[T]): js.UndefOr[String]
    
    var inactiveColor: js.UndefOr[String] = js.undefined
    
    var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var navigationState: NavigationState[T]
    
    var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
    
    var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] & Event, Unit]] = js.undefined
    
    var pressColor: js.UndefOr[String] = js.undefined
    
    var pressOpacity: js.UndefOr[Double] = js.undefined
    
    var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
    
    var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] & Color, ReactNode]] = js.undefined
    
    def renderIndicator(props: typings.reactNativeTabView.tabBarIndicatorMod.Props[T]): ReactNode
    
    var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] & Color, ReactNode]] = js.undefined
    
    var renderTabBarItem: js.UndefOr[
        js.Function1[/* props */ typings.reactNativeTabView.tabBarItemMod.Props[T] & Key, ReactElement]
      ] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      getAccessibilityLabel: Scene[T] => js.UndefOr[String],
      getAccessible: Scene[T] => js.UndefOr[Boolean],
      getLabelText: Scene[T] => js.UndefOr[String],
      getTestID: Scene[T] => js.UndefOr[String],
      jumpTo: String => Unit,
      layout: Layout,
      navigationState: NavigationState[T],
      position: AnimatedInterpolation[Double | String],
      renderIndicator: typings.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactNode
    ): Props[T] = {
      val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderIndicator = js.Any.fromFunction1(renderIndicator))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setGetAccessibilityLabel(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetAccessible(value: Scene[T] => js.UndefOr[Boolean]): Self = StObject.set(x, "getAccessible", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetTestID(value: Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
      
      inline def setIndicatorContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorContainerStyleNull: Self = StObject.set(x, "indicatorContainerStyle", null)
      
      inline def setIndicatorContainerStyleUndefined: Self = StObject.set(x, "indicatorContainerStyle", js.undefined)
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOnTabLongPress(value: /* scene */ Scene[T] => Unit): Self = StObject.set(x, "onTabLongPress", js.Any.fromFunction1(value))
      
      inline def setOnTabLongPressUndefined: Self = StObject.set(x, "onTabLongPress", js.undefined)
      
      inline def setOnTabPress(value: /* scene */ Scene[T] & Event => Unit): Self = StObject.set(x, "onTabPress", js.Any.fromFunction1(value))
      
      inline def setOnTabPressUndefined: Self = StObject.set(x, "onTabPress", js.undefined)
      
      inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      inline def setPressColorUndefined: Self = StObject.set(x, "pressColor", js.undefined)
      
      inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
      
      inline def setPressOpacityUndefined: Self = StObject.set(x, "pressOpacity", js.undefined)
      
      inline def setRenderBadge(value: /* scene */ Scene[T] => ReactNode): Self = StObject.set(x, "renderBadge", js.Any.fromFunction1(value))
      
      inline def setRenderBadgeUndefined: Self = StObject.set(x, "renderBadge", js.undefined)
      
      inline def setRenderIcon(value: /* scene */ Scene[T] & Color => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setRenderIndicator(value: typings.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactNode): Self = StObject.set(x, "renderIndicator", js.Any.fromFunction1(value))
      
      inline def setRenderLabel(value: /* scene */ Scene[T] & Color => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setRenderTabBarItem(value: /* props */ typings.reactNativeTabView.tabBarItemMod.Props[T] & Key => ReactElement): Self = StObject.set(x, "renderTabBarItem", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarItemUndefined: Self = StObject.set(x, "renderTabBarItem", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var layout: Layout
    
    var tabWidths: StringDictionary[Double]
  }
  object State {
    
    inline def apply(layout: Layout, tabWidths: StringDictionary[Double]): State = {
      val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], tabWidths = tabWidths.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setTabWidths(value: StringDictionary[Double]): Self = StObject.set(x, "tabWidths", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBar[T /* <: Route */] extends Component[Props[T], State, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabBar(prevProps: Props[T], prevState: State): Unit = js.native
    
    /* private */ var getComputedTabWidth: Any = js.native
    
    /* private */ var getFlattenedTabWidth: Any = js.native
    
    /* private */ var getMaxScrollDistance: Any = js.native
    
    /* private */ var getScrollAmount: Any = js.native
    
    /* private */ var getTabBarWidth: Any = js.native
    
    /* private */ var getTranslateX: Any = js.native
    
    /* private */ var handleLayout: Any = js.native
    
    /* private */ var measuredTabWidths: Any = js.native
    
    /* private */ var normalizeScrollValue: Any = js.native
    
    /* private */ var resetScroll: Any = js.native
    
    /* private */ var scrollAmount: Any = js.native
    
    /* private */ var scrollViewRef: Any = js.native
  }
}
