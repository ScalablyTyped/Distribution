package typings.reactRelay.anon

import typings.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TSubscription /* <: OperationType */](
    environment: typings.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
}
