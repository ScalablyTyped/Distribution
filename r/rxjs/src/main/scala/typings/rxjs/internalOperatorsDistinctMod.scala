package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/distinct", JSImport.Namespace)
@js.native
object internalOperatorsDistinctMod extends js.Object {
  @js.native
  class DistinctSubscriber[T, K] protected () extends OuterSubscriber[T, T] {
    def this(destination: Subscriber[T], keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]) = this()
    var _finalizeNext: js.Any = js.native
    var _useKeySelector: js.Any = js.native
    var keySelector: js.Any = js.native
    var values: js.Any = js.native
  }
  
  def distinct[T, K](): MonoTypeOperatorFunction[T] = js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

