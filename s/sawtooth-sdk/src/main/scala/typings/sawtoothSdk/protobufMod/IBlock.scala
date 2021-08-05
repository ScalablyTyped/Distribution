package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBlock extends StObject {
  
  /** Block batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
  
  /** Block header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** Block headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
}
object IBlock {
  
  inline def apply(): IBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlock]
  }
  
  extension [Self <: IBlock](x: Self) {
    
    inline def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value :_*))
    
    inline def setHeader(value: Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    inline def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    inline def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
