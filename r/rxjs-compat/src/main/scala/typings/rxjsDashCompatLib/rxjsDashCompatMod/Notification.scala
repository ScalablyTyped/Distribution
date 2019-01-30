package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Notification")
@js.native
class Notification[T] protected ()
  extends rxjsLib.rxjsMod.Notification[T] {
  def this(kind: rxjsLib.internalNotificationMod.NotificationKind) = this()
  def this(kind: rxjsLib.internalNotificationMod.NotificationKind, value: T) = this()
  def this(kind: rxjsLib.internalNotificationMod.NotificationKind, value: T, error: js.Any) = this()
}

@JSImport("rxjs-compat", "Notification")
@js.native
object Notification extends js.Object {
  var completeNotification: js.Any = js.native
  var undefinedValueNotification: js.Any = js.native
  /**
    * A shortcut to create a Notification instance of the type `complete`.
    * @return {Notification<any>} The valueless "complete" Notification.
    * @nocollapse
    */
  def createComplete(): rxjsLib.internalNotificationMod.Notification[_] = js.native
  /**
    * A shortcut to create a Notification instance of the type `error` from a
    * given error.
    * @param {any} [err] The `error` error.
    * @return {Notification<T>} The "error" Notification representing the
    * argument.
    * @nocollapse
    */
  def createError[T](): rxjsLib.internalNotificationMod.Notification[T] = js.native
  def createError[T](err: js.Any): rxjsLib.internalNotificationMod.Notification[T] = js.native
  /**
    * A shortcut to create a Notification instance of the type `next` from a
    * given value.
    * @param {T} value The `next` value.
    * @return {Notification<T>} The "next" Notification representing the
    * argument.
    * @nocollapse
    */
  def createNext[T](value: T): rxjsLib.internalNotificationMod.Notification[T] = js.native
}

