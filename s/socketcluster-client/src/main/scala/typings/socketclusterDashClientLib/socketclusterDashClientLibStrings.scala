package typings
package socketclusterDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object socketclusterDashClientLibStrings {
  @js.native
  sealed trait authStateChange extends js.Object
  
  @js.native
  sealed trait authenticate extends js.Object
  
  @js.native
  sealed trait authenticated
    extends socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.AuthStates
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait closed
    extends socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.States
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connectAbort extends js.Object
  
  @js.native
  sealed trait connecting
    extends socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.States
  
  @js.native
  sealed trait deauthenticate extends js.Object
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait kickOut extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait open
    extends socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.States
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait raw extends js.Object
  
  @js.native
  sealed trait removeAuthToken extends js.Object
  
  @js.native
  sealed trait subscribe extends js.Object
  
  @js.native
  sealed trait subscribeFail extends js.Object
  
  @js.native
  sealed trait subscribeRequest extends js.Object
  
  @js.native
  sealed trait subscribeStateChange extends js.Object
  
  @js.native
  sealed trait unauthenticated
    extends socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.AuthStates
  
  @js.native
  sealed trait unsubscribe extends js.Object
  
  @scala.inline
  def authStateChange: authStateChange = "authStateChange".asInstanceOf[authStateChange]
  @scala.inline
  def authenticate: authenticate = "authenticate".asInstanceOf[authenticate]
  @scala.inline
  def authenticated: authenticated = "authenticated".asInstanceOf[authenticated]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def connectAbort: connectAbort = "connectAbort".asInstanceOf[connectAbort]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def deauthenticate: deauthenticate = "deauthenticate".asInstanceOf[deauthenticate]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def kickOut: kickOut = "kickOut".asInstanceOf[kickOut]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def removeAuthToken: removeAuthToken = "removeAuthToken".asInstanceOf[removeAuthToken]
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  @scala.inline
  def subscribeFail: subscribeFail = "subscribeFail".asInstanceOf[subscribeFail]
  @scala.inline
  def subscribeRequest: subscribeRequest = "subscribeRequest".asInstanceOf[subscribeRequest]
  @scala.inline
  def subscribeStateChange: subscribeStateChange = "subscribeStateChange".asInstanceOf[subscribeStateChange]
  @scala.inline
  def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}

