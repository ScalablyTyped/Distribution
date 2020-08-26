package typings.rxLiteAsync

import typings.rxCore.Rx.IPromise
import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  @js.native
  trait ObservableStatic extends js.Object {
    def start[T](func: js.Function0[T]): Observable[T] = js.native
    def start[T](func: js.Function0[T], context: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
    def start[T](func: js.Function0[T], context: js.Any): Observable[T] = js.native
    def start[T](func: js.Function0[T], context: js.Any, scheduler: IScheduler): Observable[T] = js.native
    /**
      * Invokes the asynchronous function, surfacing the result through an observable sequence.
      * @param functionAsync Asynchronous function which returns a Promise to run.
      * @returns An observable sequence exposing the function's result value, or an exception.
      */
    def startAsync[T](functionAsync: js.Function0[IPromise[T]]): Observable[T] = js.native
    def toAsync[TResult](func: js.Function0[TResult]): js.Function0[Observable[TResult]] = js.native
    def toAsync[TResult](func: js.Function0[TResult], context: js.UndefOr[scala.Nothing], scheduler: IScheduler): js.Function0[Observable[TResult]] = js.native
    def toAsync[TResult](func: js.Function0[TResult], context: js.Any): js.Function0[Observable[TResult]] = js.native
    def toAsync[TResult](func: js.Function0[TResult], context: js.Any, scheduler: IScheduler): js.Function0[Observable[TResult]] = js.native
    def toAsync[T1, TResult](func: js.Function1[js.UndefOr[/* arg1 */ T1], TResult]): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
    def toAsync[T1, TResult](
      func: js.Function1[js.UndefOr[/* arg1 */ T1], TResult],
      context: js.UndefOr[scala.Nothing],
      scheduler: IScheduler
    ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
    def toAsync[T1, TResult](func: js.Function1[js.UndefOr[/* arg1 */ T1], TResult], context: js.Any): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
    def toAsync[T1, TResult](func: js.Function1[js.UndefOr[/* arg1 */ T1], TResult], context: js.Any, scheduler: IScheduler): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
    def toAsync[T1, T2, TResult](func: js.Function2[js.UndefOr[/* arg1 */ T1], js.UndefOr[/* arg2 */ /* repeated */ T2], TResult]): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
    def toAsync[T1, T2, TResult](
      func: js.Function2[js.UndefOr[/* arg1 */ T1], js.UndefOr[/* arg2 */ /* repeated */ T2], TResult],
      context: js.UndefOr[scala.Nothing],
      scheduler: IScheduler
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
    def toAsync[T1, T2, TResult](
      func: js.Function2[js.UndefOr[/* arg1 */ T1], js.UndefOr[/* arg2 */ /* repeated */ T2], TResult],
      context: js.Any
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
    def toAsync[T1, T2, TResult](
      func: js.Function2[js.UndefOr[/* arg1 */ T1], js.UndefOr[/* arg2 */ /* repeated */ T2], TResult],
      context: js.Any,
      scheduler: IScheduler
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, TResult](
      func: js.Function3[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ /* repeated */ T3], 
          TResult
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, TResult](
      func: js.Function3[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ /* repeated */ T3], 
          TResult
        ],
      context: js.UndefOr[scala.Nothing],
      scheduler: IScheduler
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, TResult](
      func: js.Function3[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ /* repeated */ T3], 
          TResult
        ],
      context: js.Any
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, TResult](
      func: js.Function3[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ /* repeated */ T3], 
          TResult
        ],
      context: js.Any,
      scheduler: IScheduler
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, T4, TResult](
      func: js.Function4[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ T3], 
          js.UndefOr[T4], 
          TResult
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, T4, TResult](
      func: js.Function4[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ T3], 
          js.UndefOr[T4], 
          TResult
        ],
      context: js.UndefOr[scala.Nothing],
      scheduler: IScheduler
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, T4, TResult](
      func: js.Function4[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ T3], 
          js.UndefOr[T4], 
          TResult
        ],
      context: js.Any
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
    def toAsync[T1, T2, T3, T4, TResult](
      func: js.Function4[
          js.UndefOr[/* arg1 */ T1], 
          js.UndefOr[/* arg2 */ T2], 
          js.UndefOr[/* arg3 */ T3], 
          js.UndefOr[T4], 
          TResult
        ],
      context: js.Any,
      scheduler: IScheduler
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  }
  
}

