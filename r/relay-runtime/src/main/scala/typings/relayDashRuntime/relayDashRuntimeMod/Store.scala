package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libStoreRelayModernStoreMod.RelayModernStore
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, gcScheduler: Scheduler) = this()
  def this(source: MutableRecordSource, gcScheduler: Scheduler, operationLoader: OperationLoader) = this()
}

