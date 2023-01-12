package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransaction extends StObject {
  
  /** Transaction header */
  var header: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** Transaction headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
  
  /** Transaction payload */
  var payload: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object ITransaction {
  
  inline def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITransaction] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: js.typedarray.Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    inline def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    inline def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
