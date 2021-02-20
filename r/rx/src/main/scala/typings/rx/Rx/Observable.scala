package typings.rx.Rx

import typings.rx.Map
import typings.rx.Rx.special.FlatMapResultSelector
import typings.rx.Set
import typings.rx.anon.Instantiable
import typings.rx.anon.InstantiableTPromise
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rx.Rx.ObservableOrPromise because Already inherited */ @js.native
trait Observable[T] extends IObservable[T] {
  
  /**
    * Propagates the observable sequence or Promise that reacts first.
    * @param {Observable} rightSource Second observable sequence or Promise.
    * @returns {Observable} {Observable} An observable sequence that surfaces either of the given sequences, whichever reacted first.
    */
  def amb(observable: ObservableOrPromise[T]): Observable[T] = js.native
  
  /**
    *  Creates a pattern that matches when both observable sequences have an available value.
    *
    *  @param right Observable sequence to match with the current sequence.
    *  @return {Pattern} Pattern object that matches when both observable sequences have an available value.
    */
  def and[T2](right: Observable[T2]): Pattern2[T, T2] = js.native
  
  /**
    *  Hides the identity of an observable sequence.
    * @returns {Observable} An observable sequence that hides the identity of the source sequence.
    */
  def asObservable(): Observable[T] = js.native
  
