package typings.sentryTypes

import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventType
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.statusMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  trait Response extends StObject {
    
    var event: js.UndefOr[Event | Session] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var status: Status
    
    var `type`: js.UndefOr[EventType] = js.undefined
  }
  object Response {
    
    inline def apply(status: Status): Response = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setEvent(value: Event | Session): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
