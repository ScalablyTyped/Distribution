package typings.relayTestUtils.relayModernMockEnvironmentMod

import typings.relayRuntime.AnonCacheConfig
import typings.relayRuntime.AnonKey
import typings.relayRuntime.AnonOperation
import typings.relayRuntime.relayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayOperationTrackerMod.RelayOperationTracker
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.Logger
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdate
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import typings.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import typings.relayRuntime.relayStoreTypesMod.Snapshot
import typings.relayRuntime.relayStoreTypesMod.Store
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayMockEnvironment
  extends MockEnvironment
     with Environment {
  var configName: js.UndefOr[String | Null] = js.undefined
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit
  def revertUpdate(update: OptimisticUpdate): Unit
}

object RelayMockEnvironment {
  @scala.inline
  def apply(
    applyMutation: OptimisticResponseConfig => Disposable,
    applyUpdate: OptimisticUpdateFunction => Disposable,
    check: OperationDescriptor => Boolean,
    commitPayload: (OperationDescriptor, PayloadData) => Unit,
    commitUpdate: StoreUpdater => Unit,
    execute: AnonCacheConfig => RelayObservable[GraphQLResponse],
    executeMutation: AnonKey => RelayObservable[GraphQLResponse],
    executeWithSource: AnonOperation => RelayObservable[GraphQLResponse],
    getLogger: LoggerTransactionConfig => js.UndefOr[Logger | Null],
    getNetwork: () => Network,
    getOperationTracker: () => RelayOperationTracker,
    getStore: () => Store,
    lookup: SingularReaderSelector => Snapshot,
    mock: MockFunctions,
    mockClear: () => Unit,
    replaceUpdate: (OptimisticUpdate, OptimisticUpdate) => Unit,
    retain: OperationDescriptor => Disposable,
    revertUpdate: OptimisticUpdate => Unit,
    subscribe: (Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable,
    configName: String = null
  ): RelayMockEnvironment = {
    val __obj = js.Dynamic.literal(applyMutation = js.Any.fromFunction1(applyMutation), applyUpdate = js.Any.fromFunction1(applyUpdate), check = js.Any.fromFunction1(check), commitPayload = js.Any.fromFunction2(commitPayload), commitUpdate = js.Any.fromFunction1(commitUpdate), execute = js.Any.fromFunction1(execute), executeMutation = js.Any.fromFunction1(executeMutation), executeWithSource = js.Any.fromFunction1(executeWithSource), getLogger = js.Any.fromFunction1(getLogger), getNetwork = js.Any.fromFunction0(getNetwork), getOperationTracker = js.Any.fromFunction0(getOperationTracker), getStore = js.Any.fromFunction0(getStore), lookup = js.Any.fromFunction1(lookup), mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear), replaceUpdate = js.Any.fromFunction2(replaceUpdate), retain = js.Any.fromFunction1(retain), revertUpdate = js.Any.fromFunction1(revertUpdate), subscribe = js.Any.fromFunction2(subscribe))
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayMockEnvironment]
  }
}