  /**
    * Computes the average of an observable sequence of values that are in the sequence or obtained by invoking a transform function on each element of the input sequence if present.
    * @param {Function} [selector] A transform function to apply to each element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence containing a single element with the average of the sequence of values.
    */
  def average(): Observable[Double] = js.native
  def average(keySelector: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[Double] = js.native
  def average(keySelector: Selector[T, Double]): Observable[Double] = js.native
  def average(keySelector: Selector[T, Double], thisArg: js.Any): Observable[Double] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more buffers.
    *  @param {Mixed} bufferOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [bufferClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def buffer[TBufferClosing](bufferClosingSelector: js.Function0[Observable[TBufferClosing]]): Observable[js.Array[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more buffers.
    *  @param {Mixed} bufferOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [bufferClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def buffer[TBufferOpening](bufferOpenings: Observable[TBufferOpening]): Observable[js.Array[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more buffers.
    *  @param {Mixed} bufferOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [bufferClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def buffer[TBufferOpening, TBufferClosing](
    bufferOpenings: Observable[TBufferOpening],
    bufferClosingSelector: js.Function0[Observable[TBufferClosing]]
  ): Observable[js.Array[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more buffers which are produced based on element count information.
    * @param {Number} count Length of each buffer.
    * @param {Number} [skip] Number of elements to skip between creation of consecutive buffers. If not provided, defaults to the count.
    * @returns {Observable} An observable sequence of buffers.
    */
  def bufferWithCount(count: Double): Observable[js.Array[T]] = js.native
  def bufferWithCount(count: Double, skip: Double): Observable[js.Array[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more buffers which are produced based on timing information.
    * @param {Number} timeSpan Length of each buffer (specified as an integer denoting milliseconds).
    * @param {Mixed} [timeShiftOrScheduler]  Interval between creation of consecutive buffers (specified as an integer denoting milliseconds), or an optional scheduler parameter. If not specified, the time shift corresponds to the timeSpan parameter, resulting in non-overlapping adjacent buffers.
    * @param {Scheduler} [scheduler]  Scheduler to run buffer timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of buffers.
    */
  def bufferWithTime(timeSpan: Double): Observable[js.Array[T]] = js.native
  def bufferWithTime(timeSpan: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more buffers which are produced based on timing information.
    * @param {Number} timeSpan Length of each buffer (specified as an integer denoting milliseconds).
    * @param {Mixed} [timeShiftOrScheduler]  Interval between creation of consecutive buffers (specified as an integer denoting milliseconds), or an optional scheduler parameter. If not specified, the time shift corresponds to the timeSpan parameter, resulting in non-overlapping adjacent buffers.
    * @param {Scheduler} [scheduler]  Scheduler to run buffer timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of buffers.
    */
  def bufferWithTime(timeSpan: Double, timeShift: Double): Observable[js.Array[T]] = js.native
  def bufferWithTime(timeSpan: Double, timeShift: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into a buffer that is completed when either it's full or a given amount of time has elapsed.
    * @param {Number} timeSpan Maximum time length of a buffer.
    * @param {Number} count Maximum element count of a buffer.
    * @param {Scheduler} [scheduler]  Scheduler to run bufferin timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of buffers.
    */
  def bufferWithTimeOrCount(timeSpan: Double, count: Double): Observable[js.Array[T]] = js.native
  def bufferWithTimeOrCount(timeSpan: Double, count: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
  
  /**
    * Continues an observable sequence that is terminated by an exception with the next observable sequence.
    * @param {Mixed} handlerOrSecond Exception handler function that returns an observable sequence given the error that occurred in the first sequence, or a second observable sequence used to produce results when an error occurred in the first sequence.
    * @returns {Observable} An observable sequence containing the first sequence's elements, followed by the elements of the handler sequence in case an exception occurred.
    */
  def `catch`(handler: js.Function1[/* exception */ js.Any, ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Continues an observable sequence that is terminated by an exception with the next observable sequence.
    * @param {Mixed} handlerOrSecond Exception handler function that returns an observable sequence given the error that occurred in the first sequence, or a second observable sequence used to produce results when an error occurred in the first sequence.
    * @returns {Observable} An observable sequence containing the first sequence's elements, followed by the elements of the handler sequence in case an exception occurred.
    */
  def `catch`(second: ObservableOrPromise[T]): Observable[T] = js.native
  
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, TResult](second: ObservableOrPromise[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[TOther, TResult](
    souces: js.Array[ObservableOrPromise[TOther]],
    resultSelector: js.Function2[/* firstValue */ T, /* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, T5, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, T5, T6, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, T5, T6, T7, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    resultSelector: js.Function7[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, T5, T6, T7, T8, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    resultSelector: js.Function8[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    * This can be in the form of an argument list of observables or an array.
    *
    * @example
    * 1 - obs = observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    ninth: ObservableOrPromise[T9],
    resultSelector: js.Function9[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      /* v9 */ T9, 
      TResult
    ]
  ): Observable[TResult] = js.native
  
  /**
    * Concatenates all the observable sequences.  This takes in either an array or variable arguments to concatenate.
    * @returns {Observable} An observable sequence that contains the elements of each given sequence, in sequential order.
    */
  def concat(sources: ObservableOrPromise[T]*): Observable[T] = js.native
  
  /**
    * Concatenates an observable sequence of observable sequences.
    * @returns {Observable} An observable sequence that contains the elements of each observed inner sequence, in sequential order.
    */
  def concatAll(): T = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.concatMap(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def concatMap[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.concatMap(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def concatMap[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def concatMap[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    * Projects each notification of an observable sequence to an observable sequence and concats the resulting observable sequences into one observable sequence.
    * @param {Function} onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
    * @param {Function} onError A transform function to apply when an error occurs in the source sequence.
    * @param {Function} onCompleted A transform function to apply when the end of the source sequence is reached.
    * @param {Any} [thisArg] An optional "this" to use to invoke each transform.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
    */
  def concatMapObserver[T, TResult](
    onNext: js.Function2[/* value */ T, /* i */ Double, ObservableOrPromise[TResult]],
    onError: js.Function1[/* error */ js.Any, ObservableOrPromise[_]],
    onCompleted: js.Function0[ObservableOrPromise[_]]
  ): Observable[TResult] = js.native
  def concatMapObserver[T, TResult](
    onNext: js.Function2[/* value */ T, /* i */ Double, ObservableOrPromise[TResult]],
    onError: js.Function1[/* error */ js.Any, ObservableOrPromise[_]],
    onCompleted: js.Function0[ObservableOrPromise[_]],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    * Attaches a controller to the observable sequence with the ability to queue.
    * @example
    * var source = Rx.Observable.interval(100).controlled();
    * source.request(3); // Reads 3 values
    * @param {bool} enableQueue truthy value to determine if values should be queued pending the next request
    * @param {Scheduler} scheduler determines how the requests will be scheduled
    * @returns {Observable} The observable sequence which only propagates values on request.
    */
  def controlled(): ControlledObservable[T] = js.native
  def controlled(enableQueue: js.UndefOr[scala.Nothing], scheduler: IScheduler): ControlledObservable[T] = js.native
  def controlled(enableQueue: Boolean): ControlledObservable[T] = js.native
  def controlled(enableQueue: Boolean, scheduler: IScheduler): ControlledObservable[T] = js.native
  
  /**
    * Returns an observable sequence containing a value that represents how many elements in the specified observable sequence satisfy a condition if provided, else the count of items.
    * @example
    * res = source.count();
    * res = source.count(function (x) { return x > 3; });
    * @param {Function} [predicate]A function to test each element for a condition.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence containing a single element with a number that represents how many elements in the input sequence satisfy the condition in the predicate function if provided, else the count of items in the sequence.
    */
  def count(): Observable[Double] = js.native
  def count(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[Double] = js.native
  def count(predicate: Predicate[T]): Observable[Double] = js.native
  def count(predicate: Predicate[T], thisArg: js.Any): Observable[Double] = js.native
  
  /**
    * Ignores values from an observable sequence which are followed by another value within a computed throttle duration.
    * @param {Function} durationSelector Selector function to retrieve a sequence indicating the throttle duration for each given element.
    * @returns {Observable} The debounced sequence.
    */
  def debounce(debounceDurationSelector: js.Function1[/* item */ T, ObservableOrPromise[_]]): Observable[T] = js.native
  /**
    *  Ignores values from an observable sequence which are followed by another value before dueTime.
    * @param {Number} dueTime Duration of the debounce period for each value (specified as an integer denoting milliseconds).
    * @param {Scheduler} [scheduler]  Scheduler to run the debounce timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} The debounced sequence.
    */
  def debounce(dueTime: Double): Observable[T] = js.native
  def debounce(dueTime: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Returns the elements of the specified sequence or the specified value in a singleton sequence if the sequence is empty.
    *
    *  var res = obs = xs.defaultIfEmpty();
    *  2 - obs = xs.defaultIfEmpty(false);
    *
    * @memberOf Observable#
    * @param defaultValue The value to return if the sequence is empty. If not provided, this defaults to null.
    * @returns {Observable} An observable sequence that contains the specified default value if the source is empty; otherwise, the elements of the source itself.
    */
  def defaultIfEmpty(): Observable[T] = js.native
  def defaultIfEmpty(defaultValue: T): Observable[T] = js.native
  
  /**
    *  Time shifts the observable sequence based on a subscription delay and a delay selector function for each element.
    *
    * @example
    *  1 - res = source.delayWithSelector(function (x) { return Rx.Scheduler.timer(5000); }); // with selector only
    *  1 - res = source.delayWithSelector(Rx.Observable.timer(2000), function (x) { return Rx.Observable.timer(x); }); // with delay and selector
    *
    * @param {Observable} [subscriptionDelay]  Sequence indicating the delay for the subscription to the source.
    * @param {Function} delayDurationSelector Selector function to retrieve a sequence indicating the delay for each given element.
    * @returns {Observable} Time-shifted sequence.
    */
  def delay(delayDurationSelector: js.Function1[/* item */ T, ObservableOrPromise[Double]]): Observable[T] = js.native
  /**
    *  Time shifts the observable sequence by dueTime. The relative time intervals between the values are preserved.
    *
    * @example
    *  1 - res = Rx.Observable.delay(new Date());
    *  2 - res = Rx.Observable.delay(new Date(), Rx.Scheduler.timeout);
    *
    *  3 - res = Rx.Observable.delay(5000);
    *  4 - res = Rx.Observable.delay(5000, 1000, Rx.Scheduler.timeout);
    * @memberOf Observable#
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) by which to shift the observable sequence.
    * @param {Scheduler} [scheduler] Scheduler to run the delay timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Time-shifted sequence.
    */
  def delay(dueTime: Double): Observable[T] = js.native
  def delay(dueTime: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Time shifts the observable sequence by dueTime. The relative time intervals between the values are preserved.
    *
    * @example
    *  1 - res = Rx.Observable.delay(new Date());
    *  2 - res = Rx.Observable.delay(new Date(), Rx.Scheduler.timeout);
    *
    *  3 - res = Rx.Observable.delay(5000);
    *  4 - res = Rx.Observable.delay(5000, 1000, Rx.Scheduler.timeout);
    * @memberOf Observable#
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) by which to shift the observable sequence.
    * @param {Scheduler} [scheduler] Scheduler to run the delay timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Time-shifted sequence.
    */
  def delay(dueTime: Date): Observable[T] = js.native
  def delay(dueTime: Date, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Time shifts the observable sequence based on a subscription delay and a delay selector function for each element.
    *
    * @example
    *  1 - res = source.delayWithSelector(function (x) { return Rx.Scheduler.timer(5000); }); // with selector only
    *  1 - res = source.delayWithSelector(Rx.Observable.timer(2000), function (x) { return Rx.Observable.timer(x); }); // with delay and selector
    *
    * @param {Observable} [subscriptionDelay]  Sequence indicating the delay for the subscription to the source.
    * @param {Function} delayDurationSelector Selector function to retrieve a sequence indicating the delay for each given element.
    * @returns {Observable} Time-shifted sequence.
    */
  def delay(
    subscriptionDelay: Observable[Double],
    delayDurationSelector: js.Function1[/* item */ T, ObservableOrPromise[Double]]
  ): Observable[T] = js.native
  
  /**
    *  Time shifts the observable sequence by delaying the subscription with the specified relative time duration, using the specified scheduler to run timers.
    *
    * @example
    *  1 - res = source.delaySubscription(5000); // 5s
    *  2 - res = source.delaySubscription(5000, Rx.Scheduler.default); // 5 seconds
    *
    * @param {Number} dueTime Relative or absolute time shift of the subscription.
    * @param {Scheduler} [scheduler]  Scheduler to run the subscription delay timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Time-shifted sequence.
    */
  def delaySubscription(dueTime: Double): Observable[T] = js.native
  def delaySubscription(dueTime: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Dematerializes the explicit notification values of an observable sequence as implicit notifications.
    * @returns {Observable} An observable sequence exhibiting the behavior corresponding to the source sequence's notification values.
    */
  def dematerialize[TOrigin](): Observable[TOrigin] = js.native
  
  /**
    *  Returns an observable sequence that contains only distinct elements according to the keySelector and the comparer.
    *  Usage of this operator should be considered carefully due to the maintenance of an internal lookup structure which can grow large.
    *
    * @example
    *  var res = obs = xs.distinct();
    *  2 - obs = xs.distinct(function (x) { return x.id; });
    *  2 - obs = xs.distinct(function (x) { return x.id; }, function (a,b) { return a === b; });
    * @param {Function} [keySelector]  A function to compute the comparison key for each element.
    * @param {Function} [comparer]  Used to compare items in the collection.
    * @returns {Observable} An observable sequence only containing the distinct elements, based on a computed key value, from the source sequence.
    */
  def distinct[TKey](): Observable[T] = js.native
  def distinct[TKey](keySelector: js.UndefOr[scala.Nothing], keySerializer: js.Function1[/* key */ TKey, String]): Observable[T] = js.native
  def distinct[TKey](keySelector: js.Function1[/* value */ T, TKey]): Observable[T] = js.native
  def distinct[TKey](
    keySelector: js.Function1[/* value */ T, TKey],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[T] = js.native
  
  /**
    *  Returns an observable sequence that contains only distinct contiguous elements according to the keySelector and the comparer.
    *
    *  var obs = observable.distinctUntilChanged();
    *  var obs = observable.distinctUntilChanged(function (x) { return x.id; });
    *  var obs = observable.distinctUntilChanged(function (x) { return x.id; }, function (x, y) { return x === y; });
    *
    * @param {Function} [keySelector] A function to compute the comparison key for each element. If not provided, it projects the value.
    * @param {Function} [comparer] Equality comparer for computed key values. If not provided, defaults to an equality comparer function.
    * @returns {Observable} An observable sequence only containing the distinct contiguous elements, based on a computed key value, from the source sequence.
    */
  def distinctUntilChanged[TValue](): Observable[T] = js.native
  def distinctUntilChanged[TValue](keySelector: js.UndefOr[scala.Nothing], comparer: Comparer[TValue, Boolean]): Observable[T] = js.native
  def distinctUntilChanged[TValue](keySelector: js.Function1[/* value */ T, TValue]): Observable[T] = js.native
  def distinctUntilChanged[TValue](keySelector: js.Function1[/* value */ T, TValue], comparer: Comparer[TValue, Boolean]): Observable[T] = js.native
  
  /**
    *  Invokes an action for each element in the observable sequence and invokes an action upon graceful or exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function | Observer} observerOrOnNext Action to invoke for each element in the observable sequence or an observer.
    * @param {Function} [onError]  Action to invoke upon exceptional termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @param {Function} [onCompleted]  Action to invoke upon graceful termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def `do`(): Observable[T] = js.native
  /**
    *  Invokes an action for each element in the observable sequence and invokes an action upon graceful or exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function | Observer} observerOrOnNext Action to invoke for each element in the observable sequence or an observer.
    * @param {Function} [onError]  Action to invoke upon exceptional termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @param {Function} [onCompleted]  Action to invoke upon graceful termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def `do`(observer: Observer[T]): Observable[T] = js.native
  def `do`(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def `do`(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def `do`(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def `do`(onNext: js.Function1[/* value */ T, Unit]): Observable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def `do`(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def `do`(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  
  /**
    *  Invokes an action upon graceful termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onCompleted Action to invoke upon graceful termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def doOnCompleted(onCompleted: js.Function0[Unit]): Observable[T] = js.native
  def doOnCompleted(onCompleted: js.Function0[Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Invokes an action upon exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onError Action to invoke upon exceptional termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def doOnError(onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def doOnError(onError: js.Function1[/* exception */ js.Any, Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Invokes an action for each element in the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onNext Action to invoke for each element in the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def doOnNext(onNext: js.Function1[/* value */ T, Unit]): Observable[T] = js.native
  def doOnNext(onNext: js.Function1[/* value */ T, Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Repeats source as long as condition holds emulating a do while loop.
    *
    * @param {Function} condition The condition which determines if the source will be repeated.
    * @param {Observable} source The observable sequence that will be run if the condition function returns true.
    * @returns {Observable} An observable sequence which is repeated as long as the condition holds.
    */
  def doWhile(condition: js.Function0[Boolean]): Observable[T] = js.native
  
  /**
    * Returns the element at a specified index in a sequence or default value if not found.
    * @param {Number} index The zero-based index of the element to retrieve.
    * @param {Any} [defaultValue] The default value to use if elementAt does not find a value.
    * @returns {Observable} An observable sequence that produces the element at the specified position in the source sequence.
    */
  def elementAt(index: Double): Observable[T] = js.native
  
  /**
    *  Invokes a specified action after the source observable sequence terminates gracefully or exceptionally.
    * @param {Function} finallyAction Action to invoke after the source observable sequence terminates.
    * @returns {Observable} Source sequence with the action-invoking termination behavior applied.
    */
  def ensure(action: js.Function0[Unit]): Observable[T] = js.native
  
  /**
    * Determines whether all elements of an observable sequence satisfy a condition.
    * @param {Function} [predicate] A function to test each element for a condition.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence containing a single element determining whether all elements in the source sequence pass the test in the specified predicate.
    */
  def every(): Observable[Boolean] = js.native
  def every(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[Boolean] = js.native
  def every(predicate: Predicate[T]): Observable[Boolean] = js.native
  def every(predicate: Predicate[T], thisArg: js.Any): Observable[Boolean] = js.native
  
  /**
    *  Expands an observable sequence by recursively invoking selector.
    *
    * @param {Function} selector Selector function to invoke for each produced element, resulting in another sequence to which the selector will be invoked recursively again.
    * @param {Scheduler} [scheduler] Scheduler on which to perform the expansion. If not provided, this defaults to the current thread scheduler.
    * @returns {Observable} An observable sequence containing all the elements produced by the recursive expansion.
    */
  def expand(selector: js.Function1[/* item */ T, Observable[T]]): Observable[T] = js.native
  def expand(selector: js.Function1[/* item */ T, Observable[T]], scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Comonadic bind operator.
    * @param {Function} selector A transform function to apply to each element.
    * @param {Object} scheduler Scheduler used to execute the operation. If not specified, defaults to the ImmediateScheduler.
    * @returns {Observable} An observable sequence which results from the comonadic bind operation.
    */
  def extend[TResult](selector: Selector[Observable[T], TResult]): Observable[TResult] = js.native
  def extend[TResult](selector: Selector[Observable[T], TResult], scheduler: IScheduler): Observable[TResult] = js.native
  
  /**
    *  Filters the elements of an observable sequence based on a predicate by incorporating the element's index.
    *
    * @example
    *  var res = source.where(function (value) { return value < 10; });
    *  var res = source.where(function (value, index) { return value < 10 || index < 10; });
    * @param {Function} predicate A function to test each source element for a condition; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence that contains elements from the input sequence that satisfy the condition.
    */
  def filter(predicate: Predicate[T]): Observable[T] = js.native
  def filter(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Invokes a specified action after the source observable sequence terminates gracefully or exceptionally.
    * @param {Function} finallyAction Action to invoke after the source observable sequence terminates.
    * @returns {Observable} Source sequence with the action-invoking termination behavior applied.
    */
  def `finally`(action: js.Function0[Unit]): Observable[T] = js.native
  
  /**
    * Searches for an element that matches the conditions defined by the specified predicate, and returns the first occurrence within the entire Observable sequence.
    * @param {Function} predicate The predicate that defines the conditions of the element to search for.
    * @param {Any} [thisArg] Object to use as `this` when executing the predicate.
    * @returns {Observable} An Observable sequence with the first element that matches the conditions defined by the specified predicate, if found; otherwise, undefined.
    */
  def find(predicate: Predicate[T]): Observable[T] = js.native
  def find(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    * Searches for an element that matches the conditions defined by the specified predicate, and returns
    * an Observable sequence with the zero-based index of the first occurrence within the entire Observable sequence.
    * @param {Function} predicate The predicate that defines the conditions of the element to search for.
    * @param {Any} [thisArg] Object to use as `this` when executing the predicate.
    * @returns {Observable} An Observable sequence with the zero-based index of the first occurrence of an element that matches the conditions defined by match, if found; otherwise, –1.
    */
  def findIndex(predicate: Predicate[T]): Observable[Double] = js.native
  def findIndex(predicate: Predicate[T], thisArg: js.Any): Observable[Double] = js.native
  
  /**
    * Returns the first element of an observable sequence that satisfies the condition in the predicate if present else the first item in the sequence.
    * @returns {Observable} Sequence containing the first element in the observable sequence that satisfies the condition in the predicate if provided, else the first item in the sequence.
    */
  def first(): Observable[T] = js.native
  def first(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[T] = js.native
  def first(predicate: Predicate[T]): Observable[T] = js.native
  def first(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.selectMany(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def flatMap[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.selectMany(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def flatMap[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def flatMap[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence which performs a exclusive waiting for the first to finish before subscribing to another observable.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time performs a exclusive waiting for the first to finish before subscribing to another observable.
    */
  def flatMapFirst[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence which performs a exclusive waiting for the first to finish before subscribing to another observable.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time performs a exclusive waiting for the first to finish before subscribing to another observable.
    */
  def flatMapFirst[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def flatMapFirst[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def flatMapLatest[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def flatMapLatest[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def flatMapLatest[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    * @param {Function} onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
    * @param {Function} onError A transform function to apply when an error occurs in the source sequence.
    * @param {Function} onCompleted A transform function to apply when the end of the source sequence is reached.
    * @param {Any} [thisArg] An optional "this" to use to invoke each transform.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
    */
  def flatMapObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]]
  ): Observable[T2 | T3 | T4] = js.native
  def flatMapObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]],
    thisArg: js.Any
  ): Observable[T2 | T3 | T4] = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, Rx.Observable.fromArray([1,2,3]));
    * @param selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def flatMapWithMaxConcurrent[TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]
  ): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, Rx.Observable.fromArray([1,2,3]));
    * @param selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def flatMapWithMaxConcurrent[TOther, TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def flatMapWithMaxConcurrent[TOther, TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  Subscribes an o to the observable sequence.
    *  @param {Mixed} [oOrOnNext] The object that is to receive notifications or an action to invoke for each element in the observable sequence.
    *  @param {Function} [onError] Action to invoke upon exceptional termination of the observable sequence.
    *  @param {Function} [onCompleted] Action to invoke upon graceful termination of the observable sequence.
    *  @returns {Diposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def forEach(): IDisposable = js.native
  /**
    *  Subscribes an o to the observable sequence.
    *  @param {Mixed} [oOrOnNext] The object that is to receive notifications or an action to invoke for each element in the observable sequence.
    *  @param {Function} [onError] Action to invoke upon exceptional termination of the observable sequence.
    *  @param {Function} [onCompleted] Action to invoke upon graceful termination of the observable sequence.
    *  @returns {Diposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def forEach(observer: IObserver[T]): IDisposable = js.native
  def forEach(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def forEach(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def forEach(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def forEach(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def forEach(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  def forEach(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def forEach(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): IDisposable = js.native
  
  /**
    *  Runs two observable sequences in parallel and combines their last elemenets.
    *
    * @param {Observable} second Second observable sequence.
    * @param {Function} resultSelector Result selector function to invoke with the last elements of both sequences.
    * @returns {Observable} An observable sequence with the result of calling the selector function with the last elements of both input sequences.
    */
  def forkJoin[TSecond, TResult](
    second: ObservableOrPromise[TSecond],
    resultSelector: js.Function2[/* left */ T, /* right */ TSecond, TResult]
  ): Observable[TResult] = js.native
  
  /**
    *  Groups the elements of an observable sequence according to a specified key selector function and comparer and selects the resulting elements by using a specified function.
    *
    * @example
    *  var res = observable.groupBy(function (x) { return x.id; });
    *  2 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; });
    *  3 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; }, function (x) { return x.toString(); });
    * @param {Function} keySelector A function to extract the key for each element.
    * @param {Function} [elementSelector]  A function to map each source element to an element in an observable group.
    * @returns {Observable} A sequence of observable groups, each of which corresponds to a unique key value, containing all elements that share that same key value.
    */
  def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey]): Observable[GroupedObservable[TKey, T]] = js.native
  /**
    *  Groups the elements of an observable sequence according to a specified key selector function and comparer and selects the resulting elements by using a specified function.
    *
    * @example
    *  var res = observable.groupBy(function (x) { return x.id; });
    *  2 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; });
    *  3 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; }, function (x) { return x.toString(); });
    * @param {Function} keySelector A function to extract the key for each element.
    * @param {Function} [elementSelector]  A function to map each source element to an element in an observable group.
    * @returns {Observable} A sequence of observable groups, each of which corresponds to a unique key value, containing all elements that share that same key value.
    */
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, TElement]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    skipElementSelector: js.UndefOr[scala.Nothing],
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, T]] = js.native
  def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey], skipElementSelector: Boolean): Observable[GroupedObservable[TKey, T]] = js.native
  def groupBy[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    skipElementSelector: Boolean,
    keySerializer: js.Function1[/* key */ TKey, String]
  ): Observable[GroupedObservable[TKey, T]] = js.native
  
  /**
    *  Groups the elements of an observable sequence according to a specified key selector function.
    *  A duration selector function is used to control the lifetime of groups. When a group expires, it receives an OnCompleted notification. When a new element with the same
    *  key value as a reclaimed group occurs, the group will be reborn with a new lifetime request.
    *
    * @example
    *  var res = observable.groupByUntil(function (x) { return x.id; }, null,  function () { return Rx.Observable.never(); });
    *  2 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; },  function () { return Rx.Observable.never(); });
    *  3 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; },  function () { return Rx.Observable.never(); }, function (x) { return x.toString(); });
    * @param {Function} keySelector A function to extract the key for each element.
    * @param {Function} durationSelector A function to signal the expiration of a group.
    * @returns {Observable}
    *  A sequence of observable groups, each of which corresponds to a unique key value, containing all elements that share that same key value.
    *  If a group's lifetime expires, a new group with the same key value can be created once an element with such a key value is encoutered.
    *
    */
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
  /**
    *  Groups the elements of an observable sequence according to a specified key selector function.
    *  A duration selector function is used to control the lifetime of groups. When a group expires, it receives an OnCompleted notification. When a new element with the same
    *  key value as a reclaimed group occurs, the group will be reborn with a new lifetime request.
    *
    * @example
    *  var res = observable.groupByUntil(function (x) { return x.id; }, null,  function () { return Rx.Observable.never(); });
    *  2 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; },  function () { return Rx.Observable.never(); });
    *  3 - observable.groupBy(function (x) { return x.id; }), function (x) { return x.name; },  function () { return Rx.Observable.never(); }, function (x) { return x.toString(); });
    * @param {Function} keySelector A function to extract the key for each element.
    * @param {Function} durationSelector A function to signal the expiration of a group.
    * @returns {Observable}
    *  A sequence of observable groups, each of which corresponds to a unique key value, containing all elements that share that same key value.
    *  If a group's lifetime expires, a new group with the same key value can be created once an element with such a key value is encoutered.
    *
    */
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
  
  /**
    *  Correlates the elements of two sequences based on overlapping durations, and groups the results.
    *
    *  @param {Observable} right The right observable sequence to join elements for.
    *  @param {Function} leftDurationSelector A function to select the duration (expressed as an observable sequence) of each element of the left observable sequence, used to determine overlap.
    *  @param {Function} rightDurationSelector A function to select the duration (expressed as an observable sequence) of each element of the right observable sequence, used to determine overlap.
    *  @param {Function} resultSelector A function invoked to compute a result element for any element of the left sequence with overlapping elements from the right observable sequence. The first parameter passed to the function is an element of the left sequence. The second parameter passed to the function is an observable sequence with elements from the right sequence that overlap with the left sequence's element.
    *  @returns {Observable} An observable sequence that contains result elements computed from source elements that have an overlapping duration.
    */
  def groupJoin[TRight, TDurationLeft, TDurationRight, TResult](
    right: Observable[TRight],
    leftDurationSelector: js.Function1[/* leftItem */ T, Observable[TDurationLeft]],
    rightDurationSelector: js.Function1[/* rightItem */ TRight, Observable[TDurationRight]],
    resultSelector: js.Function2[/* leftItem */ T, /* rightItem */ Observable[TRight], TResult]
  ): Observable[TResult] = js.native
  
  /**
    *  Ignores all elements in an observable sequence leaving only the termination messages.
    * @returns {Observable} An empty observable sequence that signals termination, successful or exceptional, of the source sequence.
    */
  def ignoreElements(): Observable[T] = js.native
  
  /**
    * Determines whether an observable sequence includes a specified element with an optional equality comparer.
    * @param searchElement The value to locate in the source sequence.
    * @param {Number} [fromIndex] An equality comparer to compare elements.
    * @returns {Observable} An observable sequence containing a single element determining whether the source sequence includes an element that has the specified value from the given index.
    */
  def includes(value: T): Observable[Boolean] = js.native
  def includes(value: T, comparer: Comparer[T, Boolean]): Observable[Boolean] = js.native
  
  /**
    * Returns the first index at which a given element can be found in the observable sequence, or -1 if it is not present.
    * @param {Any} searchElement Element to locate in the array.
    * @param {Number} [fromIndex] The index to start the search.  If not specified, defaults to 0.
    * @returns {Observable} And observable sequence containing the first index at which a given element can be found in the observable sequence, or -1 if it is not present.
    */
  def indexOf(element: T): Observable[Double] = js.native
  def indexOf(element: T, fromIndex: Double): Observable[Double] = js.native
  
  /**
    * Determines whether an observable sequence is empty.
    * @returns {Observable} An observable sequence containing a single element determining whether the source sequence is empty.
    */
  def isEmpty(): Observable[Boolean] = js.native
  
  /**
    *  Correlates the elements of two sequences based on overlapping durations.
    *
    *  @param {Observable} right The right observable sequence to join elements for.
    *  @param {Function} leftDurationSelector A function to select the duration (expressed as an observable sequence) of each element of the left observable sequence, used to determine overlap.
    *  @param {Function} rightDurationSelector A function to select the duration (expressed as an observable sequence) of each element of the right observable sequence, used to determine overlap.
    *  @param {Function} resultSelector A function invoked to compute a result element for any two overlapping elements of the left and right observable sequences. The parameters passed to the function correspond with the elements from the left and right source sequences for which overlap occurs.
    *  @returns {Observable} An observable sequence that contains result elements computed from source elements that have an overlapping duration.
    */
  def join[TRight, TDurationLeft, TDurationRight, TResult](
    right: Observable[TRight],
    leftDurationSelector: js.Function1[/* leftItem */ T, Observable[TDurationLeft]],
    rightDurationSelector: js.Function1[/* rightItem */ TRight, Observable[TDurationRight]],
    resultSelector: js.Function2[/* leftItem */ T, /* rightItem */ TRight, TResult]
  ): Observable[TResult] = js.native
  
  /**
    * jortSort checks if your inputs are sorted.  Note that this is only for a sequence with an end.
    * See http://jort.technology/ for full details.
    * @returns {Observable} An observable which has a single value of true if sorted, else false.
    */
  def jortSort(): Observable[Boolean] = js.native
  
  /**
    * jortSort checks if your inputs are sorted until another Observable sequence fires.
    * See http://jort.technology/ for full details.
    * @returns {Observable} An observable which has a single value of true if sorted, else false.
    */
  def jortSortUntil[TOther](other: TOther): Observable[Boolean] = js.native
  
  /**
    * Returns the last element of an observable sequence that satisfies the condition in the predicate if specified, else the last element.
    * @returns {Observable} Sequence containing the last element in the observable sequence that satisfies the condition in the predicate.
    */
  def last(): Observable[T] = js.native
  def last(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[T] = js.native
  def last(predicate: Predicate[T]): Observable[T] = js.native
  def last(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Returns an observable sequence that is the result of invoking the selector on the source sequence, without sharing subscriptions.
    *  This operator allows for a fluent style of writing queries that use the same sequence multiple times.
    *
    * @param {Function} selector Selector function which can use the source sequence as many times as needed, without sharing subscriptions to the source sequence.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def let[TResult](selector: js.Function1[/* source */ Observable[T], Observable[TResult]]): Observable[TResult] = js.native
  
  /**
    * Comonadic bind operator.
    * @param {Function} selector A transform function to apply to each element.
    * @param {Object} scheduler Scheduler used to execute the operation. If not specified, defaults to the ImmediateScheduler.
    * @returns {Observable} An observable sequence which results from the comonadic bind operation.
    */
  def manySelect[TResult](selector: Selector[Observable[T], TResult]): Observable[TResult] = js.native
  def manySelect[TResult](selector: Selector[Observable[T], TResult], scheduler: IScheduler): Observable[TResult] = js.native
  
  /**
    * Projects each element of an observable sequence into a new form by incorporating the element's index.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source.
    */
  def map[TResult](selector: Selector[T, TResult]): Observable[TResult] = js.native
  def map[TResult](selector: Selector[T, TResult], thisArg: js.Any): Observable[TResult] = js.native
  
  /**
    *  Materializes the implicit notifications of an observable sequence as explicit notification values.
    * @returns {Observable} An observable sequence containing the materialized notification values from the source sequence.
    */
  def materialize(): Observable[T] = js.native
  
  /**
    * Returns the maximum value in an observable sequence according to the specified comparer.
    * @example
    * var res = source.max();
    * var res = source.max(function (x, y) { return x.value - y.value; });
    * @param {Function} [comparer] Comparer used to compare elements.
    * @returns {Observable} An observable sequence containing a single element with the maximum element in the source sequence.
    */
  def max(): Observable[Double] = js.native
  def max(comparer: Comparer[T, Double]): Observable[Double] = js.native
  
  /**
    * Returns the elements in an observable sequence with the maximum  key value according to the specified comparer.
    * @example
    * var res = source.maxBy(function (x) { return x.value; });
    * var res = source.maxBy(function (x) { return x.value; }, function (x, y) { return x - y;; });
    * @param {Function} keySelector Key selector function.
    * @param {Function} [comparer]  Comparer used to compare key values.
    * @returns {Observable} An observable sequence containing a list of zero or more elements that have a maximum key value.
    */
  def maxBy(keySelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
  /**
    * Returns the elements in an observable sequence with the maximum  key value according to the specified comparer.
    * @example
    * var res = source.maxBy(function (x) { return x.value; });
    * var res = source.maxBy(function (x) { return x.value; }, function (x, y) { return x - y;; });
    * @param {Function} keySelector Key selector function.
    * @param {Function} [comparer]  Comparer used to compare key values.
    * @returns {Observable} An observable sequence containing a list of zero or more elements that have a maximum key value.
    */
  def maxBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, Double]): Observable[T] = js.native
  
  /**
    * Merges an observable sequence of observable sequences into an observable sequence, limiting the number of concurrent subscriptions to inner sequences.
    * Or merges two observable sequences into a single observable sequence.
    *
    * @example
    * 1 - merged = sources.merge(1);
    * 2 - merged = source.merge(otherSource);
    * @param {Mixed} [maxConcurrentOrOther] Maximum number of inner observable sequences being subscribed to concurrently or the second observable sequence.
    * @returns {Observable} The observable sequence that merges the elements of the inner sequences.
    */
  def merge(maxConcurrent: Double): T = js.native
  /**
    * Merges an observable sequence of observable sequences into an observable sequence, limiting the number of concurrent subscriptions to inner sequences.
    * Or merges two observable sequences into a single observable sequence.
    *
    * @example
    * 1 - merged = sources.merge(1);
    * 2 - merged = source.merge(otherSource);
    * @param {Mixed} [maxConcurrentOrOther] Maximum number of inner observable sequences being subscribed to concurrently or the second observable sequence.
    * @returns {Observable} The observable sequence that merges the elements of the inner sequences.
    */
  def merge(other: ObservableOrPromise[T]): Observable[T] = js.native
  
  /**
    * Merges an observable sequence of observable sequences into an observable sequence.
    * @returns {Observable} The observable sequence that merges the elements of the inner sequences.
    */
  def mergeAll(): T = js.native
  
  /**
    * Returns the minimum element in an observable sequence according to the optional comparer else a default greater than less than check.
    * @example
    * var res = source.min();
    * var res = source.min(function (x, y) { return x.value - y.value; });
    * @param {Function} [comparer] Comparer used to compare elements.
    * @returns {Observable} An observable sequence containing a single element with the minimum element in the source sequence.
    */
  def min(): Observable[Double] = js.native
  def min(comparer: Comparer[T, Double]): Observable[Double] = js.native
  
  /**
    * Returns the elements in an observable sequence with the minimum key value according to the specified comparer.
    * @example
    * var res = source.minBy(function (x) { return x.value; });
    * var res = source.minBy(function (x) { return x.value; }, function (x, y) { return x - y; });
    * @param {Function} keySelector Key selector function.
    * @param {Function} [comparer] Comparer used to compare key values.
    * @returns {Observable} An observable sequence containing a list of zero or more elements that have a minimum key value.
    */
  def minBy(keySelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
  /**
    * Returns the elements in an observable sequence with the minimum key value according to the specified comparer.
    * @example
    * var res = source.minBy(function (x) { return x.value; });
    * var res = source.minBy(function (x) { return x.value; }, function (x, y) { return x - y; });
    * @param {Function} keySelector Key selector function.
    * @param {Function} [comparer] Comparer used to compare key values.
    * @returns {Observable} An observable sequence containing a list of zero or more elements that have a minimum key value.
    */
  def minBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, Double]): Observable[T] = js.native
  
  def multicast(subject: js.Function0[ISubject[T]]): ConnectableObservable[T] = js.native
  /**
    * Multicasts the source sequence notifications through an instantiated subject into all uses of the sequence within a selector function. Each
    * subscription to the resulting sequence causes a separate multicast invocation, exposing the sequence resulting from the selector function's
    * invocation. For specializations with fixed subject types, see Publish, PublishLast, and Replay.
    *
    * @example
    * 1 - res = source.multicast(observable);
    * 2 - res = source.multicast(function () { return new Subject(); }, function (x) { return x; });
    *
    * @param {Function|Subject} subjectOrSubjectSelector
    * Factory function to create an intermediate subject through which the source sequence's elements will be multicast to the selector function.
    * Or:
    * Subject to push source elements into.
    *
    * @param {Function} [selector] Optional selector function which can use the multicasted source sequence subject to the policies enforced by the created subject. Specified only if <paramref name="subjectOrSubjectSelector" is a factory function.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def multicast(subject: ISubject[T]): ConnectableObservable[T] = js.native
  def multicast[TResult](
    subjectSelector: js.Function0[ISubject[T]],
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]
  ): Observable[T] = js.native
  /**
    * Multicasts the source sequence notifications through an instantiated subject into all uses of the sequence within a selector function. Each
    * subscription to the resulting sequence causes a separate multicast invocation, exposing the sequence resulting from the selector function's
    * invocation. For specializations with fixed subject types, see Publish, PublishLast, and Replay.
    *
    * @example
    * 1 - res = source.multicast(observable);
    * 2 - res = source.multicast(function () { return new Subject(); }, function (x) { return x; });
    *
    * @param {Function|Subject} subjectOrSubjectSelector
    * Factory function to create an intermediate subject through which the source sequence's elements will be multicast to the selector function.
    * Or:
    * Subject to push source elements into.
    *
    * @param {Function} [selector] Optional selector function which can use the multicasted source sequence subject to the policies enforced by the created subject. Specified only if <paramref name="subjectOrSubjectSelector" is a factory function.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def multicast[TResult](
    subjectSelector: ISubject[T],
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]
  ): Observable[T] = js.native
  
  /**
    *  Wraps the source sequence in order to run its observer callbacks on the specified scheduler.
    *
    *  This only invokes observer callbacks on a scheduler. In case the subscription and/or unsubscription actions have side-effects
    *  that require to be run on a scheduler, use subscribeOn.
    *
    *  @param {Scheduler} scheduler Scheduler to notify observers on.
    *  @returns {Observable} The source sequence whose observations happen on the specified scheduler.
    */
  def observeOn(scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Continues an observable sequence that is terminated normally or by an exception with the next observable sequence.
    * @param {Observable} second Second observable sequence used to produce results after the first sequence terminates.
    * @returns {Observable} An observable sequence that concatenates the first and second sequence, even if the first sequence terminates exceptionally.
    */
  def onErrorResumeNext(second: ObservableOrPromise[T]): Observable[T] = js.native
  
  /**
    * Returns a new observable that triggers on the second and subsequent triggerings of the input observable.
    * The Nth triggering of the input observable passes the arguments from the N-1th and Nth triggering as a pair.
    * The argument passed to the N-1th triggering is held in hidden internal state until the Nth triggering occurs.
    * @returns {Observable} An observable that triggers on successive pairs of observations from the input observable as an array.
    */
  def pairwise(): Observable[js.Tuple2[T, T]] = js.native
  
  /**
    * Returns two observables which partition the observations of the source by the given function.
    * The first will trigger observations for those values for which the predicate returns true.
    * The second will trigger observations for those values where the predicate returns false.
    * The predicate is executed once for each subscribed observer.
    * Both also propagate all error observations arising from the source and each completes
    * when the source completes.
    * @param {Function} predicate
    *    The function to determine which output Observable will trigger a particular observation.
    * @returns {Array}
    *    An array of observables. The first triggers when the predicate returns true,
    *    and the second triggers when the predicate returns false.
    */
  def partition(predicate: Predicate[T]): js.Tuple2[Observable[T], Observable[T]] = js.native
  def partition(predicate: Predicate[T], thisArg: js.Any): js.Tuple2[Observable[T], Observable[T]] = js.native
  
  /**
    * Pauses the underlying observable sequence based upon the observable sequence which yields true/false.
    * @example
    * var pauser = new Rx.Subject();
    * var source = Rx.Observable.interval(100).pausable(pauser);
    * @param {Observable} pauser The observable sequence used to pause the underlying sequence.
    * @returns {Observable} The observable sequence which is paused based upon the pauser.
    */
  def pausable(): PausableObservable[T] = js.native
  def pausable(pauser: Observable[Boolean]): PausableObservable[T] = js.native
  
  /**
    * Pauses the underlying observable sequence based upon the observable sequence which yields true/false,
    * and yields the values that were buffered while paused.
    * @example
    * var pauser = new Rx.Subject();
    * var source = Rx.Observable.interval(100).pausableBuffered(pauser);
    * @param {Observable} pauser The observable sequence used to pause the underlying sequence.
    * @returns {Observable} The observable sequence which is paused based upon the pauser.
    */
  def pausableBuffered(): PausableObservable[T] = js.native
  def pausableBuffered(pauser: Observable[Boolean]): PausableObservable[T] = js.native
  
  /**
    * Pipes the existing Observable sequence into a Node.js Stream.
    * @param {Stream} dest The destination Node.js stream.
    * @returns {Stream} The destination stream.
    */
  def pipe[TDest](dest: TDest): TDest = js.native
  
  /**
    * Retrieves the value of a specified nested property from all elements in
    * the Observable sequence.
    * @param {Arguments} arguments The nested properties to pluck.
    * @returns {Observable} Returns a new Observable sequence of property values.
    */
  def pluck[TResult](prop: String): Observable[TResult] = js.native
  
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence.
    * This operator is a specialization of Multicast using a regular Subject.
    *
    * @example
    * var resres = source.publish();
    * var res = source.publish(function (x) { return x; });
    *
    * @param {Function} [selector] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive all notifications of the source from the time of the subscription on.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publish(): ConnectableObservable[T] = js.native
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence.
    * This operator is a specialization of Multicast using a regular Subject.
    *
    * @example
    * var resres = source.publish();
    * var res = source.publish(function (x) { return x; });
    *
    * @param {Function} [selector] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive all notifications of the source from the time of the subscription on.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publish[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
  
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence containing only the last notification.
    * This operator is a specialization of Multicast using a AsyncSubject.
    *
    * @example
    * var res = source.publishLast();
    * var res = source.publishLast(function (x) { return x; });
    *
    * @param selector [Optional] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will only receive the last notification of the source.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publishLast(): ConnectableObservable[T] = js.native
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence containing only the last notification.
    * This operator is a specialization of Multicast using a AsyncSubject.
    *
    * @example
    * var res = source.publishLast();
    * var res = source.publishLast(function (x) { return x; });
    *
    * @param selector [Optional] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will only receive the last notification of the source.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publishLast[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
  
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence and starts with initialValue.
    * This operator is a specialization of Multicast using a BehaviorSubject.
    *
    * @example
    * var res = source.publishValue(42);
    * var res = source.publishValue(function (x) { return x.select(function (y) { return y * y; }) }, 42);
    *
    * @param {Function} [selector] Optional selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive immediately receive the initial value, followed by all notifications of the source from the time of the subscription on.
    * @param {Mixed} initialValue Initial value received by observers upon subscription.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publishValue(initialValue: T): ConnectableObservable[T] = js.native
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence and starts with initialValue.
    * This operator is a specialization of Multicast using a BehaviorSubject.
    *
    * @example
    * var res = source.publishValue(42);
    * var res = source.publishValue(function (x) { return x.select(function (y) { return y * y; }) }, 42);
    *
    * @param {Function} [selector] Optional selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive immediately receive the initial value, followed by all notifications of the source from the time of the subscription on.
    * @param {Mixed} initialValue Initial value received by observers upon subscription.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def publishValue[TResult](
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]],
    initialValue: T
  ): Observable[TResult] = js.native
  
  /**
    * Applies an accumulator function over an observable sequence, returning the result of the aggregation as a single element in the result sequence. The specified seed value is used as the initial accumulator value.
    * For aggregation behavior with incremental intermediate results, see Observable.scan.
    * @param {Function} accumulator An accumulator function to be invoked on each element.
    * @param {Any} [seed] The initial accumulator value.
    * @returns {Observable} An observable sequence containing a single element with the final accumulator value.
    */
  def reduce(accumulator: Accumulator[T, T]): Observable[T] = js.native
  def reduce(accumulator: Accumulator[T, T], seed: T): Observable[T] = js.native
  /**
    * Applies an accumulator function over an observable sequence, returning the result of the aggregation as a single element in the result sequence. The specified seed value is used as the initial accumulator value.
    * For aggregation behavior with incremental intermediate results, see Observable.scan.
    * @param {Function} accumulator An accumulator function to be invoked on each element.
    * @param {Any} [seed] The initial accumulator value.
    * @returns {Observable} An observable sequence containing a single element with the final accumulator value.
    */
  @JSName("reduce")
  def reduce_TAcc[TAcc](accumulator: Accumulator[T, TAcc]): Observable[TAcc] = js.native
  @JSName("reduce")
  def reduce_TAcc[TAcc](accumulator: Accumulator[T, TAcc], seed: TAcc): Observable[TAcc] = js.native
  
  /**
    *  Repeats the observable sequence a specified number of times. If the repeat count is not specified, the sequence repeats indefinitely.
    * @param {Number} [repeatCount]  Number of times to repeat the sequence. If not provided, repeats the sequence indefinitely.
    * @returns {Observable} The observable sequence producing the elements of the given sequence repeatedly.
    */
  def repeat(): Observable[T] = js.native
  def repeat(repeatCount: Double): Observable[T] = js.native
  
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence replaying notifications subject to a maximum time length for the replay buffer.
    * This operator is a specialization of Multicast using a ReplaySubject.
    *
    * @example
    * var res = source.replay(null, 3);
    * var res = source.replay(null, 3, 500);
    * var res = source.replay(null, 3, 500, scheduler);
    * var res = source.replay(function (x) { return x.take(6).repeat(); }, 3, 500, scheduler);
    *
    * @param selector [Optional] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive all the notifications of the source subject to the specified replay buffer trimming policy.
    * @param bufferSize [Optional] Maximum element count of the replay buffer.
    * @param windowSize [Optional] Maximum time length of the replay buffer.
    * @param scheduler [Optional] Scheduler where connected observers within the selector function will be invoked on.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def replay(): ConnectableObservable[T] = js.native
  def replay(
    selector: js.UndefOr[scala.Nothing],
    bufferSize: js.UndefOr[scala.Nothing],
    window: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): ConnectableObservable[T] = js.native
  def replay(selector: js.UndefOr[scala.Nothing], bufferSize: js.UndefOr[scala.Nothing], window: Double): ConnectableObservable[T] = js.native
  def replay(
    selector: js.UndefOr[scala.Nothing],
    bufferSize: js.UndefOr[scala.Nothing],
    window: Double,
    scheduler: IScheduler
  ): ConnectableObservable[T] = js.native
  def replay(selector: js.UndefOr[scala.Nothing], bufferSize: Double): ConnectableObservable[T] = js.native
  def replay(
    selector: js.UndefOr[scala.Nothing],
    bufferSize: Double,
    window: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): ConnectableObservable[T] = js.native
  def replay(selector: js.UndefOr[scala.Nothing], bufferSize: Double, window: Double): ConnectableObservable[T] = js.native
  def replay(selector: js.UndefOr[scala.Nothing], bufferSize: Double, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
  // hack to catch first omitted parameter
  /**
    * Returns an observable sequence that is the result of invoking the selector on a connectable observable sequence that shares a single subscription to the underlying sequence replaying notifications subject to a maximum time length for the replay buffer.
    * This operator is a specialization of Multicast using a ReplaySubject.
    *
    * @example
    * var res = source.replay(null, 3);
    * var res = source.replay(null, 3, 500);
    * var res = source.replay(null, 3, 500, scheduler);
    * var res = source.replay(function (x) { return x.take(6).repeat(); }, 3, 500, scheduler);
    *
    * @param selector [Optional] Selector function which can use the multicasted source sequence as many times as needed, without causing multiple subscriptions to the source sequence. Subscribers to the given source will receive all the notifications of the source subject to the specified replay buffer trimming policy.
    * @param bufferSize [Optional] Maximum element count of the replay buffer.
    * @param windowSize [Optional] Maximum time length of the replay buffer.
    * @param scheduler [Optional] Scheduler where connected observers within the selector function will be invoked on.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence within a selector function.
    */
  def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: js.UndefOr[scala.Nothing],
    window: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: js.UndefOr[scala.Nothing],
    window: Double
  ): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: js.UndefOr[scala.Nothing],
    window: Double,
    scheduler: IScheduler
  ): Observable[T] = js.native
  def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]], bufferSize: Double): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: Double,
    window: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: Double,
    window: Double
  ): Observable[T] = js.native
  def replay(
    selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
    bufferSize: Double,
    window: Double,
    scheduler: IScheduler
  ): Observable[T] = js.native
  def replay(selector: Unit): ConnectableObservable[T] = js.native
  def replay(
    selector: Unit,
    bufferSize: js.UndefOr[scala.Nothing],
    window: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: js.UndefOr[scala.Nothing], window: Double): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: Double): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: Double, window: Double): ConnectableObservable[T] = js.native
  def replay(selector: Unit, bufferSize: Double, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
  
  /**
    *  Repeats the source observable sequence the specified number of times or until it successfully terminates. If the retry count is not specified, it retries indefinitely.
    *  Note if you encounter an error and want it to retry once, then you must use .retry(2);
    *
    * @example
    *  var res = retried = retry.repeat();
    *  var res = retried = retry.repeat(2);
    * @param {Number} [retryCount]  Number of times to retry the sequence. If not provided, retry the sequence indefinitely.
    * @returns {Observable} An observable sequence producing the elements of the given sequence repeatedly until it terminates successfully.
    */
  def retry(): Observable[T] = js.native
  def retry(retryCount: Double): Observable[T] = js.native
  
  /**
    *  Repeats the source observable sequence upon error each time the notifier emits or until it successfully terminates.
    *  if the notifier completes, the observable sequence completes.
    *
    * @example
    *  var timer = Observable.timer(500);
    *  var source = observable.retryWhen(timer);
    * @param {Observable} [notifier] An observable that triggers the retries or completes the observable with onNext or onCompleted respectively.
    * @returns {Observable} An observable sequence producing the elements of the given sequence repeatedly until it terminates successfully.
    */
  def retryWhen(notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): Observable[T] = js.native
  
  /**
    *  Samples the observable sequence at each interval.
    *
    * @example
    *  1 - res = source.sample(sampleObservable); // Sampler tick sequence
    *  2 - res = source.sample(5000); // 5 seconds
    *  2 - res = source.sample(5000, Rx.Scheduler.timeout); // 5 seconds
    *
    * @param {Mixed} intervalOrSampler Interval at which to sample (specified as an integer denoting milliseconds) or Sampler Observable.
    * @param {Scheduler} [scheduler]  Scheduler to run the sampling timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Sampled observable sequence.
    */
  def sample(intervalOrSampler: Double): Observable[T] = js.native
  def sample(intervalOrSampler: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Samples the observable sequence at each interval.
    *
    * @example
    *  1 - res = source.sample(sampleObservable); // Sampler tick sequence
    *  2 - res = source.sample(5000); // 5 seconds
    *  2 - res = source.sample(5000, Rx.Scheduler.timeout); // 5 seconds
    *
    * @param {Mixed} intervalOrSampler Interval at which to sample (specified as an integer denoting milliseconds) or Sampler Observable.
    * @param {Scheduler} [scheduler]  Scheduler to run the sampling timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Sampled observable sequence.
    */
  def sample[TSample](sampler: Observable[TSample]): Observable[T] = js.native
  def sample[TSample](sampler: Observable[TSample], scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Applies an accumulator function over an observable sequence and returns each intermediate result. The optional seed value is used as the initial accumulator value.
    *  For aggregation behavior with no intermediate results, see Observable.aggregate.
    * @example
    *  var res = source.scan(function (acc, x) { return acc + x; });
    *  var res = source.scan(function (acc, x) { return acc + x; }, 0);
    * @param {Function} accumulator An accumulator function to be invoked on each element.
    * @param {Mixed} [seed] The initial accumulator value.
    * @returns {Observable} An observable sequence containing the accumulated values.
    */
  def scan(accumulator: Accumulator[T, T]): Observable[T] = js.native
  def scan(accumulator: Accumulator[T, T], seed: T): Observable[T] = js.native
  /**
    *  Applies an accumulator function over an observable sequence and returns each intermediate result. The optional seed value is used as the initial accumulator value.
    *  For aggregation behavior with no intermediate results, see Observable.aggregate.
    * @example
    *  var res = source.scan(function (acc, x) { return acc + x; });
    *  var res = source.scan(function (acc, x) { return acc + x; }, 0);
    * @param {Function} accumulator An accumulator function to be invoked on each element.
    * @param {Mixed} [seed] The initial accumulator value.
    * @returns {Observable} An observable sequence containing the accumulated values.
    */
  @JSName("scan")
  def scan_TAcc[TAcc](accumulator: Accumulator[T, TAcc]): Observable[TAcc] = js.native
  @JSName("scan")
  def scan_TAcc[TAcc](accumulator: Accumulator[T, TAcc], seed: TAcc): Observable[TAcc] = js.native
  
  /**
    * Projects each element of an observable sequence into a new form by incorporating the element's index.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source.
    */
  def select[TResult](selector: Selector[T, TResult]): Observable[TResult] = js.native
  def select[TResult](selector: Selector[T, TResult], thisArg: js.Any): Observable[TResult] = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.concatMap(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectConcat[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.concatMap(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.concatMap(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectConcat[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def selectConcat[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    * Projects each notification of an observable sequence to an observable sequence and concats the resulting observable sequences into one observable sequence.
    * @param {Function} onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
    * @param {Function} onError A transform function to apply when an error occurs in the source sequence.
    * @param {Function} onCompleted A transform function to apply when the end of the source sequence is reached.
    * @param {Any} [thisArg] An optional "this" to use to invoke each transform.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
    */
  def selectConcatObserver[T, TResult](
    onNext: js.Function2[/* value */ T, /* i */ Double, ObservableOrPromise[TResult]],
    onError: js.Function1[/* error */ js.Any, ObservableOrPromise[_]],
    onCompleted: js.Function0[ObservableOrPromise[_]]
  ): Observable[TResult] = js.native
  def selectConcatObserver[T, TResult](
    onNext: js.Function2[/* value */ T, /* i */ Double, ObservableOrPromise[TResult]],
    onError: js.Function1[/* error */ js.Any, ObservableOrPromise[_]],
    onCompleted: js.Function0[ObservableOrPromise[_]],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.selectMany(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectMany[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.selectMany(function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.selectMany(Rx.Observable.fromArray([1,2,3]));
    * @param {Function} selector A transform function to apply to each element or an observable sequence to project each element from the source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectMany[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def selectMany[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    * Projects each notification of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    * @param {Function} onNext A transform function to apply to each element; the second parameter of the function represents the index of the source element.
    * @param {Function} onError A transform function to apply when an error occurs in the source sequence.
    * @param {Function} onCompleted A transform function to apply when the end of the source sequence is reached.
    * @param {Any} [thisArg] An optional "this" to use to invoke each transform.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function corresponding to each notification in the input sequence.
    */
  def selectManyObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]]
  ): Observable[T2 | T3 | T4] = js.native
  def selectManyObserver[T2, T3, T4](
    onNext: js.Function2[/* value */ T, /* index */ Double, Observable[T2]],
    onError: js.Function1[/* exception */ js.Any, Observable[T3]],
    onCompleted: js.Function0[Observable[T4]],
    thisArg: js.Any
  ): Observable[T2 | T3 | T4] = js.native
  
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, Rx.Observable.fromArray([1,2,3]));
    * @param selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectManyWithMaxConcurrent[TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]
  ): Observable[TResult] = js.native
  /**
    *  One of the Following:
    *  Projects each element of an observable sequence to an observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    * @example
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); });
    *  Or:
    *  Projects each element of an observable sequence to an observable sequence, invokes the result selector for the source element and each of the corresponding inner sequence's elements, and merges the results into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, function (x) { return Rx.Observable.range(0, x); }, function (x, y) { return x + y; });
    *  Or:
    *  Projects each element of the source observable sequence to the other observable sequence and merges the resulting observable sequences into one observable sequence.
    *
    *  var res = source.flatMapWithMaxConcurrent(5, Rx.Observable.fromArray([1,2,3]));
    * @param selector A transform function to apply to each element or an observable sequence to project each element from the
    * source sequence onto which could be either an observable or Promise.
    * @param {Function} [resultSelector]  A transform function to apply to each element of the intermediate sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the one-to-many transform function collectionSelector on each element of the input sequence and then mapping each of those sequence elements and their corresponding source element to a result element.
    */
  def selectManyWithMaxConcurrent[TOther, TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def selectManyWithMaxConcurrent[TOther, TResult](
    maxConcurrent: Double,
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def selectSwitch[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def selectSwitch[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def selectSwitch[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence which performs a exclusive waiting for the first to finish before subscribing to another observable.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time performs a exclusive waiting for the first to finish before subscribing to another observable.
    */
  def selectSwitchFirst[TResult](selector: ValueOrSelector[T, ArrayOrIterable[TResult] | ObservableOrPromise[TResult]]): Observable[TResult] = js.native
  /**
    *  Projects each element of an observable sequence into a new sequence of observable sequences by incorporating the element's index and then
    *  transforms an observable sequence of observable sequences into an observable sequence which performs a exclusive waiting for the first to finish before subscribing to another observable.
    * @param {Function} selector A transform function to apply to each source element; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence whose elements are the result of invoking the transform function on each element of source producing an Observable of Observable sequences
    *  and that at any point in time performs a exclusive waiting for the first to finish before subscribing to another observable.
    */
  def selectSwitchFirst[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult]
  ): Observable[TResult] = js.native
  def selectSwitchFirst[TOther, TResult](
    selector: ValueOrSelector[T, ArrayOrIterable[TOther] | ObservableOrPromise[TOther]],
    resultSelector: FlatMapResultSelector[T, TOther, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  
  def sequenceEqual(second: ArrayOrIterable[T]): Observable[Boolean] = js.native
  def sequenceEqual(second: ArrayOrIterable[T], comparer: Comparer[T, Boolean]): Observable[Boolean] = js.native
  /**
    *  Determines whether two sequences are equal by comparing the elements pairwise using a specified equality comparer.
    *
    * @example
    * var res = res = source.sequenceEqual([1,2,3]);
    * var res = res = source.sequenceEqual([{ value: 42 }], function (x, y) { return x.value === y.value; });
    * 3 - res = source.sequenceEqual(Rx.Observable.returnValue(42));
    * 4 - res = source.sequenceEqual(Rx.Observable.returnValue({ value: 42 }), function (x, y) { return x.value === y.value; });
    * @param {Observable} second Second observable sequence or array to compare.
    * @param {Function} [comparer] Comparer used to compare elements of both sequences.
    * @returns {Observable} An observable sequence that contains a single element which indicates whether both sequences are of equal length and their corresponding elements are equal according to the specified equality comparer.
    */
  def sequenceEqual(second: ObservableOrPromise[T]): Observable[Boolean] = js.native
  def sequenceEqual(second: ObservableOrPromise[T], comparer: Comparer[T, Boolean]): Observable[Boolean] = js.native
  @JSName("sequenceEqual")
  def sequenceEqual_TOther[TOther](second: ArrayOrIterable[T], comparer: Comparer[T | TOther, Boolean]): Observable[Boolean] = js.native
  /**
    *  Determines whether two sequences are equal by comparing the elements pairwise using a specified equality comparer.
    *
    * @example
    * var res = res = source.sequenceEqual([1,2,3]);
    * var res = res = source.sequenceEqual([{ value: 42 }], function (x, y) { return x.value === y.value; });
    * 3 - res = source.sequenceEqual(Rx.Observable.returnValue(42));
    * 4 - res = source.sequenceEqual(Rx.Observable.returnValue({ value: 42 }), function (x, y) { return x.value === y.value; });
    * @param {Observable} second Second observable sequence or array to compare.
    * @param {Function} [comparer] Comparer used to compare elements of both sequences.
    * @returns {Observable} An observable sequence that contains a single element which indicates whether both sequences are of equal length and their corresponding elements are equal according to the specified equality comparer.
    */
  @JSName("sequenceEqual")
  def sequenceEqual_TOther[TOther](second: ObservableOrPromise[T], comparer: Comparer[T | TOther, Boolean]): Observable[Boolean] = js.native
  
  /**
    * Returns an observable sequence that shares a single subscription to the underlying sequence.
    * This operator is a specialization of publish which creates a subscription when the number of observers goes from zero to one, then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
    */
  def share(): Observable[T] = js.native
  
  /**
    * Returns an observable sequence that shares a single subscription to the underlying sequence replaying notifications subject to a maximum time length for the replay buffer.
    * This operator is a specialization of replay which creates a subscription when the number of observers goes from zero to one, then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
    *
    * @example
    * var res = source.shareReplay(3);
    * var res = source.shareReplay(3, 500);
    * var res = source.shareReplay(3, 500, scheduler);
    *
    * @param bufferSize [Optional] Maximum element count of the replay buffer.
    * @param window [Optional] Maximum time length of the replay buffer.
    * @param scheduler [Optional] Scheduler where connected observers within the selector function will be invoked on.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
    */
  def shareReplay(): Observable[T] = js.native
  def shareReplay(bufferSize: js.UndefOr[scala.Nothing], window: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
  def shareReplay(bufferSize: js.UndefOr[scala.Nothing], window: Double): Observable[T] = js.native
  def shareReplay(bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler): Observable[T] = js.native
  def shareReplay(bufferSize: Double): Observable[T] = js.native
  def shareReplay(bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
  def shareReplay(bufferSize: Double, window: Double): Observable[T] = js.native
  def shareReplay(bufferSize: Double, window: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Returns an observable sequence that shares a single subscription to the underlying sequence and starts with an initialValue.
    * This operator is a specialization of publishValue which creates a subscription when the number of observers goes from zero to one, then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
    * @param {Mixed} initialValue Initial value received by observers upon subscription.
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
    */
  def shareValue(initialValue: T): Observable[T] = js.native
  
  /**
    * Returns the only element of an observable sequence that satisfies the condition in the optional predicate, and reports an exception if there is not exactly one element in the observable sequence.
    * @param {Function} [predicate] A predicate function to evaluate for elements in the source sequence.
    * @param {Any} [thisArg] Object to use as `this` when executing the predicate.
    * @returns {Observable} Sequence containing the single element in the observable sequence that satisfies the condition in the predicate.
    */
  def single(): Observable[T] = js.native
  def single(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[T] = js.native
  def single(predicate: Predicate[T]): Observable[T] = js.native
  def single(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    * Returns an observable sequence that shares a single subscription to the underlying sequence. This observable sequence
    * can be resubscribed to, even if all prior subscriptions have ended. (unlike `.publish().refCount()`)
    * @returns {Observable} An observable sequence that contains the elements of a sequence produced by multicasting the source.
    */
  def singleInstance(): Observable[T] = js.native
  
  /**
    * Bypasses a specified number of elements in an observable sequence and then returns the remaining elements.
    * @param {Number} count The number of elements to skip before returning the remaining elements.
    * @returns {Observable} An observable sequence that contains the elements that occur after the specified index in the input sequence.
    */
  def skip(count: Double): Observable[T] = js.native
  
  /**
    *  Bypasses a specified number of elements at the end of an observable sequence.
    * @description
    *  This operator accumulates a queue with a length enough to store the first `count` elements. As more elements are
    *  received, elements are taken from the front of the queue and produced on the result sequence. This causes elements to be delayed.
    * @param count Number of elements to bypass at the end of the source sequence.
    * @returns {Observable} An observable sequence containing the source sequence elements except for the bypassed ones at the end.
    */
  def skipLast(count: Double): Observable[T] = js.native
  
  /**
    *  Skips elements for the specified duration from the end of the observable source sequence, using the specified scheduler to run timers.
    *
    *  1 - res = source.skipLastWithTime(5000);
    *  2 - res = source.skipLastWithTime(5000, scheduler);
    *
    * @description
    *  This operator accumulates a queue with a length enough to store elements received during the initial duration window.
    *  As more elements are received, elements older than the specified duration are taken from the queue and produced on the
    *  result sequence. This causes elements to be delayed with duration.
    * @param {Number} duration Duration for skipping elements from the end of the sequence.
    * @param {Scheduler} [scheduler]  Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout
    * @returns {Observable} An observable sequence with the elements skipped during the specified duration from the end of the source sequence.
    */
  def skipLastWithTime(duration: Double): Observable[T] = js.native
  def skipLastWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Returns the values from the source observable sequence only after the other observable sequence produces a value.
    * @param {Observable | Promise} other The observable sequence or Promise that triggers propagation of elements of the source sequence.
    * @returns {Observable} An observable sequence containing the elements of the source sequence starting from the point the other sequence triggered propagation.
    */
  def skipUntil[T2](other: ObservableOrPromise[T2]): Observable[T] = js.native
  
  /**
    *  Skips elements from the observable source sequence until the specified start time, using the specified scheduler to run timers.
    *  Errors produced by the source sequence are always forwarded to the result sequence, even if the error occurs before the start time.
    *
    * @examples
    *  1 - res = source.skipUntilWithTime(new Date(), [scheduler]);
    *  2 - res = source.skipUntilWithTime(5000, [scheduler]);
    * @param {Date|Number} startTime Time to start taking elements from the source sequence. If this value is less than or equal to Date(), no elements will be skipped.
    * @param {Scheduler} [scheduler] Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence with the elements skipped until the specified start time.
    */
  def skipUntilWithTime(duration: Double): Observable[T] = js.native
  def skipUntilWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Skips elements from the observable source sequence until the specified start time, using the specified scheduler to run timers.
    *  Errors produced by the source sequence are always forwarded to the result sequence, even if the error occurs before the start time.
    *
    * @examples
    *  1 - res = source.skipUntilWithTime(new Date(), [scheduler]);
    *  2 - res = source.skipUntilWithTime(5000, [scheduler]);
    * @param {Date|Number} startTime Time to start taking elements from the source sequence. If this value is less than or equal to Date(), no elements will be skipped.
    * @param {Scheduler} [scheduler] Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence with the elements skipped until the specified start time.
    */
  def skipUntilWithTime(startTime: Date): Observable[T] = js.native
  def skipUntilWithTime(startTime: Date, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Bypasses elements in an observable sequence as long as a specified condition is true and then returns the remaining elements.
    *  The element's index is used in the logic of the predicate function.
    *
    *  var res = source.skipWhile(function (value) { return value < 10; });
    *  var res = source.skipWhile(function (value, index) { return value < 10 || index < 10; });
    * @param {Function} predicate A function to test each element for a condition; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence that contains the elements from the input sequence starting at the first element in the linear series that does not pass the test specified by predicate.
    */
  def skipWhile(predicate: Predicate[T]): Observable[T] = js.native
  def skipWhile(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Skips elements for the specified duration from the start of the observable source sequence, using the specified scheduler to run timers.
    *
    * @example
    *  1 - res = source.skipWithTime(5000, [optional scheduler]);
    *
    * @description
    *  Specifying a zero value for duration doesn't guarantee no elements will be dropped from the start of the source sequence.
    *  This is a side-effect of the asynchrony introduced by the scheduler, where the action that causes callbacks from the source sequence to be forwarded
    *  may not execute immediately, despite the zero due time.
    *
    *  Errors produced by the source sequence are always forwarded to the result sequence, even if the error occurs before the duration.
    * @param {Number} duration Duration for skipping elements from the start of the sequence.
    * @param {Scheduler} scheduler Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence with the elements skipped during the specified duration from the start of the source sequence.
    */
  def skipWithTime(duration: Double): Observable[T] = js.native
  def skipWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Determines whether any element of an observable sequence satisfies a condition if present, else if any items are in the sequence.
    * @param {Function} [predicate] A function to test each element for a condition.
    * @returns {Observable} An observable sequence containing a single element determining whether any elements in the source sequence pass the test in the specified predicate if given, else if any items are in the sequence.
    */
  def some(): Observable[Boolean] = js.native
  def some(predicate: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[Boolean] = js.native
  def some(predicate: Predicate[T]): Observable[Boolean] = js.native
  def some(predicate: Predicate[T], thisArg: js.Any): Observable[Boolean] = js.native
  
  /**
    *  Prepends a sequence of values to an observable sequence with an optional scheduler and an argument list of values to prepend.
    *  @example
    *  var res = source.startWith(1, 2, 3);
    *  var res = source.startWith(Rx.Scheduler.timeout, 1, 2, 3);
    * @param {Arguments} args The specified values to prepend to the observable sequence
    * @returns {Observable} The source sequence prepended with the specified values.
    */
  def startWith(scheduler: IScheduler, values: T*): Observable[T] = js.native
  /**
    *  Prepends a sequence of values to an observable sequence with an optional scheduler and an argument list of values to prepend.
    *  @example
    *  var res = source.startWith(1, 2, 3);
    *  var res = source.startWith(Rx.Scheduler.timeout, 1, 2, 3);
    * @param {Arguments} args The specified values to prepend to the observable sequence
    * @returns {Observable} The source sequence prepended with the specified values.
    */
  def startWith(values: T*): Observable[T] = js.native
  
  /**
    *  Wraps the source sequence in order to run its subscription and unsubscription logic on the specified scheduler. This operation is not commonly used;
    *  see the remarks section for more information on the distinction between subscribeOn and observeOn.
    *  This only performs the side-effects of subscription and unsubscription on the specified scheduler. In order to invoke observer
    *  callbacks on a scheduler, use observeOn.
    *  @param {Scheduler} scheduler Scheduler to perform subscription and unsubscription actions on.
    *  @returns {Observable} The source sequence whose subscriptions and unsubscriptions happen on the specified scheduler.
    */
  def subscribeOn(scheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Subscribes to the next value in the sequence with an optional "this" argument.
    * @param {Function} onCompleted The function to invoke upon graceful termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Disposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def subscribeOnCompleted(onCompleted: js.Function0[Unit]): IDisposable = js.native
  def subscribeOnCompleted(onCompleted: js.Function0[Unit], thisArg: js.Any): IDisposable = js.native
  
  /**
    * Subscribes to an exceptional condition in the sequence with an optional "this" argument.
    * @param {Function} onError The function to invoke upon exceptional termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Disposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, Unit]): IDisposable = js.native
  def subscribeOnError(onError: js.Function1[/* exception */ js.Any, Unit], thisArg: js.Any): IDisposable = js.native
  
  /**
    * Subscribes to the next value in the sequence with an optional "this" argument.
    * @param {Function} onNext The function to invoke on each element in the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Disposable} A disposable handling the subscriptions and unsubscriptions.
    */
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit]): IDisposable = js.native
  def subscribeOnNext(onNext: js.Function1[/* value */ T, Unit], thisArg: js.Any): IDisposable = js.native
  
  /**
    * Computes the sum of a sequence of values that are obtained by invoking an optional transform function on each element of the input sequence, else if not specified computes the sum on each item in the sequence.
    * @param {Function} [selector] A transform function to apply to each element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence containing a single element with the sum of the values in the source sequence.
    */
  def sum(): Observable[Double] = js.native
  def sum(keySelector: js.UndefOr[scala.Nothing], thisArg: js.Any): Observable[Double] = js.native
  def sum(keySelector: Selector[T, Double]): Observable[Double] = js.native
  def sum(keySelector: Selector[T, Double], thisArg: js.Any): Observable[Double] = js.native
  
  /**
    * Transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @returns {Observable} The observable sequence that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def switch(): T = js.native
  
  /**
    * Performs a exclusive waiting for the first to finish before subscribing to another observable.
    * Observables that come in between subscriptions will be dropped on the floor.
    * @returns {Observable} A exclusive observable with only the results that happen when subscribed.
    */
  def switchFirst(): T = js.native
  
  /**
    * Transforms an observable sequence of observable sequences into an observable sequence producing values only from the most recent observable sequence.
    * @returns {Observable} The observable sequence that at any point in time produces the elements of the most recent inner observable sequence that has been received.
    */
  def switchLatest(): T = js.native
  
  /**
    *  Returns a specified number of contiguous elements from the start of an observable sequence, using the specified scheduler for the edge case of take(0).
    *
    *  var res = source.take(5);
    *  var res = source.take(0, Rx.Scheduler.timeout);
    * @param {Number} count The number of elements to return.
    * @param {Scheduler} [scheduler] Scheduler used to produce an OnCompleted message in case <paramref name="count count</paramref> is set to 0.
    * @returns {Observable} An observable sequence that contains the specified number of elements from the start of the input sequence.
    */
  def take(count: Double): Observable[T] = js.native
  def take(count: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Returns a specified number of contiguous elements from the end of an observable sequence.
    * @description
    *  This operator accumulates a buffer with a length enough to store elements count elements. Upon completion of
    *  the source sequence, this buffer is drained on the result sequence. This causes the elements to be delayed.
    * @param {Number} count Number of elements to take from the end of the source sequence.
    * @returns {Observable} An observable sequence containing the specified number of elements from the end of the source sequence.
    */
  def takeLast(count: Double): Observable[T] = js.native
  
  /**
    *  Returns an array with the specified number of contiguous elements from the end of an observable sequence.
    *
    * @description
    *  This operator accumulates a buffer with a length enough to store count elements. Upon completion of the
    *  source sequence, this buffer is produced on the result sequence.
    * @param {Number} count Number of elements to take from the end of the source sequence.
    * @returns {Observable} An observable sequence containing a single array with the specified number of elements from the end of the source sequence.
    */
  def takeLastBuffer(count: Double): Observable[js.Array[T]] = js.native
  
  /**
    *  Returns an array with the elements within the specified duration from the end of the observable source sequence, using the specified scheduler to run timers.
    * @description
    *  This operator accumulates a queue with a length enough to store elements received during the initial duration window.
    *  As more elements are received, elements older than the specified duration are taken from the queue and produced on the
    *  result sequence. This causes elements to be delayed with duration.
    * @param {Number} duration Duration for taking elements from the end of the sequence.
    * @param {Scheduler} scheduler Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence containing a single array with the elements taken during the specified duration from the end of the source sequence.
    */
  def takeLastBufferWithTime(duration: Double): Observable[js.Array[T]] = js.native
  def takeLastBufferWithTime(duration: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
  
  /**
    *  Returns elements within the specified duration from the end of the observable source sequence, using the specified schedulers to run timers and to drain the collected elements.
    * @description
    *  This operator accumulates a queue with a length enough to store elements received during the initial duration window.
    *  As more elements are received, elements older than the specified duration are taken from the queue and produced on the
    *  result sequence. This causes elements to be delayed with duration.
    * @param {Number} duration Duration for taking elements from the end of the sequence.
    * @param {Scheduler} [scheduler]  Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence with the elements taken during the specified duration from the end of the source sequence.
    */
  def takeLastWithTime(duration: Double): Observable[T] = js.native
  def takeLastWithTime(duration: Double, timerScheduler: js.UndefOr[scala.Nothing], loopScheduler: IScheduler): Observable[T] = js.native
  def takeLastWithTime(duration: Double, timerScheduler: IScheduler): Observable[T] = js.native
  def takeLastWithTime(duration: Double, timerScheduler: IScheduler, loopScheduler: IScheduler): Observable[T] = js.native
  
  /**
    * Returns the values from the source observable sequence until the other observable sequence produces a value.
    * @param {Observable | Promise} other Observable sequence or Promise that terminates propagation of elements of the source sequence.
    * @returns {Observable} An observable sequence containing the elements of the source sequence up to the point the other sequence interrupted further propagation.
    */
  def takeUntil[T2](other: ObservableOrPromise[T2]): Observable[T] = js.native
  
  /**
    *  Takes elements for the specified duration until the specified end time, using the specified scheduler to run timers.
    * @param {Number | Date} endTime Time to stop taking elements from the source sequence. If this value is less than or equal to new Date(), the result stream will complete immediately.
    * @param {Scheduler} [scheduler] Scheduler to run the timer on.
    * @returns {Observable} An observable sequence with the elements taken until the specified end time.
    */
  def takeUntilWithTime(duration: Double): Observable[T] = js.native
  def takeUntilWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Takes elements for the specified duration until the specified end time, using the specified scheduler to run timers.
    * @param {Number | Date} endTime Time to stop taking elements from the source sequence. If this value is less than or equal to new Date(), the result stream will complete immediately.
    * @param {Scheduler} [scheduler] Scheduler to run the timer on.
    * @returns {Observable} An observable sequence with the elements taken until the specified end time.
    */
  def takeUntilWithTime(endTime: Date): Observable[T] = js.native
  def takeUntilWithTime(endTime: Date, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Returns elements from an observable sequence as long as a specified condition is true.
    *  The element's index is used in the logic of the predicate function.
    * @param {Function} predicate A function to test each element for a condition; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence that contains the elements from the input sequence that occur before the element at which the test no longer passes.
    */
  def takeWhile(predicate: Predicate[T]): Observable[T] = js.native
  def takeWhile(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Takes elements for the specified duration from the start of the observable source sequence, using the specified scheduler to run timers.
    *
    * @example
    *  1 - res = source.takeWithTime(5000,  [optional scheduler]);
    * @description
    *  This operator accumulates a queue with a length enough to store elements received during the initial duration window.
    *  As more elements are received, elements older than the specified duration are taken from the queue and produced on the
    *  result sequence. This causes elements to be delayed with duration.
    * @param {Number} duration Duration for taking elements from the start of the sequence.
    * @param {Scheduler} scheduler Scheduler to run the timer on. If not specified, defaults to Rx.Scheduler.timeout.
    * @returns {Observable} An observable sequence with the elements taken during the specified duration from the start of the source sequence.
    */
  def takeWithTime(duration: Double): Observable[T] = js.native
  def takeWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Invokes an action for each element in the observable sequence and invokes an action upon graceful or exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function | Observer} observerOrOnNext Action to invoke for each element in the observable sequence or an observer.
    * @param {Function} [onError]  Action to invoke upon exceptional termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @param {Function} [onCompleted]  Action to invoke upon graceful termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def tap(): Observable[T] = js.native
  /**
    *  Invokes an action for each element in the observable sequence and invokes an action upon graceful or exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function | Observer} observerOrOnNext Action to invoke for each element in the observable sequence or an observer.
    * @param {Function} [onError]  Action to invoke upon exceptional termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @param {Function} [onCompleted]  Action to invoke upon graceful termination of the observable sequence. Used if only the observerOrOnNext parameter is also a function.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def tap(observer: Observer[T]): Observable[T] = js.native
  def tap(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def tap(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def tap(
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def tap(onNext: js.Function1[/* value */ T, Unit]): Observable[T] = js.native
  def tap(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  def tap(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def tap(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observable[T] = js.native
  
  /**
    *  Invokes an action upon graceful termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onCompleted Action to invoke upon graceful termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def tapOnCompleted(onCompleted: js.Function0[Unit]): Observable[T] = js.native
  def tapOnCompleted(onCompleted: js.Function0[Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Invokes an action upon exceptional termination of the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onError Action to invoke upon exceptional termination of the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def tapOnError(onError: js.Function1[/* exception */ js.Any, Unit]): Observable[T] = js.native
  def tapOnError(onError: js.Function1[/* exception */ js.Any, Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Invokes an action for each element in the observable sequence.
    *  This method can be used for debugging, logging, etc. of query behavior by intercepting the message stream to run arbitrary actions for messages on the pipeline.
    * @param {Function} onNext Action to invoke for each element in the observable sequence.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} The source sequence with the side-effecting behavior applied.
    */
  def tapOnNext(onNext: js.Function1[/* value */ T, Unit]): Observable[T] = js.native
  def tapOnNext(onNext: js.Function1[/* value */ T, Unit], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Matches when the observable sequence has an available value and projects the value.
    *
    *  @param {Function} selector Selector that will be invoked for values in the source sequence.
    *  @returns {Plan} Plan that produces the projected values, to be fed (with other plans) to the when operator.
    */
  def thenDo[TR](selector: js.Function1[/* item1 */ T, TR]): Plan[TR] = js.native
  
  /**
    * Returns an Observable that emits only the first item emitted by the source Observable during sequential time windows of a specified duration.
    * @param {Number} windowDuration time to wait before emitting another item after emitting the last item
    * @param {Scheduler} [scheduler] the Scheduler to use internally to manage the timers that handle timeout for each item. If not provided, defaults to Scheduler.timeout.
    * @returns {Observable} An Observable that performs the throttle operation.
    */
  def throttle(windowDuration: Double): Observable[T] = js.native
  def throttle(windowDuration: Double, scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Samples the observable sequence at each interval.
    *
    * @example
    *  1 - res = source.sample(sampleObservable); // Sampler tick sequence
    *  2 - res = source.sample(5000); // 5 seconds
    *  2 - res = source.sample(5000, Rx.Scheduler.timeout); // 5 seconds
    *
    * @param {Mixed} intervalOrSampler Interval at which to sample (specified as an integer denoting milliseconds) or Sampler Observable.
    * @param {Scheduler} [scheduler]  Scheduler to run the sampling timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Sampled observable sequence.
    */
  def throttleLatest(interval: Double): Observable[T] = js.native
  def throttleLatest(interval: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Samples the observable sequence at each interval.
    *
    * @example
    *  1 - res = source.sample(sampleObservable); // Sampler tick sequence
    *  2 - res = source.sample(5000); // 5 seconds
    *  2 - res = source.sample(5000, Rx.Scheduler.timeout); // 5 seconds
    *
    * @param {Mixed} intervalOrSampler Interval at which to sample (specified as an integer denoting milliseconds) or Sampler Observable.
    * @param {Scheduler} [scheduler]  Scheduler to run the sampling timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} Sampled observable sequence.
    */
  def throttleLatest[TSample](sampler: Observable[TSample]): Observable[T] = js.native
  def throttleLatest[TSample](sampler: Observable[TSample], scheduler: IScheduler): Observable[T] = js.native
  
  /**
    *  Records the time interval between consecutive values in an observable sequence.
    *
    * @example
    *  1 - res = source.timeInterval();
    *  2 - res = source.timeInterval(Rx.Scheduler.timeout);
    *
    * @param [scheduler]  Scheduler used to compute time intervals. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence with time interval information on values.
    */
  def timeInterval(): Observable[TimeInterval[T]] = js.native
  def timeInterval(scheduler: IScheduler): Observable[TimeInterval[T]] = js.native
  
  /**
    *  Returns the source observable sequence or the other observable sequence if dueTime elapses.
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) when a timeout occurs.
    * @param {Observable} [other]  Sequence to return in case of a timeout. If not specified, a timeout error throwing sequence will be used.
    * @param {Scheduler} [scheduler]  Scheduler to run the timeout timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} The source sequence switching to the other sequence in case of a timeout.
    */
  def timeout(dueTime: Double): Observable[T] = js.native
  def timeout(dueTime: Double, other: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
  def timeout(dueTime: Double, other: Observable[T]): Observable[T] = js.native
  def timeout(dueTime: Double, other: Observable[T], scheduler: IScheduler): Observable[T] = js.native
  def timeout(dueTime: Double, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Returns the source observable sequence or the other observable sequence if dueTime elapses.
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) when a timeout occurs.
    * @param {Scheduler} [scheduler]  Scheduler to run the timeout timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} The source sequence switching to the other sequence in case of a timeout.
    */
  def timeout(dueTime: Date): Observable[T] = js.native
  def timeout(dueTime: Date, other: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
  def timeout(dueTime: Date, other: Observable[T]): Observable[T] = js.native
  def timeout(dueTime: Date, other: Observable[T], scheduler: IScheduler): Observable[T] = js.native
  def timeout(dueTime: Date, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Returns the source observable sequence, switching to the other observable sequence if a timeout is signaled.
    * @param {Observable} [firstTimeout]  Observable sequence that represents the timeout for the first element. If not provided, this defaults to Observable.never().
    * @param {Function} timeoutDurationSelector Selector to retrieve an observable sequence that represents the timeout between the current element and the next element.
    * @param {Observable} [other]  Sequence to return in case of a timeout. If not provided, this is set to Observable.throwException().
    * @returns {Observable} The source sequence switching to the other sequence in case of a timeout.
    */
  def timeout[TTimeout](
    firstTimeout: Observable[TTimeout],
    timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]
  ): Observable[T] = js.native
  def timeout[TTimeout](
    firstTimeout: Observable[TTimeout],
    timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]],
    other: Observable[T]
  ): Observable[T] = js.native
  /**
    *  Returns the source observable sequence, switching to the other observable sequence if a timeout is signaled.
    * @param {Function} timeoutDurationSelector Selector to retrieve an observable sequence that represents the timeout between the current element and the next element.
    * @returns {Observable} The source sequence switching to the other sequence in case of a timeout.
    */
  def timeout[TTimeout](timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]): Observable[T] = js.native
  /**
    *  Returns the source observable sequence, switching to the other observable sequence if a timeout is signaled.
    * @param {Function} timeoutDurationSelector Selector to retrieve an observable sequence that represents the timeout between the current element and the next element.
    * @param {Observable} other  Sequence to return in case of a timeout. If not provided, this is set to Observable.throwException().
    * @returns {Observable} The source sequence switching to the other sequence in case of a timeout.
    */
  def timeout[TTimeout](timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]], other: Observable[T]): Observable[T] = js.native
  
  /**
    *  Records the timestamp for each value in an observable sequence.
    *
    * @example
    *  1 - res = source.timestamp(); // produces { value: x, timestamp: ts }
    *  2 - res = source.timestamp(Rx.Scheduler.default);
    *
    * @param {Scheduler} [scheduler]  Scheduler used to compute timestamps. If not specified, the default scheduler is used.
    * @returns {Observable} An observable sequence with timestamp information on values.
    */
  def timestamp(): Observable[Timestamp[T]] = js.native
  def timestamp(scheduler: IScheduler): Observable[Timestamp[T]] = js.native
  
  /**
    * Creates an array from an observable sequence.
    * @returns {Observable} An observable sequence containing a single element with a list containing all the elements of the source sequence.
    */
  def toArray(): Observable[js.Array[T]] = js.native
  
  /**
    * Converts the observable sequence to a Map if it exists.
    * @param {Function} keySelector A function which produces the key for the Map.
    * @param {Function} [elementSelector] An optional function which produces the element for the Map. If not present, defaults to the value from the observable sequence.
    * @returns {Observable} An observable sequence with a single value of a Map containing the values from the observable sequence.
    */
  def toMap[TKey](keySelector: js.Function1[/* value */ T, TKey]): Observable[Map[TKey, T]] = js.native
  /**
    * Converts the observable sequence to a Map if it exists.
    * @param {Function} keySelector A function which produces the key for the Map.
    * @param {Function} [elementSelector] An optional function which produces the element for the Map. If not present, defaults to the value from the observable sequence.
    * @returns {Observable} An observable sequence with a single value of a Map containing the values from the observable sequence.
    */
  def toMap[TKey, TElement](
    keySelector: js.Function1[/* value */ T, TKey],
    elementSelector: js.Function1[/* value */ T, TElement]
  ): Observable[Map[TKey, TElement]] = js.native
  
  /*
    * Converts an existing observable sequence to an ES6 Compatible Promise
    * @example
    * var promise = Rx.Observable.return(42).toPromise(RSVP.Promise);
    *
    * // With config
    * Rx.config.Promise = RSVP.Promise;
    * var promise = Rx.Observable.return(42).toPromise();
    * @param {Function} [promiseCtor] The constructor of the promise. If not provided, it looks for it in Rx.config.Promise.
    * @returns {Promise} An ES6 compatible promise with the last value from the observable sequence.
    */
  def toPromise(): IPromise[T] = js.native
  def toPromise(promiseCtor: Instantiable[T]): IPromise[T] = js.native
  /*
    * Converts an existing observable sequence to an ES6 Compatible Promise
    * @example
    * var promise = Rx.Observable.return(42).toPromise(RSVP.Promise);
    *
    * // With config
    * Rx.config.Promise = RSVP.Promise;
    * var promise = Rx.Observable.return(42).toPromise();
    * @param {Function} [promiseCtor] The constructor of the promise. If not provided, it looks for it in Rx.config.Promise.
    * @returns {Promise} An ES6 compatible promise with the last value from the observable sequence.
    */
  def toPromise[TPromise /* <: IPromise[T] */](promiseCtor: InstantiableTPromise[T, TPromise]): TPromise = js.native
  
  /**
    * Converts the observable sequence to a Set if it exists.
    * @returns {Observable} An observable sequence with a single value of a Set containing the values from the observable sequence.
    */
  def toSet(): Observable[Set[T]] = js.native
  
  /**
    * Executes a transducer to transform the observable sequence
    * @param {Transducer} transducer A transducer to execute
    * @returns {Observable} An Observable sequence containing the results from the transducer.
    */
  def transduce(transducer: js.Any): js.Any = js.native
  
  /**
    *  Filters the elements of an observable sequence based on a predicate by incorporating the element's index.
    *
    * @example
    *  var res = source.where(function (value) { return value < 10; });
    *  var res = source.where(function (value, index) { return value < 10 || index < 10; });
    * @param {Function} predicate A function to test each source element for a condition; the second parameter of the function represents the index of the source element.
    * @param {Any} [thisArg] Object to use as this when executing callback.
    * @returns {Observable} An observable sequence that contains elements from the input sequence that satisfy the condition.
    */
  def where(predicate: Predicate[T]): Observable[T] = js.native
  def where(predicate: Predicate[T], thisArg: js.Any): Observable[T] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more windows.
    *
    *  @param {Mixed} windowOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [windowClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def window[TWindowClosing](windowClosingSelector: js.Function0[Observable[TWindowClosing]]): Observable[Observable[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more windows.
    *
    *  @param {Mixed} windowOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [windowClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def window[TWindowOpening](windowOpenings: Observable[TWindowOpening]): Observable[Observable[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more windows.
    *
    *  @param {Mixed} windowOpeningsOrClosingSelector Observable sequence whose elements denote the creation of new windows, or, a function invoked to define the boundaries of the produced windows (a new window is started when the previous one is closed, resulting in non-overlapping windows).
    *  @param {Function} [windowClosingSelector] A function invoked to define the closing of each produced window. If a closing selector function is specified for the first parameter, this parameter is ignored.
    *  @returns {Observable} An observable sequence of windows.
    */
  def window[TWindowOpening, TWindowClosing](
    windowOpenings: Observable[TWindowOpening],
    windowClosingSelector: js.Function0[Observable[TWindowClosing]]
  ): Observable[Observable[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more windows which are produced based on element count information.
    *
    *  var res = xs.windowWithCount(10);
    *  var res = xs.windowWithCount(10, 1);
    * @param {Number} count Length of each window.
    * @param {Number} [skip] Number of elements to skip between creation of consecutive windows. If not specified, defaults to the count.
    * @returns {Observable} An observable sequence of windows.
    */
  def windowWithCount(count: Double): Observable[Observable[T]] = js.native
  def windowWithCount(count: Double, skip: Double): Observable[Observable[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into zero or more windows which are produced based on timing information.
    * @param {Number} timeSpan Length of each window (specified as an integer denoting milliseconds).
    * @param {Mixed} [timeShiftOrScheduler]  Interval between creation of consecutive windows (specified as an integer denoting milliseconds), or an optional scheduler parameter. If not specified, the time shift corresponds to the timeSpan parameter, resulting in non-overlapping adjacent windows.
    * @param {Scheduler} [scheduler]  Scheduler to run windowing timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of windows.
    */
  def windowWithTime(timeSpan: Double): Observable[Observable[T]] = js.native
  def windowWithTime(timeSpan: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
  /**
    *  Projects each element of an observable sequence into zero or more windows which are produced based on timing information.
    * @param {Number} timeSpan Length of each window (specified as an integer denoting milliseconds).
    * @param {Mixed} [timeShiftOrScheduler]  Interval between creation of consecutive windows (specified as an integer denoting milliseconds), or an optional scheduler parameter. If not specified, the time shift corresponds to the timeSpan parameter, resulting in non-overlapping adjacent windows.
    * @param {Scheduler} [scheduler]  Scheduler to run windowing timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of windows.
    */
  def windowWithTime(timeSpan: Double, timeShift: Double): Observable[Observable[T]] = js.native
  def windowWithTime(timeSpan: Double, timeShift: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
  
  /**
    *  Projects each element of an observable sequence into a window that is completed when either it's full or a given amount of time has elapsed.
    * @param {Number} timeSpan Maximum time length of a window.
    * @param {Number} count Maximum element count of a window.
    * @param {Scheduler} [scheduler]  Scheduler to run windowing timers on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence of windows.
    */
  def windowWithTimeOrCount(timeSpan: Double, count: Double): Observable[Observable[T]] = js.native
  def windowWithTimeOrCount(timeSpan: Double, count: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
  
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, TResult](second: ObservableOrPromise[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[TOther, TResult](
    souces: js.Array[ObservableOrPromise[TOther]],
    resultSelector: js.Function2[/* firstValue */ T, /* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, T5, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, T5, T6, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, T5, T6, T7, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    resultSelector: js.Function7[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, T5, T6, T7, T8, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    resultSelector: js.Function8[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function only when the (first) source observable sequence produces an element.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def withLatestFrom[T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    ninth: ObservableOrPromise[T9],
    resultSelector: js.Function9[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      /* v9 */ T9, 
      TResult
    ]
  ): Observable[TResult] = js.native
  
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, TResult](second: ObservableOrPromise[T2]): Observable[TResult] = js.native
  def zip[T2, TResult](second: ObservableOrPromise[T2], resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[TOther, TResult](souces: js.Array[ObservableOrPromise[TOther]]): Observable[TResult] = js.native
  def zip[TOther, TResult](
    souces: js.Array[ObservableOrPromise[TOther]],
    resultSelector: js.Function2[/* firstValue */ T, /* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, TResult](second: ObservableOrPromise[T2], third: ObservableOrPromise[T3]): Observable[TResult] = js.native
  def zip[T2, T3, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, TResult](second: ObservableOrPromise[T2], third: ObservableOrPromise[T3], fourth: ObservableOrPromise[T4]): Observable[TResult] = js.native
  def zip[T2, T3, T4, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, T5, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, T5, T6, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, T6, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, T5, T6, T7, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, T6, T7, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    resultSelector: js.Function7[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, T5, T6, T7, T8, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, T6, T7, T8, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    resultSelector: js.Function8[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences or an array have produced an element at a corresponding index.
    * The last element in the arguments must be a function to invoke for each series of elements at corresponding indexes in the args.
    * @returns {Observable} An observable sequence containing the result of combining elements of the args using the specified result selector function.
    */
  def zip[T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    ninth: ObservableOrPromise[T9]
  ): Observable[TResult] = js.native
  def zip[T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    seventh: ObservableOrPromise[T7],
    eighth: ObservableOrPromise[T8],
    ninth: ObservableOrPromise[T9],
    resultSelector: js.Function9[
      /* v1 */ T, 
      /* v2 */ T2, 
      /* v3 */ T3, 
      /* v4 */ T4, 
      /* v5 */ T5, 
      /* v6 */ T6, 
      /* v7 */ T7, 
      /* v8 */ T8, 
      /* v9 */ T9, 
      TResult
    ]
  ): Observable[TResult] = js.native
}
