package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.anon.OperationUpdater
import typings.relayRuntime.anon.OptimisticResponse
import typings.relayRuntime.anon.Readonlykindmissingfieldl
import typings.relayRuntime.anon.Readonlykindmissingfieldt
import typings.relayRuntime.anon.Readonlykindrelayresolver
import typings.relayRuntime.anon.Source
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
  /**
    * Apply an optimistic mutation response and/or updater. The mutation can be
    * reverted by calling `dispose()` on the returned value.
    */
  def applyMutation(optimisticConfig: OptimisticResponseConfig[Any]): Disposable = js.native
  
  /**
    * Apply an optimistic update to the environment. The mutation can be reverted
    * by calling `dispose()` on the returned value.
    */
  def applyUpdate(optimisticUpdate: OptimisticUpdateFunction): Disposable = js.native
  
  /**
    * Determine if the operation can be resolved with data in the store (i.e. no
    * fields are missing).
    *
    * Note that this operation effectively "executes" the selector against the
    * cache and therefore takes time proportional to the size/complexity of the
    * selector.
    */
  def check(operation: OperationDescriptor): OperationAvailability = js.native
  def check(operation: OperationDescriptor, options: CheckOptions): OperationAvailability = js.native
  
  /**
    * Commit a payload to the environment using the given operation selector.
    */
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): Unit = js.native
  
  /**
    * Commit an updater to the environment. This mutation cannot be reverted and
    * should therefore not be used for optimistic updates. This is mainly
    * intended for updating fields from client schema extensions.
    */
  def commitUpdate(updater: StoreUpdater): Unit = js.native
  
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
  def execute(config: OperationUpdater): RelayObservable[GraphQLResponse] = js.native
  
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
  def executeMutation(hasOperationOptimisticUpdaterOptimisticResponseUpdaterUploadables: OptimisticResponse): RelayObservable[GraphQLResponse] = js.native
  
  /**
    * Returns an Observable of GraphQLResponse resulting from executing the
    * provided Query or Subscription operation responses, the result of which is
    * then normalized and comitted to the publish queue.
    *
    * Note: Observables are lazy, so calling this method will do nothing until
    * the result is subscribed to:
    * environment.executeWithSource({...}).subscribe({...}).
    */
  def executeWithSource(hasOperationSource: Source): RelayObservable[GraphQLResponse] = js.native
  
  /**
    * Get the environment's internal Network.
    */
  def getNetwork(): Network = js.native
  
  /**
    * Returns the environment specific OperationTracker.
    */
  def getOperationTracker(): RelayOperationTracker = js.native
  
  /**
    * Get the environment's internal Store.
    */
  def getStore(): Store = js.native
  
  /**
    * Returns true if a request is currently "active", meaning it's currently
    * actively receiving payloads or downloading modules, and has not received
    * a final payload yet. Note that a request might still be pending (or "in flight")
    * without actively receiving payload, for example a live query or an
    * active GraphQL subscription
    */
  def isRequestActive(requestIdentifier: String): Boolean = js.native
  
  /**
    * Returns true if the environment is for use during server side rendering.
    * functions like getQueryResource key off of this in order to determine
    * whether we need to set up certain caches and timeout's.
    */
  def isServer(): Boolean = js.native
  
  /**
    * Read the results of a selector from in-memory records in the store.
    * Optionally takes an owner, corresponding to the operation that
    * owns this selector (fragment).
    */
  def lookup(selector: SingularReaderSelector): Snapshot = js.native
  
  /**
    * Extra information attached to the environment instance
    */
  var options: Any = js.native
  
  /**
    * Called by Relay when it encounters a missing field that has been annotated
    * with `@required(action: LOG)`.
    */
  def requiredFieldLogger(arg: Readonlykindmissingfieldl): Unit = js.native
  def requiredFieldLogger(arg: Readonlykindmissingfieldt): Unit = js.native
  def requiredFieldLogger(arg: Readonlykindrelayresolver): Unit = js.native
  /**
    * Called by Relay when it encounters a missing field that has been annotated
    * with `@required(action: LOG)`.
    */
  @JSName("requiredFieldLogger")
  var requiredFieldLogger_Original: RequiredFieldLogger = js.native
  
  /**
    * Ensure that all the records necessary to fulfill the given operation are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    */
  def retain(operation: OperationDescriptor): Disposable = js.native
  
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when data has been committed to the store that would cause the results of
    * the snapshot's selector to change.
    */
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable = js.native
}
