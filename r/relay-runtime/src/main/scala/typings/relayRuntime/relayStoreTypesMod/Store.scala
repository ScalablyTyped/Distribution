package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayModernStoreMod.InvalidationState
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  /**
    * Determine if the operation can be resolved with data in the store (i.e. no
    * fields are missing).
    */
  def check(operation: OperationDescriptor): OperationAvailability = js.native
  def check(operation: OperationDescriptor, options: CheckOptions): OperationAvailability = js.native
  /**
    * Given the previous invalidation state for those
    * ids, this function will return:
    *   - false, if the invalidation state for those ids is the same, meaning
    *     **it has not changed**
    *   - true, if the invalidation state for the given ids has changed
    */
  def checkInvalidationState(previousInvalidationState: InvalidationState): Boolean = js.native
  /**
    * Get a read-only view of the store's internal RecordSource.
    */
  def getSource(): RecordSource = js.native
  /**
    * The method should disable garbage collection until
    * the returned reference is disposed.
    */
  def holdGC(): Disposable = js.native
  /**
    * Read the results of a selector from in-memory records in the store.
    * Optionally takes an owner, corresponding to the operation that
    * owns this selector (fragment).
    */
  def lookup(selector: SingularReaderSelector): Snapshot = js.native
  /**
    * Will return an opaque snapshot of the current invalidation state of
    * the data ids that were provided.
    */
  def lookupInvalidationState(dataIDs: js.Array[DataID]): InvalidationState = js.native
  def notify(sourceOperation: OperationDescriptor): js.Array[RequestDescriptor] = js.native
  def notify(sourceOperation: OperationDescriptor, invalidateStore: Boolean): js.Array[RequestDescriptor] = js.native
  /**
    * Publish new information (e.g. from the network) to the store, updating its
    * internal record source. Subscribers are not immediately notified - this
    * occurs when `notify()` is called.
    */
  def publish(source: RecordSource): Unit = js.native
  def publish(source: RecordSource, idsMarkedForInvalidation: Set[DataID]): Unit = js.native
  /**
    * Reset the state of the store to the point that snapshot() was last called.
    */
  def restore(): Unit = js.native
  /**
    * Ensure that all the records necessary to fulfill the given selector are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    */
  def retain(operation: OperationDescriptor): Disposable = js.native
  /**
    * Record a backup/snapshot of the current state of the store, including
    * records and derived data such as fragment and connection subscriptions.
    * This state can be restored with restore().
    */
  def snapshot(): Unit = js.native
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when `notify()` is called *and* records have been published that affect the
    * selector results relative to the last `notify()`.
    */
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable = js.native
  /**
    * Will subscribe the provided callback to the invalidation state of the
    * given data ids. Whenever the invalidation state for any of the provided
    * ids changes, the callback will be called, and provide the latest
    * invalidation state.
    * Disposing of the returned disposable will remove the subscription.
    */
  def subscribeToInvalidationState(invalidationState: InvalidationState, callback: js.Function0[Unit]): Disposable = js.native
}

