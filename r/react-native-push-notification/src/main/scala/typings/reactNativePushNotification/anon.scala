package typings.reactNativePushNotification

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<react-native-push-notification.react-native-push-notification.ReceivedNotification, 'userInfo'> */
  trait OmitReceivedNotificationu extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var alert: js.Object
    
    var badge: Double
    
    var data: Record[String, Any]
    
    def finish(fetchResult: String): Unit
    @JSName("finish")
    var finish_Original: js.Function1[/* fetchResult */ String, Unit]
    
    var foreground: Boolean
    
    var id: String
    
    var message: String | js.Object
    
    var sound: String
    
    var subText: js.UndefOr[String] = js.undefined
    
    var userInteraction: Boolean
  }
  object OmitReceivedNotificationu {
    
    inline def apply(
      alert: js.Object,
      badge: Double,
      data: Record[String, Any],
      finish: /* fetchResult */ String => Unit,
      foreground: Boolean,
      id: String,
      message: String | js.Object,
      sound: String,
      userInteraction: Boolean
    ): OmitReceivedNotificationu = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), foreground = foreground.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], userInteraction = userInteraction.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitReceivedNotificationu]
    }
    
    extension [Self <: OmitReceivedNotificationu](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAlert(value: js.Object): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: /* fetchResult */ String => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String | js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      inline def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      inline def setUserInteraction(value: Boolean): Self = StObject.set(x, "userInteraction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Os extends StObject {
    
    var os: String
    
    var token: String
  }
  object Os {
    
    inline def apply(os: String, token: String): Os = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Os]
    }
    
    extension [Self <: Os](x: Self) {
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
