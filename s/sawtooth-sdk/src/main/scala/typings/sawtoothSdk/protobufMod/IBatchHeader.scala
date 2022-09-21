package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchHeader extends StObject {
  
  /** BatchHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.undefined
  
  /** BatchHeader transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IBatchHeader {
  
  inline def apply(): IBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchHeader]
  }
  
  extension [Self <: IBatchHeader](x: Self) {
    
    inline def setSignerPublicKey(value: String): Self = StObject.set(x, "signerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSignerPublicKeyNull: Self = StObject.set(x, "signerPublicKey", null)
    
    inline def setSignerPublicKeyUndefined: Self = StObject.set(x, "signerPublicKey", js.undefined)
    
    inline def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsNull: Self = StObject.set(x, "transactionIds", null)
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value*))
  }
}
