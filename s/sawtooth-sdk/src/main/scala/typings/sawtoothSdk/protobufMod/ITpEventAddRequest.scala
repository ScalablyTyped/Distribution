package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpEventAddRequest extends js.Object {
  
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
  implicit class ITpEventAddRequestOps[Self <: ITpEventAddRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextId(value: String): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    
    @scala.inline
    def setContextIdNull: Self = this.set("contextId", null)
    
    @scala.inline
    def setEvent(value: IEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventNull: Self = this.set("event", null)
  }
}
