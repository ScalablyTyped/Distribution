package typings.sentryTypes

import typings.sentryTypes.typesDatacategoryMod.DataCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientreportMod {
  
  trait ClientReport extends StObject {
    
    var discarded_events: js.Array[Outcome]
    
    var timestamp: Double
  }
  object ClientReport {
    
    inline def apply(discarded_events: js.Array[Outcome], timestamp: Double): ClientReport = {
      val __obj = js.Dynamic.literal(discarded_events = discarded_events.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientReport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientReport] (val x: Self) extends AnyVal {
      
      inline def setDiscarded_events(value: js.Array[Outcome]): Self = StObject.set(x, "discarded_events", value.asInstanceOf[js.Any])
      
      inline def setDiscarded_eventsVarargs(value: Outcome*): Self = StObject.set(x, "discarded_events", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.before_send
    - typings.sentryTypes.sentryTypesStrings.event_processor
    - typings.sentryTypes.sentryTypesStrings.network_error
    - typings.sentryTypes.sentryTypesStrings.queue_overflow
    - typings.sentryTypes.sentryTypesStrings.ratelimit_backoff
    - typings.sentryTypes.sentryTypesStrings.sample_rate
    - typings.sentryTypes.sentryTypesStrings.send_error
    - typings.sentryTypes.sentryTypesStrings.internal_sdk_error
  */
  trait EventDropReason extends StObject
  object EventDropReason {
    
    inline def before_send: typings.sentryTypes.sentryTypesStrings.before_send = "before_send".asInstanceOf[typings.sentryTypes.sentryTypesStrings.before_send]
    
    inline def event_processor: typings.sentryTypes.sentryTypesStrings.event_processor = "event_processor".asInstanceOf[typings.sentryTypes.sentryTypesStrings.event_processor]
    
    inline def internal_sdk_error: typings.sentryTypes.sentryTypesStrings.internal_sdk_error = "internal_sdk_error".asInstanceOf[typings.sentryTypes.sentryTypesStrings.internal_sdk_error]
    
    inline def network_error: typings.sentryTypes.sentryTypesStrings.network_error = "network_error".asInstanceOf[typings.sentryTypes.sentryTypesStrings.network_error]
    
    inline def queue_overflow: typings.sentryTypes.sentryTypesStrings.queue_overflow = "queue_overflow".asInstanceOf[typings.sentryTypes.sentryTypesStrings.queue_overflow]
    
    inline def ratelimit_backoff: typings.sentryTypes.sentryTypesStrings.ratelimit_backoff = "ratelimit_backoff".asInstanceOf[typings.sentryTypes.sentryTypesStrings.ratelimit_backoff]
    
    inline def sample_rate: typings.sentryTypes.sentryTypesStrings.sample_rate = "sample_rate".asInstanceOf[typings.sentryTypes.sentryTypesStrings.sample_rate]
    
    inline def send_error: typings.sentryTypes.sentryTypesStrings.send_error = "send_error".asInstanceOf[typings.sentryTypes.sentryTypesStrings.send_error]
  }
  
  trait Outcome extends StObject {
    
    var category: DataCategory
    
    var quantity: Double
    
    var reason: EventDropReason
  }
  object Outcome {
    
    inline def apply(category: DataCategory, quantity: Double, reason: EventDropReason): Outcome = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Outcome]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Outcome] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: DataCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setReason(value: EventDropReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
}
