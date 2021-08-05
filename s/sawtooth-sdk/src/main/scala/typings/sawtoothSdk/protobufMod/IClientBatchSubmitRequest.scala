package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchSubmitRequest extends StObject {
  
  /** ClientBatchSubmitRequest batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}
object IClientBatchSubmitRequest {
  
  inline def apply(): IClientBatchSubmitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchSubmitRequest]
  }
  
  extension [Self <: IClientBatchSubmitRequest](x: Self) {
    
    inline def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value :_*))
  }
}
