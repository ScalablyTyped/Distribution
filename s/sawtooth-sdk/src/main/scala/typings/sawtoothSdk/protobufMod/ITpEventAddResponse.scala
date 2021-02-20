package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpEventAddResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpEventAddResponse extends StObject {
  
  /** TpEventAddResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpEventAddResponse {
  
  @scala.inline
  def apply(): ITpEventAddResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpEventAddResponse]
  }
  
  @scala.inline
  implicit class ITpEventAddResponseMutableBuilder[Self <: ITpEventAddResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
