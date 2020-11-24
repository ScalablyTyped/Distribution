package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceStatus
  extends /* key */ StringDictionary[js.Any] {
  
  var service_operational: js.UndefOr[Boolean] = js.native
  
  var status_message: js.UndefOr[String] = js.native
  
  var wait_time: js.UndefOr[Double] = js.native
}
object SauceStatus {
  
  @scala.inline
  def apply(): SauceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceStatus]
  }
  
  @scala.inline
  implicit class SauceStatusOps[Self <: SauceStatus] (val x: Self) extends AnyVal {
    
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
    def setService_operational(value: Boolean): Self = this.set("service_operational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_operational: Self = this.set("service_operational", js.undefined)
    
    @scala.inline
    def setStatus_message(value: String): Self = this.set("status_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus_message: Self = this.set("status_message", js.undefined)
    
    @scala.inline
    def setWait_time(value: Double): Self = this.set("wait_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_time: Self = this.set("wait_time", js.undefined)
  }
}
