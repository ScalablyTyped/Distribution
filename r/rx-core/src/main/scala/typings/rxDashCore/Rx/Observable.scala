package typings.rxDashCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def amb(rightSource: IPromise[T]): Observable[T] = js.native
  def amb(rightSource: Observable[T]): Observable[T] = js.native
  def bufferWithCount(count: Double): Observable[js.Array[T]] = js.native
  def bufferWithCount(count: Double, skip: Double): Observable[js.Array[T]] = js.native
  def defaultIfEmpty(): Observable[T] = js.native
  def defaultIfEmpty(defaultValue: T): Observable[T] = js.native
  def distinct(skipParameter: Boolean, valueSerializer: js.Function1[/* value */ T, String]): Observable[T] = js.native
  def distinct[TKey](): Observable[T] = js.native
  def distinct[TKey](keySelector: js.Function1[/* value */ T, TKey]): Observable[T] = js.native
  def distinct[TKey](
    keySelector: js.Function1[/* value */ T, TKey],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[T] = js.native
  def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey]): Observable[GroupedObservable[TKey, T]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey], skipElementSelector: Boolean): Observable[GroupedObservable[TKey, T]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    skipElementSelector: Boolean,
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, T]] = js.native
  def groupByUntil[TKey, TDuration](
    keySelector: js.Function1[/* value */ T, TKey],
    skipElementSelector: Boolean,
    durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]]
  ): Observable[GroupedObservable[TKey, T]] = js.native
  def groupByUntil[TKey, TDuration](
    keySelector: js.Function1[/* value */ T, TKey],
    skipElementSelector: Boolean,
    durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, T]] = js.native
  def groupByUntil[TKey, TElement, TDuration](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement],
    durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def groupByUntil[TKey, TElement, TDuration](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement],
    durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def observeOn(scheduler: IScheduler): Observable[T] = js.native
  def onErrorResumeNext(second: IPromise[T]): Observable[T] = js.native
  def onErrorResumeNext(second: Observable[T]): Observable[T] = js.native
  def subscribeOn(scheduler: IScheduler): Observable[T] = js.native
  def windowWithCount(count: Double): Observable[Observable[T]] = js.native
  def windowWithCount(count: Double, skip: Double): Observable[Observable[T]] = js.native
}

