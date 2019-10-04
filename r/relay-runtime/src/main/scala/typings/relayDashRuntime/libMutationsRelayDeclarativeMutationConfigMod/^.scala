package typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod

import typings.relayDashRuntime.Anon_OptimisticUpdater
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(configs: js.Array[DeclarativeMutationConfig], request: ConcreteRequest): Anon_OptimisticUpdater = js.native
  def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object]
  ): Anon_OptimisticUpdater = js.native
  def convert(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object],
    updater: SelectorStoreUpdater[js.Object]
  ): Anon_OptimisticUpdater = js.native
}

