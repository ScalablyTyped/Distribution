package typings.reactNavigationCore

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOnRouteFocusMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnRouteFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Action /* <: NavigationAction */](hasRouterGetStateSourceRouteKeySetState: Options[Action]): js.Function1[/* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRouterGetStateSourceRouteKeySetState.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ String, Unit]]
  
  trait Options[Action /* <: NavigationAction */] extends StObject {
    
    def getState(): NavigationState[ParamListBase]
    
    var key: js.UndefOr[String] = js.undefined
    
    var router: Router[NavigationState[ParamListBase], Action]
    
    def setState(state: NavigationState[ParamListBase]): Unit
  }
  object Options {
    
    inline def apply[Action /* <: NavigationAction */](
      getState: () => NavigationState[ParamListBase],
      router: Router[NavigationState[ParamListBase], Action],
      setState: NavigationState[ParamListBase] => Unit
    ): Options[Action] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), router = router.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[Options[Action]]
    }
    
    extension [Self <: Options[?], Action /* <: NavigationAction */](x: Self & Options[Action]) {
      
      inline def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRouter(value: Router[NavigationState[ParamListBase], Action]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setSetState(value: NavigationState[ParamListBase] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
