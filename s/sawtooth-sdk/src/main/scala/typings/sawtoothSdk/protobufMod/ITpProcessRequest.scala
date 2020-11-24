package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpProcessRequest extends js.Object {
  
  /** TpProcessRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  
  /** TpProcessRequest header */
  var header: js.UndefOr[ITransactionHeader | Null] = js.native
  
  /** TpProcessRequest payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.native
  
  /** TpProcessRequest signature */
  var signature: js.UndefOr[String | Null] = js.native
}
object ITpProcessRequest {
  
  @scala.inline
  def apply(): ITpProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessRequest]
  }
  
  @scala.inline
  implicit class ITpProcessRequestOps[Self <: ITpProcessRequest] (val x: Self) extends AnyVal {
    
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
    def setContextId(value: String): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    
    @scala.inline
    def setContextIdNull: Self = this.set("contextId", null)
    
    @scala.inline
    def setHeader(value: ITransactionHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPayloadNull: Self = this.set("payload", null)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSignatureNull: Self = this.set("signature", null)
  }
}
