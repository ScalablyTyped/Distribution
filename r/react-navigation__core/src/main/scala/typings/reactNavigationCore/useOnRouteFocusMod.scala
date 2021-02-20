package typings.reactNavigationCore

import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnRouteFocusMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnRouteFocus", JSImport.Default)
  @js.native
  def default[Action /* <: NavigationAction */](hasRouterGetStateKeySetState: Options[Action]): js.Function1[/* key */ String, Unit] = js.native
  
  @js.native
  trait Options[Action /* <: NavigationAction */] extends StObject {
    
    def getState(): NavigationState[ParamListBase] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var router: Router[NavigationState[ParamListBase], Action] = js.native
    
    def setState(state: NavigationState[ParamListBase]): Unit = js.native
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
    implicit class OptionsMutableBuilder[Self <: Options[_], Action /* <: NavigationAction */] (val x: Self with Options[Action]) extends AnyVal {
      
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
