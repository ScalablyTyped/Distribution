package typings.relayDashRuntime.libMutationsCommitMutationMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/commitMutation", "commitMutation")
@js.native
object commitMutation extends js.Object {
  def apply[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}

