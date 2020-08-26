package typings.rx.Rx

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.rx.anon.Off
import typings.std.Date
import typings.std.Error
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableStatic extends js.Object {
  /**
    * Propagates the observable sequence or Promise that reacts first.
    * @returns {Observable} An observable sequence that surfaces any of the given sequences, whichever reacted first.
    */
  def amb[T](observables: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Propagates the observable sequence or Promise that reacts first.
    * @returns {Observable} An observable sequence that surfaces any of the given sequences, whichever reacted first.
    */
  def amb[T](observables: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    *  Uses selector to determine which source in sources to use.
    * @param {Function} selector The function which extracts the value for to test in a case statement.
    * @param {Array} sources A object which has keys which correspond to the case statement labels.
    * @param {Observable} [elseSource] The observable sequence or Promise that will be run if the sources are not matched. If this is not provided, it defaults to Rx.Observabe.empty with the specified scheduler.
    *
    * @returns {Observable} An observable sequence which is determined by a case statement.
    */
  def `case`[T](selector: js.Function0[Double], sources: NumberDictionary[ObservableOrPromise[T]]): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[Double],
    sources: NumberDictionary[ObservableOrPromise[T]],
    schedulerOrElseSource: IScheduler
  ): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[Double],
    sources: NumberDictionary[ObservableOrPromise[T]],
    schedulerOrElseSource: ObservableOrPromise[T]
  ): Observable[T] = js.native
  /**
    *  Uses selector to determine which source in sources to use.
    * @param {Function} selector The function which extracts the value for to test in a case statement.
    * @param {Array} sources A object which has keys which correspond to the case statement labels.
    * @param {Observable} [elseSource] The observable sequence or Promise that will be run if the sources are not matched. If this is not provided, it defaults to Rx.Observabe.empty with the specified scheduler.
    *
    * @returns {Observable} An observable sequence which is determined by a case statement.
    */
  def `case`[T](selector: js.Function0[String], sources: StringDictionary[ObservableOrPromise[T]]): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[String],
    sources: StringDictionary[ObservableOrPromise[T]],
    schedulerOrElseSource: IScheduler
  ): Observable[T] = js.native
  def `case`[T](
    selector: js.Function0[String],
    sources: StringDictionary[ObservableOrPromise[T]],
    schedulerOrElseSource: ObservableOrPromise[T]
  ): Observable[T] = js.native
  /**
    * Continues an observable sequence that is terminated by an exception with the next observable sequence.
    * @param {Array | Arguments} args Arguments or an array to use as the next sequence if an error occurs.
    * @returns {Observable} An observable sequence containing elements from consecutive source sequences until a source sequence terminates successfully.
    */
  def `catch`[T](sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Continues an observable sequence that is terminated by an exception with the next observable sequence.
    * @param {Array | Arguments} args Arguments or an array to use as the next sequence if an error occurs.
    * @returns {Observable} An observable sequence containing elements from consecutive source sequences until a source sequence terminates successfully.
    */
  def `catch`[T](sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[TOther, TResult](
    souces: js.Array[ObservableOrPromise[TOther]],
    resultSelector: js.Function1[/* repeated */ TOther, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, T5, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, T5, T6, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever any of the observable sequences or Promises produces an element.
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, T5, T6, T7, TResult](
    first: ObservableOrPromise[T],
    second: ObservableOrPromise[T2],
    third: ObservableOrPromise[T3],
    fourth: ObservableOrPromise[T4],
    fifth: ObservableOrPromise[T5],
    sixth: ObservableOrPromise[T6],
    eventh: ObservableOrPromise[T7],
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
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, T5, T6, T7, T8, TResult](
    first: ObservableOrPromise[T],
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
    *
    * @example
    * 1 - obs = Rx.Observable.combineLatest(obs1, obs2, obs3, function (o1, o2, o3) { return o1 + o2 + o3; });
    * 2 - obs = Rx.Observable.combineLatest([obs1, obs2, obs3], function (o1, o2, o3) { return o1 + o2 + o3; });
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def combineLatest[T, T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    first: ObservableOrPromise[T],
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
    * Concatenates all the observable sequences.
    * @param {Array | Arguments} args Arguments or an array to concat to the observable sequence.
    * @returns {Observable} An observable sequence that contains the elements of each given sequence, in sequential order.
    */
  def concat[T](sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Concatenates all the observable sequences.
    * @param {Array | Arguments} args Arguments or an array to concat to the observable sequence.
    * @returns {Observable} An observable sequence that contains the elements of each given sequence, in sequential order.
    */
  def concat[T](sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    *  Creates an observable sequence from a specified subscribe method implementation.
    * @example
    *  var res = Rx.Observable.create(function (observer) { return function () { } );
    *  var res = Rx.Observable.create(function (observer) { return Rx.Disposable.empty; } );
    *  var res = Rx.Observable.create(function (observer) { } );
    * @param {Function} subscribe Implementation of the resulting observable sequence's subscribe method, returning a function that will be wrapped in a Disposable.
    * @returns {Observable} The observable sequence with the specified implementation for the Subscribe method.
    */
  def create[T](subscribe: js.Function1[/* observer */ Observer[T], IDisposable | js.Function | Unit]): Observable[T] = js.native
  /**
    *  Returns an observable sequence that invokes the specified factory function whenever a new observer subscribes.
    *
    * @example
    *  var res = Rx.Observable.defer(function () { return Rx.Observable.fromArray([1,2,3]); });
    * @param {Function} observableFactory Observable factory function to invoke for each observer that subscribes to the resulting sequence or Promise.
    * @returns {Observable} An observable sequence whose observers trigger an invocation of the given observable factory function.
    */
  def defer[T](observableFactory: js.Function0[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    *  Returns an empty observable sequence, using the specified scheduler to send out the single OnCompleted message.
    *
    * @example
    *  var res = Rx.Observable.empty();
    *  var res = Rx.Observable.empty(Rx.Scheduler.timeout);
    * @param {Scheduler} [scheduler] Scheduler to send the termination call on.
    * @returns {Observable} An observable sequence with no elements.
    */
  def empty[T](): Observable[T] = js.native
  def empty[T](scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Concatenates the observable sequences obtained by running the specified result selector for each element in source.
    * There is an alias for this method called 'forIn' for browsers <IE9
    * @param {Array} sources An array of values to turn into an observable sequence.
    * @param {Function} resultSelector A function to apply to each item in the sources array to turn it into an observable sequence.
    * @returns {Observable} An observable sequence from the concatenated observable sequences.
    */
  def `for`[T, TResult](sources: js.Array[T], resultSelector: Selector[T, TResult]): Observable[TResult] = js.native
  def `for`[T, TResult](sources: js.Array[T], resultSelector: Selector[T, TResult], thisArg: js.Any): Observable[TResult] = js.native
  /**
    *  Concatenates the observable sequences obtained by running the specified result selector for each element in source.
    * There is an alias for this method called 'forIn' for browsers <IE9
    * @param {Array} sources An array of values to turn into an observable sequence.
    * @param {Function} resultSelector A function to apply to each item in the sources array to turn it into an observable sequence.
    * @returns {Observable} An observable sequence from the concatenated observable sequences.
    */
  def forIn[T, TResult](sources: js.Array[T], resultSelector: Selector[T, TResult]): Observable[TResult] = js.native
  def forIn[T, TResult](sources: js.Array[T], resultSelector: Selector[T, TResult], thisArg: js.Any): Observable[TResult] = js.native
  /**
    *  Runs all observable sequences in parallel and collect their last elements.
    *
    * @example
    *  1 - res = Rx.Observable.forkJoin([obs1, obs2]);
    *  1 - res = Rx.Observable.forkJoin(obs1, obs2, ...);
    * @returns {Observable} An observable sequence with an array collecting the last elements of all the input sequences.
    */
  def forkJoin[T](args: ObservableOrPromise[T]*): Observable[js.Array[T]] = js.native
  /**
    *  Runs all observable sequences in parallel and collect their last elements.
    *
    * @example
    *  1 - res = Rx.Observable.forkJoin([obs1, obs2]);
    *  1 - res = Rx.Observable.forkJoin(obs1, obs2, ...);
    * @returns {Observable} An observable sequence with an array collecting the last elements of all the input sequences.
    */
  def forkJoin[T](sources: js.Array[ObservableOrPromise[T]]): Observable[js.Array[T]] = js.native
  /**
    * This method creates a new Observable sequence from an array-like or iterable object.
    * @param {Any} arrayLike An array-like or iterable object to convert to an Observable sequence.
    * @param {Function} [mapFn] Map function to call on every element of the array.
    * @param {Any} [thisArg] The context to use calling the mapFn if provided.
    * @param {Scheduler} [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  def from[T](array: ArrayOrIterable[T]): Observable[T] = js.native
  /**
    * This method creates a new Observable sequence from an array-like or iterable object.
    * @param {Any} arrayLike An array-like or iterable object to convert to an Observable sequence.
    * @param {Function} [mapFn] Map function to call on every element of the array.
    * @param {Any} [thisArg] The context to use calling the mapFn if provided.
    * @param {Scheduler} [scheduler] Optional scheduler to use for scheduling.  If not provided, defaults to Scheduler.currentThread.
    */
  def from[T, TResult](array: ArrayOrIterable[T], mapFn: js.Function2[/* value */ T, /* index */ Double, TResult]): Observable[TResult] = js.native
  def from[T, TResult](
    array: ArrayOrIterable[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  def from[T, TResult](
    array: ArrayOrIterable[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any
  ): Observable[TResult] = js.native
  def from[T, TResult](
    array: ArrayOrIterable[T],
    mapFn: js.Function2[/* value */ T, /* index */ Double, TResult],
    thisArg: js.Any,
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  /**
    *  Converts an array to an observable sequence, using an optional scheduler to enumerate the array.
    * @deprecated use Observable.from or Observable.of
    * @param {Scheduler} [scheduler] Scheduler to run the enumeration of the input sequence on.
    * @returns {Observable} The observable sequence whose elements are pulled from the given enumerable sequence.
    */
  def fromArray[T](array: ArrayLike[T]): Observable[T] = js.native
  def fromArray[T](array: ArrayLike[T], scheduler: IScheduler): Observable[T] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult](func: js.Function, context: js.Any, selector: js.Function): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1](func: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* result */ TResult, _], _]): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[TResult, T1](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[TResult, T1](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.Any
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromCallback[TResult, T1](
    func: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.Any,
    selector: js.Function
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function1[/* result */ TResult, _], _]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.Any
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ js.Function1[/* result */ TResult, _], _],
    context: js.Any,
    selector: js.Function
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a callback function to an observable sequence.
    *
    * @param {Function} function Function with a callback as the last parameter to convert to an Observable sequence.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback to produce a single item to yield on next.
    * @returns {Function} A function, when executed with the required parameters minus the callback, produces an Observable sequence with a single value of the arguments to the callback as an array.
    */
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ]
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function1[/* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  /**
    * Creates an observable sequence by adding an event listener to the matching DOMElement or each item in the NodeList.
    * @param {Object} element The DOMElement or NodeList to attach a listener.
    * @param {String} eventName The event name to attach the observable sequence.
    * @param {Function} [selector] A selector which takes the arguments from the event handler to produce a single item to yield on next.
    * @returns {Observable} An observable sequence of events from the specified element and the specified event.
    */
  def fromEvent[T](element: Off, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: Off, eventName: String, selector: js.Function1[/* arguments */ js.Array[_], T]): Observable[T] = js.native
  /**
    * Creates an observable sequence by adding an event listener to the matching DOMElement or each item in the NodeList.
    * @param {Object} element The DOMElement or NodeList to attach a listener.
    * @param {String} eventName The event name to attach the observable sequence.
    * @param {Function} [selector] A selector which takes the arguments from the event handler to produce a single item to yield on next.
    * @returns {Observable} An observable sequence of events from the specified element and the specified event.
    */
  def fromEvent[T](element: EventTarget, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: EventTarget, eventName: String, selector: js.Function1[/* arguments */ js.Array[_], T]): Observable[T] = js.native
  /**
    * Creates an observable sequence from an event emitter via an addHandler/removeHandler pair.
    * @param {Function} addHandler The function to add a handler to the emitter.
    * @param {Function} [removeHandler] The optional function to remove a handler from an emitter.
    * @param {Function} [selector] A selector which takes the arguments from the event handler to produce a single item to yield on next.
    * @returns {Observable} An observable sequence which wraps an event from an event emitter
    */
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, Unit],
    removeHandler: js.Function1[/* handler */ js.Function, Unit]
  ): Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ js.Function, Unit],
    removeHandler: js.Function1[/* handler */ js.Function, Unit],
    selector: js.Function1[/* arguments */ js.Array[_], T]
  ): Observable[T] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult](func: js.Function): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromNodeCallback[TResult](func: js.Function, context: js.UndefOr[scala.Nothing], selector: js.Function): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromNodeCallback[TResult](func: js.Function, context: js.Any): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  def fromNodeCallback[TResult](func: js.Function, context: js.Any, selector: js.Function): js.Function1[/* repeated */ js.Any, Observable[TResult]] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1](
    func: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1](
    func: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1](
    func: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1](
    func: js.Function2[
      /* arg1 */ T1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2](
    func: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3](
    func: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4](
    func: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5](
    func: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6](
    func: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7](
    func: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8](
    func: js.Function9[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a Node.js callback style function to an observable sequence.  This must be in function (err, ...) format.
    * @param {Function} func The function to call
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @param {Function} [selector] A selector which takes the arguments from the callback minus the error to produce a single item to yield on next.
    * @returns {Function} An async function which when applied, returns an observable sequence with the callback arguments as an array.
    */
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ]
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.UndefOr[scala.Nothing],
    selector: js.Function
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  def fromNodeCallback[TResult, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    func: js.Function10[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ T7, 
      /* arg8 */ T8, 
      /* arg9 */ T9, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ TResult, _], 
      _
    ],
    context: js.Any,
    selector: js.Function
  ): js.Function9[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ T7, 
    /* arg8 */ T8, 
    /* arg9 */ T9, 
    Observable[TResult]
  ] = js.native
  /**
    * Converts a Promise to an Observable sequence
    * @param {Promise} An ES6 Compliant promise.
    * @returns {Observable} An Observable sequence which wraps the existing promise success and failure.
    */
  def fromPromise[T](promise: Promise[T]): Observable[T] = js.native
  /**
    *  Generates an observable sequence by running a state-driven loop producing the sequence's elements, using the specified scheduler to send out observer messages.
    *
    * @example
    *  var res = Rx.Observable.generate(0, function (x) { return x < 10; }, function (x) { return x + 1; }, function (x) { return x; });
    *  var res = Rx.Observable.generate(0, function (x) { return x < 10; }, function (x) { return x + 1; }, function (x) { return x; }, Rx.Scheduler.timeout);
    * @param {Mixed} initialState Initial state.
    * @param {Function} condition Condition to terminate generation (upon returning false).
    * @param {Function} iterate Iteration step function.
    * @param {Function} resultSelector Selector function for results produced in the sequence.
    * @param {Scheduler} [scheduler] Scheduler on which to run the generator loop. If not provided, defaults to Scheduler.currentThread.
    * @returns {Observable} The generated sequence.
    */
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
  /**
    *  Generates an observable sequence by iterating a state from an initial state until the condition fails.
    *
    * @example
    *  res = source.generateWithAbsoluteTime(0,
    *      function (x) { return return true; },
    *      function (x) { return x + 1; },
    *      function (x) { return x; },
    *      function (x) { return new Date(); }
    *  });
    *
    * @param {Mixed} initialState Initial state.
    * @param {Function} condition Condition to terminate generation (upon returning false).
    * @param {Function} iterate Iteration step function.
    * @param {Function} resultSelector Selector function for results produced in the sequence.
    * @param {Function} timeSelector Time selector function to control the speed of values being produced each iteration, returning Date values.
    * @param {Scheduler} [scheduler]  Scheduler on which to run the generator loop. If not specified, the timeout scheduler is used.
    * @returns {Observable} The generated sequence.
    */
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Date]
  ): Observable[TResult] = js.native
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Date],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  /**
    *  Generates an observable sequence by iterating a state from an initial state until the condition fails.
    *
    * @example
    *  res = source.generateWithRelativeTime(0,
    *      function (x) { return return true; },
    *      function (x) { return x + 1; },
    *      function (x) { return x; },
    *      function (x) { return 500; }
    *  );
    *
    * @param {Mixed} initialState Initial state.
    * @param {Function} condition Condition to terminate generation (upon returning false).
    * @param {Function} iterate Iteration step function.
    * @param {Function} resultSelector Selector function for results produced in the sequence.
    * @param {Function} timeSelector Time selector function to control the speed of values being produced each iteration, returning integer values denoting milliseconds.
    * @param {Scheduler} [scheduler]  Scheduler on which to run the generator loop. If not specified, the timeout scheduler is used.
    * @returns {Observable} The generated sequence.
    */
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Double]
  ): Observable[TResult] = js.native
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Double],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  /**
    *  Determines whether an observable collection contains values.
    *
    * @example
    *  1 - res = Rx.Observable.if(condition, obs1);
    *  2 - res = Rx.Observable.if(condition, obs1, obs2);
    *  3 - res = Rx.Observable.if(condition, obs1, scheduler);
    * @param {Function} condition The condition which determines if the thenSource or elseSource will be run.
    * @param {Observable} thenSource The observable sequence or Promise that will be run if the condition function returns true.
    * @param {Observable} [elseSource] The observable sequence or Promise that will be run if the condition function returns false. If this is not provided, it defaults to Rx.Observabe.Empty with the specified scheduler.
    * @returns {Observable} An observable sequence which is either the thenSource or elseSource.
    */
  def `if`[T](condition: js.Function0[Boolean], thenSource: ObservableOrPromise[T]): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[Boolean],
    thenSource: ObservableOrPromise[T],
    elseSourceOrScheduler: IScheduler
  ): Observable[T] = js.native
  def `if`[T](
    condition: js.Function0[Boolean],
    thenSource: ObservableOrPromise[T],
    elseSourceOrScheduler: ObservableOrPromise[T]
  ): Observable[T] = js.native
  /**
    *  Returns an observable sequence that produces a value after each period.
    *
    * @example
    *  1 - res = Rx.Observable.interval(1000);
    *  2 - res = Rx.Observable.interval(1000, Rx.Scheduler.timeout);
    *
    * @param {Number} period Period for producing the values in the resulting sequence (specified as an integer denoting milliseconds).
    * @param {Scheduler} [scheduler] Scheduler to run the timer on. If not specified, Rx.Scheduler.timeout is used.
    * @returns {Observable} An observable sequence that produces a value after each period.
    */
  def interval(period: Double): Observable[Double] = js.native
  def interval(period: Double, scheduler: IScheduler): Observable[Double] = js.native
  /**
    * Determines whether the given object is an Observable
    * @param {Any} An object to determine whether it is an Observable
    * @returns {Boolean} true if an Observable, else false.
    */
  def isObservable(o: js.Any): Boolean = js.native
  /**
    *  Returns an observable sequence that contains a single element, using the specified scheduler to send out observer messages.
    *  There is an alias called 'just' or browsers <IE9.
    * @param {Mixed} value Single element in the resulting observable sequence.
    * @param {Scheduler} scheduler Scheduler to send the single element on. If not specified, defaults to Scheduler.immediate.
    * @returns {Observable} An observable sequence containing the single specified element.
    */
  def just[T](value: T): Observable[T] = js.native
  def just[T](value: T, scheduler: IScheduler): Observable[T] = js.native
  /**
    * Merges all the observable sequences into a single observable sequence.
    * The scheduler is optional and if not specified, the immediate scheduler is used.
    * @returns {Observable} The observable sequence that merges the elements of the observable sequences.
    */
  def merge[T](scheduler: IScheduler, sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Merges all the observable sequences into a single observable sequence.
    * The scheduler is optional and if not specified, the immediate scheduler is used.
    * @returns {Observable} The observable sequence that merges the elements of the observable sequences.
    */
  def merge[T](scheduler: IScheduler, sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Merges all the observable sequences into a single observable sequence.
    * The scheduler is optional and if not specified, the immediate scheduler is used.
    * @returns {Observable} The observable sequence that merges the elements of the observable sequences.
    */
  def merge[T](sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Merges all the observable sequences into a single observable sequence.
    * The scheduler is optional and if not specified, the immediate scheduler is used.
    * @returns {Observable} The observable sequence that merges the elements of the observable sequences.
    */
  def merge[T](sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Flattens an Observable that emits Observables into one Observable, in a way that allows an Observer to
    * receive all successfully emitted items from all of the source Observables without being interrupted by
    * an error notification from one of them.
    *
    * This behaves like Observable.prototype.mergeAll except that if any of the merged Observables notify of an
    * error via the Observer's onError, mergeDelayError will refrain from propagating that
    * error notification until all of the merged Observables have finished emitting items.
    * @param {Array | Arguments} args Arguments or an array to merge.
    * @returns {Observable} an Observable that emits all of the items emitted by the Observables emitted by the Observable
    */
  def mergeDelayError[T](sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Flattens an Observable that emits Observables into one Observable, in a way that allows an Observer to
    * receive all successfully emitted items from all of the source Observables without being interrupted by
    * an error notification from one of them.
    *
    * This behaves like Observable.prototype.mergeAll except that if any of the merged Observables notify of an
    * error via the Observer's onError, mergeDelayError will refrain from propagating that
    * error notification until all of the merged Observables have finished emitting items.
    * @param {Array | Arguments} args Arguments or an array to merge.
    * @returns {Observable} an Observable that emits all of the items emitted by the Observables emitted by the Observable
    */
  def mergeDelayError[T](sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Returns a non-terminating observable sequence, which can be used to denote an infinite duration (e.g. when using reactive joins).
    * @returns {Observable} An observable sequence whose observers will never get called.
    */
  def never[T](): Observable[T] = js.native
  /**
    *  This method creates a new Observable instance with a variable number of arguments, regardless of number or type of the arguments.
    * @returns {Observable} The observable sequence whose elements are pulled from the given arguments.
    */
  def of[T](values: T*): Observable[T] = js.native
  /**
    * Creates an Observable sequence from changes to an array using Array.observe.
    * @param {Array} array An array to observe changes.
    * @returns {Observable} An observable sequence containing changes to an array from Array.observe.
    */
  def ofArrayChanges[T](obj: js.Array[T]): Observable[ArrayObserveChange[T]] = js.native
  /**
    * Creates an Observable sequence from changes to an object using Object.observe.
    * @param {Object} obj An object to observe changes.
    * @returns {Observable} An observable sequence containing changes to an object from Object.observe.
    */
  def ofObjectChanges[T](obj: T): Observable[ObjectObserveChange[T]] = js.native
  def ofWithScheduler[T](scheduler: js.UndefOr[scala.Nothing], values: T*): Observable[T] = js.native
  /**
    *  This method creates a new Observable instance with a variable number of arguments, regardless of number or type of the arguments.
    * @param {Scheduler} scheduler A scheduler to use for scheduling the arguments.
    * @returns {Observable} The observable sequence whose elements are pulled from the given arguments.
    */
  def ofWithScheduler[T](scheduler: IScheduler, values: T*): Observable[T] = js.native
  /**
    * Continues an observable sequence that is terminated normally or by an exception with the next observable sequence.
    *
    * @example
    * 1 - res = Rx.Observable.onErrorResumeNext(xs, ys, zs);
    * 1 - res = Rx.Observable.onErrorResumeNext([xs, ys, zs]);
    * @returns {Observable} An observable sequence that concatenates the source sequences, even if a sequence terminates exceptionally.
    */
  def onErrorResumeNext[T](sources: ObservableOrPromise[T]*): Observable[T] = js.native
  /**
    * Continues an observable sequence that is terminated normally or by an exception with the next observable sequence.
    *
    * @example
    * 1 - res = Rx.Observable.onErrorResumeNext(xs, ys, zs);
    * 1 - res = Rx.Observable.onErrorResumeNext([xs, ys, zs]);
    * @returns {Observable} An observable sequence that concatenates the source sequences, even if a sequence terminates exceptionally.
    */
  def onErrorResumeNext[T](sources: js.Array[ObservableOrPromise[T]]): Observable[T] = js.native
  /**
    * Convert an object into an observable sequence of [key, value] pairs.
    * @param {Object} obj The object to inspect.
    * @param {Scheduler} [scheduler] Scheduler to run the enumeration of the input sequence on.
    * @returns {Observable} An observable sequence of [key, value] pairs from the object.
    */
  def pairs[T](obj: NumberDictionary[T]): Observable[js.Tuple2[Double, T]] = js.native
  def pairs[T](obj: NumberDictionary[T], scheduler: IScheduler): Observable[js.Tuple2[Double, T]] = js.native
  /**
    * Convert an object into an observable sequence of [key, value] pairs.
    * @param {Object} obj The object to inspect.
    * @param {Scheduler} [scheduler] Scheduler to run the enumeration of the input sequence on.
    * @returns {Observable} An observable sequence of [key, value] pairs from the object.
    */
  def pairs[T](obj: StringDictionary[T]): Observable[js.Tuple2[String, T]] = js.native
  def pairs[T](obj: StringDictionary[T], scheduler: IScheduler): Observable[js.Tuple2[String, T]] = js.native
  /**
    *  Generates an observable sequence of integral numbers within a specified range, using the specified scheduler to send out observer messages.
    *
    * @example
    *  var res = Rx.Observable.range(0, 10);
    *  var res = Rx.Observable.range(0, 10, Rx.Scheduler.timeout);
    * @param {Number} start The value of the first integer in the sequence.
    * @param {Number} count The number of sequential integers to generate.
    * @param {Scheduler} [scheduler] Scheduler to run the generator loop on. If not specified, defaults to Scheduler.currentThread.
    * @returns {Observable} An observable sequence that contains a range of sequential integral numbers.
    */
  def range(start: Double, count: Double): Observable[Double] = js.native
  def range(start: Double, count: Double, scheduler: IScheduler): Observable[Double] = js.native
  /**
    *  Generates an observable sequence that repeats the given element the specified number of times, using the specified scheduler to send out observer messages.
    *
    * @example
    *  var res = Rx.Observable.repeat(42);
    *  var res = Rx.Observable.repeat(42, 4);
    *  3 - res = Rx.Observable.repeat(42, 4, Rx.Scheduler.timeout);
    *  4 - res = Rx.Observable.repeat(42, null, Rx.Scheduler.timeout);
    * @param {Mixed} value Element to repeat.
    * @param {Number} repeatCount [Optiona] Number of times to repeat the element. If not specified, repeats indefinitely.
    * @param {Scheduler} scheduler Scheduler to run the producer loop on. If not specified, defaults to Scheduler.immediate.
    * @returns {Observable} An observable sequence that repeats the given element the specified number of times.
    */
  def repeat[T](value: T): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: js.UndefOr[scala.Nothing], scheduler: IScheduler): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Double): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Double, scheduler: IScheduler): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Unit): Observable[T] = js.native
  def repeat[T](value: T, repeatCount: Unit, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Returns an observable sequence that contains a single element, using the specified scheduler to send out observer messages.
    *  There is an alias called 'just' or browsers <IE9.
    * @param {Mixed} value Single element in the resulting observable sequence.
    * @param {Scheduler} scheduler Scheduler to send the single element on. If not specified, defaults to Scheduler.immediate.
    * @returns {Observable} An observable sequence containing the single specified element.
    */
  def `return`[T](value: T): Observable[T] = js.native
  def `return`[T](value: T, scheduler: IScheduler): Observable[T] = js.native
  def spawn[T](fn: js.Function): Observable[T] = js.native
  /**
    * Invokes the specified function asynchronously on the specified scheduler, surfacing the result through an observable sequence.
    *
    * @example
    * var res = Rx.Observable.start(function () { console.log('hello'); });
    * var res = Rx.Observable.start(function () { console.log('hello'); }, Rx.Scheduler.timeout);
    * var res = Rx.Observable.start(function () { this.log('hello'); }, Rx.Scheduler.timeout, console);
    *
    * @param {Function} func Function to run asynchronously.
    * @param {Scheduler} [scheduler]  Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param [context]  The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Observable} An observable sequence exposing the function's result value, or an exception.
    *
    * Remarks
    * * The function is called immediately, not during the subscription of the resulting sequence.
    * * Multiple subscriptions to the resulting sequence can observe the function's result.
    */
  def start[T](func: js.Function0[T]): Observable[T] = js.native
  def start[T](func: js.Function0[T], scheduler: js.UndefOr[scala.Nothing], context: js.Any): Observable[T] = js.native
  def start[T](func: js.Function0[T], scheduler: IScheduler): Observable[T] = js.native
  def start[T](func: js.Function0[T], scheduler: IScheduler, context: js.Any): Observable[T] = js.native
  /**
    * Invokes the asynchronous function, surfacing the result through an observable sequence.
    * @param {Function} functionAsync Asynchronous function which returns a Promise to run.
    * @returns {Observable} An observable sequence exposing the function's result value, or an exception.
    */
  def startAsync[T](functionAsync: js.Function0[IPromise[T]]): Observable[T] = js.native
  /**
    *  Returns an observable sequence that terminates with an exception, using the specified scheduler to send out the single onError message.
    * @param {Mixed} error An object used for the sequence's termination.
    * @param {Scheduler} scheduler Scheduler to send the exceptional termination call on. If not specified, defaults to Scheduler.immediate.
    * @returns {Observable} The observable sequence that terminates exceptionally with the specified exception object.
    */
  def `throw`[T](exception: js.Any): Observable[T] = js.native
  def `throw`[T](exception: js.Any, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Returns an observable sequence that terminates with an exception, using the specified scheduler to send out the single onError message.
    * @param {Mixed} error An object used for the sequence's termination.
    * @param {Scheduler} scheduler Scheduler to send the exceptional termination call on. If not specified, defaults to Scheduler.immediate.
    * @returns {Observable} The observable sequence that terminates exceptionally with the specified exception object.
    */
  def `throw`[T](exception: Error): Observable[T] = js.native
  def `throw`[T](exception: Error, scheduler: IScheduler): Observable[T] = js.native
  /**
    *  Returns an observable sequence that produces a value after dueTime has elapsed and then after each period.
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) at which to produce the first value.
    * @param {Mixed} [periodOrScheduler]  Period to produce subsequent values (specified as an integer denoting milliseconds), or the scheduler to run the timer on. If not specified, the resulting timer is not recurring.
    * @param {Scheduler} [scheduler]  Scheduler to run the timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence that produces a value after due time has elapsed and then each period.
    */
  def timer(dueTime: Double): Observable[Double] = js.native
  /**
    *  Returns an observable sequence that produces a value after dueTime has elapsed and then after each period.
    * @param {Number} dueTime Absolute (specified as a Date object) or relative time (specified as an integer denoting milliseconds) at which to produce the first value.
    * @param {Mixed} [periodOrScheduler]  Period to produce subsequent values (specified as an integer denoting milliseconds), or the scheduler to run the timer on. If not specified, the resulting timer is not recurring.
    * @param {Scheduler} [scheduler]  Scheduler to run the timer on. If not specified, the timeout scheduler is used.
    * @returns {Observable} An observable sequence that produces a value after due time has elapsed and then each period.
    */
  def timer(dueTime: Double, period: Double): Observable[Double] = js.native
  def timer(dueTime: Double, period: Double, scheduler: IScheduler): Observable[Double] = js.native
  def timer(dueTime: Double, scheduler: IScheduler): Observable[Double] = js.native
  /**
    * Converts the function into an asynchronous function. Each invocation of the resulting asynchronous function causes an invocation of the original synchronous function on the specified scheduler.
    * @param {Function} function Function to convert to an asynchronous function.
    * @param {Scheduler} [scheduler] Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Function} Asynchronous function.
    */
  def toAsync[TResult](func: js.Function0[TResult]): js.Function0[Observable[TResult]] = js.native
  def toAsync[TResult](func: js.Function0[TResult], context: js.UndefOr[scala.Nothing], scheduler: IScheduler): js.Function0[Observable[TResult]] = js.native
  def toAsync[TResult](func: js.Function0[TResult], context: js.Any): js.Function0[Observable[TResult]] = js.native
  def toAsync[TResult](func: js.Function0[TResult], context: js.Any, scheduler: IScheduler): js.Function0[Observable[TResult]] = js.native
  /**
    * Converts the function into an asynchronous function. Each invocation of the resulting asynchronous function causes an invocation of the original synchronous function on the specified scheduler.
    * @param {Function} function Function to convert to an asynchronous function.
    * @param {Scheduler} [scheduler] Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Function} Asynchronous function.
    */
  def toAsync[T1, TResult](func: js.Function1[/* arg1 */ T1, TResult]): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def toAsync[T1, TResult](
    func: js.Function1[/* arg1 */ T1, TResult],
    context: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def toAsync[T1, TResult](func: js.Function1[/* arg1 */ T1, TResult], context: js.Any): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  def toAsync[T1, TResult](func: js.Function1[/* arg1 */ T1, TResult], context: js.Any, scheduler: IScheduler): js.Function1[/* arg1 */ T1, Observable[TResult]] = js.native
  /**
    * Converts the function into an asynchronous function. Each invocation of the resulting asynchronous function causes an invocation of the original synchronous function on the specified scheduler.
    * @param {Function} function Function to convert to an asynchronous function.
    * @param {Scheduler} [scheduler] Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Function} Asynchronous function.
    */
  def toAsync[T1, T2, TResult](func: js.Function2[/* arg1 */ T1, /* arg2 */ T2, TResult]): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def toAsync[T1, T2, TResult](
    func: js.Function2[/* arg1 */ T1, /* arg2 */ T2, TResult],
    context: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def toAsync[T1, T2, TResult](func: js.Function2[/* arg1 */ T1, /* arg2 */ T2, TResult], context: js.Any): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  def toAsync[T1, T2, TResult](func: js.Function2[/* arg1 */ T1, /* arg2 */ T2, TResult], context: js.Any, scheduler: IScheduler): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Observable[TResult]] = js.native
  /**
    * Converts the function into an asynchronous function. Each invocation of the resulting asynchronous function causes an invocation of the original synchronous function on the specified scheduler.
    * @param {Function} function Function to convert to an asynchronous function.
    * @param {Scheduler} [scheduler] Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Function} Asynchronous function.
    */
  def toAsync[T1, T2, T3, TResult](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, TResult]): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, TResult](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, TResult],
    context: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, TResult](func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, TResult], context: js.Any): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, TResult](
    func: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, TResult],
    context: js.Any,
    scheduler: IScheduler
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Observable[TResult]] = js.native
  /**
    * Converts the function into an asynchronous function. Each invocation of the resulting asynchronous function causes an invocation of the original synchronous function on the specified scheduler.
    * @param {Function} function Function to convert to an asynchronous function.
    * @param {Scheduler} [scheduler] Scheduler to run the function on. If not specified, defaults to Scheduler.timeout.
    * @param {Mixed} [context] The context for the func parameter to be executed.  If not specified, defaults to undefined.
    * @returns {Function} Asynchronous function.
    */
  def toAsync[T1, T2, T3, T4, TResult](func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, TResult]): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, T4, TResult](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, TResult],
    context: js.UndefOr[scala.Nothing],
    scheduler: IScheduler
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, T4, TResult](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, TResult],
    context: js.Any
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  def toAsync[T1, T2, T3, T4, TResult](
    func: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, TResult],
    context: js.Any,
    scheduler: IScheduler
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Observable[TResult]] = js.native
  /**
    * Constructs an observable sequence that depends on a resource object, whose lifetime is tied to the resulting observable sequence's lifetime.
    * @param {Function} resourceFactory Factory function to obtain a resource object.
    * @param {Function} observableFactory Factory function to obtain an observable sequence that depends on the obtained resource.
    * @returns {Observable} An observable sequence whose lifetime controls the lifetime of the dependent resource object.
    */
  def using[TSource, TResource /* <: IDisposable */](
    resourceFactory: js.Function0[TResource],
    observableFactory: js.Function1[/* resource */ TResource, Observable[TSource]]
  ): Observable[TSource] = js.native
  /**
    *  Joins together the results from several patterns.
    *
    *  @param plans A series of plans (specified as an Array of as a series of arguments) created by use of the Then operator on patterns.
    *  @returns {Observable} Observable sequence with the results form matching several patterns.
    */
  def when[TR](plan: Plan[TR]): Observable[TR] = js.native
  /**
    *  Repeats source as long as condition holds emulating a while loop.
    * There is an alias for this method called 'whileDo' for browsers <IE9
    *
    * @param {Function} condition The condition which determines if the source will be repeated.
    * @param {Observable} source The observable sequence that will be run if the condition function returns true.
    * @returns {Observable} An observable sequence which is repeated as long as the condition holds.
    */
  def `while`[T](condition: js.Function0[Boolean], source: ObservableOrPromise[T]): Observable[T] = js.native
  /**
    *  Repeats source as long as condition holds emulating a while loop.
    * There is an alias for this method called 'whileDo' for browsers <IE9
    *
    * @param {Function} condition The condition which determines if the source will be repeated.
    * @param {Observable} source The observable sequence that will be run if the condition function returns true.
    * @returns {Observable} An observable sequence which is repeated as long as the condition holds.
    */
  def whileDo[T](condition: js.Function0[Boolean], source: ObservableOrPromise[T]): Observable[T] = js.native
  def wrap[T](fn: js.Function): Observable[T] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, TResult](source1: ObservableOrPromise[T1], ObservableOrPromise: Observable[T2]): Observable[TResult] = js.native
  def zip[T1, T2, TResult](
    source1: ObservableOrPromise[T1],
    ObservableOrPromise: Observable[T2],
    resultSelector: js.Function2[/* item1 */ T1, /* item2 */ T2, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, TResult](sources: js.Array[ObservableOrPromise[T2]]): Observable[TResult] = js.native
  def zip[T1, T2, TResult](
    sources: js.Array[ObservableOrPromise[T2]],
    resultSelector: js.Function2[/* item1 */ T1, /* repeated */ T2, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    resultSelector: js.Function3[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, TResult](
    source1: Observable[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    resultSelector: js.Function4[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, T5, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    resultSelector: js.Function5[/* item1 */ T1, /* item2 */ T2, /* item3 */ T3, /* item4 */ T4, /* item5 */ T5, TResult]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, T5, T6, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, T6, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    resultSelector: js.Function6[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, T5, T6, T7, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, T6, T7, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7],
    resultSelector: js.Function7[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, T5, T6, T7, T8, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7],
    source8: ObservableOrPromise[T8]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, T6, T7, T8, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7],
    source8: ObservableOrPromise[T8],
    resultSelector: js.Function8[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by using the selector function whenever all of the observable sequences have produced an element at a corresponding index.
    * @param arguments Observable sources.
    * @param {Function} resultSelector Function to invoke for each series of elements at corresponding indexes in the sources.
    * @returns {Observable} An observable sequence containing the result of combining elements of the sources using the specified result selector function.
    */
  def zip[T1, T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7],
    source8: ObservableOrPromise[T8],
    source9: ObservableOrPromise[T9]
  ): Observable[TResult] = js.native
  def zip[T1, T2, T3, T4, T5, T6, T7, T8, T9, TResult](
    source1: ObservableOrPromise[T1],
    source2: ObservableOrPromise[T2],
    source3: ObservableOrPromise[T3],
    source4: ObservableOrPromise[T4],
    source5: ObservableOrPromise[T5],
    source6: ObservableOrPromise[T6],
    source7: ObservableOrPromise[T7],
    source8: ObservableOrPromise[T8],
    source9: ObservableOrPromise[T9],
    resultSelector: js.Function9[
      /* item1 */ T1, 
      /* item2 */ T2, 
      /* item3 */ T3, 
      /* item4 */ T4, 
      /* item5 */ T5, 
      /* item6 */ T6, 
      /* item7 */ T7, 
      /* item8 */ T8, 
      /* item9 */ T9, 
      TResult
    ]
  ): Observable[TResult] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by emitting a list with the elements of the observable sequences at corresponding indexes.
    * @param arguments Observable sources.
    * @returns {Observable} An observable sequence containing lists of elements at corresponding indexes.
    */
  def zipIterable[T](sources: Observable[T]*): Observable[js.Array[T]] = js.native
  /**
    * Merges the specified observable sequences into one observable sequence by emitting a list with the elements of the observable sequences at corresponding indexes.
    * @param arguments Observable sources.
    * @returns {Observable} An observable sequence containing lists of elements at corresponding indexes.
    */
  def zipIterable[T](sources: js.Array[Observable[T]]): Observable[js.Array[T]] = js.native
}

