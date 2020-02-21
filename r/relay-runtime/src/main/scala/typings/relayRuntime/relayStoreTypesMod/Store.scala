package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayConnectionMod.ConnectionID
import typings.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typings.relayRuntime.relayConnectionMod.ConnectionReference
import typings.relayRuntime.relayConnectionMod.ConnectionResolver
import typings.relayRuntime.relayConnectionMod.ConnectionSnapshot
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
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
    * Get a read-only view of the store's internal connection events for a given
    * connection.
    */
  def getConnectionEvents_UNSTABLE(connectionID: ConnectionID): js.Array[ConnectionInternalEvent] = js.native
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
  def lookupConnection_UNSTABLE[TEdge, TState](connectionReference: ConnectionReference[TEdge], resolver: ConnectionResolver[TEdge, TState]): ConnectionSnapshot[TEdge, TState] = js.native
  /**
    * Publish new information (e.g. from the network) to the store, updating its
    * internal record source. Subscribers are not immediately notified - this
    * occurs when `notify()` is called.
    */
  def publish(source: RecordSource): Unit = js.native
  /**
    * Publish connection events, updating the store's list of events. As with
    * publish(), subscribers are only notified after notify() is called.
    */
  def publishConnectionEvents_UNSTABLE(events: js.Array[ConnectionInternalEvent], `final`: Boolean): Unit = js.native
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
  def subscribeConnection_UNSTABLE[TEdge, TState](
    snapshot: ConnectionSnapshot[TEdge, TState],
    resolver: ConnectionResolver[TEdge, TState],
    callback: js.Function1[/* state */ TState, Unit]
  ): Disposable = js.native
}

