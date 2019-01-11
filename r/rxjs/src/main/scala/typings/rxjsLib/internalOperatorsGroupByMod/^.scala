package typings
package rxjsLib.internalOperatorsGroupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/groupBy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, T]] = js.native
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: scala.Unit,
    durationSelector: js.Function1[
      /* grouped */ rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, T], 
      rxjsLib.internalObservableMod.Observable[_]
    ]
  ): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, T]] = js.native
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R]] = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* grouped */ rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R], 
      rxjsLib.internalObservableMod.Observable[_]
    ]
  ): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R]] = js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* grouped */ rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R], 
      rxjsLib.internalObservableMod.Observable[_]
    ],
    subjectSelector: js.Function0[rxjsLib.internalSubjectMod.Subject[R]]
  ): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R]] = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): rxjsLib.internalTypesMod.OperatorFunction[T, rxjsLib.internalOperatorsGroupByMod.GroupedObservable[K, R]] = js.native
}

