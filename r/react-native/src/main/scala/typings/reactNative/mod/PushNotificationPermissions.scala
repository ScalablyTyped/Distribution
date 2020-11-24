package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationPermissions extends js.Object {
  
  var alert: js.UndefOr[Boolean] = js.native
  
  var badge: js.UndefOr[Boolean] = js.native
  
  var sound: js.UndefOr[Boolean] = js.native
}
object PushNotificationPermissions {
  
  @scala.inline
  def apply(): PushNotificationPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationPermissions]
  }
  
  @scala.inline
  implicit class PushNotificationPermissionsOps[Self <: PushNotificationPermissions] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: Boolean): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setBadge(value: Boolean): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
  }
}
