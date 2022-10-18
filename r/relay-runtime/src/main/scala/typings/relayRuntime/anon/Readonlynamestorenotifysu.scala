package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.libStoreRelayStoreTypesMod.Snapshot
import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotsubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.subscription',   sourceOperation :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationDescriptor | undefined,   snapshot :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.Snapshot,   nextSnapshot :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.Snapshot}> */
trait Readonlynamestorenotifysu
  extends StObject
     with LogEvent {
  
  val name: storeDotnotifyDotsubscription
  
  val nextSnapshot: Snapshot
  
  val snapshot: Snapshot
  
  val sourceOperation: js.UndefOr[OperationDescriptor] = js.undefined
}
object Readonlynamestorenotifysu {
  
  inline def apply(nextSnapshot: Snapshot, snapshot: Snapshot): Readonlynamestorenotifysu = {
    val __obj = js.Dynamic.literal(name = "store.notify.subscription", nextSnapshot = nextSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorenotifysu]
  }
  
  extension [Self <: Readonlynamestorenotifysu](x: Self) {
    
    inline def setName(value: storeDotnotifyDotsubscription): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextSnapshot(value: Snapshot): Self = StObject.set(x, "nextSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSourceOperation(value: OperationDescriptor): Self = StObject.set(x, "sourceOperation", value.asInstanceOf[js.Any])
    
    inline def setSourceOperationUndefined: Self = StObject.set(x, "sourceOperation", js.undefined)
  }
}
