package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventSubscription extends StObject {
  
  /** EventSubscription eventType */
  var eventType: js.UndefOr[String | Null] = js.native
  
  /** EventSubscription filters */
  var filters: js.UndefOr[js.Array[IEventFilter] | Null] = js.native
}
object IEventSubscription {
  
  @scala.inline
  def apply(): IEventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventSubscription]
  }
  
  @scala.inline
  implicit class IEventSubscriptionMutableBuilder[Self <: IEventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[IEventFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: IEventFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
