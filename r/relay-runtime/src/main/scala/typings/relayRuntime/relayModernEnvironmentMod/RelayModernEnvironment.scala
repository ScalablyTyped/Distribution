package typings.relayRuntime.relayModernEnvironmentMod

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
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import typings.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import typings.relayRuntime.relayStoreTypesMod.Snapshot
import typings.relayRuntime.relayStoreTypesMod.Store
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernEnvironment", "RelayModernEnvironment")
@js.native
class RelayModernEnvironment protected () extends Environment {
  def this(config: EnvironmentConfig) = this()
  var configName: js.UndefOr[String | Null] = js.native
  /**
    * Apply an optimistic mutation response and/or updater. The mutation can be
    * reverted by calling `dispose()` on the returned value.
    */
  /* CompleteClass */
  override def applyMutation(optimisticConfig: OptimisticResponseConfig): Disposable = js.native
  /**
    * Apply an optimistic update to the environment. The mutation can be reverted
    * by calling `dispose()` on the returned value.
    */
  /* CompleteClass */
  override def applyUpdate(optimisticUpdate: OptimisticUpdateFunction): Disposable = js.native
  /**
    * Determine if the operation can be resolved with data in the store (i.e. no
    * fields are missing).
    *
    * Note that this operation effectively "executes" the selector against the
    * cache and therefore takes time proportional to the size/complexity of the
    * selector.
    */
  /* CompleteClass */
  override def check(operation: OperationDescriptor): Boolean = js.native
  /**
    * Commit a payload to the environment using the given operation selector.
    */
  /* CompleteClass */
  override def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): Unit = js.native
  /**
    * Commit an updater to the environment. This mutation cannot be reverted and
    * should therefore not be used for optimistic updates. This is mainly
    * intended for updating fields from client schema extensions.
    */
  /* CompleteClass */
  override def commitUpdate(updater: StoreUpdater): Unit = js.native
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
  /* CompleteClass */
  override def execute(config: AnonCacheConfig): RelayObservable[GraphQLResponse] = js.native
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
  /* CompleteClass */
  override def executeMutation(hasOperationOptimisticUpdaterOptimisticResponseUpdaterUploadables: AnonKey): RelayObservable[GraphQLResponse] = js.native
  /**
    * Returns an Observable of GraphQLResponse resulting from executing the
    * provided Query or Subscription operation responses, the result of which is
    * then normalized and comitted to the publish queue.
    *
    * Note: Observables are lazy, so calling this method will do nothing until
    * the result is subscribed to:
    * environment.executeWithSource({...}).subscribe({...}).
    */
  /* CompleteClass */
  override def executeWithSource(hasOperationSource: AnonOperation): RelayObservable[GraphQLResponse] = js.native
  /**
    * Get an instance of a logger
    */
  /* CompleteClass */
  override def getLogger(config: LoggerTransactionConfig): js.UndefOr[Logger | Null] = js.native
  /**
    * Get the environment's internal Network.
    */
  /* CompleteClass */
  override def getNetwork(): Network = js.native
  /**
    * Returns the environment specific OperationTracker.
    */
  /* CompleteClass */
  override def getOperationTracker(): RelayOperationTracker = js.native
  /**
    * Get the environment's internal Store.
    */
  /* CompleteClass */
  override def getStore(): Store = js.native
  /**
    * Read the results of a selector from in-memory records in the store.
    * Optionally takes an owner, corresponding to the operation that
    * owns this selector (fragment).
    */
  /* CompleteClass */
  override def lookup(selector: SingularReaderSelector): Snapshot = js.native
  def replaceUpdate(update: OptimisticUpdateFunction, newUpdate: OptimisticUpdateFunction): Unit = js.native
  /**
    * Ensure that all the records necessary to fulfill the given operation are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    */
  /* CompleteClass */
  override def retain(operation: OperationDescriptor): Disposable = js.native
  def revertUpdate(update: OptimisticUpdateFunction): Unit = js.native
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when data has been committed to the store that would cause the results of
    * the snapshot's selector to change.
    */
  /* CompleteClass */
  override def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable = js.native
}

