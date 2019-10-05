package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.Anon_CacheConfig
import typings.relayDashRuntime.Anon_Key
import typings.relayDashRuntime.Anon_Operation
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayDashRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * Apply an optimistic mutation response and/or updater. The mutation can be
    * reverted by calling `dispose()` on the returned value.
    */
  def applyMutation(optimisticConfig: OptimisticResponseConfig): Disposable
  /**
    * Apply an optimistic update to the environment. The mutation can be reverted
    * by calling `dispose()` on the returned value.
    */
  def applyUpdate(optimisticUpdate: OptimisticUpdateFunction): Disposable
  /**
    * Determine if the selector can be resolved with data in the store (i.e. no
    * fields are missing).
    *
    * Note that this operation effectively "executes" the selector against the
    * cache and therefore takes time proportional to the size/complexity of the
    * selector.
    */
  def check(selector: NormalizationSelector): Boolean
  /**
    * Commit a payload to the environment using the given operation selector.
    */
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): Unit
  /**
    * Commit an updater to the environment. This mutation cannot be reverted and
    * should therefore not be used for optimistic updates. This is mainly
    * intended for updating fields from client schema extensions.
    */
  def commitUpdate(updater: StoreUpdater): Unit
  /**
    * Send a query to the server with Observer semantics: one or more
    * responses may be returned (via `next`) over time followed by either
    * the request completing (`completed`) or an error (`error`).
    *
    * Networks/servers that support subscriptions may choose to hold the
    * subscription open indefinitely such that `complete` is not called.
    *
    * Note: Observables are lazy, so calling this method will do nothing until
    * the result is subscribed to: environment.execute({...}).subscribe({...}).
    */
  def execute(config: Anon_CacheConfig): RelayObservable[GraphQLResponse]
  /**
    * Returns an Observable of GraphQLResponse resulting from executing the
    * provided Mutation operation, the result of which is then normalized and
    * committed to the publish queue along with an optional optimistic response
    * or updater.
    *
    * Note: Observables are lazy, so calling this method will do nothing until
    * the result is subscribed to:
    * environment.executeMutation({...}).subscribe({...}).
    */
  def executeMutation(hasOperationOptimisticUpdaterOptimisticResponseUpdaterUploadables: Anon_Key): RelayObservable[GraphQLResponse]
  /**
    * Returns an Observable of GraphQLResponse resulting from executing the
    * provided Query or Subscription operation responses, the result of which is
    * then normalized and comitted to the publish queue.
    *
    * Note: Observables are lazy, so calling this method will do nothing until
    * the result is subscribed to:
    * environment.executeWithSource({...}).subscribe({...}).
    */
  def executeWithSource(hasOperationSource: Anon_Operation): RelayObservable[GraphQLResponse]
  /**
    * Get an instance of a logger
    */
  def getLogger(config: LoggerTransactionConfig): js.UndefOr[Logger | Null]
  /**
    * Get the environment's internal Network.
    */
  def getNetwork(): Network
  /**
    * Returns the environment specific OperationTracker.
    */
  def getOperationTracker(): RelayOperationTracker
  /**
    * Get the environment's internal Store.
    */
  def getStore(): Store
  /**
    * Read the results of a selector from in-memory records in the store.
    * Optionally takes an owner, corresponding to the operation that
    * owns this selector (fragment).
    */
  def lookup(selector: SingularReaderSelector): Snapshot
  /**
    * Ensure that all the records necessary to fulfill the given selector are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    */
  def retain(selector: NormalizationSelector): Disposable
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when data has been committed to the store that would cause the results of
    * the snapshot's selector to change.
    */
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable
}

object Environment {
  @scala.inline
  def apply(
    applyMutation: OptimisticResponseConfig => Disposable,
    applyUpdate: OptimisticUpdateFunction => Disposable,
    check: NormalizationSelector => Boolean,
    commitPayload: (OperationDescriptor, PayloadData) => Unit,
    commitUpdate: StoreUpdater => Unit,
    execute: Anon_CacheConfig => RelayObservable[GraphQLResponse],
    executeMutation: Anon_Key => RelayObservable[GraphQLResponse],
    executeWithSource: Anon_Operation => RelayObservable[GraphQLResponse],
    getLogger: LoggerTransactionConfig => js.UndefOr[Logger | Null],
    getNetwork: () => Network,
    getOperationTracker: () => RelayOperationTracker,
    getStore: () => Store,
    lookup: SingularReaderSelector => Snapshot,
    retain: NormalizationSelector => Disposable,
    subscribe: (Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable
  ): Environment = {
    val __obj = js.Dynamic.literal(applyMutation = js.Any.fromFunction1(applyMutation), applyUpdate = js.Any.fromFunction1(applyUpdate), check = js.Any.fromFunction1(check), commitPayload = js.Any.fromFunction2(commitPayload), commitUpdate = js.Any.fromFunction1(commitUpdate), execute = js.Any.fromFunction1(execute), executeMutation = js.Any.fromFunction1(executeMutation), executeWithSource = js.Any.fromFunction1(executeWithSource), getLogger = js.Any.fromFunction1(getLogger), getNetwork = js.Any.fromFunction0(getNetwork), getOperationTracker = js.Any.fromFunction0(getOperationTracker), getStore = js.Any.fromFunction0(getStore), lookup = js.Any.fromFunction1(lookup), retain = js.Any.fromFunction1(retain), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[Environment]
  }
}

