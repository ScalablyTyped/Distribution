package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayOperationTracker", JSImport.Namespace)
@js.native
object libStoreRelayOperationTrackerMod extends js.Object {
  @js.native
  class RelayOperationTracker () extends js.Object {
    def _resolveOwnerResolvers(owner: RequestDescriptor): Unit = js.native
    /**
      * Once pending operation is completed we need to remove it
      * from all tracking maps
      */
    def complete(pendingOperation: RequestDescriptor): Unit = js.native
    def getPromiseForPendingOperationsAffectingOwner(owner: RequestDescriptor): js.Promise[Unit] | Null = js.native
    /**
      * Update the map of current processing operations with the set of
      * affected owners and notify subscribers
      */
    def update(pendingOperation: RequestDescriptor, affectedOwners: Set[RequestDescriptor]): Unit = js.native
  }
  
}

