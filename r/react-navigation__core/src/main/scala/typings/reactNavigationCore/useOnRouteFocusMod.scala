package typings.reactNavigationCore

import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnRouteFocusMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnRouteFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Action /* <: NavigationAction */](hasRouterGetStateSourceRouteKeySetState: Options[Action]): js.Function1[/* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRouterGetStateSourceRouteKeySetState.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ String, Unit]]
  
  trait Options[Action /* <: NavigationAction */] extends StObject {
    
    def getState(): NavigationState[ParamListBase]
    
    var key: js.UndefOr[String] = js.undefined
    
    var router: Router[NavigationState[ParamListBase], Action]
    
    def setState(state: NavigationState[ParamListBase]): Unit
  }
  object Options {
    
    @scala.inline
    def apply[Action /* <: NavigationAction */](
      getState: () => NavigationState[ParamListBase],
      router: Router[NavigationState[ParamListBase], Action],
      setState: NavigationState[ParamListBase] => Unit
    ): Options[Action] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), router = router.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[Options[Action]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], Action /* <: NavigationAction */] (val x: Self & Options[Action]) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRouter(value: Router[NavigationState[ParamListBase], Action]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetState(value: NavigationState[ParamListBase] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
