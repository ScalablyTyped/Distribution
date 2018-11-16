package typings
package rxjsLib.internalNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Notification", "Notification")
@js.native
class Notification[T] protected () extends js.Object {
  def this(kind: java.lang.String) = this()
  def this(kind: java.lang.String, value: T) = this()
  def this(kind: java.lang.String, value: T, error: js.Any) = this()
  var error: js.UndefOr[js.Any] = js.native
  var hasValue: scala.Boolean = js.native
  var kind: java.lang.String = js.native
  var value: js.UndefOr[T] = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(nextOrObserver: js.Function1[/* value */ T, scala.Unit]): js.Any = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(
    nextOrObserver: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(
    nextOrObserver: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* err */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): js.Any = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(nextOrObserver: rxjsLib.internalTypesMod.PartialObserver[T]): js.Any = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(
    nextOrObserver: rxjsLib.internalTypesMod.PartialObserver[T],
    error: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
       * Takes an Observer or its individual callback functions, and calls `observe`
       * or `do` methods accordingly.
       * @param {Observer|function(value: T): void} nextOrObserver An Observer or
       * the `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def accept(
    nextOrObserver: rxjsLib.internalTypesMod.PartialObserver[T],
    error: js.Function1[/* err */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): js.Any = js.native
  /**
       * Given some {@link Observer} callbacks, deliver the value represented by the
       * current Notification to the correctly corresponding callback.
       * @param {function(value: T): void} next An Observer `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def `do`(next: js.Function1[/* value */ T, scala.Unit]): js.Any = js.native
  /**
       * Given some {@link Observer} callbacks, deliver the value represented by the
       * current Notification to the correctly corresponding callback.
       * @param {function(value: T): void} next An Observer `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def `do`(next: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* err */ js.Any, scala.Unit]): js.Any = js.native
  /**
       * Given some {@link Observer} callbacks, deliver the value represented by the
       * current Notification to the correctly corresponding callback.
       * @param {function(value: T): void} next An Observer `next` callback.
       * @param {function(err: any): void} [error] An Observer `error` callback.
       * @param {function(): void} [complete] An Observer `complete` callback.
       * @return {any}
       */
  def `do`(
    next: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* err */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): js.Any = js.native
  /**
       * Delivers to the given `observer` the value wrapped by this Notification.
       * @param {Observer} observer
       * @return
       */
  def observe(observer: rxjsLib.internalTypesMod.PartialObserver[T]): js.Any = js.native
  /**
       * Returns a simple Observable that just delivers the notification represented
       * by this Notification instance.
       * @return {any}
       */
  def toObservable(): rxjsLib.internalObservableMod.Observable[T] = js.native
}

@JSImport("rxjs/internal/Notification", "Notification")
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
  /**
       * A shortcut to create a Notification instance of the type `error` from a
       * given error.
       * @param {any} [err] The `error` error.
       * @return {Notification<T>} The "error" Notification representing the
       * argument.
       * @nocollapse
       */
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

