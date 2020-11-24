package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSNotificationPayload extends BaseNotificationPayload {
  
  var apnsPushType: js.UndefOr[String] = js.native
  
  var configurations: js.Array[APNS2Configuration] = js.native
  
  var isSilent: Boolean = js.native
}
object APNSNotificationPayload {
  
  @scala.inline
  def apply(configurations: js.Array[APNS2Configuration], isSilent: Boolean, payload: js.Object): APNSNotificationPayload = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSNotificationPayload]
  }
  
  @scala.inline
  implicit class APNSNotificationPayloadOps[Self <: APNSNotificationPayload] (val x: Self) extends AnyVal {
    
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
    def setConfigurationsVarargs(value: APNS2Configuration*): Self = this.set("configurations", js.Array(value :_*))
    
    @scala.inline
    def setConfigurations(value: js.Array[APNS2Configuration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSilent(value: Boolean): Self = this.set("isSilent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApnsPushType(value: String): Self = this.set("apnsPushType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApnsPushType: Self = this.set("apnsPushType", js.undefined)
  }
}
