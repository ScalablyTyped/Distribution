package typings.rxjs.rxMod

import typings.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "Subscriber")
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
  extends typings.rxjs.subscriberMod.Subscriber[T] {
  def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
  def this(destinationOrNext: PartialObserver[_]) = this()
  def this(
    destinationOrNext: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ) = this()
  def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
  def this(
    destinationOrNext: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
    complete: js.Function0[Unit]
  ) = this()
  def this(
    destinationOrNext: PartialObserver[_],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
    complete: js.Function0[Unit]
  ) = this()
}

/* static members */
@JSImport("rxjs/internal/Rx", "Subscriber")
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
  def create[T](): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def create[T](
    next: js.Function1[/* x */ js.UndefOr[T], Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
  def create[T](
    next: js.Function1[/* x */ js.UndefOr[T], Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
    complete: js.Function0[Unit]
  ): typings.rxjs.subscriberMod.Subscriber[T] = js.native
}

