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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useNavigationHelpers", JSImport.Namespace)
@js.native
object useNavigationHelpersMod extends js.Object {
  
  def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, Action /* <: NavigationAction */, EventMap /* <: Record[String, _] */](hasOnActionGetStateEmitterRouter: Options[State, Action]): DangerouslyGetParent with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) with EventEmitter[EventMap] with EventConsumer[_] with (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, _]) with ActionHelpers = js.native
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends js.Object {
    
    var emitter: NavigationEventEmitter[_] = js.native
    
    def getState(): State = js.native
    
    def onAction(action: NavigationAction): Boolean = js.native
    def onAction(action: NavigationAction, visitedNavigators: Set[String]): Boolean = js.native
    
    var router: Router[State, Action] = js.native
  }
}
