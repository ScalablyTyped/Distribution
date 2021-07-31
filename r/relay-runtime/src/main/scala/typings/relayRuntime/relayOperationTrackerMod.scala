package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayOperationTrackerMod {
  
  @JSImport("relay-runtime/lib/store/RelayOperationTracker", "RelayOperationTracker")
  @js.native
  class RelayOperationTracker () extends StObject {
    
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
