package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchGetResponse extends StObject {
  
  /** ClientBatchGetResponse batch */
  var batch: js.UndefOr[IBatch | Null] = js.undefined
  
  /** ClientBatchGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBatchGetResponse {
  
  inline def apply(): IClientBatchGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchGetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBatchGetResponse] (val x: Self) extends AnyVal {
    
    inline def setBatch(value: IBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchNull: Self = StObject.set(x, "batch", null)
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
