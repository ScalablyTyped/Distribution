package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messaging {
  
  @JSImport("react-native-firebase", "RNFirebase.messaging.IOSMessaging")
  @js.native
  class IOSMessaging () extends StObject {
    
    /**
      * Returns the devices APNS token.
      */
    def getAPNSToken(): js.Promise[String | Null] = js.native
    
    /**
      * Register for iOS remote notifications
      */
    def registerForRemoteNotifications(): js.Promise[Unit] = js.native
  }
  
  @JSImport("react-native-firebase", "RNFirebase.messaging.RemoteMessage")
  @js.native
  class RemoteMessage () extends StObject {
    
    var collapseKey: js.UndefOr[String] = js.native
    
    var data: js.Object = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var messageType: String = js.native
    
    var sentTime: js.UndefOr[Double] = js.native
    
    def setCollapseKey(collapseKey: String): RemoteMessage = js.native
    
    def setData(data: js.Object): RemoteMessage = js.native
    
    def setMessageId(messageId: String): RemoteMessage = js.native
    
    def setMessageType(messageType: String): RemoteMessage = js.native
    
    def setTo(to: String): RemoteMessage = js.native
    
    def setTtl(ttl: Double): RemoteMessage = js.native
    
    var to: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait Messaging extends StObject {
    
    def deleteToken(): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: String, scope: String): js.Promise[Unit] = js.native
    def deleteToken(authorizedEntity: Unit, scope: String): js.Promise[Unit] = js.native
    
    /**
      * Returns the devices FCM token.
      */
    def getToken(): js.Promise[String] = js.native
    
    /**
      * Checks if the app has notification permissions.
      */
    def hasPermission(): js.Promise[Boolean] = js.native
    
    /**
      * Returns firebase.messaging.IOSMessaging that gets the
      *  iOS specific methods and properties of messaging.
      */
    var ios: IOSMessaging = js.native
    
    /**
      * On a new message,
      * the payload object is passed to the listener callback.
      * This method is only triggered when the app is running.
      */
    def onMessage(listener: js.Function1[/* message */ js.Any, js.Any]): js.Function0[js.Any] = js.native
    
    /**
      * On the event a devices FCM token is refreshed by Google,
      *  the new token is returned in a callback listener.
      */
    def onTokenRefresh(listener: js.Function1[/* token */ String, js.Any]): js.Function0[js.Any] = js.native
    
    /**
      * Requests app notification permissions in an Alert dialog.
      */
    def requestPermission(): js.Promise[Unit] = js.native
    
    /**
      * Send an upstream message
      */
    def sendMessage(remoteMessage: RemoteMessage): js.Promise[Unit] = js.native
    
    /**
      * Subscribes the device to a topic.
      */
    def subscribeToTopic(topic: String): Unit = js.native
    
    /**
      * Unsubscribe the device from a topic.
      */
    def unsubscribeFromTopic(topic: String): Unit = js.native
  }
  
  trait MessagingStatics extends StObject {
    
    var RemoteMessage: Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.messaging.RemoteMessage]
  }
  object MessagingStatics {
    
    @scala.inline
    def apply(RemoteMessage: Instantiable0[RemoteMessage]): MessagingStatics = {
      val __obj = js.Dynamic.literal(RemoteMessage = RemoteMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagingStatics]
    }
    
    @scala.inline
    implicit class MessagingStaticsMutableBuilder[Self <: MessagingStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteMessage(value: Instantiable0[RemoteMessage]): Self = StObject.set(x, "RemoteMessage", value.asInstanceOf[js.Any])
    }
  }
}
