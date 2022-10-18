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

object distTypesInternalOperatorsMergeMapToMod {
  
  @JSImport("rxjs/dist/types/internal/operators/mergeMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeMapTo(innerObservable: js.Iterable[Any]): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def mergeMapTo(innerObservable: js.Iterable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[js.Iterable[Any]]]]
  inline def mergeMapTo(innerObservable: Observable[Any]): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def mergeMapTo(innerObservable: Observable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[Observable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[Observable[Any]]]]
  inline def mergeMapTo(innerObservable: InteropObservable[Any]): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def mergeMapTo(innerObservable: InteropObservable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[InteropObservable[Any]]]]
  inline def mergeMapTo(innerObservable: ReadableStreamLike[Any]): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def mergeMapTo(innerObservable: ReadableStreamLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ReadableStreamLike[Any]]]]
  inline def mergeMapTo(innerObservable: ArrayLike[Any]): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def mergeMapTo(innerObservable: ArrayLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[ArrayLike[Any]]]]
  inline def mergeMapTo(innerObservable: AsyncIterable[Any]): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def mergeMapTo(innerObservable: AsyncIterable[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[AsyncIterable[Any]]]]
  inline def mergeMapTo(innerObservable: PromiseLike[Any]): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def mergeMapTo(innerObservable: PromiseLike[Any], concurrent: Double): OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[Any, ObservedValueOf[PromiseLike[Any]]]]
  inline def mergeMapTo[T, R](
    innerObservable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: js.Iterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[js.Iterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: Observable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[Observable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: InteropObservable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[InteropObservable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ReadableStreamLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ReadableStreamLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: ArrayLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[ArrayLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: AsyncIterable[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[AsyncIterable[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeMapTo[T, R](
    innerObservable: PromiseLike[Any],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[PromiseLike[Any]], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
