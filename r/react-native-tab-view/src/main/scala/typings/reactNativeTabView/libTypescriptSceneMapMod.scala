package typings.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSceneMapMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* param0 */ SceneProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ SceneProps, Element]]
  
  /* Inlined {  route :any} & std.Omit<react-native-tab-view.react-native-tab-view/lib/typescript/types.SceneRendererProps, 'layout'> */
  trait SceneProps extends StObject {
    
    var jumpTo: js.Function1[/* key */ String, Unit]
    
    var position: AnimatedInterpolation[Double | String]
    
    var route: Any
  }
  object SceneProps {
    
    inline def apply(jumpTo: /* key */ String => Unit, position: AnimatedInterpolation[Double | String], route: Any): SceneProps = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SceneProps] (val x: Self) extends AnyVal {
      
      inline def setJumpTo(value: /* key */ String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      inline def setPosition(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
