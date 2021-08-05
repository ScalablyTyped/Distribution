package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatch extends StObject {
  
  /** Batch header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** Batch headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
  
  /** Batch trace */
  var trace: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Batch transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}
object IBatch {
  
  inline def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  extension [Self <: IBatch](x: Self) {
    
    inline def setHeader(value: Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    inline def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    inline def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceNull: Self = StObject.set(x, "trace", null)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
