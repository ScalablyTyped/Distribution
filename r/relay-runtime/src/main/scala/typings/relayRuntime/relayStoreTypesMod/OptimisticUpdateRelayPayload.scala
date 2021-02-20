package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticUpdateRelayPayload extends OptimisticUpdate {
  
  val operation: OperationDescriptor = js.native
  
  val payload: RelayResponsePayload = js.native
  
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
}
object OptimisticUpdateRelayPayload {
  
  @scala.inline
  def apply(operation: OperationDescriptor, payload: RelayResponsePayload): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
  
  @scala.inline
  implicit class OptimisticUpdateRelayPayloadMutableBuilder[Self <: OptimisticUpdateRelayPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: RelayResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    @scala.inline
    def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
