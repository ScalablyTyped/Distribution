package typings.pubnub.mod

import typings.pubnub.anon.Apns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsPayload extends StObject {
  
  var apns: APNSNotificationPayload = js.native
  
  var badge: js.UndefOr[Double] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  def buildPayload(platforms: js.Array[String]): js.Object = js.native
  
  var debugging: Boolean = js.native
  
  var fcm: FCMNotificationPayload = js.native
  
  var mpns: MPNSNotificationPayload = js.native
  
  var payload: Apns = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object NotificationsPayload {
  
  @scala.inline
  def apply(
    apns: APNSNotificationPayload,
    buildPayload: js.Array[String] => js.Object,
    debugging: Boolean,
    fcm: FCMNotificationPayload,
    mpns: MPNSNotificationPayload,
    payload: Apns
  ): NotificationsPayload = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], buildPayload = js.Any.fromFunction1(buildPayload), debugging = debugging.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsPayload]
  }
  
  @scala.inline
  implicit class NotificationsPayloadMutableBuilder[Self <: NotificationsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: APNSNotificationPayload): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setBuildPayload(value: js.Array[String] => js.Object): Self = StObject.set(x, "buildPayload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugging(value: Boolean): Self = StObject.set(x, "debugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcm(value: FCMNotificationPayload): Self = StObject.set(x, "fcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpns(value: MPNSNotificationPayload): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Apns): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
