package typings.relayRuntime.relayModernQueryExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayObservableMod.Sink
import typings.relayRuntime.relayResponseNormalizerMod.GetDataID
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typings.relayRuntime.relayStoreTypesMod.PublishQueue
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteConfig extends js.Object {
  @JSName("getDataID")
  var getDataID_Original: GetDataID = js.native
  var operation: OperationDescriptor = js.native
  var operationLoader: OperationLoader = js.native
  var operationTracker: js.UndefOr[OperationTracker] = js.native
  var optimisticConfig: OptimisticResponseConfig = js.native
  var publishQueue: PublishQueue = js.native
  var scheduler: js.UndefOr[TaskScheduler] = js.native
  var sink: Sink[GraphQLResponse] = js.native
  var source: RelayObservable[GraphQLResponse] = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.native
  def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
}

