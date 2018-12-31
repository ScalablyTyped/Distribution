package typings
package rxjsLib.internalObservableCombineLatestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/combineLatest", "CombineLatestOperator")
@js.native
class CombineLatestOperator[T, R] ()
  extends rxjsLib.internalOperatorMod.Operator[T, R] {
  def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  var resultSelector: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override def call(subscriber: rxjsLib.internalSubscriberMod.Subscriber[R], source: js.Any): rxjsLib.internalTypesMod.TeardownLogic = js.native
}

