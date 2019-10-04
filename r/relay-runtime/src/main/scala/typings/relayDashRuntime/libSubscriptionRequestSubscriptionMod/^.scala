package typings.relayDashRuntime.libSubscriptionRequestSubscriptionMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/subscription/requestSubscription", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def requestSubscription[TSubscriptionPayload](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

