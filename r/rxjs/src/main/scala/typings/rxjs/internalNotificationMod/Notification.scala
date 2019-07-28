package typings.rxjs.internalNotificationMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.PartialObserver
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Notification", "Notification")
@js.native
class Notification[T] protected () extends js.Object {
  def this(kind: C) = this()
  def this(kind: E) = this()
  def this(kind: N) = this()
  def this(kind: C, value: T) = this()
  def this(kind: E, value: T) = this()
  def this(kind: N, value: T) = this()
  def this(kind: C, value: T, error: js.Any) = this()
  def this(kind: E, value: T, error: js.Any) = this()
  def this(kind: N, value: T, error: js.Any) = this()
  var error: js.UndefOr[js.Any] = js.native
  var hasValue: Boolean = js.native
  var kind: N | E | C = js.native
  var value: js.UndefOr[T] = js.native
  def accept(nextOrObserver: js.Function1[/* value */ T, Unit]): js.Any = js.native
  def accept(nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
  def accept(
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* err */ js.Any, Unit],
    complete: js.Function0[Unit]
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
  def accept(nextOrObserver: PartialObserver[T]): js.Any = js.native
  def accept(nextOrObserver: PartialObserver[T], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
  def accept(
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* err */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = js.native
  /**
    * Given some {@link Observer} callbacks, deliver the value represented by the
    * current Notification to the correctly corresponding callback.
    * @param {function(value: T): void} next An Observer `next` callback.
    * @param {function(err: any): void} [error] An Observer `error` callback.
    * @param {function(): void} [complete] An Observer `complete` callback.
    * @return {any}
    */
  def `do`(next: js.Function1[/* value */ T, Unit]): js.Any = js.native
  def `do`(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
  def `do`(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* err */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = js.native
  /**
    * Delivers to the given `observer` the value wrapped by this Notification.
    * @param {Observer} observer
    * @return
    */
  def observe(observer: PartialObserver[T]): js.Any = js.native
  /**
    * Returns a simple Observable that just delivers the notification represented
    * by this Notification instance.
    * @return {any}
    */
  def toObservable(): Observable[T] = js.native
}

/* static members */
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
  def createComplete(): Notification[_] = js.native
  /**
    * A shortcut to create a Notification instance of the type `error` from a
    * given error.
    * @param {any} [err] The `error` error.
    * @return {Notification<T>} The "error" Notification representing the
    * argument.
    * @nocollapse
    */
  def createError[T](): Notification[T] = js.native
  def createError[T](err: js.Any): Notification[T] = js.native
  /**
    * A shortcut to create a Notification instance of the type `next` from a
    * given value.
    * @param {T} value The `next` value.
    * @return {Notification<T>} The "next" Notification representing the
    * argument.
    * @nocollapse
    */
  def createNext[T](value: T): Notification[T] = js.native
}

