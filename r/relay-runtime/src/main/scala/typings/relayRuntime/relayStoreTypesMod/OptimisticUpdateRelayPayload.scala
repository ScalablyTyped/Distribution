package typings.relayRuntime.relayStoreTypesMod

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
  implicit class OptimisticUpdateRelayPayloadOps[Self <: OptimisticUpdateRelayPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: RelayResponsePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
  }
}
