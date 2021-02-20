package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationPermissions extends StObject {
  
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
  implicit class PushNotificationPermissionsMutableBuilder[Self <: PushNotificationPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    @scala.inline
    def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
  }
}
