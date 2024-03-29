package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdateRelayPayload
  extends StObject
     with OptimisticUpdate {
  
  val operation: OperationDescriptor
  
  val payload: RelayResponsePayload
  
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}
object OptimisticUpdateRelayPayload {
  
  inline def apply(operation: OperationDescriptor, payload: RelayResponsePayload): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimisticUpdateRelayPayload] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: RelayResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
