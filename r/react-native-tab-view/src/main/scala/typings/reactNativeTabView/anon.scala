package typings.reactNativeTabView

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNativeTabView.libTypescriptTypesMod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    var color: String
    
    var focused: Boolean
  }
  object Color {
    
    inline def apply(color: String, focused: Boolean): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/types.EventEmitterProps & {  position :react-native.react-native.Animated.AnimatedInterpolation<number | string>, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
  trait EventEmitterPropsposition extends StObject {
    
    def addEnterListener(listener: Listener): js.Function0[Unit]
    
    def jumpTo(key: String): Unit
    
    var position: AnimatedInterpolation[Double | String]
    
    def render(children: ReactNode): ReactNode
  }
  object EventEmitterPropsposition {
    
    inline def apply(
      addEnterListener: Listener => js.Function0[Unit],
      jumpTo: String => Unit,
      position: AnimatedInterpolation[Double | String],
      render: ReactNode => ReactNode
    ): EventEmitterPropsposition = {
      val __obj = js.Dynamic.literal(addEnterListener = js.Any.fromFunction1(addEnterListener), jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[EventEmitterPropsposition]
    }
    
    extension [Self <: EventEmitterPropsposition](x: Self) {
      
      inline def setAddEnterListener(value: Listener => js.Function0[Unit]): Self = StObject.set(x, "addEnterListener", js.Any.fromFunction1(value))
      
      inline def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRender(value: ReactNode => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  trait Focused[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */] extends StObject {
    
    var color: String
    
    var focused: Boolean
    
    var route: T
  }
  object Focused {
    
    inline def apply[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](color: String, focused: Boolean, route: T): Focused[T] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused[T]]
    }
    
    extension [Self <: Focused[?], T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](x: Self & Focused[T]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Loading extends StObject {
    
    var loading: Boolean
  }
  object Loading {
    
    inline def apply(loading: Boolean): Loading = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loading]
    }
    
    extension [Self <: Loading](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationState[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */] extends StObject {
    
    var navigationState: typings.reactNativeTabView.libTypescriptTypesMod.NavigationState[T]
  }
  object NavigationState {
    
    inline def apply[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](navigationState: typings.reactNativeTabView.libTypescriptTypesMod.NavigationState[T]): NavigationState[T] = {
      val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[T]]
    }
    
    extension [Self <: NavigationState[?], T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](x: Self & NavigationState[T]) {
      
      inline def setNavigationState(value: typings.reactNativeTabView.libTypescriptTypesMod.NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-native-tab-view.react-native-tab-view/lib/typescript/types.Layout> */
  trait PartialLayout extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialLayout {
    
    inline def apply(): PartialLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLayout]
    }
    
    extension [Self <: PartialLayout](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Route[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */] extends StObject {
    
    var route: T
  }
  object Route {
    
    inline def apply[T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](route: T): Route[T] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route[T]]
    }
    
    extension [Self <: Route[?], T /* <: typings.reactNativeTabView.libTypescriptTypesMod.Route */](x: Self & Route[T]) {
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
