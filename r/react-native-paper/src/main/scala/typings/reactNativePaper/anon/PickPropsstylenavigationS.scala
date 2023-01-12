package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.NavigationState
import typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.TouchableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation.Props, 'style' | 'navigationState' | 'renderScene' | 'renderIcon' | 'renderLabel' | 'renderTouchable' | 'getLabelText' | 'getBadge' | 'getColor' | 'getAccessibilityLabel' | 'getTestID' | 'activeColor' | 'inactiveColor' | 'keyboardHidesNavigationBar' | 'barStyle' | 'labeled' | 'sceneAnimationEnabled' | 'onTabPress' | 'onIndexChange' | 'shifting' | 'safeAreaInsets' | 'labelMaxFontSizeMultiplier'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropsstylenavigationS extends StObject {
  
  var activeColor: js.UndefOr[String] = js.undefined
  
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var getAccessibilityLabel: js.UndefOr[js.Function1[/* props */ Route, js.UndefOr[String]]] = js.undefined
  
  var getBadge: js.UndefOr[js.Function1[/* props */ Route, js.UndefOr[Boolean | Double | String]]] = js.undefined
  
  var getColor: js.UndefOr[js.Function1[/* props */ Route, js.UndefOr[String]]] = js.undefined
  
  var getLabelText: js.UndefOr[js.Function1[/* props */ Route, js.UndefOr[String]]] = js.undefined
  
  var getTestID: js.UndefOr[js.Function1[/* props */ Route, js.UndefOr[String]]] = js.undefined
  
  var inactiveColor: js.UndefOr[String] = js.undefined
  
  var keyboardHidesNavigationBar: js.UndefOr[Boolean] = js.undefined
  
  var labelMaxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  
  var labeled: js.UndefOr[Boolean] = js.undefined
  
  var navigationState: NavigationState
  
  var onIndexChange: js.Function1[/* index */ Double, Unit]
  
  var onTabPress: js.UndefOr[js.Function1[/* props */ routeRouteTabPressEvent, Unit]] = js.undefined
  
  var renderIcon: js.UndefOr[js.Function1[/* props */ Focused, ReactNode]] = js.undefined
  
  var renderLabel: js.UndefOr[js.Function1[/* props */ Focused, ReactNode]] = js.undefined
  
  var renderScene: js.Function1[/* props */ JumpTo, ReactNode | Null]
  
  var renderTouchable: js.UndefOr[js.Function1[/* props */ TouchableProps, ReactNode]] = js.undefined
  
  var safeAreaInsets: js.UndefOr[Bottom] = js.undefined
  
  var sceneAnimationEnabled: js.UndefOr[Boolean] = js.undefined
  
  var shifting: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
}
object PickPropsstylenavigationS {
  
  inline def apply(
    navigationState: NavigationState,
    onIndexChange: /* index */ Double => Unit,
    renderScene: /* props */ JumpTo => ReactNode | Null
  ): PickPropsstylenavigationS = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderScene = js.Any.fromFunction1(renderScene))
    __obj.asInstanceOf[PickPropsstylenavigationS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPropsstylenavigationS] (val x: Self) extends AnyVal {
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setGetAccessibilityLabel(value: /* props */ Route => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
    
    inline def setGetAccessibilityLabelUndefined: Self = StObject.set(x, "getAccessibilityLabel", js.undefined)
    
    inline def setGetBadge(value: /* props */ Route => js.UndefOr[Boolean | Double | String]): Self = StObject.set(x, "getBadge", js.Any.fromFunction1(value))
    
    inline def setGetBadgeUndefined: Self = StObject.set(x, "getBadge", js.undefined)
    
    inline def setGetColor(value: /* props */ Route => js.UndefOr[String]): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    inline def setGetLabelText(value: /* props */ Route => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
    
    inline def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
    
    inline def setGetTestID(value: /* props */ Route => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
    
    inline def setGetTestIDUndefined: Self = StObject.set(x, "getTestID", js.undefined)
    
    inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
    
    inline def setKeyboardHidesNavigationBar(value: Boolean): Self = StObject.set(x, "keyboardHidesNavigationBar", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHidesNavigationBarUndefined: Self = StObject.set(x, "keyboardHidesNavigationBar", js.undefined)
    
    inline def setLabelMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "labelMaxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setLabelMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "labelMaxFontSizeMultiplier", js.undefined)
    
    inline def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
    
    inline def setLabeledUndefined: Self = StObject.set(x, "labeled", js.undefined)
    
    inline def setNavigationState(value: NavigationState): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
    
    inline def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
    
    inline def setOnTabPress(value: /* props */ routeRouteTabPressEvent => Unit): Self = StObject.set(x, "onTabPress", js.Any.fromFunction1(value))
    
    inline def setOnTabPressUndefined: Self = StObject.set(x, "onTabPress", js.undefined)
    
    inline def setRenderIcon(value: /* props */ Focused => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
    
    inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    
    inline def setRenderLabel(value: /* props */ Focused => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
    
    inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
    
    inline def setRenderScene(value: /* props */ JumpTo => ReactNode | Null): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
    
    inline def setRenderTouchable(value: /* props */ TouchableProps => ReactNode): Self = StObject.set(x, "renderTouchable", js.Any.fromFunction1(value))
    
    inline def setRenderTouchableUndefined: Self = StObject.set(x, "renderTouchable", js.undefined)
    
    inline def setSafeAreaInsets(value: Bottom): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    
    inline def setSafeAreaInsetsUndefined: Self = StObject.set(x, "safeAreaInsets", js.undefined)
    
    inline def setSceneAnimationEnabled(value: Boolean): Self = StObject.set(x, "sceneAnimationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSceneAnimationEnabledUndefined: Self = StObject.set(x, "sceneAnimationEnabled", js.undefined)
    
    inline def setShifting(value: Boolean): Self = StObject.set(x, "shifting", value.asInstanceOf[js.Any])
    
    inline def setShiftingUndefined: Self = StObject.set(x, "shifting", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
