package typings.relayDashTestDashUtils.libRelayModernMockEnvironmentMod

import typings.relayDashRuntime.Anon_CacheConfigOperation
import typings.relayDashRuntime.Anon_OperationOptimisticResponse
import typings.relayDashRuntime.Anon_OperationSource
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayDashRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Logger
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdate
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Snapshot
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Store
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
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
    check: NormalizationSelector => Boolean,
    commitPayload: (OperationDescriptor, PayloadData) => Unit,
    commitUpdate: StoreUpdater => Unit,
    execute: Anon_CacheConfigOperation => RelayObservable[GraphQLResponse],
    executeMutation: Anon_OperationOptimisticResponse => RelayObservable[GraphQLResponse],
    executeWithSource: Anon_OperationSource => RelayObservable[GraphQLResponse],
    getLogger: LoggerTransactionConfig => Logger,
    getNetwork: () => Network,
    getOperationTracker: () => RelayOperationTracker,
    getStore: () => Store,
    lookup: SingularReaderSelector => Snapshot,
    mock: MockFunctions,
    mockClear: () => Unit,
    replaceUpdate: (OptimisticUpdate, OptimisticUpdate) => Unit,
    retain: NormalizationSelector => Disposable,
    revertUpdate: OptimisticUpdate => Unit,
    subscribe: (Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable,
    configName: String = null
  ): RelayMockEnvironment = {
    val __obj = js.Dynamic.literal(applyMutation = js.Any.fromFunction1(applyMutation), applyUpdate = js.Any.fromFunction1(applyUpdate), check = js.Any.fromFunction1(check), commitPayload = js.Any.fromFunction2(commitPayload), commitUpdate = js.Any.fromFunction1(commitUpdate), execute = js.Any.fromFunction1(execute), executeMutation = js.Any.fromFunction1(executeMutation), executeWithSource = js.Any.fromFunction1(executeWithSource), getLogger = js.Any.fromFunction1(getLogger), getNetwork = js.Any.fromFunction0(getNetwork), getOperationTracker = js.Any.fromFunction0(getOperationTracker), getStore = js.Any.fromFunction0(getStore), lookup = js.Any.fromFunction1(lookup), mock = mock, mockClear = js.Any.fromFunction0(mockClear), replaceUpdate = js.Any.fromFunction2(replaceUpdate), retain = js.Any.fromFunction1(retain), revertUpdate = js.Any.fromFunction1(revertUpdate), subscribe = js.Any.fromFunction2(subscribe))
    if (configName != null) __obj.updateDynamic("configName")(configName)
    __obj.asInstanceOf[RelayMockEnvironment]
  }
}

