package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalOperatorsGroupByMod.BasicGroupByOptions
import typings.rxjs.distTypesInternalOperatorsGroupByMod.GroupByOptionsWithElement
import typings.rxjs.distTypesInternalOperatorsGroupByMod.GroupedObservable
import typings.rxjs.distTypesInternalSubjectMod.Subject
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjsCompat.rxjsCompatBooleans.`false`
import typings.rxjsCompat.rxjsCompatBooleans.`true`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsGroupByMod {
  
  @JSImport("rxjs-compat/operators/groupBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[T, K /* <: T */](key: js.Function1[/* value */ T, (/* is K */ Boolean) | K]): OperatorFunction[T, GroupedObservable[`true` | `false`, (Exclude[T, K]) | K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[`true` | `false`, (Exclude[T, K]) | K]]]
  inline def groupBy[T, K](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K](key: js.Function1[/* value */ T, K], options: BasicGroupByOptions[K, T]): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  inline def groupBy[T, K, R](key: js.Function1[/* value */ T, K], element: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: js.Function1[/* value */ T, R],
    duration: Unit,
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]],
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: Unit,
    connector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], connector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy[T, K, E](key: js.Function1[/* value */ T, K], options: GroupByOptionsWithElement[K, E, T]): OperatorFunction[T, GroupedObservable[K, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, E]]]
  
  inline def groupBy_TKR[T, K, R](key: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  inline def groupBy_TKR[T, K, R](
    key: js.Function1[/* value */ T, K],
    element: Unit,
    duration: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
}
