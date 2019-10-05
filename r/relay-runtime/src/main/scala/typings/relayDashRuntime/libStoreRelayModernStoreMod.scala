package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionID
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionInternalEvent
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionReference
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionResolver
import typings.relayDashRuntime.libStoreRelayConnectionMod.ConnectionSnapshot
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSource
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Scheduler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Snapshot
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Store
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernStore", JSImport.Namespace)
@js.native
object libStoreRelayModernStoreMod extends js.Object {
  @js.native
  class RelayModernStore protected () extends Store {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, gcScheduler: Scheduler) = this()
    def this(source: MutableRecordSource, gcScheduler: Scheduler, operationLoader: OperationLoader) = this()
    /**
      * Determine if the selector can be resolved with data in the store (i.e. no
      * fields are missing).
      */
    /* CompleteClass */
    override def check(selector: NormalizationSelector): Boolean = js.native
    /**
      * Get a read-only view of the store's internal connection events for a given
      * connection.
      */
    /* CompleteClass */
    override def getConnectionEvents_UNSTABLE(connectionID: ConnectionID): js.Array[ConnectionInternalEvent] = js.native
    /**
      * Get a read-only view of the store's internal RecordSource.
      */
    /* CompleteClass */
    override def getSource(): RecordSource = js.native
    /**
      * The method should disable garbage collection until
      * the returned reference is disposed.
      */
    /* CompleteClass */
    override def holdGC(): Disposable = js.native
    def lookup(selector: ReaderSelector): Snapshot = js.native
    /**
      * Read the results of a selector from in-memory records in the store.
      * Optionally takes an owner, corresponding to the operation that
      * owns this selector (fragment).
      */
    /* CompleteClass */
    override def lookup(selector: SingularReaderSelector): Snapshot = js.native
    /* CompleteClass */
    override def lookupConnection_UNSTABLE[TEdge, TState](connectionReference: ConnectionReference[TEdge], resolver: ConnectionResolver[TEdge, TState]): ConnectionSnapshot[TEdge, TState] = js.native
    /**
      * Publish new information (e.g. from the network) to the store, updating its
      * internal record source. Subscribers are not immediately notified - this
      * occurs when `notify()` is called.
      */
    /* CompleteClass */
    override def publish(source: RecordSource): Unit = js.native
    /**
      * Publish connection events, updating the store's list of events. As with
      * publish(), subscribers are only notified after notify() is called.
      */
    /* CompleteClass */
    override def publishConnectionEvents_UNSTABLE(events: js.Array[ConnectionInternalEvent], `final`: Boolean): Unit = js.native
    /**
      * Reset the state of the store to the point that snapshot() was last called.
      */
    /* CompleteClass */
    override def restore(): Unit = js.native
    /**
      * Ensure that all the records necessary to fulfill the given selector are
      * retained in-memory. The records will not be eligible for garbage collection
      * until the returned reference is disposed.
      */
    /* CompleteClass */
    override def retain(selector: NormalizationSelector): Disposable = js.native
    /**
      * Record a backup/snapshot of the current state of the store, including
      * records and derived data such as fragment and connection subscriptions.
      * This state can be restored with restore().
      */
    /* CompleteClass */
    override def snapshot(): Unit = js.native
    /**
      * Subscribe to changes to the results of a selector. The callback is called
      * when `notify()` is called *and* records have been published that affect the
      * selector results relative to the last `notify()`.
      */
    /* CompleteClass */
    override def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable = js.native
    /* CompleteClass */
    override def subscribeConnection_UNSTABLE[TEdge, TState](
      snapshot: ConnectionSnapshot[TEdge, TState],
      resolver: ConnectionResolver[TEdge, TState],
      callback: js.Function1[/* state */ TState, Unit]
    ): Disposable = js.native
    def toJSON(): js.Any = js.native
  }
  
}

