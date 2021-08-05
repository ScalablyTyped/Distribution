package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.AuthStates
import typings.socketclusterClient.clientsocketMod.States
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketclusterClientStrings {
  
  @js.native
  sealed trait authStateChange extends StObject
  inline def authStateChange: authStateChange = "authStateChange".asInstanceOf[authStateChange]
  
  @js.native
  sealed trait authenticate extends StObject
  inline def authenticate: authenticate = "authenticate".asInstanceOf[authenticate]
  
  @js.native
  sealed trait authenticated
    extends StObject
       with AuthStates
  inline def authenticated: authenticated = "authenticated".asInstanceOf[authenticated]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait closed
    extends StObject
       with States
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connectAbort extends StObject
  inline def connectAbort: connectAbort = "connectAbort".asInstanceOf[connectAbort]
  
  @js.native
  sealed trait connecting
    extends StObject
       with States
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait deauthenticate extends StObject
  inline def deauthenticate: deauthenticate = "deauthenticate".asInstanceOf[deauthenticate]
  
  @js.native
  sealed trait disconnect extends StObject
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait kickOut extends StObject
  inline def kickOut: kickOut = "kickOut".asInstanceOf[kickOut]
  
  @js.native
  sealed trait open
    extends StObject
       with States
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait pending extends StObject
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait removeAuthToken extends StObject
  inline def removeAuthToken: removeAuthToken = "removeAuthToken".asInstanceOf[removeAuthToken]
  
  @js.native
  sealed trait subscribe extends StObject
  inline def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait subscribeFail extends StObject
  inline def subscribeFail: subscribeFail = "subscribeFail".asInstanceOf[subscribeFail]
  
  @js.native
  sealed trait subscribeRequest extends StObject
  inline def subscribeRequest: subscribeRequest = "subscribeRequest".asInstanceOf[subscribeRequest]
  
  @js.native
  sealed trait subscribeStateChange extends StObject
  inline def subscribeStateChange: subscribeStateChange = "subscribeStateChange".asInstanceOf[subscribeStateChange]
  
  @js.native
  sealed trait subscribed extends StObject
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with AuthStates
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unsubscribe extends StObject
  inline def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  
  @js.native
  sealed trait unsubscribed extends StObject
  inline def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}
