package typings.relayRuntime.relayNetworkTypesMod

import typings.relayRuntime.anon.Column
import typings.relayRuntime.relayRuntimeStrings.CRITICAL
import typings.relayRuntime.relayRuntimeStrings.ERROR
import typings.relayRuntime.relayRuntimeStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadError extends js.Object {
  
  var locations: js.UndefOr[js.Array[Column]] = js.native
  
  var message: String = js.native
  
  var severity: js.UndefOr[CRITICAL | ERROR | WARNING] = js.native
}
object PayloadError {
  
  @scala.inline
  def apply(message: String): PayloadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadError]
  }
  
  @scala.inline
  implicit class PayloadErrorOps[Self <: PayloadError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Column*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Column]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setSeverity(value: CRITICAL | ERROR | WARNING): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
}
