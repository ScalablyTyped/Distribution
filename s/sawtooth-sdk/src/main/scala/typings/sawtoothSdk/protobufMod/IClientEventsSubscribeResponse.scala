package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientEventsSubscribeResponse extends StObject {
  
  /** ClientEventsSubscribeResponse responseMessage */
  var responseMessage: js.UndefOr[String | Null] = js.undefined
  
  /** ClientEventsSubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientEventsSubscribeResponse {
  
  inline def apply(): IClientEventsSubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientEventsSubscribeResponse] (val x: Self) extends AnyVal {
    
    inline def setResponseMessage(value: String): Self = StObject.set(x, "responseMessage", value.asInstanceOf[js.Any])
    
    inline def setResponseMessageNull: Self = StObject.set(x, "responseMessage", null)
    
    inline def setResponseMessageUndefined: Self = StObject.set(x, "responseMessage", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
