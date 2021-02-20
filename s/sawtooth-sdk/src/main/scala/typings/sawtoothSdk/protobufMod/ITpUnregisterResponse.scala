package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpUnregisterResponse extends StObject {
  
  /** TpUnregisterResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpUnregisterResponse {
  
  @scala.inline
  def apply(): ITpUnregisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpUnregisterResponse]
  }
  
  @scala.inline
  implicit class ITpUnregisterResponseMutableBuilder[Self <: ITpUnregisterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
