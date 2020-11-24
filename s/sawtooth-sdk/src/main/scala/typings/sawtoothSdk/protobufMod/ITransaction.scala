package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransaction extends js.Object {
  
  /** Transaction header */
  var header: js.UndefOr[Uint8Array | Null] = js.native
  
  /** Transaction headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
  
  /** Transaction payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.native
}
object ITransaction {
  
  @scala.inline
  def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  
  @scala.inline
  implicit class ITransactionOps[Self <: ITransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeader(value: Uint8Array): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setHeaderSignature(value: String): Self = this.set("headerSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSignature: Self = this.set("headerSignature", js.undefined)
    
    @scala.inline
    def setHeaderSignatureNull: Self = this.set("headerSignature", null)
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPayloadNull: Self = this.set("payload", null)
  }
}
