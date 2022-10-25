package typings.sipJs

import typings.sipJs.libApiMessageMod.Message
import typings.sipJs.libApiNotificationMod.Notification
import typings.sipJs.libApiSessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionManagerSessionManagerDelegateMod {
  
  trait SessionManagerDelegate extends StObject {
    
    /**
      * Called when a call is answered.
      * @remarks
      * Callback for handling establishment of a new Session.
      */
    var onCallAnswered: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.undefined
    
    /**
      * Called when a call is created.
      * @remarks
      * Callback for handling the creation of a new Session.
      */
    var onCallCreated: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.undefined
    
    /**
      * Called when a call receives an incoming DTMF tone.
      * @remarks
      * Callback for handling an incoming INFO request with content type application/dtmf-relay.
      */
    var onCallDTMFReceived: js.UndefOr[
        js.Function3[/* session */ Session, /* tone */ String, /* duration */ Double, Unit]
      ] = js.undefined
    
    /**
      * Called when a call is hung up.
      * @remarks
      * Callback for handling termination of a Session.
      */
    var onCallHangup: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.undefined
    
    /**
      * Called when a call is put on hold or taken off hold.
      * @remarks
      * Callback for handling re-INVITE responses.
      */
    var onCallHold: js.UndefOr[js.Function2[/* session */ Session, /* held */ Boolean, Unit]] = js.undefined
    
    /**
      * Called when a call is received.
      * @remarks
      * Callback for handling incoming INVITE requests.
      * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
      */
    var onCallReceived: js.UndefOr[js.Function1[/* session */ Session, Unit]] = js.undefined
    
    /**
      * Called upon receiving a message.
      * @remarks
      * Callback for handling incoming MESSAGE requests.
      * @param message - The message received.
      */
    var onMessageReceived: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    /**
      * Called upon receiving a notification.
      * @remarks
      * Callback for handling incoming NOTIFY requests.
      * @param notification - The notication received.
      */
    var onNotificationReceived: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /**
      * Called when user is registered to received calls.
      */
    var onRegistered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when user is connected to server.
      * @remarks
      * Callback for handling user becomes connected.
      */
    var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when user is no longer connected.
      * @remarks
      * Callback for handling user becomes disconnected.
      *
      * @param error - An Error if server caused the disconnect. Otherwise undefined.
      */
    var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    /**
      * Called when user is no longer registered to received calls.
      */
    var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SessionManagerDelegate {
    
    inline def apply(): SessionManagerDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionManagerDelegate]
    }
    
    extension [Self <: SessionManagerDelegate](x: Self) {
      
      inline def setOnCallAnswered(value: /* session */ Session => Unit): Self = StObject.set(x, "onCallAnswered", js.Any.fromFunction1(value))
      
      inline def setOnCallAnsweredUndefined: Self = StObject.set(x, "onCallAnswered", js.undefined)
      
      inline def setOnCallCreated(value: /* session */ Session => Unit): Self = StObject.set(x, "onCallCreated", js.Any.fromFunction1(value))
      
      inline def setOnCallCreatedUndefined: Self = StObject.set(x, "onCallCreated", js.undefined)
      
      inline def setOnCallDTMFReceived(value: (/* session */ Session, /* tone */ String, /* duration */ Double) => Unit): Self = StObject.set(x, "onCallDTMFReceived", js.Any.fromFunction3(value))
      
      inline def setOnCallDTMFReceivedUndefined: Self = StObject.set(x, "onCallDTMFReceived", js.undefined)
      
      inline def setOnCallHangup(value: /* session */ Session => Unit): Self = StObject.set(x, "onCallHangup", js.Any.fromFunction1(value))
      
      inline def setOnCallHangupUndefined: Self = StObject.set(x, "onCallHangup", js.undefined)
      
      inline def setOnCallHold(value: (/* session */ Session, /* held */ Boolean) => Unit): Self = StObject.set(x, "onCallHold", js.Any.fromFunction2(value))
      
      inline def setOnCallHoldUndefined: Self = StObject.set(x, "onCallHold", js.undefined)
      
      inline def setOnCallReceived(value: /* session */ Session => Unit): Self = StObject.set(x, "onCallReceived", js.Any.fromFunction1(value))
      
      inline def setOnCallReceivedUndefined: Self = StObject.set(x, "onCallReceived", js.undefined)
      
      inline def setOnMessageReceived(value: /* message */ Message => Unit): Self = StObject.set(x, "onMessageReceived", js.Any.fromFunction1(value))
      
      inline def setOnMessageReceivedUndefined: Self = StObject.set(x, "onMessageReceived", js.undefined)
      
      inline def setOnNotificationReceived(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotificationReceived", js.Any.fromFunction1(value))
      
      inline def setOnNotificationReceivedUndefined: Self = StObject.set(x, "onNotificationReceived", js.undefined)
      
      inline def setOnRegistered(value: () => Unit): Self = StObject.set(x, "onRegistered", js.Any.fromFunction0(value))
      
      inline def setOnRegisteredUndefined: Self = StObject.set(x, "onRegistered", js.undefined)
      
      inline def setOnServerConnect(value: () => Unit): Self = StObject.set(x, "onServerConnect", js.Any.fromFunction0(value))
      
      inline def setOnServerConnectUndefined: Self = StObject.set(x, "onServerConnect", js.undefined)
      
      inline def setOnServerDisconnect(value: /* error */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "onServerDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnServerDisconnectUndefined: Self = StObject.set(x, "onServerDisconnect", js.undefined)
      
      inline def setOnUnregistered(value: () => Unit): Self = StObject.set(x, "onUnregistered", js.Any.fromFunction0(value))
      
      inline def setOnUnregisteredUndefined: Self = StObject.set(x, "onUnregistered", js.undefined)
    }
  }
}
