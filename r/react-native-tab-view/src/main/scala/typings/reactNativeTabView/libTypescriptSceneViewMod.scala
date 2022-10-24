package typings.reactNativeTabView

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Loading
import typings.reactNativeTabView.libTypescriptTypesMod.EventEmitterProps
import typings.reactNativeTabView.libTypescriptTypesMod.Layout
import typings.reactNativeTabView.libTypescriptTypesMod.Listener
import typings.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typings.reactNativeTabView.libTypescriptTypesMod.Route
import typings.reactNativeTabView.libTypescriptTypesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSceneViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](param0: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps
       with EventEmitterProps {
    
    def children(props: Loading): ReactNode
    
    var index: Double
    
    var `lazy`: Boolean
    
    var lazyPreloadDistance: Double
    
    var navigationState: NavigationState[T]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      addEnterListener: Listener => js.Function0[Unit],
      children: Loading => ReactNode,
      index: Double,
      jumpTo: String => Unit,
      layout: Layout,
      `lazy`: Boolean,
      lazyPreloadDistance: Double,
      navigationState: NavigationState[T],
      position: AnimatedInterpolation[Double | String]
    ): Props[T] = {
      val __obj = js.Dynamic.literal(addEnterListener = js.Any.fromFunction1(addEnterListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setChildren(value: Loading => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
