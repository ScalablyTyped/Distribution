package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpEventAddRequest extends StObject {
  
  /** TpEventAddRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  
  /** TpEventAddRequest event */
  var event: js.UndefOr[IEvent | Null] = js.undefined
}
object ITpEventAddRequest {
  
  inline def apply(): ITpEventAddRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpEventAddRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITpEventAddRequest] (val x: Self) extends AnyVal {
    
    inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    inline def setEvent(value: IEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
