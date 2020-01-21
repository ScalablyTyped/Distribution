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

trait Store extends js.Object {
  /**
    * Determine if the selector can be resolved with data in the store (i.e. no
    * fields are missing).
    */
  def check(selector: NormalizationSelector): Boolean
  /**
    * Get a read-only view of the store's internal connection events for a given
    * connection.
    */
  def getConnectionEvents_UNSTABLE(connectionID: ConnectionID): js.Array[ConnectionInternalEvent]
  /**
    * Get a read-only view of the store's internal RecordSource.
    */
  def getSource(): RecordSource
  /**
    * The method should disable garbage collection until
    * the returned reference is disposed.
    */
  def holdGC(): Disposable
  /**
    * Read the results of a selector from in-memory records in the store.
    * Optionally takes an owner, corresponding to the operation that
    * owns this selector (fragment).
    */
  def lookup(selector: SingularReaderSelector): Snapshot
  def lookupConnection_UNSTABLE[TEdge, TState](connectionReference: ConnectionReference[TEdge], resolver: ConnectionResolver[TEdge, TState]): ConnectionSnapshot[TEdge, TState]
  /**
    * Publish new information (e.g. from the network) to the store, updating its
    * internal record source. Subscribers are not immediately notified - this
    * occurs when `notify()` is called.
    */
  def publish(source: RecordSource): Unit
  /**
    * Publish connection events, updating the store's list of events. As with
    * publish(), subscribers are only notified after notify() is called.
    */
  def publishConnectionEvents_UNSTABLE(events: js.Array[ConnectionInternalEvent], `final`: Boolean): Unit
  /**
    * Reset the state of the store to the point that snapshot() was last called.
    */
  def restore(): Unit
  /**
    * Ensure that all the records necessary to fulfill the given selector are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    */
  def retain(selector: NormalizationSelector): Disposable
  /**
    * Record a backup/snapshot of the current state of the store, including
    * records and derived data such as fragment and connection subscriptions.
    * This state can be restored with restore().
    */
  def snapshot(): Unit
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when `notify()` is called *and* records have been published that affect the
    * selector results relative to the last `notify()`.
    */
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable
  def subscribeConnection_UNSTABLE[TEdge, TState](
    snapshot: ConnectionSnapshot[TEdge, TState],
    resolver: ConnectionResolver[TEdge, TState],
    callback: js.Function1[/* state */ TState, Unit]
  ): Disposable
}

object Store {
  @scala.inline
  def apply(
    check: NormalizationSelector => Boolean,
    getConnectionEvents_UNSTABLE: ConnectionID => js.Array[ConnectionInternalEvent],
    getSource: () => RecordSource,
    holdGC: () => Disposable,
    lookup: SingularReaderSelector => Snapshot,
    lookupConnection_UNSTABLE: (ConnectionReference[js.Any], ConnectionResolver[js.Any, js.Any]) => ConnectionSnapshot[js.Any, js.Any],
    publish: RecordSource => Unit,
    publishConnectionEvents_UNSTABLE: (js.Array[ConnectionInternalEvent], Boolean) => Unit,
    restore: () => Unit,
    retain: NormalizationSelector => Disposable,
    snapshot: () => Unit,
    subscribe: (Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable,
    subscribeConnection_UNSTABLE: (ConnectionSnapshot[js.Any, js.Any], ConnectionResolver[js.Any, js.Any], js.Function1[js.Any, Unit]) => Disposable
  ): Store = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), getConnectionEvents_UNSTABLE = js.Any.fromFunction1(getConnectionEvents_UNSTABLE), getSource = js.Any.fromFunction0(getSource), holdGC = js.Any.fromFunction0(holdGC), lookup = js.Any.fromFunction1(lookup), lookupConnection_UNSTABLE = js.Any.fromFunction2(lookupConnection_UNSTABLE), publish = js.Any.fromFunction1(publish), publishConnectionEvents_UNSTABLE = js.Any.fromFunction2(publishConnectionEvents_UNSTABLE), restore = js.Any.fromFunction0(restore), retain = js.Any.fromFunction1(retain), snapshot = js.Any.fromFunction0(snapshot), subscribe = js.Any.fromFunction2(subscribe), subscribeConnection_UNSTABLE = js.Any.fromFunction3(subscribeConnection_UNSTABLE))
  
    __obj.asInstanceOf[Store]
  }
}

