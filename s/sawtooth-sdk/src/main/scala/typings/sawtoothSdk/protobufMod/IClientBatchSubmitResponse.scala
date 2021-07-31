package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchSubmitResponse extends StObject {
  
  /** ClientBatchSubmitResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBatchSubmitResponse {
  
  @scala.inline
  def apply(): IClientBatchSubmitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchSubmitResponse]
  }
  
  @scala.inline
  implicit class IClientBatchSubmitResponseMutableBuilder[Self <: IClientBatchSubmitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
