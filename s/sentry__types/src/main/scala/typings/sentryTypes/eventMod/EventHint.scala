package typings.sentryTypes.eventMod

import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.scopeMod.Scope
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHint extends js.Object {
  
  var captureContext: js.UndefOr[CaptureContext] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var event_id: js.UndefOr[String] = js.native
  
  var originalException: js.UndefOr[Error | String | Null] = js.native
  
  var syntheticException: js.UndefOr[Error | Null] = js.native
}
object EventHint {
  
  @scala.inline
  def apply(): EventHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventHint]
  }
  
  @scala.inline
  implicit class EventHintOps[Self <: EventHint] (val x: Self) extends AnyVal {
    
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
    def setCaptureContextFunction1(value: /* scope */ Scope => Scope): Self = this.set("captureContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCaptureContext(value: CaptureContext): Self = this.set("captureContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureContext: Self = this.set("captureContext", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEvent_id(value: String): Self = this.set("event_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_id: Self = this.set("event_id", js.undefined)
    
    @scala.inline
    def setOriginalException(value: Error | String): Self = this.set("originalException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalException: Self = this.set("originalException", js.undefined)
    
    @scala.inline
    def setOriginalExceptionNull: Self = this.set("originalException", null)
    
    @scala.inline
    def setSyntheticException(value: Error): Self = this.set("syntheticException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntheticException: Self = this.set("syntheticException", js.undefined)
    
    @scala.inline
    def setSyntheticExceptionNull: Self = this.set("syntheticException", null)
  }
}
