package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FCMNotificationPayload extends BaseNotificationPayload {
  
  var icon: js.UndefOr[String] = js.native
  
  var isSilent: Boolean = js.native
  
  var tag: js.UndefOr[String] = js.native
}
object FCMNotificationPayload {
  
  @scala.inline
  def apply(isSilent: Boolean, payload: js.Object): FCMNotificationPayload = {
    val __obj = js.Dynamic.literal(isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCMNotificationPayload]
  }
  
  @scala.inline
  implicit class FCMNotificationPayloadMutableBuilder[Self <: FCMNotificationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
