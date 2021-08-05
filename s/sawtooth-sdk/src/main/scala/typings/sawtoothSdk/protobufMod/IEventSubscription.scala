package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventSubscription extends StObject {
  
  /** EventSubscription eventType */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /** EventSubscription filters */
  var filters: js.UndefOr[js.Array[IEventFilter] | Null] = js.undefined
}
object IEventSubscription {
  
  inline def apply(): IEventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventSubscription]
  }
  
  extension [Self <: IEventSubscription](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFilters(value: js.Array[IEventFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: IEventFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
