package typings.reactDashRelay.reactDashRelayMod

import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationConfig
import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "commitMutation")
@js.native
object commitMutation extends js.Object {
  def apply[TOperation /* <: MutationParameters */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}

