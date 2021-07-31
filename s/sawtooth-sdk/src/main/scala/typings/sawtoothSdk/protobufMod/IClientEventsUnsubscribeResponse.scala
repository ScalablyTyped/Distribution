package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsUnsubscribeResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientEventsUnsubscribeResponse extends StObject {
  
  /** ClientEventsUnsubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientEventsUnsubscribeResponse {
  
  @scala.inline
  def apply(): IClientEventsUnsubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsUnsubscribeResponse]
  }
  
  @scala.inline
  implicit class IClientEventsUnsubscribeResponseMutableBuilder[Self <: IClientEventsUnsubscribeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
