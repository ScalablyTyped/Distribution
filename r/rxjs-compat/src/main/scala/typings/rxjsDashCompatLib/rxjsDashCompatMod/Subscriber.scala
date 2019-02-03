package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Subscriber")
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
  extends rxjsLib.rxjsMod.Subscriber[T] {
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_]) = this()
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(destinationOrNext: js.Function1[/* value */ T, scala.Unit], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit], complete: js.Function0[scala.Unit]) = this()
  def this(destinationOrNext: rxjsLib.internalTypesMod.PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit], complete: js.Function0[scala.Unit]) = this()
}

/* static members */
@JSImport("rxjs-compat", "Subscriber")
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

