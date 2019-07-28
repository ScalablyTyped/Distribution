package typings.rxjsDashCompat.rxjsDashCompatMod

import typings.rxjsDashCompat.rxjsDashCompatStrings.C
import typings.rxjsDashCompat.rxjsDashCompatStrings.E
import typings.rxjsDashCompat.rxjsDashCompatStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Notification")
@js.native
class Notification[T] protected ()
  extends typings.rxjs.rxjsMod.Notification[T] {
  def this(kind: C) = this()
  def this(kind: E) = this()
  def this(kind: N) = this()
  def this(kind: C, value: T) = this()
  def this(kind: E, value: T) = this()
  def this(kind: N, value: T) = this()
  def this(kind: C, value: T, error: js.Any) = this()
  def this(kind: E, value: T, error: js.Any) = this()
  def this(kind: N, value: T, error: js.Any) = this()
}

/* static members */
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
  def createComplete(): typings.rxjs.internalNotificationMod.Notification[_] = js.native
  /**
    * A shortcut to create a Notification instance of the type `error` from a
    * given error.
    * @param {any} [err] The `error` error.
    * @return {Notification<T>} The "error" Notification representing the
    * argument.
    * @nocollapse
    */
  def createError[T](): typings.rxjs.internalNotificationMod.Notification[T] = js.native
  def createError[T](err: js.Any): typings.rxjs.internalNotificationMod.Notification[T] = js.native
  /**
    * A shortcut to create a Notification instance of the type `next` from a
    * given value.
    * @param {T} value The `next` value.
    * @return {Notification<T>} The "next" Notification representing the
    * argument.
    * @nocollapse
    */
  def createNext[T](value: T): typings.rxjs.internalNotificationMod.Notification[T] = js.native
}

