package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateFlow extends js.Object {
  // endregion
  /**
     * Error used when the computation of a promise is cancelled.
     */
  var CancellationError: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.CancellationError] = js.native
  /**
     * Handles the execution of scheduled tasks, each of which may be an
     * asynchronous operation. The control flow will ensure tasks are executed in
     * the ordered scheduled, starting each task only once those before it have
     * completed.
     *
     * Each task scheduled within this flow may return a
     * {@link promise.Promise} to indicate it is an asynchronous
     * operation. The ControlFlow will wait for such promises to be resolved before
     * marking the task as completed.
     *
     * Tasks and each callback registered on a {@link promise.Promise}
     * will be run in their own ControlFlow frame.  Any tasks scheduled within a
     * frame will take priority over previously scheduled tasks. Furthermore, if any
     * of the tasks in the frame fail, the remainder of the tasks in that frame will
     * be discarded and the failure will be propagated to the user through the
     * callback/task's promised result.
     *
     * Each time a ControlFlow empties its task queue, it will fire an
     * {@link promise.ControlFlow.EventType.IDLE IDLE} event. Conversely,
     * whenever the flow terminates due to an unhandled error, it will remove all
     * remaining tasks in its queue and fire an
     * {@link promise.ControlFlow.EventType.UNCAUGHT_EXCEPTION
     * UNCAUGHT_EXCEPTION} event. If there are no listeners registered with the
     * flow, the error will be rethrown to the global error handler.
     *
     * @extends {EventEmitter}
     * @final
     */
  var ControlFlow: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow] = js.native
  /**
     * Represents a value that will be resolved at some point in the future. This
     * class represents the protected 'producer' half of a Promise - each Deferred
     * has a {@code promise} property that may be returned to consumers for
     * registering callbacks, reserving the ability to resolve the deferred to the
     * producer.
     *
     * <p>If this Deferred is rejected and there are no listeners registered before
     * the next turn of the event loop, the rejection will be passed to the
     * {@link promise.ControlFlow} as an unhandled failure.
     *
     */
  var Deferred: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Deferred[js.Object]] = js.native
  /**
     * Represents the eventual value of a completed operation. Each promise may be
     * in one of three states: pending, fulfilled, or rejected. Each promise starts
     * in the pending state and may make a single transition to either a
     * fulfilled or rejected state, at which point the promise is considered
     * resolved.
     *
     * @implements {promise.Thenable<T>}
     * @template T
     * @see http://promises-aplus.github.io/promises-spec/
     */
  var Promise: org.scalablytyped.runtime.Instantiable1[
    /* resolver */ js.Function2[
      /* resolve */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IFulfilledCallback[js.Object], 
      /* reject */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IRejectedCallback, 
      scala.Unit
    ], 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Object]
  ] = js.native
  /**
     * Thenable is a promise-like object with a {@code then} method which may be
     * used to schedule callbacks on a promised value.
     *
     * @interface
     * @template T
     */
  var Thenable: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Thenable[js.Any]] = js.native
  // region Functions
  /**
     * Set `USE_PROMISE_MANAGER` to `false` to disable the promise manager.
     * This is useful, if you use async/await (see https://github.com/SeleniumHQ/selenium/issues/2969
     * and https://github.com/SeleniumHQ/selenium/issues/3037).
     */
  var USE_PROMISE_MANAGER: scala.Boolean = js.native
  /**
     * Given an array of promises, will return a promise that will be fulfilled
     * with the fulfillment values of the input array's values. If any of the
     * input array's promises are rejected, the returned promise will be rejected
     * with the same reason.
     *
     * @param {!Array<(T|!ManagedPromise<T>)>} arr An array of
     *     promises to wait on.
     * @return {!ManagedPromise<!T[]>} A promise that is
     *     fulfilled with an array containing the fulfilled values of the
     *     input array, or rejected with the same reason as the first
     *     rejected value.
     * @template T
     */
  def all[T](arr: js.Array[T | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T]]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]] = js.native
  /**
     * Invokes the appropriate callback function as soon as a promised
     * {@code value} is resolved. This function is similar to
     * {@link promise.when}, except it does not return a new promise.
     * @param {*} value The value to observe.
     * @param {Function} callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     */
  def asap(value: js.Any, callback: js.Function): scala.Unit = js.native
  /**
     * Invokes the appropriate callback function as soon as a promised
     * {@code value} is resolved. This function is similar to
     * {@link promise.when}, except it does not return a new promise.
     * @param {*} value The value to observe.
     * @param {Function} callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     */
  def asap(value: js.Any, callback: js.Function, opt_errback: js.Function): scala.Unit = js.native
  /**
     * Wraps a function that expects a node-style callback as its final
     * argument. This callback expects two arguments: an error value (which will be
     * null if the call succeeded), and the success value as the second argument.
     * The callback will the resolve or reject the returned promise, based on its
     * arguments.
     * @param {!Function} fn The function to wrap.
     * @param {...?} var_args The arguments to apply to the function, excluding the
     *     final callback.
     * @return {!ManagedPromise} A promise that will be resolved with the
     *     result of the provided function's callback.
     */
  def checkedNodeCall[T](fn: js.Function, var_args: js.Any*): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Consumes a {@code GeneratorFunction}. Each time the generator yields a
     * promise, this function will wait for it to be fulfilled before feeding the
     * fulfilled value back into {@code next}. Likewise, if a yielded promise is
     * rejected, the rejection error will be passed to {@code throw}.
     *
     * __Example 1:__ the Fibonacci Sequence.
     *
     *     promise.consume(function* fibonacci() {
     *       var n1 = 1, n2 = 1;
     *       for (var i = 0; i < 4; ++i) {
     *         var tmp = yield n1 + n2;
     *         n1 = n2;
     *         n2 = tmp;
     *       }
     *       return n1 + n2;
     *     }).then(function(result) {
     *       console.log(result);  // 13
     *     });
     *
     * __Example 2:__ a generator that throws.
     *
     *     promise.consume(function* () {
     *       yield promise.delayed(250).then(function() {
     *         throw Error('boom');
     *       });
     *     }).catch(function(e) {
     *       console.log(e.toString());  // Error: boom
     *     });
     *
     * @param {!Function} generatorFn The generator function to execute.
     * @param {Object=} opt_self The object to use as 'this' when invoking the
     *     initial generator.
     * @param {...*} var_args Any arguments to pass to the initial generator.
     * @return {!ManagedPromise<?>} A promise that will resolve to the
     *     generator's final result.
     * @throws {TypeError} If the given function is not a generator.
     */
  def consume[T](generatorFn: js.Function): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Consumes a {@code GeneratorFunction}. Each time the generator yields a
     * promise, this function will wait for it to be fulfilled before feeding the
     * fulfilled value back into {@code next}. Likewise, if a yielded promise is
     * rejected, the rejection error will be passed to {@code throw}.
     *
     * __Example 1:__ the Fibonacci Sequence.
     *
     *     promise.consume(function* fibonacci() {
     *       var n1 = 1, n2 = 1;
     *       for (var i = 0; i < 4; ++i) {
     *         var tmp = yield n1 + n2;
     *         n1 = n2;
     *         n2 = tmp;
     *       }
     *       return n1 + n2;
     *     }).then(function(result) {
     *       console.log(result);  // 13
     *     });
     *
     * __Example 2:__ a generator that throws.
     *
     *     promise.consume(function* () {
     *       yield promise.delayed(250).then(function() {
     *         throw Error('boom');
     *       });
     *     }).catch(function(e) {
     *       console.log(e.toString());  // Error: boom
     *     });
     *
     * @param {!Function} generatorFn The generator function to execute.
     * @param {Object=} opt_self The object to use as 'this' when invoking the
     *     initial generator.
     * @param {...*} var_args Any arguments to pass to the initial generator.
     * @return {!ManagedPromise<?>} A promise that will resolve to the
     *     generator's final result.
     * @throws {TypeError} If the given function is not a generator.
     */
  def consume[T](generatorFn: js.Function, opt_self: js.Any, var_args: js.Any*): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * @return {!promise.ControlFlow} The currently active control flow.
     */
  def controlFlow(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow = js.native
  /**
     * Creates a new control flow. The provided callback will be invoked as the
     * first task within the new flow, with the flow as its sole argument. Returns
     * a promise that resolves to the callback result.
     * @param {function(!ControlFlow)} callback The entry point
     *     to the newly created flow.
     * @return {!ManagedPromise} A promise that resolves to the callback
     *     result.
     */
  def createFlow[R](
    callback: js.Function1[
      /* flow */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow, 
      R
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[R] = js.native
  /**
     * Creates a new deferred object.
     * @return {!promise.Deferred} The new deferred object.
     */
  def defer[T](): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Deferred[T] = js.native
  /**
     * Creates a promise that will be resolved at a set time in the future.
     * @param {number} ms The amount of time, in milliseconds, to wait before
     *     resolving the promise.
     * @return {!ManagedPromise} The promise.
     */
  def delayed(ms: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Calls a function for each element in an array, and if the function returns
     * true adds the element to a new array.
     *
     * If the return value of the filter function is a promise, this function
     * will wait for it to be fulfilled before determining whether to insert the
     * element into the new array.
     *
     * If the filter function throws or returns a rejected promise, the promise
     * returned by this function will be rejected with the same reason. Only the
     * first failure will be reported; all subsequent errors will be silently
     * ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): (
     *             boolean|ManagedPromise<boolean>)} fn The function
     *     to call for each element in the array.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def filter[T](
    arr: js.Array[T],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]] = js.native
  /**
     * Calls a function for each element in an array, and if the function returns
     * true adds the element to a new array.
     *
     * If the return value of the filter function is a promise, this function
     * will wait for it to be fulfilled before determining whether to insert the
     * element into the new array.
     *
     * If the filter function throws or returns a rejected promise, the promise
     * returned by this function will be rejected with the same reason. Only the
     * first failure will be reported; all subsequent errors will be silently
     * ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): (
     *             boolean|ManagedPromise<boolean>)} fn The function
     *     to call for each element in the array.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def filter[T](
    arr: js.Array[T],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _],
    opt_self: js.Any
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]] = js.native
  /**
     * Calls a function for each element in an array, and if the function returns
     * true adds the element to a new array.
     *
     * If the return value of the filter function is a promise, this function
     * will wait for it to be fulfilled before determining whether to insert the
     * element into the new array.
     *
     * If the filter function throws or returns a rejected promise, the promise
     * returned by this function will be rejected with the same reason. Only the
     * first failure will be reported; all subsequent errors will be silently
     * ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): (
     *             boolean|ManagedPromise<boolean>)} fn The function
     *     to call for each element in the array.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def filter[T](
    arr: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]] = js.native
  /**
     * Calls a function for each element in an array, and if the function returns
     * true adds the element to a new array.
     *
     * If the return value of the filter function is a promise, this function
     * will wait for it to be fulfilled before determining whether to insert the
     * element into the new array.
     *
     * If the filter function throws or returns a rejected promise, the promise
     * returned by this function will be rejected with the same reason. Only the
     * first failure will be reported; all subsequent errors will be silently
     * ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): (
     *             boolean|ManagedPromise<boolean>)} fn The function
     *     to call for each element in the array.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def filter[T](
    arr: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _],
    opt_self: js.Any
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]] = js.native
  /**
     * Creates a promise that has been resolved with the given value.
     * @param {T=} opt_value The resolved value.
     * @return {!Promise<T>} The resolved promise.
     * @deprecated Use {@link Promise#resolve Promise.resolve(value)}.
     * @template T
     */
  def fulfilled[T](): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Creates a promise that has been resolved with the given value.
     * @param {T=} opt_value The resolved value.
     * @return {!Promise<T>} The resolved promise.
     * @deprecated Use {@link Promise#resolve Promise.resolve(value)}.
     * @template T
     */
  def fulfilled[T](opt_value: T): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Returns a promise that will be resolved with the input value in a
     * fully-resolved state. If the value is an array, each element will be fully
     * resolved. Likewise, if the value is an object, all keys will be fully
     * resolved. In both cases, all nested arrays and objects will also be
     * fully resolved.  All fields are resolved in place; the returned promise will
     * resolve on {@code value} and not a copy.
     *
     * Warning: This function makes no checks against objects that contain
     * cyclical references:
     *
     *     var value = {};
     *     value['self'] = value;
     *     promise.fullyResolved(value);  // Stack overflow.
     *
     * @param {*} value The value to fully resolve.
     * @return {!ManagedPromise} A promise for a fully resolved version
     *     of the input value.
     */
  def fullyResolved[T](value: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Tests is a function is a generator.
     * @param {!Function} fn The function to test.
     * @return {boolean} Whether the function is a generator.
     */
  def isGenerator(fn: js.Function): scala.Boolean = js.native
  /**
     * Determines whether a {@code value} should be treated as a promise.
     * Any object whose 'then' property is a function will be considered a promise.
     *
     * @param {*} value The value to test.
     * @return {boolean} Whether the value is a promise.
     */
  def isPromise(value: js.Any): scala.Boolean = js.native
  /**
     * Calls a function for each element in an array and inserts the result into a
     * new array, which is used as the fulfillment value of the promise returned
     * by this function.
     *
     * If the return value of the mapping function is a promise, this function
     * will wait for it to be fulfilled before inserting it into the new array.
     *
     * If the mapping function throws or returns a rejected promise, the
     * promise returned by this function will be rejected with the same reason.
     * Only the first failure will be reported; all subsequent errors will be
     * silently ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): ?} fn The
     *     function to call for each element in the array. This function should
     *     expect three arguments (the element, the index, and the array itself.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def map[T](
    arr: js.Array[T],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[_]] = js.native
  /**
     * Calls a function for each element in an array and inserts the result into a
     * new array, which is used as the fulfillment value of the promise returned
     * by this function.
     *
     * If the return value of the mapping function is a promise, this function
     * will wait for it to be fulfilled before inserting it into the new array.
     *
     * If the mapping function throws or returns a rejected promise, the
     * promise returned by this function will be rejected with the same reason.
     * Only the first failure will be reported; all subsequent errors will be
     * silently ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): ?} fn The
     *     function to call for each element in the array. This function should
     *     expect three arguments (the element, the index, and the array itself.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def map[T](
    arr: js.Array[T],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ],
    opt_self: js.Any
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[_]] = js.native
  /**
     * Calls a function for each element in an array and inserts the result into a
     * new array, which is used as the fulfillment value of the promise returned
     * by this function.
     *
     * If the return value of the mapping function is a promise, this function
     * will wait for it to be fulfilled before inserting it into the new array.
     *
     * If the mapping function throws or returns a rejected promise, the
     * promise returned by this function will be rejected with the same reason.
     * Only the first failure will be reported; all subsequent errors will be
     * silently ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): ?} fn The
     *     function to call for each element in the array. This function should
     *     expect three arguments (the element, the index, and the array itself.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def map[T](
    arr: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[_]] = js.native
  /**
     * Calls a function for each element in an array and inserts the result into a
     * new array, which is used as the fulfillment value of the promise returned
     * by this function.
     *
     * If the return value of the mapping function is a promise, this function
     * will wait for it to be fulfilled before inserting it into the new array.
     *
     * If the mapping function throws or returns a rejected promise, the
     * promise returned by this function will be rejected with the same reason.
     * Only the first failure will be reported; all subsequent errors will be
     * silently ignored.
     *
     * @param {!(Array<TYPE>|ManagedPromise<!Array<TYPE>>)} arr The
     *     array to iterator over, or a promise that will resolve to said array.
     * @param {function(this: SELF, TYPE, number, !Array<TYPE>): ?} fn The
     *     function to call for each element in the array. This function should
     *     expect three arguments (the element, the index, and the array itself.
     * @param {SELF=} opt_self The object to be used as the value of 'this' within
     *     {@code fn}.
     * @template TYPE, SELF
     */
  def map[T](
    arr: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[T]],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ],
    opt_self: js.Any
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[_]] = js.native
  /**
     * Creates a promise that has been rejected with the given reason.
     * @param {*=} opt_reason The rejection reason; may be any value, but is
     *     usually an Error or a string.
     * @return {!Promise<?>} The rejected promise.
     * @deprecated Use {@link Promise#reject Promise.Promise(reason)}.
     */
  def rejected[T](): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Creates a promise that has been rejected with the given reason.
     * @param {*=} opt_reason The rejection reason; may be any value, but is
     *     usually an Error or a string.
     * @return {!Promise<?>} The rejected promise.
     * @deprecated Use {@link Promise#reject Promise.Promise(reason)}.
     */
  def rejected[T](opt_reason: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  /**
     * Changes the default flow to use when no others are active.
     * @param {!ControlFlow} flow The new default flow.
     * @throws {Error} If the default flow is not currently active.
     */
  def setDefaultFlow(flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow): scala.Unit = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](value: T): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](value: T, opt_callback: js.Function1[/* value */ T, _]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](
    value: T,
    opt_callback: js.Function1[/* value */ T, _],
    opt_errback: js.Function1[/* error */ js.Any, _]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](value: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](
    value: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T],
    opt_callback: js.Function1[/* value */ T, _]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
     * Registers an observer on a promised {@code value}, returning a new promise
     * that will be resolved when the value is. If {@code value} is not a promise,
     * then the return promise will be immediately resolved.
     * @param {*} value The value to observe.
     * @param {Function=} opt_callback The function to call when the value is
     *     resolved successfully.
     * @param {Function=} opt_errback The function to call when the value is
     *     rejected.
     * @return {!ManagedPromise} A new promise.
     */
  def when[T](
    value: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T],
    opt_callback: js.Function1[/* value */ T, _],
    opt_errback: js.Function1[/* error */ js.Any, _]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
}

