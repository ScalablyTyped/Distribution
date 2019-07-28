package typings.rxDashLiteDashExperimental.RxNs

import typings.rxDashCore.RxNs.IPromise
import typings.rxDashCore.RxNs.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  /**
    *  Repeats source as long as condition holds emulating a do while loop.
    * @param condition The condition which determines if the source will be repeated.
    * @returns An observable sequence which is repeated as long as the condition holds.
    */
  def doWhile(condition: js.Function0[Boolean]): Observable[T] = js.native
  /**
    *  Expands an observable sequence by recursively invoking selector.
    *
    * @param selector Selector function to invoke for each produced element, resulting in another sequence to which the selector will be invoked recursively again.
    * @param [scheduler] Scheduler on which to perform the expansion. If not provided, this defaults to the current thread scheduler.
    * @returns An observable sequence containing all the elements produced by the recursive expansion.
    */
  def expand(selector: js.Function1[/* item */ T, Observable[T]]): Observable[T] = js.native
  def expand(selector: js.Function1[/* item */ T, Observable[T]], scheduler: IScheduler): Observable[T] = js.native
  def forkJoin[TSecond, TResult](
    second: IPromise[TSecond],
    resultSelector: js.Function2[/* left */ T, /* right */ TSecond, TResult]
  ): Observable[TResult] = js.native
  /**
    *  Runs two observable sequences in parallel and combines their last elemenets.
    *
    * @param second Second observable sequence or promise.
    * @param resultSelector Result selector function to invoke with the last elements of both sequences.
    * @returns An observable sequence with the result of calling the selector function with the last elements of both input sequences.
    */
  def forkJoin[TSecond, TResult](
    second: Observable[TSecond],
    resultSelector: js.Function2[/* left */ T, /* right */ TSecond, TResult]
  ): Observable[TResult] = js.native
  /**
    *  Returns an observable sequence that is the result of invoking the selector on the source sequence, without sharing subscriptions.
    *  This operator allows for a fluent style of writing queries that use the same sequence multiple times.
    *
    * @param selector Selector function which can use the source sequence as many times as needed, without sharing subscriptions to the source sequence.
    * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def let[TResult](selector: js.Function1[/* source */ Observable[T], Observable[TResult]]): Observable[TResult] = js.native
  /**
    *  Returns an observable sequence that is the result of invoking the selector on the source sequence, without sharing subscriptions.
    *  This operator allows for a fluent style of writing queries that use the same sequence multiple times.
    *
    * @param selector Selector function which can use the source sequence as many times as needed, without sharing subscriptions to the source sequence.
    * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def letBind[TResult](selector: js.Function1[/* source */ Observable[T], Observable[TResult]]): Observable[TResult] = js.native
  /**
    * Comonadic bind operator.
    * @param selector A transform function to apply to each element.
    * @param [scheduler] Scheduler used to execute the operation. If not specified, defaults to the ImmediateScheduler.
    * @returns An observable sequence which results from the comonadic bind operation.
    */
  def manySelect[TResult](
    selector: js.Function3[/* item */ Observable[T], /* index */ Double, /* source */ Observable[T], TResult]
  ): Observable[TResult] = js.native
  def manySelect[TResult](
    selector: js.Function3[/* item */ Observable[T], /* index */ Double, /* source */ Observable[T], TResult],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
}

