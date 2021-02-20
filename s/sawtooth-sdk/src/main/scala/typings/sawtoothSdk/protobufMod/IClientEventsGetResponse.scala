package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsGetResponse extends StObject {
  
  /** ClientEventsGetResponse events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.native
  
  /** ClientEventsGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientEventsGetResponse {
  
  @scala.inline
  def apply(): IClientEventsGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsGetResponse]
  }
  
  @scala.inline
  implicit class IClientEventsGetResponseMutableBuilder[Self <: IClientEventsGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
