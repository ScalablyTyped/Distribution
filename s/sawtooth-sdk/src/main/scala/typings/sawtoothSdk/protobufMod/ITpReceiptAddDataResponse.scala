package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpReceiptAddDataResponse extends StObject {
  
  /** TpReceiptAddDataResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpReceiptAddDataResponse {
  
  @scala.inline
  def apply(): ITpReceiptAddDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpReceiptAddDataResponse]
  }
  
  @scala.inline
  implicit class ITpReceiptAddDataResponseMutableBuilder[Self <: ITpReceiptAddDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
