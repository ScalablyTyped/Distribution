package typings.reactNavigationCore

import typings.reactNavigationCore.anon.GetState
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventEmitter
import typings.reactNavigationCore.libTypescriptSrcTypesMod.PrivateValueStore
import typings.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseNavigationHelpersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, Action /* <: NavigationAction */, EventMap /* <: Record[String, Any] */](hasNavigatorIdOnActionGetStateEmitterRouter: Options[State, Action]): GetState & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNavigatorIdOnActionGetStateEmitterRouter.asInstanceOf[js.Any]).asInstanceOf[GetState & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends StObject {
    
    var emitter: NavigationEventEmitter[Any]
    
    def getState(): State
    
    var id: js.UndefOr[String] = js.undefined
    
    def onAction(action: NavigationAction): Boolean
    
    var router: Router[State, Action]
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */](
      emitter: NavigationEventEmitter[Any],
      getState: () => State,
      onAction: NavigationAction => Boolean,
      router: Router[State, Action]
    ): Options[State, Action] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState), onAction = js.Any.fromFunction1(onAction), router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, Action]]
    }
    
    extension [Self <: Options[?, ?], State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */](x: Self & (Options[State, Action])) {
      
      inline def setEmitter(value: NavigationEventEmitter[Any]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnAction(value: NavigationAction => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      inline def setRouter(value: Router[State, Action]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
