package typings
package rxjsLib.internalSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- rxjsLib.internalTypesMod.Observer because var conflicts: closed. Inlined next, error, complete */ @JSImport("rxjs/internal/Subscriber", "Subscriber")
@js.native
/**
  * @param {Observer|function(value: T): void} [destinationOrNext] A partially
  * defined Observer or a `next` callback function.
  * @param {function(e: ?any): void} [error] The `error` callback of an
  * Observer.
  * @param {function(): void} [complete] The `complete` callback of an
  * Observer.
  */
class Subscriber[T] ()
  extends rxjsLib.internalSubscriptionMod.Subscription {
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_]) = this()
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit], complete: js.Function0[scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit], complete: js.Function0[scala.Unit]) = this()
  var destination: rxjsLib.internalTypesMod.PartialObserver[_] | Subscriber[_] = js.native
  var isStopped: scala.Boolean = js.native
  /** @internal */ var syncErrorThrowable: scala.Boolean = js.native
  /** @internal */ var syncErrorThrown: scala.Boolean = js.native
  /** @internal */ var syncErrorValue: js.Any = js.native
  /* protected */ def _complete(): scala.Unit = js.native
  /* protected */ def _error(err: js.Any): scala.Unit = js.native
  /* protected */ def _next(value: T): scala.Unit = js.native
  /** @deprecated This is an internal implementation detail, do not use. */
  def _unsubscribeAndRecycle(): Subscriber[T] = js.native
  /**
    * The {@link Observer} callback to receive a valueless notification of type
    * `complete` from the Observable. Notifies the Observer that the Observable
    * has finished sending push-based notifications.
    * @return {void}
    */
  def complete(): scala.Unit = js.native
  /**
    * The {@link Observer} callback to receive notifications of type `error` from
    * the Observable, with an attached `Error`. Notifies the Observer that
    * the Observable has experienced an error condition.
    * @param {any} [err] The `error` exception.
    * @return {void}
    */
  def error(): scala.Unit = js.native
  def error(err: js.Any): scala.Unit = js.native
  /**
    * The {@link Observer} callback to receive notifications of type `next` from
    * the Observable, with a value. The Observable may call this method 0 or more
    * times.
    * @param {T} [value] The `next` value.
    * @return {void}
    */
  def next(): scala.Unit = js.native
  def next(value: T): scala.Unit = js.native
}

/* static members */
@JSImport("rxjs/internal/Subscriber", "Subscriber")
@js.native
object Subscriber extends js.Object {
  /**
    * A static factory for a Subscriber, given a (potentially partial) definition
    * of an Observer.
    * @param {function(x: ?T): void} [next] The `next` callback of an Observer.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    * @return {Subscriber<T>} A Subscriber wrapping the (partially defined)
    * Observer represented by the given arguments.
    * @nocollapse
    */
  def create[T](): rxjsLib.internalSubscriberMod.Subscriber[T] = js.native
  def create[T](next: js.Function1[/* x */ js.UndefOr[T], scala.Unit]): rxjsLib.internalSubscriberMod.Subscriber[T] = js.native
  def create[T](
    next: js.Function1[/* x */ js.UndefOr[T], scala.Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]
  ): rxjsLib.internalSubscriberMod.Subscriber[T] = js.native
  def create[T](
    next: js.Function1[/* x */ js.UndefOr[T], scala.Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit],
    complete: js.Function0[scala.Unit]
  ): rxjsLib.internalSubscriberMod.Subscriber[T] = js.native
}

