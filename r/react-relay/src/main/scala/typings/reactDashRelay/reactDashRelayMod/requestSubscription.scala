package typings.reactDashRelay.reactDashRelayMod

import typings.relayDashRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "requestSubscription")
@js.native
object requestSubscription extends js.Object {
  def apply[TSubscriptionPayload](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

