package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends IObservable[T] {
  def asObservable(): Observable[T] = js.native
  def `catch`(
    handler: js.Function1[/* exception */ stdLib.Error, rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
  def `catch`(second: Observable[T]): Observable[T] = js.native
  def catchException(
    handler: js.Function1[/* exception */ stdLib.Error, rxDashCoreLib.RxNs.IPromise[T] | Observable[T]]
  ): Observable[T] = js.native
      // alias for catch
  def catchException(second: Observable[T]): Observable[T] = js.native
      // alias for catch
  def combineLatest[T2](second: rxDashCoreLib.RxNs.IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
      // alias for catch
  def combineLatest[T2](second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T2, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T2, TResult](second: Observable[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  def combineLatest[T2, T3](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T2, T3](second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[TOther, TResult](
    souces: js.Array[Observable[TOther] | rxDashCoreLib.RxNs.IPromise[TOther]],
    resultSelector: js.Function2[/* firstValue */ T, /* repeated */TOther, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, T4](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, T4](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: rxDashCoreLib.RxNs.IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T2, T3, TResult](
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, T5](second: Observable[T2], third: Observable[T3], fourth: Observable[T4], fifth: Observable[T5]): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def combineLatest[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def concat(sources: (Observable[T] | rxDashCoreLib.RxNs.IPromise[T])*): Observable[T] = js.native
  def concat(sources: js.Array[Observable[T] | rxDashCoreLib.RxNs.IPromise[T]]): Observable[T] = js.native
  def concatAll(): T = js.native
      // alias for selectConcat
  def concatMap[R](
    selector: js.Function2[
      /* value */ T, 
      /* index */ scala.Double, 
      js.Array[R] | rxDashCoreLib.RxNs.IPromise[R] | Observable[R]
    ]
  ): Observable[R] = js.native
      // alias for selectConcat
  def concatMap[R](sequence: js.Array[R]): Observable[R] = js.native
      // alias for selectConcat
  def concatMap[R](sequence: Observable[R]): Observable[R] = js.native
      // alias for concatAll
      // alias for selectConcat
  def concatMap[T2, R](
    selector: js.Function2[
      /* value */ T, 
      /* index */ scala.Double, 
      rxDashCoreLib.RxNs.IPromise[T2] | Observable[T2]
    ],
    resultSelector: js.Function3[/* value1 */ T, /* value2 */ T2, /* index */ scala.Double, R]
  ): Observable[R] = js.native
  def concatObservable(): Observable[T] = js.native
  def debounce(dueTime: scala.Double): Observable[T] = js.native
  def debounce(dueTime: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def delay(dueTime: scala.Double): Observable[T] = js.native
  def delay(dueTime: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def delay(dueTime: stdLib.Date): Observable[T] = js.native
  def delay(dueTime: stdLib.Date, scheduler: IScheduler): Observable[T] = js.native
  def dematerialize[TOrigin](): Observable[TOrigin] = js.native
  def distinctUntilChanged(skipParameter: scala.Boolean, comparer: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): Observable[T] = js.native
  def distinctUntilChanged[TValue](): Observable[T] = js.native
  def distinctUntilChanged[TValue](keySelector: js.Function1[/* value */ T, TValue]): Observable[T] = js.native
  def distinctUntilChanged[TValue](
    keySelector: js.Function1[/* value */ T, TValue],
    comparer: js.Function2[/* x */ TValue, /* y */ TValue, scala.Boolean]
  ): Observable[T] = js.native
  def `do`(): Observable[T] = js.native
  def `do`(observer: Observer[T]): Observable[T] = js.native
  def `do`(onNext: js.Function1[/* value */ T, scala.Unit]): Observable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit]
  ): Observable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Observable[T] = js.native
      // alias for do
  def doAction(): Observable[T] = js.native
  def doAction(observer: Observer[T]): Observable[T] = js.native
      // alias for do
  def doAction(onNext: js.Function1[/* value */ T, scala.Unit]): Observable[T] = js.native
      // alias for do
  def doAction(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit]
  ): Observable[T] = js.native
      // alias for do
  def doAction(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Observable[T] = js.native
  def doOnCompleted(onCompleted: js.Function0[scala.Unit]): Observable[T] = js.native
  def doOnCompleted(onCompleted: js.Function0[scala.Unit], thisArg: js.Any): Observable[T] = js.native
  def doOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit]): Observable[T] = js.native
  def doOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit], thisArg: js.Any): Observable[T] = js.native
      // alias for do
  def doOnNext(onNext: js.Function1[/* value */ T, scala.Unit]): Observable[T] = js.native
      // alias for do
  def doOnNext(onNext: js.Function1[/* value */ T, scala.Unit], thisArg: js.Any): Observable[T] = js.native
  // Experimental Flattening
  /**
           * Performs a exclusive waiting for the first to finish before subscribing to another observable.
           * Observables that come in between subscriptions will be dropped on the floor.
           * Can be applied on `Observable<Observable<R>>` or `Observable<IPromise<R>>`.
           * @since 2.2.28
           * @returns A exclusive observable with only the results that happen when subscribed.
           */
  def exclusive[R](): Observable[R] = js.native
  /**
           * Performs a exclusive map waiting for the first to finish before subscribing to another observable.
           * Observables that come in between subscriptions will be dropped on the floor.
           * Can be applied on `Observable<Observable<I>>` or `Observable<IPromise<I>>`.
           * @since 2.2.28
           * @param selector Selector to invoke for every item in the current subscription.
           * @param [thisArg] An optional context to invoke with the selector parameter.
           * @returns An exclusive observable with only the results that happen when subscribed.
           */
  def exclusiveMap[I, R](selector: js.Function3[/* value */ I, /* index */ scala.Double, /* source */ Observable[I], R]): Observable[R] = js.native
  /**
           * Performs a exclusive map waiting for the first to finish before subscribing to another observable.
           * Observables that come in between subscriptions will be dropped on the floor.
           * Can be applied on `Observable<Observable<I>>` or `Observable<IPromise<I>>`.
           * @since 2.2.28
           * @param selector Selector to invoke for every item in the current subscription.
           * @param [thisArg] An optional context to invoke with the selector parameter.
           * @returns An exclusive observable with only the results that happen when subscribed.
           */
  def exclusiveMap[I, R](
    selector: js.Function3[/* value */ I, /* index */ scala.Double, /* source */ Observable[I], R],
    thisArg: js.Any
  ): Observable[R] = js.native
  def filter(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def filter(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def `finally`(action: js.Function0[scala.Unit]): Observable[T] = js.native
  def finallyAction(action: js.Function0[scala.Unit]): Observable[T] = js.native
      // alias for selectMany
  def flatMap[TResult](other: rxDashCoreLib.RxNs.IPromise[TResult]): Observable[TResult] = js.native
      // alias for selectMany
  def flatMap[TResult](other: Observable[TResult]): Observable[TResult] = js.native
      // alias for selectMany
  def flatMap[TResult](
    selector: js.Function1[
      /* value */ T, 
      js.Array[TResult] | rxDashCoreLib.RxNs.IPromise[TResult] | Observable[TResult]
    ]
  ): Observable[TResult] = js.native
      // alias for selectMany
  def flatMap[TOther, TResult](
    selector: js.Function1[/* value */ T, rxDashCoreLib.RxNs.IPromise[TOther] | Observable[TOther]],
    resultSelector: js.Function2[/* item */ T, /* other */ TOther, TResult]
  ): Observable[TResult] = js.native
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def flatMapLatest[TResult](
    selector: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ Observable[T], 
      Observable[TResult]
    ]
  ): Observable[TResult] = js.native
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def flatMapLatest[TResult](
    selector: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ Observable[T], 
      Observable[TResult]
    ],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  /**
           * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
           * @param onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
           * @param onError A transform function to apply when an error occurs in the source sequence.
           * @param onCompleted A transform function to apply when the end of the source sequence is reached.
           * @param [thisArg] An optional "this" to use to invoke each transform.
           * @returns An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
           */
  def flatMapObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ scala.Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]]
  ): Observable[T2 | T3 | T4] = js.native
  /**
           * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
           * @param onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
           * @param onError A transform function to apply when an error occurs in the source sequence.
           * @param onCompleted A transform function to apply when the end of the source sequence is reached.
           * @param [thisArg] An optional "this" to use to invoke each transform.
           * @returns An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
           */
  def flatMapObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ scala.Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]],
    thisArg: js.Any
  ): Observable[T2 | T3 | T4] = js.native
  def forEach(): rxDashCoreLib.RxNs.IDisposable = js.native
  def forEach(onNext: js.Function1[/* value */ T, scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  def forEach(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  def forEach(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ js.Any, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
      // alias for finally
  def ignoreElements(): Observable[T] = js.native
  def map[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult]
  ): Observable[TResult] = js.native
  def map[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  def materialize(): Observable[Notification[T]] = js.native
      // alias for selectConcat
  def merge(maxConcurrent: scala.Double): T = js.native
  def merge(other: rxDashCoreLib.RxNs.IPromise[T]): Observable[T] = js.native
  def merge(other: Observable[T]): Observable[T] = js.native
  def mergeAll(): T = js.native
  def mergeObservable(): T = js.native
      // alias for select
  def pluck[TResult](prop: java.lang.String): Observable[TResult] = js.native
  def publish(): ConnectableObservable[T] = js.native
  def repeat(): Observable[T] = js.native
  def repeat(repeatCount: scala.Double): Observable[T] = js.native
  def retry(): Observable[T] = js.native
  def retry(retryCount: scala.Double): Observable[T] = js.native
  def retryWhen[TError](notifier: js.Function1[/* errors */ Observable[TError], Observable[_]]): Observable[T] = js.native
  def sample(interval: scala.Double): Observable[T] = js.native
  def sample(interval: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def sample[TSample](sampler: Observable[TSample]): Observable[T] = js.native
  def sample[TSample](sampler: Observable[TSample], scheduler: IScheduler): Observable[T] = js.native
  def scan(
    accumulator: js.Function4[
      /* acc */ T, 
      /* value */ T, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[Observable[T]], 
      T
    ]
  ): Observable[T] = js.native
  /**
           *  Applies an accumulator function over an observable sequence and returns each intermediate result. The optional seed value is used as the initial accumulator value.
           *  For aggregation behavior with no intermediate results, see Observable.aggregate.
           * @example
           *  var res = source.scan(function (acc, x) { return acc + x; });
           *  var res = source.scan(function (acc, x) { return acc + x; }, 0);
           * @param accumulator An accumulator function to be invoked on each element.
           * @param seed The initial accumulator value.
           * @returns An observable sequence containing the accumulated values.
           */
  def scan[TAcc](
    accumulator: js.Function4[
      /* acc */ TAcc, 
      /* value */ T, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[Observable[TAcc]], 
      TAcc
    ],
    seed: TAcc
  ): Observable[TAcc] = js.native
  def select[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult]
  ): Observable[TResult] = js.native
  def select[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  def selectConcat[R](
    selector: js.Function2[
      /* value */ T, 
      /* index */ scala.Double, 
      rxDashCoreLib.RxNs.IPromise[R] | Observable[R]
    ]
  ): Observable[R] = js.native
  def selectConcat[R](sequence: Observable[R]): Observable[R] = js.native
  def selectConcat[T2, R](
    selector: js.Function2[
      /* value */ T, 
      /* index */ scala.Double, 
      rxDashCoreLib.RxNs.IPromise[T2] | Observable[T2]
    ],
    resultSelector: js.Function3[/* value1 */ T, /* value2 */ T2, /* index */ scala.Double, R]
  ): Observable[R] = js.native
  def selectMany[TResult](other: rxDashCoreLib.RxNs.IPromise[TResult]): Observable[TResult] = js.native
  def selectMany[TResult](other: Observable[TResult]): Observable[TResult] = js.native
  def selectMany[TResult](
    selector: js.Function1[
      /* value */ T, 
      js.Array[TResult] | rxDashCoreLib.RxNs.IPromise[TResult] | Observable[TResult]
    ]
  ): Observable[TResult] = js.native
  def selectMany[TOther, TResult](
    selector: js.Function1[/* value */ T, rxDashCoreLib.RxNs.IPromise[TOther] | Observable[TOther]],
    resultSelector: js.Function2[/* item */ T, /* other */ TOther, TResult]
  ): Observable[TResult] = js.native
      // alias for selectMany
  /**
           * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
           * @param onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
           * @param onError A transform function to apply when an error occurs in the source sequence.
           * @param onCompleted A transform function to apply when the end of the source sequence is reached.
           * @param [thisArg] An optional "this" to use to invoke each transform.
           * @returns An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
           */
  def selectManyObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ scala.Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]]
  ): Observable[T2 | T3 | T4] = js.native
      // alias for selectMany
  /**
           * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
           * @param onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
           * @param onError A transform function to apply when an error occurs in the source sequence.
           * @param onCompleted A transform function to apply when the end of the source sequence is reached.
           * @param [thisArg] An optional "this" to use to invoke each transform.
           * @returns An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
           */
  def selectManyObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ scala.Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]],
    thisArg: js.Any
  ): Observable[T2 | T3 | T4] = js.native
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def selectSwitch[TResult](
    selector: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ Observable[T], 
      Observable[TResult]
    ]
  ): Observable[TResult] = js.native
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def selectSwitch[TResult](
    selector: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ Observable[T], 
      Observable[TResult]
    ],
    thisArg: js.Any
  ): Observable[TResult] = js.native
      // alias for selectSwitch
  def skip(count: scala.Double): Observable[T] = js.native
  def skipLast(count: scala.Double): Observable[T] = js.native
  def skipUntil[T2](other: rxDashCoreLib.RxNs.IPromise[T2]): Observable[T] = js.native
      // alias for mergeAll
  def skipUntil[T2](other: Observable[T2]): Observable[T] = js.native
  def skipWhile(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def skipWhile(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def startWith(scheduler: IScheduler, values: T*): Observable[T] = js.native
  def startWith(values: T*): Observable[T] = js.native
  def switch(): T = js.native
  def switchLatest(): T = js.native
      // alias for selectSwitch
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @since 2.2.28
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def switchMap[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult]
  ): Observable[TResult] = js.native
      // alias for selectSwitch
  /**
           *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
           *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
           * @param selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
           * @param [thisArg] Object to use as this when executing callback.
           * @since 2.2.28
           * @returns An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
           *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
           */
  def switchMap[TResult](
    selector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  def take(count: scala.Double): Observable[T] = js.native
  def take(count: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def takeLast(count: scala.Double): Observable[T] = js.native
  def takeLastBuffer(count: scala.Double): Observable[js.Array[T]] = js.native
  def takeUntil[T2](other: rxDashCoreLib.RxNs.IPromise[T2]): Observable[T] = js.native
      // alias for switch
  def takeUntil[T2](other: Observable[T2]): Observable[T] = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def takeWhile(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
      // alias for do
  def tap(): Observable[T] = js.native
      // alias for do
  def tap(observer: Observer[T]): Observable[T] = js.native
      // alias for do
  def tap(onNext: js.Function1[/* value */ T, scala.Unit]): Observable[T] = js.native
      // alias for do
  def tap(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit]
  ): Observable[T] = js.native
      // alias for do
  def tap(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* exception */ stdLib.Error, scala.Unit],
    onCompleted: js.Function0[scala.Unit]
  ): Observable[T] = js.native
  def tapOnCompleted(onCompleted: js.Function0[scala.Unit]): Observable[T] = js.native
  def tapOnCompleted(onCompleted: js.Function0[scala.Unit], thisArg: js.Any): Observable[T] = js.native
  def tapOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit]): Observable[T] = js.native
  def tapOnError(onError: js.Function1[/* exception */ js.Any, scala.Unit], thisArg: js.Any): Observable[T] = js.native
  def tapOnNext(onNext: js.Function1[/* value */ T, scala.Unit]): Observable[T] = js.native
  def tapOnNext(onNext: js.Function1[/* value */ T, scala.Unit], thisArg: js.Any): Observable[T] = js.native
  /**
           * @deprecated use #debounce or #throttleWithTimeout instead.
           */
  def throttle(dueTime: scala.Double): Observable[T] = js.native
  /**
           * @deprecated use #debounce or #throttleWithTimeout instead.
           */
  def throttle(dueTime: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def throttleWithTimeout(dueTime: scala.Double): Observable[T] = js.native
  def throttleWithTimeout(dueTime: scala.Double, scheduler: IScheduler): Observable[T] = js.native
  def timeInterval(): Observable[TimeInterval[T]] = js.native
  def timeInterval(scheduler: IScheduler): Observable[TimeInterval[T]] = js.native
  def timeout(dueTime: scala.Double): Observable[T] = js.native
  def timeout(dueTime: scala.Double, other: Observable[T]): Observable[T] = js.native
  def timeout(dueTime: scala.Double, other: Observable[T], scheduler: IScheduler): Observable[T] = js.native
  def timeout(dueTime: stdLib.Date): Observable[T] = js.native
  def timeout(dueTime: stdLib.Date, other: Observable[T]): Observable[T] = js.native
  def timeout(dueTime: stdLib.Date, other: Observable[T], scheduler: IScheduler): Observable[T] = js.native
  def timestamp(): Observable[Timestamp[T]] = js.native
  def timestamp(scheduler: IScheduler): Observable[Timestamp[T]] = js.native
      // alias for subscribe
  def toArray(): Observable[js.Array[T]] = js.native
  /**
           * Converts an existing observable sequence to an ES6 Compatible Promise
           * @example
           * var promise = Rx.Observable.return(42).toPromise(RSVP.Promise);
           *
           * // With config
           * Rx.config.Promise = RSVP.Promise;
           * var promise = Rx.Observable.return(42).toPromise();
           * @param [promiseCtor] The constructor of the promise. If not provided, it looks for it in Rx.config.Promise.
           * @returns An ES6 compatible promise with the last value from the observable sequence.
           */
  def toPromise(): rxDashCoreLib.RxNs.IPromise[T] = js.native
  /**
           * Converts an existing observable sequence to an ES6 Compatible Promise
           * @example
           * var promise = Rx.Observable.return(42).toPromise(RSVP.Promise);
           *
           * // With config
           * Rx.config.Promise = RSVP.Promise;
           * var promise = Rx.Observable.return(42).toPromise();
           * @param [promiseCtor] The constructor of the promise. If not provided, it looks for it in Rx.config.Promise.
           * @returns An ES6 compatible promise with the last value from the observable sequence.
           */
  def toPromise(promiseCtor: rxDashLiteLib.Anon_ResolverResolvePromiseValue[T]): rxDashCoreLib.RxNs.IPromise[T] = js.native
   // alias for where
  /**
           * Converts an existing observable sequence to an ES6 Compatible Promise
           * @example
           * var promise = Rx.Observable.return(42).toPromise(RSVP.Promise);
           * @param promiseCtor The constructor of the promise.
           * @returns An ES6 compatible promise with the last value from the observable sequence.
           */
  def toPromise[TPromise /* <: rxDashCoreLib.RxNs.IPromise[T] */](promiseCtor: rxDashLiteLib.Anon_ResolverResolvePromise[T, TPromise]): TPromise = js.native
  def where(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def where(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def withLatestFrom[T2](second: rxDashCoreLib.RxNs.IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[T2](second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def withLatestFrom[T2, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T2, TResult](second: Observable[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  def withLatestFrom[T2, T3](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[T2, T3](second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def withLatestFrom[TOther, TResult](
    souces: js.Array[Observable[TOther] | rxDashCoreLib.RxNs.IPromise[TOther]],
    resultSelector: js.Function2[/* firstValue */ T, /* repeated */TOther, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, T4](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, T4](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: rxDashCoreLib.RxNs.IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def withLatestFrom[T2, T3, TResult](
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, T5](second: Observable[T2], third: Observable[T3], fourth: Observable[T4], fifth: Observable[T5]): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def withLatestFrom[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2](second: rxDashCoreLib.RxNs.IPromise[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def zip[T2](second: Observable[T2]): Observable[js.Tuple2[T, T2]] = js.native
  def zip[TOther, TResult](
    second: js.Array[Observable[TOther] | rxDashCoreLib.RxNs.IPromise[TOther]],
    resultSelector: js.Function2[/* left */ T, /* repeated */TOther, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def zip[T2, T3](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def zip[T2, TResult](second: Observable[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  def zip[T2, T3](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def zip[T2, T3](second: Observable[T2], third: Observable[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  def zip[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, T4](second: rxDashCoreLib.RxNs.IPromise[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4]
  ): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, T4](second: Observable[T2], third: rxDashCoreLib.RxNs.IPromise[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: rxDashCoreLib.RxNs.IPromise[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, T4](second: Observable[T2], third: Observable[T3], fourth: Observable[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def zip[T2, T3, TResult](
    second: Observable[T2],
    third: Observable[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, T5](second: Observable[T2], third: Observable[T3], fourth: Observable[T4], fifth: Observable[T5]): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def zip[T2, T3, T4, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: rxDashCoreLib.RxNs.IPromise[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: rxDashCoreLib.RxNs.IPromise[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: rxDashCoreLib.RxNs.IPromise[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: rxDashCoreLib.RxNs.IPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: Observable[T2],
    third: Observable[T3],
    fourth: Observable[T4],
    fifth: Observable[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
}

