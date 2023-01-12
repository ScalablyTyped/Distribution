package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchGetRequest extends StObject {
  
  /** ClientBatchGetRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
}
object IClientBatchGetRequest {
  
  inline def apply(): IClientBatchGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchGetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBatchGetRequest] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
  }
}
