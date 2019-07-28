package typings.rxjs.internalSubscriberMod

import typings.rxjs.internalTypesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subscriber", "SafeSubscriber")
@js.native
class SafeSubscriber[T] protected () extends Subscriber[T] {
  def this(_parentSubscriber: Subscriber[T]) = this()
  def this(_parentSubscriber: Subscriber[T], observerOrNext: js.Function1[/* value */ T, Unit]) = this()
  def this(_parentSubscriber: Subscriber[T], observerOrNext: PartialObserver[T]) = this()
  def this(
    _parentSubscriber: Subscriber[T],
    observerOrNext: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ) = this()
  def this(
    _parentSubscriber: Subscriber[T],
    observerOrNext: PartialObserver[T],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ) = this()
  def this(
    _parentSubscriber: Subscriber[T],
    observerOrNext: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
    complete: js.Function0[Unit]
  ) = this()
  def this(
    _parentSubscriber: Subscriber[T],
    observerOrNext: PartialObserver[T],
    error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
    complete: js.Function0[Unit]
  ) = this()
  var __tryOrSetError: js.Any = js.native
  var __tryOrUnsub: js.Any = js.native
  var _context: js.Any = js.native
  var _parentSubscriber: js.Any = js.native
  /** @internal This is an internal implementation detail, do not use. */
  def _unsubscribe(): Unit = js.native
}

