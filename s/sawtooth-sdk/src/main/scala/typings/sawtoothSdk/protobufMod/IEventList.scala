package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventList extends StObject {
  
  /** EventList events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
}
object IEventList {
  
  @scala.inline
  def apply(): IEventList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventList]
  }
  
  @scala.inline
  implicit class IEventListMutableBuilder[Self <: IEventList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
