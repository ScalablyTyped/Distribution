package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingOperations extends StObject {
  
  var pendingOperations: js.Array[RequestDescriptor]
  
  var promise: js.Promise[Unit]
}
object PendingOperations {
  
  inline def apply(pendingOperations: js.Array[RequestDescriptor], promise: js.Promise[Unit]): PendingOperations = {
    val __obj = js.Dynamic.literal(pendingOperations = pendingOperations.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingOperations]
  }
  
  extension [Self <: PendingOperations](x: Self) {
    
    inline def setPendingOperations(value: js.Array[RequestDescriptor]): Self = StObject.set(x, "pendingOperations", value.asInstanceOf[js.Any])
    
    inline def setPendingOperationsVarargs(value: RequestDescriptor*): Self = StObject.set(x, "pendingOperations", js.Array(value*))
    
    inline def setPromise(value: js.Promise[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
