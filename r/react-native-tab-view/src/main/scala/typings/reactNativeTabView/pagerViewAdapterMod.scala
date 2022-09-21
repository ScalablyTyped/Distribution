package typings.reactNativeTabView

import typings.react.mod.ReactElement
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePagerView.typesMod.Orientation
import typings.reactNativePagerView.typesMod.OverScrollMode
import typings.reactNativeTabView.anon.EventEmitterPropsposition
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.locale
import typings.reactNativeTabView.reactNativeTabViewStrings.ltr
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.reactNativeTabViewStrings.rtl
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerViewAdapterMod {
  
  @JSImport("react-native-tab-view/lib/typescript/PagerViewAdapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleRest: Props[T]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasKeyboardDismissModeSwipeEnabledNavigationStateOnIndexChangeOnSwipeStartOnSwipeEndChildrenStyleRest.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/types.PagerProps & {onIndexChange (index : number): void,   navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/types.NavigationState<T>, children (props : react-native-tab-view.react-native-tab-view/lib/typescript/types.EventEmitterProps & {  position :react-native.react-native.Animated.AnimatedInterpolation<number | string>, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void}): react.react.ReactElement} */
  trait Props[T /* <: Route */] extends StObject {
    
    def children(props: EventEmitterPropsposition): ReactElement
    
    var keyboardDismissMode: js.UndefOr[none | `on-drag` | auto] = js.undefined
    
    var layoutDirection: js.UndefOr[rtl | ltr | locale] = js.undefined
    
    var navigationState: NavigationState[T]
    
    var offscreenPageLimit: js.UndefOr[Double] = js.undefined
    
    def onIndexChange(index: Double): Unit
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var overScrollMode: js.UndefOr[OverScrollMode] = js.undefined
    
    var overdrag: js.UndefOr[Boolean] = js.undefined
    
    var pageMargin: js.UndefOr[Double] = js.undefined
    
    var showPageIndicator: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var swipeEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      children: EventEmitterPropsposition => ReactElement,
      navigationState: NavigationState[T],
      onIndexChange: Double => Unit
    ): Props[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setChildren(value: EventEmitterPropsposition => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setLayoutDirection(value: rtl | ltr | locale): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimit(value: Double): Self = StObject.set(x, "offscreenPageLimit", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimitUndefined: Self = StObject.set(x, "offscreenPageLimit", js.undefined)
      
      inline def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnSwipeEnd(value: () => Unit): Self = StObject.set(x, "onSwipeEnd", js.Any.fromFunction0(value))
      
      inline def setOnSwipeEndUndefined: Self = StObject.set(x, "onSwipeEnd", js.undefined)
      
      inline def setOnSwipeStart(value: () => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction0(value))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverScrollMode(value: OverScrollMode): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setOverdrag(value: Boolean): Self = StObject.set(x, "overdrag", value.asInstanceOf[js.Any])
      
      inline def setOverdragUndefined: Self = StObject.set(x, "overdrag", js.undefined)
      
      inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      inline def setShowPageIndicator(value: Boolean): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
      
      inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
    }
  }
}
