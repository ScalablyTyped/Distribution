package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.notification
  - typings.reactNative.reactNativeStrings.localNotification
  - typings.reactNative.reactNativeStrings.register
  - typings.reactNative.reactNativeStrings.registrationError
*/
trait PushNotificationEventName extends js.Object

object PushNotificationEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localNotification: typings.reactNative.reactNativeStrings.localNotification = this.cast("localNotification")
  @scala.inline
  def notification: typings.reactNative.reactNativeStrings.notification = this.cast("notification")
  @scala.inline
  def register: typings.reactNative.reactNativeStrings.register = this.cast("register")
  @scala.inline
  def registrationError: typings.reactNative.reactNativeStrings.registrationError = this.cast("registrationError")
}

