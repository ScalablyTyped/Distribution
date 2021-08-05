package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchStatusRequest extends StObject {
  
  /** ClientBatchStatusRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientBatchStatusRequest timeout */
  var timeout: js.UndefOr[Double | Null] = js.undefined
  
  /** ClientBatchStatusRequest wait */
  @JSName("wait")
  var wait_FIClientBatchStatusRequest: js.UndefOr[Boolean | Null] = js.undefined
}
object IClientBatchStatusRequest {
  
  inline def apply(): IClientBatchStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusRequest]
  }
  
  extension [Self <: IClientBatchStatusRequest](x: Self) {
    
    inline def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    inline def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    inline def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    inline def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value :_*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Null: Self = StObject.set(x, "wait", null)
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
