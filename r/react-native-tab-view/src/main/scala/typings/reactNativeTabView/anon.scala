package typings.reactNativeTabView

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNativeTabView.tabBarIndicatorMod.Props
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.Listener
import typings.reactNativeTabView.typesMod.Scene
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
  
  trait Focused[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
    
    var color: String
    
    var focused: Boolean
    
    var route: T
  }
  object Focused {
    
    inline def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](color: String, focused: Boolean, route: T): Focused[T] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused[T]]
    }
    
    extension [Self <: Focused[?], T /* <: typings.reactNativeTabView.typesMod.Route */](x: Self & Focused[T]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessibilityLabel extends StObject {
    
    def getAccessibilityLabel(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
    
    def getAccessible(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): Boolean
    
    def getLabelText(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
    
    def getTestID(hasRoute: Scene[typings.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
    
    def renderIndicator(props: Props[typings.reactNativeTabView.typesMod.Route]): Element
  }
  object GetAccessibilityLabel {
    
    inline def apply(
      getAccessibilityLabel: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
      getAccessible: Scene[typings.reactNativeTabView.typesMod.Route] => Boolean,
      getLabelText: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
      getTestID: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
      renderIndicator: Props[typings.reactNativeTabView.typesMod.Route] => Element
    ): GetAccessibilityLabel = {
      val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
      __obj.asInstanceOf[GetAccessibilityLabel]
    }
    
    extension [Self <: GetAccessibilityLabel](x: Self) {
      
      inline def setGetAccessibilityLabel(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetAccessible(value: Scene[typings.reactNativeTabView.typesMod.Route] => Boolean): Self = StObject.set(x, "getAccessible", js.Any.fromFunction1(value))
      
      inline def setGetLabelText(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetTestID(value: Scene[typings.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setRenderIndicator(value: Props[typings.reactNativeTabView.typesMod.Route] => Element): Self = StObject.set(x, "renderIndicator", js.Any.fromFunction1(value))
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
  
  trait NavigationState[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
    
    var navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]
  }
  object NavigationState {
    
    inline def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]): NavigationState[T] = {
      val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState[T]]
    }
    
    extension [Self <: NavigationState[?], T /* <: typings.reactNativeTabView.typesMod.Route */](x: Self & NavigationState[T]) {
      
      inline def setNavigationState(value: typings.reactNativeTabView.typesMod.NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
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
  
  trait Route[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
    
    var route: T
  }
  object Route {
    
    inline def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](route: T): Route[T] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route[T]]
    }
    
    extension [Self <: Route[?], T /* <: typings.reactNativeTabView.typesMod.Route */](x: Self & Route[T]) {
      
      inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/types.SceneRendererProps & {  route :any} */
  trait SceneRendererPropsroutean extends StObject {
    
    def jumpTo(key: String): Unit
    
    var layout: Layout
    
    var position: AnimatedInterpolation[Double | String]
    
    var route: Any
  }
  object SceneRendererPropsroutean {
    
    inline def apply(
      jumpTo: String => Unit,
      layout: Layout,
      position: AnimatedInterpolation[Double | String],
      route: Any
    ): SceneRendererPropsroutean = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneRendererPropsroutean]
    }
    
    extension [Self <: SceneRendererPropsroutean](x: Self) {
      
      inline def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
