package typings.pubnub.mod

import typings.pubnub.anon.Apns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsPayload extends StObject {
  
  var apns: APNSNotificationPayload
  
  var badge: js.UndefOr[Double] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  def buildPayload(platforms: js.Array[String]): js.Object
  
  var debugging: Boolean
  
  var fcm: FCMNotificationPayload
  
  var mpns: MPNSNotificationPayload
  
  var payload: Apns
  
  var sound: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object NotificationsPayload {
  
  inline def apply(
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
  
  extension [Self <: NotificationsPayload](x: Self) {
    
    inline def setApns(value: APNSNotificationPayload): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBuildPayload(value: js.Array[String] => js.Object): Self = StObject.set(x, "buildPayload", js.Any.fromFunction1(value))
    
    inline def setDebugging(value: Boolean): Self = StObject.set(x, "debugging", value.asInstanceOf[js.Any])
    
    inline def setFcm(value: FCMNotificationPayload): Self = StObject.set(x, "fcm", value.asInstanceOf[js.Any])
    
    inline def setMpns(value: MPNSNotificationPayload): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Apns): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
