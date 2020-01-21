package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishQueue extends js.Object {
  /**
    * Schedule applying an optimistic updates on the next `run()`.
    */
  def applyUpdate(updater: OptimisticUpdate): Unit = js.native
  /**
    * Schedule applying a payload to the store on the next `run()`.
    */
  def commitPayload(operation: OperationDescriptor, payload: RelayResponsePayload): Unit = js.native
  def commitPayload(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: SelectorStoreUpdater[js.Object]
  ): Unit = js.native
  /**
    * Schedule a publish to the store from the provided source on the next
    * `run()`. As an example, to update the store with substituted fields that
    * are missing in the store.
    */
  def commitSource(source: RecordSource): Unit = js.native
  /**
    * Schedule an updater to mutate the store on the next `run()` typically to
    * update client schema fields.
    */
  def commitUpdate(updater: StoreUpdater): Unit = js.native
  /**
    * Schedule a revert of all optimistic updates on the next `run()`.
    */
  def revertAll(): Unit = js.native
  /**
    * Schedule reverting an optimistic updates on the next `run()`.
    */
  def revertUpdate(updater: OptimisticUpdate): Unit = js.native
  /**
    * Execute all queued up operations from the other public methods.
    */
  def run(): js.Array[RequestDescriptor] = js.native
}

