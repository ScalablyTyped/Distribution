package typings.relayDashRuntime.libMutationsCommitMutationMod

import typings.relayDashRuntime.libStoreRelayModernEnvironmentMod.RelayModernEnvironment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/commitMutation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: RelayModernEnvironment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
}

