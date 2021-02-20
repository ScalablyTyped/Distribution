package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsSubscribeResponse extends StObject {
  
  /** ClientEventsSubscribeResponse responseMessage */
  var responseMessage: js.UndefOr[String | Null] = js.native
  
  /** ClientEventsSubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientEventsSubscribeResponse {
  
  @scala.inline
  def apply(): IClientEventsSubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeResponse]
  }
  
  @scala.inline
  implicit class IClientEventsSubscribeResponseMutableBuilder[Self <: IClientEventsSubscribeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseMessage(value: String): Self = StObject.set(x, "responseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseMessageNull: Self = StObject.set(x, "responseMessage", null)
    
    @scala.inline
    def setResponseMessageUndefined: Self = StObject.set(x, "responseMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
