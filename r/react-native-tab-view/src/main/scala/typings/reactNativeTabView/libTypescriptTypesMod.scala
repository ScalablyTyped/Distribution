package typings.reactNativeTabView

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePagerView.libTypescriptTypesMod.Orientation
import typings.reactNativePagerView.libTypescriptTypesMod.OverScrollMode
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.locale
import typings.reactNativeTabView.reactNativeTabViewStrings.ltr
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.reactNativeTabViewStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypesMod {
  
  trait Event extends StObject {
    
    var defaultPrevented: Boolean
    
    def preventDefault(): Unit
  }
  object Event {
    
    inline def apply(defaultPrevented: Boolean, preventDefault: () => Unit): Event = {
      val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait EventEmitterProps extends StObject {
    
    def addEnterListener(listener: Listener): js.Function0[Unit]
  }
  object EventEmitterProps {
    
    inline def apply(addEnterListener: Listener => js.Function0[Unit]): EventEmitterProps = {
      val __obj = js.Dynamic.literal(addEnterListener = js.Any.fromFunction1(addEnterListener))
      __obj.asInstanceOf[EventEmitterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventEmitterProps] (val x: Self) extends AnyVal {
      
      inline def setAddEnterListener(value: Listener => js.Function0[Unit]): Self = StObject.set(x, "addEnterListener", js.Any.fromFunction1(value))
    }
  }
  
  trait Layout extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Layout {
    
    inline def apply(height: Double, width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = js.Function1[/* value */ Double, Unit]
  
  trait NavigationState[T /* <: Route */] extends StObject {
    
    var index: Double
    
    var routes: js.Array[T]
  }
  object NavigationState {
    
    inline def apply[T /* <: Route */](index: Double, routes: js.Array[T]): NavigationState[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationState[?], T /* <: Route */] (val x: Self & NavigationState[T]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[T]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: T*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<react-native-pager-view.react-native-pager-view.PagerViewProps, 'initialPage' | 'scrollEnabled' | 'onPageScroll' | 'onPageSelected' | 'onPageScrollStateChanged' | 'keyboardDismissMode' | 'children'> & {  keyboardDismissMode :'none' | 'on-drag' | 'auto' | undefined,   swipeEnabled :boolean | undefined,   animationEnabled :boolean | undefined,   onSwipeStart :(): void | undefined,   onSwipeEnd :(): void | undefined} */
  trait PagerProps extends StObject {
    
    var animationEnabled: js.UndefOr[Boolean] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[none | `on-drag` | auto] = js.undefined
    
    var layoutDirection: js.UndefOr[rtl | ltr | locale] = js.undefined
    
    var offscreenPageLimit: js.UndefOr[Double] = js.undefined
    
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
  object PagerProps {
    
    inline def apply(): PagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagerProps] (val x: Self) extends AnyVal {
      
      inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
      
      inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setLayoutDirection(value: rtl | ltr | locale): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setOffscreenPageLimit(value: Double): Self = StObject.set(x, "offscreenPageLimit", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimitUndefined: Self = StObject.set(x, "offscreenPageLimit", js.undefined)
      
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
  
  trait Route extends StObject {
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Route {
    
    inline def apply(key: String): Route = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Scene[T /* <: Route */] extends StObject {
    
    var route: T
  }
  object Scene {
    
    inline def apply[T /* <: Route */](route: T): Scene[T] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scene[?], T /* <: Route */] (val x: Self & Scene[T]) extends AnyVal {
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneRendererProps extends StObject {
    
    def jumpTo(key: String): Unit
    
    var layout: Layout
    
    var position: AnimatedInterpolation[Double | String]
  }
  object SceneRendererProps {
    
    inline def apply(jumpTo: String => Unit, layout: Layout, position: AnimatedInterpolation[Double | String]): SceneRendererProps = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneRendererProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SceneRendererProps] (val x: Self) extends AnyVal {
      
      inline def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
