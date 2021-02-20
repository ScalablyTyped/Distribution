package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchGetResponse extends StObject {
  
  /** ClientBatchGetResponse batch */
  var batch: js.UndefOr[IBatch | Null] = js.native
  
  /** ClientBatchGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientBatchGetResponse {
  
  @scala.inline
  def apply(): IClientBatchGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchGetResponse]
  }
  
  @scala.inline
  implicit class IClientBatchGetResponseMutableBuilder[Self <: IClientBatchGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: IBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchNull: Self = StObject.set(x, "batch", null)
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
