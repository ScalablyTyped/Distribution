package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.AuthStates
import typings.socketclusterClient.clientsocketMod.States
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketclusterClientStrings {
  
  @js.native
  sealed trait authStateChange extends StObject
  @scala.inline
  def authStateChange: authStateChange = "authStateChange".asInstanceOf[authStateChange]
  
  @js.native
  sealed trait authenticate extends StObject
  @scala.inline
  def authenticate: authenticate = "authenticate".asInstanceOf[authenticate]
  
  @js.native
  sealed trait authenticated extends AuthStates
  @scala.inline
  def authenticated: authenticated = "authenticated".asInstanceOf[authenticated]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait closed extends States
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait connect extends StObject
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connectAbort extends StObject
  @scala.inline
  def connectAbort: connectAbort = "connectAbort".asInstanceOf[connectAbort]
  
  @js.native
  sealed trait connecting extends States
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait deauthenticate extends StObject
  @scala.inline
  def deauthenticate: deauthenticate = "deauthenticate".asInstanceOf[deauthenticate]
  
  @js.native
  sealed trait disconnect extends StObject
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait kickOut extends StObject
  @scala.inline
  def kickOut: kickOut = "kickOut".asInstanceOf[kickOut]
  
  @js.native
  sealed trait open extends States
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait pending extends StObject
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait removeAuthToken extends StObject
  @scala.inline
  def removeAuthToken: removeAuthToken = "removeAuthToken".asInstanceOf[removeAuthToken]
  
  @js.native
  sealed trait subscribe extends StObject
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait subscribeFail extends StObject
  @scala.inline
  def subscribeFail: subscribeFail = "subscribeFail".asInstanceOf[subscribeFail]
  
  @js.native
  sealed trait subscribeRequest extends StObject
  @scala.inline
  def subscribeRequest: subscribeRequest = "subscribeRequest".asInstanceOf[subscribeRequest]
  
  @js.native
  sealed trait subscribeStateChange extends StObject
  @scala.inline
  def subscribeStateChange: subscribeStateChange = "subscribeStateChange".asInstanceOf[subscribeStateChange]
  
  @js.native
  sealed trait subscribed extends StObject
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait unauthenticated extends AuthStates
  @scala.inline
  def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unsubscribe extends StObject
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  
  @js.native
  sealed trait unsubscribed extends StObject
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}
