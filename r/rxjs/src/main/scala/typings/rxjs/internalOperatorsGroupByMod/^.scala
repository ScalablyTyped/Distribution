package typings.rxjs.internalOperatorsGroupByMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalSubjectMod.Subject
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/groupBy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
}

