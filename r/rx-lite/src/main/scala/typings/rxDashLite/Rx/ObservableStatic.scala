package typings.rxDashLite.Rx

import org.scalablytyped.runtime.StringDictionary
import typings.rxDashCore.Rx.IDisposable
import typings.rxDashCore.Rx.IPromise
import typings.rxDashLite.Anon_Index
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableStatic extends js.Object {
  def `catch`[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
      // alias for throw
  def `catch`[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
      // alias for catch
  def catchError[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
      // alias for catch
  def catchError[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
      // alias for catch
  def catchException[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def catchException[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def combineLatest[T](sources: js.Array[Observable[T] | IPromise[T]]): Observable[js.Array[T]] = js.native
  def combineLatest[T, T2](first: IPromise[T], second: IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T, T2](first: IPromise[T], second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T, T2](first: Observable[T], second: IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
      // alias for catch
  def combineLatest[T, T2](first: Observable[T], second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[TOther, TResult](
    sources: js.Array[Observable[TOther] | IPromise[TOther]],
    resultSelector: js.Function1[/* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3](first: IPromise[T], second: IPromise[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3](first: IPromise[T], second: IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, TResult](
    first: IPromise[T],
    second: Observable[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3](first: IPromise[T], second: Observable[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3](first: IPromise[T], second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, TResult](
    first: Observable[T],
    second: IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3](first: Observable[T], second: IPromise[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3](first: Observable[T], second: IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, TResult](
    first: Observable[T],
    second: Observable[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3](first: Observable[T], second: Observable[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3](first: Observable[T], second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, T5](
    first: Observable[T] | IPromise[T],
    second: Observable[T2] | IPromise[T2],
    third: Observable[T3] | IPromise[T3],
    fourth: Observable[T4] | IPromise[T4],
    fifth: Observable[T5] | IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T, T2, T3, T4, T5, TResult](
    first: Observable[T] | IPromise[T],
    second: Observable[T2] | IPromise[T2],
    third: Observable[T3] | IPromise[T3],
    fourth: Observable[T4] | IPromise[T4],
    fifth: Observable[T5] | IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def concat[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def concat[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def create[T](subscribe: js.Function1[/* observer */ Observer[T], js.Function0[Unit] | IDisposable | Unit]): Observable[T] = js.native
  def createWithDisposable[T](subscribe: js.Function1[/* observer */ Observer[T], IDisposable]): Observable[T] = js.native
  def defer[T](observableFactory: js.Function0[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def empty[T](): Observable[T] = js.native
  def empty[T](scheduler: IScheduler): Observable[T] = js.native
  /**
    * This method creates a new Observable sequence from an array object.
    * @param array An array-like or iterable object to convert to an Observable sequence.
    * @param [mapFn] Map function to call on every element of the array.
    * @param [thisArg] The context to use calling the mapFn if provided.
    * @param [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  def from[T](array: js.Array[T]): Observable[T] = js.native
  def from[T](array: js.Array[T], mapFn: js.Function2[/* value */ T, /* index */ Double, T]): Observable[T] = js.native
  def from[T](array: js.Array[T], mapFn: js.Function2[/* value */ T, /* index */ Double, T], thisArg: js.Any): Observable[T] = js.native
  def from[T](
    array: js.Array[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, T],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[T] = js.native
  /**
    * This method creates a new Observable sequence from an array-like object.
    * @param array An array-like or iterable object to convert to an Observable sequence.
    * @param [mapFn] Map function to call on every element of the array.
    * @param [thisArg] The context to use calling the mapFn if provided.
    * @param [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  def from[T](array: Anon_Index[T]): Observable[T] = js.native
  def from[T](array: Anon_Index[T], mapFn: js.Function2[/* value */ T, /* index */ Double, T]): Observable[T] = js.native
  def from[T](array: Anon_Index[T], mapFn: js.Function2[/* value */ T, /* index */ Double, T], thisArg: js.Any): Observable[T] = js.native
  def from[T](
    array: Anon_Index[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, T],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[T] = js.native
  /**
    * This method creates a new Observable sequence from an array-like or iterable object.
    * @param array An array-like or iterable object to convert to an Observable sequence.
    * @param [mapFn] Map function to call on every element of the array.
    * @param [thisArg] The context to use calling the mapFn if provided.
    * @param [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  def from[T](iterable: js.Any): Observable[T] = js.native
  def from[T](iterable: js.Any, mapFn: js.Function2[/* value */ js.Any, /* index */ Double, T]): Observable[T] = js.native
  def from[T](iterable: js.Any, mapFn: js.Function2[/* value */ js.Any, /* index */ Double, T], thisArg: js.Any): Observable[T] = js.native
  def from[T](
    iterable: js.Any,
    mapFn: js.Function2[/* value */ js.Any, /* index */ Double, T],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[T] = js.native
  def fromArray[T](array: js.Array[T]): Observable[T] = js.native
  def fromArray[T](array: js.Array[T], scheduler: IScheduler): Observable[T] = js.native
  def fromArray[T](array: Anon_Index[T]): Observable[T] = js.native
  def fromArray[T](array: Anon_Index[T], scheduler: IScheduler): Observable[T] = js.native
  def fromCallback[TResult](func: js.Function): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromCallback[TResult](
    func: js.Function1[
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function0[Observable[TResult]] = js.native
  def fromCallback[TResult](
    func: js.Function1[
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function0[Observable[TResult]] = js.native
  def fromCallback[TResult](func: js.Function, context: js.Any): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromCallback[TCallbackResult, TResult](
    func: js.Function1[/* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function0[Observable[TResult]] = js.native
  def fromCallback[T1, TResult](
    func: js.Function2[
      /* arg1 */ T1, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[T1, TResult](
    func: js.Function2[
      /* arg1 */ T1, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[TCallbackResult, TResult](
    func: js.Function,
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromCallback[T1, TCallbackResult, TResult](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[T1, T2, TResult](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[T1, T2, TResult](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[T1, T2, TCallbackResult, TResult](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[T1, T2, T3, TResult](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromCallback[T1, T2, T3, TResult](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      (/* callback */ js.Function) | (/* callback */ js.Function1[/* result */ TResult, _]), 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromCallback[T1, T2, T3, TCallbackResult, TResult](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* args */ js.Array[TCallbackResult], TResult]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromEvent[T](element: DOMEventTarget, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: DOMEventTarget, eventName: String, selector: js.Function1[/* repeated */ js.Any, T]): Observable[T] = js.native
  def fromEvent[T](element: NativeEventTarget, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: NativeEventTarget, eventName: String, selector: js.Function1[/* repeated */ js.Any, T]): Observable[T] = js.native
  def fromEvent[T](element: NodeEventTarget, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: NodeEventTarget, eventName: String, selector: js.Function1[/* repeated */ js.Any, T]): Observable[T] = js.native
  def fromEvent[T](element: ArrayLike[DOMEventTarget], eventName: String): Observable[T] = js.native
  def fromEvent[T](
    element: ArrayLike[DOMEventTarget],
    eventName: String,
    selector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, Unit],
    removeHandler: js.Function1[/* handler */ js.Function, Unit]
  ): Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, Unit],
    removeHandler: js.Function1[/* handler */ js.Function, Unit],
    selector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def fromNodeCallback[T](func: js.Function): js.Function1[/* repeated */ js.Any, Observable[T]] = js.native
  def fromNodeCallback[TR](func: js.Function1[/* callback */ js.Function, _]): js.Function0[Observable[TR]] = js.native
  def fromNodeCallback[TR](func: js.Function1[/* callback */ js.Function, _], context: js.Any): js.Function0[Observable[TR]] = js.native
  def fromNodeCallback[T](func: js.Function, context: js.Any): js.Function1[/* repeated */ js.Any, Observable[T]] = js.native
  def fromNodeCallback[TC, TR](
    func: js.Function1[/* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function0[Observable[TR]] = js.native
  def fromNodeCallback[T1, TR](func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _]): js.Function1[/* arg1 */ T1, Observable[TR]] = js.native
  def fromNodeCallback[T1, TR](func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _], context: js.Any): js.Function1[/* arg1 */ T1, Observable[TR]] = js.native
  def fromNodeCallback[TC, T](func: js.Function, context: js.Any, selector: js.Function1[/* results */ js.Array[TC], T]): js.Function1[/* repeated */ js.Any, Observable[T]] = js.native
  def fromNodeCallback[T1, TC, TR](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function1[/* arg1 */ T1, Observable[TR]] = js.native
  def fromNodeCallback[T1, T2, TR](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _]): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TR]] = js.native
  def fromNodeCallback[T1, T2, TR](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _], context: js.Any): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TR]] = js.native
  def fromNodeCallback[T1, T2, TC, TR](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TR]] = js.native
  def fromNodeCallback[T1, T2, T3, T](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[T]] = js.native
  def fromNodeCallback[T1, T2, T3, T](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[T]] = js.native
  def fromNodeCallback[T1, T2, T3, TC, TR](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _],
    context: js.Any,
    selector: js.Function1[/* results */ js.Array[TC], TR]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TR]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T[T](func: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], _]): js.Function0[Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T[T](
    func: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], _],
    context: js.Any
  ): js.Function0[Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T[T1, T](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], _]
  ): js.Function1[/* arg1 */ T1, Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T[T1, T](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], _],
    context: js.Any
  ): js.Function1[/* arg1 */ T1, Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T2T[T1, T2, T](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T2T[T1, T2, T](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ T, _], 
      _
    ],
    context: js.Any
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[T]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T2T3TR[T1, T2, T3, TR](func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _]): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TR]] = js.native
  @JSName("fromNodeCallback")
  def fromNodeCallback_T1T2T3TR[T1, T2, T3, TR](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ js.Function, _],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TR]] = js.native
  /**
    * Converts a Promise to an Observable sequence
    * @param promise An ES6 Compliant promise.
    * @returns An Observable sequence which wraps the existing promise success and failure.
    */
  def fromPromise[T](promise: IPromise[T]): Observable[T] = js.native
  /**
    * This method creates a new Observable sequence from an array object.
    * @param array An array-like or iterable object to convert to an Observable sequence.
    * @param mapFn Map function to call on every element of the array.
    * @param [thisArg] The context to use calling the mapFn if provided.
    * @param [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  @JSName("from")
  def from_TTResult[T, TResult](array: js.Array[T], mapFn: js.Function2[/* value */ T, /* index */ Double, TResult]): Observable[TResult] = js.native
  @JSName("from")
  def from_TTResult[T, TResult](
    array: js.Array[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  @JSName("from")
  def from_TTResult[T, TResult](
    array: js.Array[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  /**
    * This method creates a new Observable sequence from an array-like object.
    * @param array An array-like or iterable object to convert to an Observable sequence.
    * @param mapFn Map function to call on every element of the array.
    * @param [thisArg] The context to use calling the mapFn if provided.
    * @param [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  @JSName("from")
  def from_TTResult[T, TResult](array: Anon_Index[T], mapFn: js.Function2[/* value */ T, /* index */ Double, TResult]): Observable[TResult] = js.native
  @JSName("from")
  def from_TTResult[T, TResult](
    array: Anon_Index[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  @JSName("from")
  def from_TTResult[T, TResult](
    array: Anon_Index[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  def generate[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult]
  ): Observable[TResult] = js.native
  def generate[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  def interval(dutTime: Double, period: Double): Observable[Double] = js.native
  def interval(dutTime: Double, period: Double, scheduler: IScheduler): Observable[Double] = js.native
  def interval(period: Double): Observable[Double] = js.native
  def interval(period: Double, scheduler: IScheduler): Observable[Double] = js.native
  /**
    * @since 2.2.28
    */
  def just[T](value: T): Observable[T] = js.native
  def just[T](value: T, scheduler: IScheduler): Observable[T] = js.native
  def merge[T](scheduler: IScheduler, sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def merge[T](scheduler: IScheduler, sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def merge[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
  def merge[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
  def never[T](): Observable[T] = js.native
  /**
    *  This method creates a new Observable instance with a variable number of arguments, regardless of number or type of the arguments.
    *
    * @example
    *  var res = Rx.Observable.of(1, 2, 3);
    * @since 2.2.28
    * @returns The observable sequence whose elements are pulled from the given arguments.
    */
  def of[T](values: T*): Observable[T] = js.native
  /**
    *  This method creates a new Observable instance with a variable number of arguments, regardless of number or type of the arguments.
    * @example
    *  var res = Rx.Observable.ofWithScheduler(Rx.Scheduler.timeout, 1, 2, 3);
    * @since 2.2.28
    * @param [scheduler] A scheduler to use for scheduling the arguments.
    * @returns The observable sequence whose elements are pulled from the given arguments.
    */
  def ofWithScheduler[T](): Observable[T] = js.native
  def ofWithScheduler[T](scheduler: IScheduler, values: T*): Observable[T] = js.native
  def pairs[T](obj: StringDictionary[T]): Observable[js.Tuple2[String, T]] = js.native
  def pairs[T](obj: StringDictionary[T], scheduler: IScheduler): Observable[js.Tuple2[String, T]] = js.native
  def range(start: Double, count: Double): Observable[Double] = js.native
  def range(start: Double, count: Double, scheduler: IScheduler): Observable[Double] = js.native
  def repeat[T](value: T): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Double): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Double, scheduler: IScheduler): Observable[T] = js.native
  def `return`[T](value: T): Observable[T] = js.native
  def `return`[T](value: T, scheduler: IScheduler): Observable[T] = js.native
      // alias for return
  def returnValue[T](value: T): Observable[T] = js.native
  def returnValue[T](value: T, scheduler: IScheduler): Observable[T] = js.native
      // alias for return
  def `throw`[T](exception: Error): Observable[T] = js.native
  def `throw`[T](exception: Error, scheduler: IScheduler): Observable[T] = js.native
      // alias for throw
  def throwError[T](error: Error): Observable[T] = js.native
  def throwError[T](error: Error, scheduler: IScheduler): Observable[T] = js.native
  def throwException[T](exception: Error): Observable[T] = js.native
  def throwException[T](exception: Error, scheduler: IScheduler): Observable[T] = js.native
  def timer(dueTime: Double): Observable[Double] = js.native
  def timer(dueTime: Double, period: Double): Observable[Double] = js.native
  def timer(dueTime: Double, period: Double, scheduler: IScheduler): Observable[Double] = js.native
  def timer(dueTime: Double, scheduler: IScheduler): Observable[Double] = js.native
  def withLatestFrom[T, T2](first: IPromise[T], second: IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[T, T2](first: IPromise[T], second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[T, T2](first: Observable[T], second: IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[T, T2](first: Observable[T], second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[TOther, TResult](
    souces: js.Array[Observable[TOther] | IPromise[TOther]],
    resultSelector: js.Function1[/* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3](first: IPromise[T], second: IPromise[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, T3](first: IPromise[T], second: IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, TResult](
    first: IPromise[T],
    second: Observable[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3](first: IPromise[T], second: Observable[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, T3](first: IPromise[T], second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, TResult](
    first: Observable[T],
    second: IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3](first: Observable[T], second: IPromise[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, T3](first: Observable[T], second: IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, TResult](
    first: Observable[T],
    second: Observable[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3](first: Observable[T], second: Observable[T2], third: IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, T3](first: Observable[T], second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: IPromise[T], second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: IPromise[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: Observable[T3], fourth: IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, T4](first: Observable[T], second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T, T2, T3, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, T5](
    first: Observable[T] | IPromise[T],
    second: Observable[T2] | IPromise[T2],
    third: Observable[T3] | IPromise[T3],
    fourth: Observable[T4] | IPromise[T4],
    fifth: Observable[T5] | IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: IPromise[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, TResult](
    first: Observable[T],
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T, T2, T3, T4, T5, TResult](
    first: Observable[T] | IPromise[T],
    second: Observable[T2] | IPromise[T2],
    third: Observable[T3] | IPromise[T3],
    fourth: Observable[T4] | IPromise[T4],
    fifth: Observable[T5] | IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2](first: IPromise[T1], sources: js.Array[Observable[T2] | IPromise[T2]]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2](first: IPromise[T1], sources: IPromise[T2]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2](first: IPromise[T1], sources: Observable[T2]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2](first: Observable[T1], sources: js.Array[Observable[T2] | IPromise[T2]]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2](first: Observable[T1], sources: IPromise[T2]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2](first: Observable[T1], sources: Observable[T2]): Observable[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2, TResult](
    first: IPromise[T1],
    sources: js.Array[Observable[T2] | IPromise[T2]],
    resultSelector: js.Function2[/* item1 */ T1, /* repeated */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, TResult](
    first: Observable[T1],
    sources: js.Array[Observable[T2] | IPromise[T2]],
    resultSelector: js.Function2[/* item1 */ T1, /* repeated */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    resultSelector: js.Function2[/* item1 */ T1, /* item2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3](source1: IPromise[T1], source2: IPromise[T2], source3: IPromise[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3](source1: IPromise[T1], source2: IPromise[T2], source3: Observable[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    resultSelector: js.Function2[/* item1 */ T1, /* item2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3](source1: IPromise[T1], source2: Observable[T2], source3: IPromise[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3](source1: IPromise[T1], source2: Observable[T2], source3: Observable[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    resultSelector: js.Function2[/* item1 */ T1, /* item2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3](source1: Observable[T1], source2: IPromise[T2], source3: IPromise[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3](source1: Observable[T1], source2: IPromise[T2], source3: Observable[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    resultSelector: js.Function2[/* item1 */ T1, /* item2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3](source1: Observable[T1], source2: Observable[T2], source3: IPromise[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3](source1: Observable[T1], source2: Observable[T2], source3: Observable[T3]): Observable[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: IPromise[T2], source3: IPromise[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: IPromise[T2], source3: IPromise[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: IPromise[T2], source3: Observable[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: IPromise[T2], source3: Observable[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: Observable[T2], source3: IPromise[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: Observable[T2], source3: IPromise[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: Observable[T2], source3: Observable[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: IPromise[T1], source2: Observable[T2], source3: Observable[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: IPromise[T2], source3: IPromise[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: IPromise[T2], source3: IPromise[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: IPromise[T2], source3: Observable[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: IPromise[T2], source3: Observable[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: Observable[T2], source3: IPromise[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: Observable[T2], source3: IPromise[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: Observable[T2], source3: Observable[T3], source4: IPromise[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4](source1: Observable[T1], source2: Observable[T2], source3: Observable[T3], source4: Observable[T4]): Observable[js.Tuple4[T1, T2, T3, T4]] = js.native
  def zip[T1, T2, T3, T4, T5](
    source1: Observable[T1] | IPromise[T1],
    source2: Observable[T2] | IPromise[T2],
    source3: Observable[T3] | IPromise[T3],
    source4: Observable[T4] | IPromise[T4],
    source5: Observable[T5] | IPromise[T5]
  ): Observable[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: IPromise[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: IPromise[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: IPromise[T2],
    source3: Observable[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: IPromise[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    source4: IPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: Observable[T2],
    source3: Observable[T3],
    source4: Observable[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, TResult](
    source1: Observable[T1] | IPromise[T1],
    source2: Observable[T2] | IPromise[T2],
    source3: Observable[T3] | IPromise[T3],
    source4: Observable[T4] | IPromise[T4],
    source5: Observable[T5] | IPromise[T5],
    resultSelector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zipArray[T](sources: (Observable[T] | IPromise[T])*): Observable[js.Array[T]] = js.native
  def zipArray[T](sources: js.Array[Observable[T] | IPromise[T]]): Observable[js.Array[T]] = js.native
}

