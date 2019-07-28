package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import typings.rxjs.rxjsMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/groupBy", JSImport.Namespace)
@js.native
object operatorGroupByMod extends js.Object {
  def groupBy[T, K](`this`: Observable[T], keySelector: js.Function1[/* value */ T, K]): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ _
  ] = js.native
  def groupBy[T, K](
    `this`: Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
      Observable[_]
    ]
  ): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ _
  ] = js.native
  def groupBy[T, K, R](
    `this`: Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R]
  ): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ _
  ] = js.native
  def groupBy[T, K, R](
    `this`: Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      Observable[_]
    ]
  ): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ _
  ] = js.native
  def groupBy[T, K, R](
    `this`: Observable[T],
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
      Observable[_]
    ],
    subjectSelector: js.Function0[Subject[R]]
  ): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ _
  ] = js.native
  @JSName("groupBy")
  def groupBy_TKR[T, K, R](`this`: Observable[T], keySelector: js.Function1[/* value */ T, K]): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ _
  ] = js.native
}

