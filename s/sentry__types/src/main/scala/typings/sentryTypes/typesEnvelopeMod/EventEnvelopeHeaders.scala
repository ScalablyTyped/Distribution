package typings.sentryTypes.typesEnvelopeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEnvelopeHeaders extends StObject {
  
  var event_id: String
  
  var sent_at: String
  
  var trace: js.UndefOr[DynamicSamplingContext] = js.undefined
}
object EventEnvelopeHeaders {
  
  inline def apply(event_id: String, sent_at: String): EventEnvelopeHeaders = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], sent_at = sent_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEnvelopeHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEnvelopeHeaders] (val x: Self) extends AnyVal {
    
    inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setSent_at(value: String): Self = StObject.set(x, "sent_at", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: DynamicSamplingContext): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
