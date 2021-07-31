package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpReceiptAddDataRequest extends StObject {
  
  /** TpReceiptAddDataRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  
  /** TpReceiptAddDataRequest data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}
object ITpReceiptAddDataRequest {
  
  @scala.inline
  def apply(): ITpReceiptAddDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpReceiptAddDataRequest]
  }
  
  @scala.inline
  implicit class ITpReceiptAddDataRequestMutableBuilder[Self <: ITpReceiptAddDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
