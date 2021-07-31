package typings.reactNativeTabView

import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Event extends StObject {
    
    var defaultPrevented: Boolean
    
    def preventDefault(): Unit
  }
  object Event {
    
    @scala.inline
    def apply(defaultPrevented: Boolean, preventDefault: () => Unit): Event = {
      val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait EventEmitterProps extends StObject {
    
    @JSName("addListener")
    def addListener_enter(`type`: enter, listener: Listener): Unit
    
    @JSName("removeListener")
    def removeListener_enter(`type`: enter, listener: Listener): Unit
  }
  object EventEmitterProps {
    
    @scala.inline
    def apply(addListener: (enter, Listener) => Unit, removeListener: (enter, Listener) => Unit): EventEmitterProps = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[EventEmitterProps]
    }
    
    @scala.inline
    implicit class EventEmitterPropsMutableBuilder[Self <: EventEmitterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (enter, Listener) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(value: (enter, Listener) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  trait Layout extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Layout {
    
    @scala.inline
    def apply(height: Double, width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = js.Function1[/* value */ Double, Unit]
  
  trait NavigationState[T /* <: Route */] extends StObject {
    
    var index: Double
    
    var routes: js.Array[T]
  }
  object NavigationState {
    
    @scala.inline
    def apply[T /* <: Route */](index: Double, routes: js.Array[T]): NavigationState[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[T]]
    }
    
    @scala.inline
    implicit class NavigationStateMutableBuilder[Self <: NavigationState[?], T /* <: Route */] (val x: Self & NavigationState[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[T]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: T*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  trait PagerCommonProps extends StObject {
    
    var keyboardDismissMode: none | `on-drag` | auto
    
    var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var springConfig: Damping
    
    var springVelocityScale: js.UndefOr[Double] = js.undefined
    
    var swipeEnabled: Boolean
    
    var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
    
    var timingConfig: Duration
  }
  object PagerCommonProps {
    
    @scala.inline
    def apply(
      keyboardDismissMode: none | `on-drag` | auto,
      springConfig: Damping,
      swipeEnabled: Boolean,
      timingConfig: Duration
    ): PagerCommonProps = {
      val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerCommonProps]
    }
    
    @scala.inline
    implicit class PagerCommonPropsMutableBuilder[Self <: PagerCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSwipeEnd(value: () => Unit): Self = StObject.set(x, "onSwipeEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeEndUndefined: Self = StObject.set(x, "onSwipeEnd", js.undefined)
      
      @scala.inline
      def setOnSwipeStart(value: () => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      @scala.inline
      def setSpringConfig(value: Damping): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringVelocityScale(value: Double): Self = StObject.set(x, "springVelocityScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringVelocityScaleUndefined: Self = StObject.set(x, "springVelocityScale", js.undefined)
      
      @scala.inline
      def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeVelocityImpact(value: Double): Self = StObject.set(x, "swipeVelocityImpact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeVelocityImpactUndefined: Self = StObject.set(x, "swipeVelocityImpact", js.undefined)
      
      @scala.inline
      def setTimingConfig(value: Duration): Self = StObject.set(x, "timingConfig", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(key: String): Route = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Scene[T /* <: Route */] extends StObject {
    
    var route: T
  }
  object Scene {
    
    @scala.inline
    def apply[T /* <: Route */](route: T): Scene[T] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene[T]]
    }
    
    @scala.inline
    implicit class SceneMutableBuilder[Self <: Scene[?], T /* <: Route */] (val x: Self & Scene[T]) extends AnyVal {
      
      @scala.inline
      def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait SceneRendererProps extends StObject {
    
    def jumpTo(key: String): Unit
    
    var layout: Layout
    
    var position: Node
  }
  object SceneRendererProps {
    
    @scala.inline
    def apply(jumpTo: String => Unit, layout: Layout, position: Node): SceneRendererProps = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneRendererProps]
    }
    
    @scala.inline
    implicit class SceneRendererPropsMutableBuilder[Self <: SceneRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Node): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
