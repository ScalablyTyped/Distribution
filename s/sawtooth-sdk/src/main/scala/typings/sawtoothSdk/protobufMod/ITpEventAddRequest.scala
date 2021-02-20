package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpEventAddRequest extends StObject {
  
  /** TpEventAddRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  
  /** TpEventAddRequest event */
  var event: js.UndefOr[IEvent | Null] = js.native
}
object ITpEventAddRequest {
  
  @scala.inline
  def apply(): ITpEventAddRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpEventAddRequest]
  }
  
  @scala.inline
  implicit class ITpEventAddRequestMutableBuilder[Self <: ITpEventAddRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setEvent(value: IEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNull: Self = StObject.set(x, "event", null)
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
