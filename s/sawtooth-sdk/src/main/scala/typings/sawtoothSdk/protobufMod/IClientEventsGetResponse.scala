package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientEventsGetResponse extends StObject {
  
  /** ClientEventsGetResponse events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
  
  /** ClientEventsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientEventsGetResponse {
  
  inline def apply(): IClientEventsGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetResponse]
  }
  
  extension [Self <: IClientEventsGetResponse](x: Self) {
    
    inline def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
