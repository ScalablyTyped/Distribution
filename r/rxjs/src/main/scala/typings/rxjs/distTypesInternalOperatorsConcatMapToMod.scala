package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.InteropObservable
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsConcatMapToMod {
  
  @JSImport("rxjs/dist/types/internal/operators/concatMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatMapTo(observable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def concatMapTo(observable: js.Iterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def concatMapTo(observable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def concatMapTo(observable: Observable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def concatMapTo(observable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def concatMapTo(observable: InteropObservable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def concatMapTo(observable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def concatMapTo(observable: ReadableStreamLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def concatMapTo(observable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def concatMapTo(observable: ArrayLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def concatMapTo(observable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def concatMapTo(observable: AsyncIterable[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def concatMapTo(observable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def concatMapTo(observable: PromiseLike[Any], resultSelector: Unit): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def concatMapTo[T, R](
    observable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def concatMapTo[T, R](
    observable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
