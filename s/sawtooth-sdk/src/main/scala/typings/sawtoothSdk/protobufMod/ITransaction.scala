package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransaction extends StObject {
  
  /** Transaction header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** Transaction headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
  
  /** Transaction payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.undefined
}
object ITransaction {
  
  @scala.inline
  def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  
  @scala.inline
  implicit class ITransactionMutableBuilder[Self <: ITransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNull: Self = StObject.set(x, "header", null)
    
    @scala.inline
    def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    @scala.inline
    def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
