package typings.rxjs.internalObservableCombineLatestMod

import typings.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/combineLatest", "CombineLatestSubscriber")
@js.native
class CombineLatestSubscriber[T, R] protected () extends OuterSubscriber[T, R] {
  def this(destination: Subscriber[R]) = this()
  def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  var _tryResultSelector: js.Any = js.native
  var active: js.Any = js.native
  var observables: js.Any = js.native
  var resultSelector: js.UndefOr[js.Any] = js.native
  var toRespond: js.Any = js.native
  var values: js.Any = js.native
  /* protected */ def _next(observable: js.Any): Unit = js.native
  def notifyComplete(unused: Subscriber[R]): Unit = js.native
}

