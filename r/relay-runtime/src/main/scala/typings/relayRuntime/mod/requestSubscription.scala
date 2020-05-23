package typings.relayRuntime.mod

import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "requestSubscription")
@js.native
object requestSubscription extends js.Object {
  def apply[TSubscription /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
}

