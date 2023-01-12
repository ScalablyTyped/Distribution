package typings.reactNativePushNotification

import org.scalablytyped.runtime.Shortcut
import typings.reactNativePushNotification.anon.Id
import typings.reactNativePushNotification.anon.OmitReceivedNotificationu
import typings.reactNativePushNotification.anon.Os
import typings.reactNativePushNotification.reactNativePushNotificationStrings.`private`
import typings.reactNativePushNotification.reactNativePushNotificationStrings.alert
import typings.reactNativePushNotification.reactNativePushNotificationStrings.badge
import typings.reactNativePushNotification.reactNativePushNotificationStrings.day
import typings.reactNativePushNotification.reactNativePushNotificationStrings.high
import typings.reactNativePushNotification.reactNativePushNotificationStrings.hour
import typings.reactNativePushNotification.reactNativePushNotificationStrings.low
import typings.reactNativePushNotification.reactNativePushNotificationStrings.max
import typings.reactNativePushNotification.reactNativePushNotificationStrings.min
import typings.reactNativePushNotification.reactNativePushNotificationStrings.minute
import typings.reactNativePushNotification.reactNativePushNotificationStrings.none
import typings.reactNativePushNotification.reactNativePushNotificationStrings.public
import typings.reactNativePushNotification.reactNativePushNotificationStrings.secret
import typings.reactNativePushNotification.reactNativePushNotificationStrings.sound
import typings.reactNativePushNotification.reactNativePushNotificationStrings.time
import typings.reactNativePushNotification.reactNativePushNotificationStrings.unspecified
import typings.reactNativePushNotification.reactNativePushNotificationStrings.week
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-push-notification", JSImport.Default)
  @js.native
  val default: PushNotification = js.native
  
  @JSImport("react-native-push-notification", "ChannelObject")
  @js.native
  open class ChannelObject () extends StObject {
    
    var channelDescription: js.UndefOr[String] = js.native
    
    var channelId: String = js.native
    
    var channelName: String = js.native
    
    var importance: js.UndefOr[Importance] = js.native
    
    var playSound: js.UndefOr[Boolean] = js.native
    
    var soundName: js.UndefOr[String] = js.native
    
    var vibrate: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  sealed trait Importance extends StObject
  @JSImport("react-native-push-notification", "Importance")
  @js.native
  object Importance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Importance & Double] = js.native
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with Importance
    /* 3 */ val DEFAULT: typings.reactNativePushNotification.mod.Importance.DEFAULT & Double = js.native
    
    @js.native
    sealed trait HIGH
      extends StObject
         with Importance
    /* 4 */ val HIGH: typings.reactNativePushNotification.mod.Importance.HIGH & Double = js.native
    
    @js.native
    sealed trait LOW
      extends StObject
         with Importance
    /* 2 */ val LOW: typings.reactNativePushNotification.mod.Importance.LOW & Double = js.native
    
    @js.native
    sealed trait MIN
      extends StObject
         with Importance
    /* 1 */ val MIN: typings.reactNativePushNotification.mod.Importance.MIN & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with Importance
    /* 0 */ val NONE: typings.reactNativePushNotification.mod.Importance.NONE & Double = js.native
    
    @js.native
    sealed trait UNSPECIFIED
      extends StObject
         with Importance
    /* -1000 */ val UNSPECIFIED: typings.reactNativePushNotification.mod.Importance.UNSPECIFIED & Double = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationDeliveredObject")
  @js.native
  open class PushNotificationDeliveredObject () extends StObject {
    
    var body: String = js.native
    
    var category: js.UndefOr[String] = js.native
    
    var group: String = js.native
    
    var identifier: String = js.native
    
    var tag: String = js.native
    
    var title: String = js.native
    
    var userInfo: js.UndefOr[Any] = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationObject")
  @js.native
  open class PushNotificationObject () extends StObject {
    
    var actions: js.UndefOr[js.Array[String]] = js.native
    
    var allowWhileIdle: js.UndefOr[Boolean] = js.native
    
    var autoCancel: js.UndefOr[Boolean] = js.native
    
    var bigLargeIcon: js.UndefOr[String] = js.native
    
    var bigLargeIconUrl: js.UndefOr[String] = js.native
    
    var bigPictureUrl: js.UndefOr[String] = js.native
    
    var bigText: js.UndefOr[String] = js.native
    
    /* iOS only properties */
    var category: js.UndefOr[Any] = js.native
    
    var channelId: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var groupSummary: js.UndefOr[Boolean] = js.native
    
    /* iOS and Android properties */
    var id: js.UndefOr[String | Double] = js.native
    
    var ignoreInForeground: js.UndefOr[Boolean] = js.native
    
    var importance: js.UndefOr[
        typings.reactNativePushNotification.reactNativePushNotificationStrings.default | max | high | low | min | none | unspecified
      ] = js.native
    
    var invokeApp: js.UndefOr[Boolean] = js.native
    
    var largeIcon: js.UndefOr[String] = js.native
    
    var largeIconUrl: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[String | Double] = js.native
    
    var ongoing: js.UndefOr[Boolean] = js.native
    
    var onlyAlertOnce: js.UndefOr[Boolean] = js.native
    
    var picture: js.UndefOr[String] = js.native
    
    var playSound: js.UndefOr[Boolean] = js.native
    
    var priority: js.UndefOr[
        max | high | low | min | typings.reactNativePushNotification.reactNativePushNotificationStrings.default
      ] = js.native
    
    var repeatTime: js.UndefOr[Double] = js.native
    
    var repeatType: js.UndefOr[week | day | hour | minute | time] = js.native
    
    var shortcutId: js.UndefOr[String] = js.native
    
    var showWhen: js.UndefOr[Boolean] = js.native
    
    var smallIcon: js.UndefOr[String] = js.native
    
    var soundName: js.UndefOr[String] = js.native
    
    var subText: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    /* Android only properties */
    var ticker: js.UndefOr[String] = js.native
    
    var timeoutAfter: js.UndefOr[Double | Null] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var userInfo: js.UndefOr[Any] = js.native
    
    var usesChronometer: js.UndefOr[Boolean] = js.native
    
    var vibrate: js.UndefOr[Boolean] = js.native
    
    var vibration: js.UndefOr[Double] = js.native
    
    var visibility: js.UndefOr[`private` | public | secret] = js.native
    
    var when: js.UndefOr[Double | Null] = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationScheduleObject")
  @js.native
  open class PushNotificationScheduleObject () extends PushNotificationObject {
    
    var date: js.Date = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationScheduledLocalObject")
  @js.native
  open class PushNotificationScheduledLocalObject () extends StObject {
    
    var data: Record[String, Any] = js.native
    
    var date: js.Date = js.native
    
    var id: String = js.native
    
    var message: String = js.native
    
    var number: Double = js.native
    
    var repeatInterval: Double = js.native
    
    var soundName: String = js.native
    
    var title: String = js.native
  }
  
  @js.native
  trait PushNotification extends StObject {
    
    def abandonPermissions(): Unit = js.native
    
    def cancelAllLocalNotifications(): Unit = js.native
    
    def cancelLocalNotification(notificationId: String): Unit = js.native
    
    /**
      * @deprecated use cancelLocalNotification method
      */
    def cancelLocalNotifications(details: Id): Unit = js.native
    
    def channelBlocked(channel_id: String, callback: js.Function1[/* blocked */ Boolean, Unit]): Unit = js.native
    
    def channelExists(channel_id: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, Unit]): Unit = js.native
    
    def clearAllNotifications(): Unit = js.native
    
    def clearLocalNotification(tag: String, notificationID: Double): Unit = js.native
    
    def configure(options: PushNotificationOptions): Unit = js.native
    
    def createChannel(channel: ChannelObject, callback: js.Function1[/* created */ Boolean, Unit]): Unit = js.native
    
    def deleteChannel(channel_id: String): Unit = js.native
    
    def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ Double, Unit]): Unit = js.native
    
    def getChannels(callback: js.Function1[/* channel_ids */ js.Array[String], Unit]): Unit = js.native
    
    def getDeliveredNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationDeliveredObject], Unit]): Unit = js.native
    
    def getScheduledLocalNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationScheduledLocalObject], Unit]): Unit = js.native
    
    def invokeApp(notification: PushNotificationObject): Unit = js.native
    
    def localNotification(notification: PushNotificationObject): Unit = js.native
    
    def localNotificationSchedule(notification: PushNotificationScheduleObject): Unit = js.native
    
    def popInitialNotification(callback: js.Function1[/* notification */ ReceivedNotification | Null, Unit]): Unit = js.native
    
    def presentLocalNotification(notification: PushNotificationObject): Unit = js.native
    
    def removeAllDeliveredNotifications(): Unit = js.native
    
    def removeDeliveredNotifications(identifiers: js.Array[String]): Unit = js.native
    
    def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
    def requestPermissions(permissions: js.Array[alert | badge | sound]): js.Promise[PushNotificationPermissions] = js.native
    
    def scheduleLocalNotification(notification: PushNotificationScheduleObject): Unit = js.native
    
    def setApplicationIconBadgeNumber(badgeCount: Double): Unit = js.native
    
    def subscribeToTopic(topic: String): Unit = js.native
    
    def unregister(): Unit = js.native
    
    def unsubscribeFromTopic(topic: String): Unit = js.native
  }
  
  trait PushNotificationOptions extends StObject {
    
    var onAction: js.UndefOr[js.Function1[/* notification */ ReceivedNotification, Unit]] = js.undefined
    
    var onNotification: js.UndefOr[js.Function1[/* notification */ OmitReceivedNotificationu, Unit]] = js.undefined
    
    var onRegister: js.UndefOr[js.Function1[/* token */ Os, Unit]] = js.undefined
    
    var onRegistrationError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onRemoteFetch: js.UndefOr[js.Function1[/* notificationData */ Any, Unit]] = js.undefined
    
    var permissions: js.UndefOr[PushNotificationPermissions] = js.undefined
    
    var popInitialNotification: js.UndefOr[Boolean] = js.undefined
    
    var requestPermissions: js.UndefOr[Boolean] = js.undefined
  }
  object PushNotificationOptions {
    
    inline def apply(): PushNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushNotificationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushNotificationOptions] (val x: Self) extends AnyVal {
      
      inline def setOnAction(value: /* notification */ ReceivedNotification => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      inline def setOnNotification(value: /* notification */ OmitReceivedNotificationu => Unit): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
      
      inline def setOnNotificationUndefined: Self = StObject.set(x, "onNotification", js.undefined)
      
      inline def setOnRegister(value: /* token */ Os => Unit): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      inline def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      inline def setOnRegistrationError(value: /* error */ Any => Unit): Self = StObject.set(x, "onRegistrationError", js.Any.fromFunction1(value))
      
      inline def setOnRegistrationErrorUndefined: Self = StObject.set(x, "onRegistrationError", js.undefined)
      
      inline def setOnRemoteFetch(value: /* notificationData */ Any => Unit): Self = StObject.set(x, "onRemoteFetch", js.Any.fromFunction1(value))
      
      inline def setOnRemoteFetchUndefined: Self = StObject.set(x, "onRemoteFetch", js.undefined)
      
      inline def setPermissions(value: PushNotificationPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPopInitialNotification(value: Boolean): Self = StObject.set(x, "popInitialNotification", value.asInstanceOf[js.Any])
      
      inline def setPopInitialNotificationUndefined: Self = StObject.set(x, "popInitialNotification", js.undefined)
      
      inline def setRequestPermissions(value: Boolean): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
      
      inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
    }
  }
  
  trait PushNotificationPermissions extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.undefined
    
    var badge: js.UndefOr[Boolean] = js.undefined
    
    var sound: js.UndefOr[Boolean] = js.undefined
  }
  object PushNotificationPermissions {
    
    inline def apply(): PushNotificationPermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushNotificationPermissions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushNotificationPermissions] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  trait ReceivedNotification extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var alert: js.Object
    
    var badge: Double
    
    var data: Record[String, Any]
    
    def finish(fetchResult: String): Unit
    
    var foreground: Boolean
    
    var id: String
    
    var message: String | js.Object
    
    var sound: String
    
    var subText: js.UndefOr[String] = js.undefined
    
    var userInfo: Record[String, Any]
    
    var userInteraction: Boolean
  }
  object ReceivedNotification {
    
    inline def apply(
      alert: js.Object,
      badge: Double,
      data: Record[String, Any],
      finish: String => Unit,
      foreground: Boolean,
      id: String,
      message: String | js.Object,
      sound: String,
      userInfo: Record[String, Any],
      userInteraction: Boolean
    ): ReceivedNotification = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), foreground = foreground.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any], userInteraction = userInteraction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceivedNotification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReceivedNotification] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAlert(value: js.Object): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: String => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String | js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      inline def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      inline def setUserInfo(value: Record[String, Any]): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInteraction(value: Boolean): Self = StObject.set(x, "userInteraction", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PushNotification
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PushNotification = default
}
