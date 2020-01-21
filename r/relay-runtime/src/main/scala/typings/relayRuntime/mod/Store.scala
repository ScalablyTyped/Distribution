package typings.relayRuntime.mod

import typings.relayRuntime.relayModernStoreMod.RelayModernStore
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.Scheduler
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

