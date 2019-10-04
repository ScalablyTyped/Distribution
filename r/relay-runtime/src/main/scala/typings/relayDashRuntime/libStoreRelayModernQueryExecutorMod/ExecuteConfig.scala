package typings.relayDashRuntime.libStoreRelayModernQueryExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayDashRuntime.libNetworkRelayObservableMod.Sink
import typings.relayDashRuntime.libStoreRelayResponseNormalizerMod.GetDataID
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationTracker
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.PublishQueue
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
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

