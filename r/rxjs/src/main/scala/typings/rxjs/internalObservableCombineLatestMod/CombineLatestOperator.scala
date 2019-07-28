package typings.rxjs.internalObservableCombineLatestMod

import typings.rxjs.internalOperatorMod.Operator
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/combineLatest", "CombineLatestOperator")
@js.native
class CombineLatestOperator[T, R] () extends Operator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  var resultSelector: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
}

