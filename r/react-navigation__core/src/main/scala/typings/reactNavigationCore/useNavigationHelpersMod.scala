package typings.reactNavigationCore

import typings.reactNavigationCore.anon.DangerouslyGetParent
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.reactNavigationCore.typesMod.EventEmitter
import typings.reactNavigationCore.typesMod.PrivateValueStore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationHelpersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, Action /* <: NavigationAction */, EventMap /* <: Record[String, js.Any] */](hasOnActionGetStateEmitterRouter: Options[State, Action]): DangerouslyGetParent & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[js.Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Any]) & ActionHelpers = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnActionGetStateEmitterRouter.asInstanceOf[js.Any]).asInstanceOf[DangerouslyGetParent & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[js.Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Any]) & ActionHelpers]
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends StObject {
    
    var emitter: NavigationEventEmitter[js.Any] = js.native
    
    def getState(): State = js.native
    
    def onAction(action: NavigationAction): Boolean = js.native
    def onAction(action: NavigationAction, visitedNavigators: Set[String]): Boolean = js.native
    
    var router: Router[State, Action] = js.native
  }
}
