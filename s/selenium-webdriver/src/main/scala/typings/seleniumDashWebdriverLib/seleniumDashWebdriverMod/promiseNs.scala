package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "promise")
@js.native
object promiseNs extends js.Object {
  // endregion
  /**
    * Error used when the computation of a promise is cancelled.
    */
  @js.native
  /**
    * @param {string=} opt_msg The cancellation message.
    */
  class CancellationError ()
    extends stdLib.Error {
    def this(opt_msg: java.lang.String) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
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
  @js.native
  /**
    * @constructor
    */
  class ControlFlow ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.EventEmitter {
    /**
      * Schedules a task for execution. If there is nothing currently in the
      * queue, the task will be executed in the next turn of the event loop. If
      * the task function is a generator, the task will be executed using
      * {@link promise.consume}.
      *
      * @param {function(): (T|promise.Promise<T>)} fn The function to
      *     call to start the task. If the function returns a
      *     {@link promise.Promise}, this instance will wait for it to be
      *     resolved before starting the next task.
      * @param {string=} opt_description A description of the task.
      * @return {!promise.Promise<T>} A promise that will be resolved
      *     with the result of the action.
      * @template T
      */
    def execute[T](fn: js.Function0[T | Promise[T]]): Promise[T] = js.native
    def execute[T](fn: js.Function0[T | Promise[T]], opt_description: java.lang.String): Promise[T] = js.native
    /**
      * Generates an annotated string describing the internal state of this control
      * flow, including the currently executing as well as pending tasks. If
      * {@code opt_includeStackTraces === true}, the string will include the
      * stack trace from when each task was scheduled.
      * @param {string=} opt_includeStackTraces Whether to include the stack traces
      *     from when each task was scheduled. Defaults to false.
      * @return {string} String representation of this flow's internal state.
      */
    def getSchedule(): java.lang.String = js.native
    def getSchedule(opt_includeStackTraces: scala.Boolean): java.lang.String = js.native
    /**
      * Resets this instance, clearing its queue and removing all event listeners.
      */
    def reset(): scala.Unit = js.native
    /**
      * Inserts a {@code setTimeout} into the command queue. This is equivalent to
      * a thread sleep in a synchronous programming language.
      *
      * @param {number} ms The timeout delay, in milliseconds.
      * @param {string=} opt_description A description to accompany the timeout.
      * @return {!promise.Promise} A promise that will be resolved with
      *     the result of the action.
      */
    def timeout(ms: scala.Double): Promise[scala.Unit] = js.native
    def timeout(ms: scala.Double, opt_description: java.lang.String): Promise[scala.Unit] = js.native
    def wait[T](condition: js.Function): Promise[T] = js.native
    def wait[T](condition: js.Function, opt_timeout: scala.Double): Promise[T] = js.native
    def wait[T](condition: js.Function, opt_timeout: scala.Double, opt_message: java.lang.String): Promise[T] = js.native
    /**
      * Schedules a task that shall wait for a condition to hold. Each condition
      * function may return any value, but it will always be evaluated as a boolean.
      *
      * Condition functions may schedule sub-tasks with this instance, however,
      * their execution time will be factored into whether a wait has timed out.
      *
      * In the event a condition returns a Promise, the polling loop will wait for
      * it to be resolved before evaluating whether the condition has been satisfied.
      * The resolution time for a promise is factored into whether a wait has timed
      * out.
      *
      * If the condition function throws, or returns a rejected promise, the
      * wait task will fail.
      *
      * If the condition is defined as a promise, the flow will wait for it to
      * settle. If the timeout expires before the promise settles, the promise
      * returned by this function will be rejected.
      *
      * If this function is invoked with `timeout === 0`, or the timeout is omitted,
      * the flow will wait indefinitely for the condition to be satisfied.
      *
      * @param {(!promise.Promise<T>|function())} condition The condition to poll,
      *     or a promise to wait on.
      * @param {number=} opt_timeout How long to wait, in milliseconds, for the
      *     condition to hold before timing out. If omitted, the flow will wait
      *     indefinitely.
      * @param {string=} opt_message An optional error message to include if the
      *     wait times out; defaults to the empty string.
      * @return {!promise.Promise<T>} A promise that will be fulfilled
      *     when the condition has been satisified. The promise shall be rejected if
      *     the wait times out waiting for the condition.
      * @throws {TypeError} If condition is not a function or promise or if timeout
      *     is not a number >= 0.
      * @template T
      */
    def wait[T](condition: Promise[T]): Promise[T] = js.native
    def wait[T](condition: Promise[T], opt_timeout: scala.Double): Promise[T] = js.native
    def wait[T](condition: Promise[T], opt_timeout: scala.Double, opt_message: java.lang.String): Promise[T] = js.native
  }
  
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
  @js.native
  // region Constructors
  /**
    *
    * @param {promise.ControlFlow=} opt_flow The control flow
    *     this instance was created under. This should only be provided during
    *     unit tests.
    * @constructor
    */
  class Deferred[T] () extends js.Object {
    def this(opt_flow: ControlFlow) = this()
    // region Properties
    /**
      * The consumer promise for this instance. Provides protected access to the
      * callback registering functions.
      * @type {!promise.Promise}
      */
    var promise: Promise[T] = js.native
    def errback(): scala.Unit = js.native
    def errback(opt_error: js.Any): scala.Unit = js.native
    /**
      * Resolves this promise with the given value. If the value is itself a
      * promise and not a reference to this deferred, this instance will wait for
      * it before resolving.
      * @param {*=} opt_value The resolved value.
      */
    def fulfill(): scala.Unit = js.native
    def fulfill(opt_value: T): scala.Unit = js.native
    // endregion
    // region Methods
    /**
      * Rejects this promise. If the error is itself a promise, this instance will
      * be chained to it and be rejected with the error's resolved value.
      * @param {*=} opt_error The rejection reason, typically either a
      *     {@code Error} or a {@code string}.
      */
    def reject(): scala.Unit = js.native
    def reject(opt_error: js.Any): scala.Unit = js.native
    /**
      * Removes all of the listeners previously registered on this deferred.
      * @throws {Error} If this deferred has already been resolved.
      */
    def removeAll(): scala.Unit = js.native
  }
  
  trait IControlFlowTimer extends js.Object {
    def clearInterval(ms: scala.Double): scala.Unit
    def clearTimeout(ms: scala.Double): scala.Unit
    def setInterval(fn: js.Function, ms: scala.Double): scala.Double
    def setTimeout(fn: js.Function, ms: scala.Double): scala.Double
  }
  
  trait IEventType extends js.Object {
    /** Emitted when all tasks have been successfully executed. */
    var IDLE: java.lang.String
    /** Emitted when a ControlFlow has been reset. */
    var RESET: java.lang.String
    /** Emitted whenever a new task has been scheduled. */
    var SCHEDULE_TASK: java.lang.String
    /**
      * Emitted whenever a control flow aborts due to an unhandled promise
      * rejection. This event will be emitted along with the offending rejection
      * reason. Upon emitting this event, the control flow will empty its task
      * queue and revert to its initial state.
      */
    var UNCAUGHT_EXCEPTION: java.lang.String
  }
  
  @js.native
  trait IThenable[T]
    extends stdLib.PromiseLike[T] {
    /**
      * Registers a listener for when this promise is rejected. This is synonymous
      * with the {@code catch} clause in a synchronous API:
      *
      *     // Synchronous API:
      *     try {
      *       doSynchronousWork();
      *     } catch (ex) {
      *       console.error(ex);
      *     }
      *
      *     // Asynchronous promise API:
      *     doAsynchronousWork().catch(function(ex) {
      *       console.error(ex);
      *     });
      *
      * @param {function(*): (R|IThenable<R>)} errback The
      *     function to call if this promise is rejected. The function should
      *     expect a single argument: the rejection reason.
      * @return {!ManagedPromise<R>} A new promise which will be
      *     resolved with the result of the invoked callback.
      * @template R
      */
    def `catch`[TResult](): Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  }
  
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
  @js.native
  class Promise[T] protected () extends IThenable[T] {
    /**
      * @param {function(
      *           function((T|IThenable<T>|Thenable)=),
      *           function(*=))} resolver
      *     Function that is invoked immediately to begin computation of this
      *     promise's value. The function should accept a pair of callback
      *     functions, one for fulfilling the promise and another for rejecting it.
      * @param {ControlFlow=} opt_flow The control flow
      *     this instance was created under. Defaults to the currently active flow.
      */
    def this(resolver: js.Function2[/* resolve */ IFulfilledCallback[T], /* reject */ IRejectedCallback, scala.Unit]) = this()
    def this(resolver: js.Function2[/* resolve */ IFulfilledCallback[T], /* reject */ IRejectedCallback, scala.Unit], opt_flow: ControlFlow) = this()
  }
  
  /**
    * Thenable is a promise-like object with a {@code then} method which may be
    * used to schedule callbacks on a promised value.
    *
    * @interface
    * @template T
    */
  @js.native
  class Thenable[T] () extends IThenable[T] {
    /**
      * Registers a listener to invoke when this promise is resolved, regardless
      * of whether the promise's value was successfully computed. This function
      * is synonymous with the {@code finally} clause in a synchronous API:
      *
      *     // Synchronous API:
      *     try {
      *       doSynchronousWork();
      *     } finally {
      *       cleanUp();
      *     }
      *
      *     // Asynchronous promise API:
      *     doAsynchronousWork().finally(cleanUp);
      *
      * __Note:__ similar to the {@code finally} clause, if the registered
      * callback returns a rejected promise or throws an error, it will silently
      * replace the rejection error (if any) from this promise:
      *
      *     try {
      *       throw Error('one');
      *     } finally {
      *       throw Error('two');  // Hides Error: one
      *     }
      *
      *     promise.rejected(Error('one'))
      *         .finally(function() {
      *           throw Error('two');  // Hides Error: one
      *         });
      *
      * @param {function(): (R|IThenable<R>)} callback The function to call when
      *     this promise is resolved.
      * @return {!ManagedPromise<R>} A promise that will be fulfilled
      *     with the callback result.
      * @template R
      */
    def `finally`[R](callback: js.Function): Promise[R] = js.native
  }
  
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
  def all[T](arr: js.Array[T | Promise[T]]): Promise[js.Array[T]] = js.native
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
  def checkedNodeCall[T](fn: js.Function, var_args: js.Any*): Promise[T] = js.native
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
  def consume[T](generatorFn: js.Function): Promise[T] = js.native
  def consume[T](generatorFn: js.Function, opt_self: js.Any, var_args: js.Any*): Promise[T] = js.native
  /**
    * @return {!promise.ControlFlow} The currently active control flow.
    */
  def controlFlow(): ControlFlow = js.native
  /**
    * Creates a new control flow. The provided callback will be invoked as the
    * first task within the new flow, with the flow as its sole argument. Returns
    * a promise that resolves to the callback result.
    * @param {function(!ControlFlow)} callback The entry point
    *     to the newly created flow.
    * @return {!ManagedPromise} A promise that resolves to the callback
    *     result.
    */
  def createFlow[R](callback: js.Function1[/* flow */ ControlFlow, R]): Promise[R] = js.native
  /**
    * Creates a new deferred object.
    * @return {!promise.Deferred} The new deferred object.
    */
  def defer[T](): Deferred[T] = js.native
  /**
    * Creates a promise that will be resolved at a set time in the future.
    * @param {number} ms The amount of time, in milliseconds, to wait before
    *     resolving the promise.
    * @return {!ManagedPromise} The promise.
    */
  def delayed(ms: scala.Double): Promise[scala.Unit] = js.native
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
  ): Promise[js.Array[T]] = js.native
  def filter[T](
    arr: js.Array[T],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _],
    opt_self: js.Any
  ): Promise[js.Array[T]] = js.native
  def filter[T](
    arr: Promise[js.Array[T]],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _]
  ): Promise[js.Array[T]] = js.native
  def filter[T](
    arr: Promise[js.Array[T]],
    fn: js.Function4[/* element */ T, /* type */ js.Any, /* index */ scala.Double, /* array */ js.Array[T], _],
    opt_self: js.Any
  ): Promise[js.Array[T]] = js.native
  /**
    * Creates a promise that has been resolved with the given value.
    * @param {T=} opt_value The resolved value.
    * @return {!Promise<T>} The resolved promise.
    * @deprecated Use {@link Promise#resolve Promise.resolve(value)}.
    * @template T
    */
  def fulfilled[T](): Promise[T] = js.native
  def fulfilled[T](opt_value: T): Promise[T] = js.native
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
  def fullyResolved[T](value: js.Any): Promise[T] = js.native
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
  ): Promise[js.Array[_]] = js.native
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
  ): Promise[js.Array[_]] = js.native
  def map[T](
    arr: Promise[js.Array[T]],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ]
  ): Promise[js.Array[_]] = js.native
  def map[T](
    arr: Promise[js.Array[T]],
    fn: js.Function4[
      /* self */ js.Any, 
      /* type */ js.Any, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      _
    ],
    opt_self: js.Any
  ): Promise[js.Array[_]] = js.native
  /**
    * Creates a promise that has been rejected with the given reason.
    * @param {*=} opt_reason The rejection reason; may be any value, but is
    *     usually an Error or a string.
    * @return {!Promise<?>} The rejected promise.
    * @deprecated Use {@link Promise#reject Promise.Promise(reason)}.
    */
  def rejected[T](): Promise[T] = js.native
  def rejected[T](opt_reason: js.Any): Promise[T] = js.native
  /**
    * Changes the default flow to use when no others are active.
    * @param {!ControlFlow} flow The new default flow.
    * @throws {Error} If the default flow is not currently active.
    */
  def setDefaultFlow(flow: ControlFlow): scala.Unit = js.native
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
  def when[T](value: T): Promise[_] = js.native
  def when[T](value: T, opt_callback: js.Function1[/* value */ T, _]): Promise[_] = js.native
  def when[T](
    value: T,
    opt_callback: js.Function1[/* value */ T, _],
    opt_errback: js.Function1[/* error */ js.Any, _]
  ): Promise[_] = js.native
  def when[T](value: Promise[T]): Promise[_] = js.native
  def when[T](value: Promise[T], opt_callback: js.Function1[/* value */ T, _]): Promise[_] = js.native
  def when[T](
    value: Promise[T],
    opt_callback: js.Function1[/* value */ T, _],
    opt_errback: js.Function1[/* error */ js.Any, _]
  ): Promise[_] = js.native
  /* static members */
  @js.native
  object ControlFlow extends js.Object {
    /**
      * Events that may be emitted by an {@link promise.ControlFlow}.
      * @enum {string}
      */
    var EventType: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IEventType = js.native
  }
  
  /* static members */
  @js.native
  object Deferred extends js.Object {
    // endregion
    var State_ : seleniumDashWebdriverLib.Anon_BLOCKED = js.native
  }
  
  /* static members */
  @js.native
  object Promise extends js.Object {
    /**
      * Creates a promise that is immediately rejected with the given reason.
      *
      * @param {*=} opt_reason The rejection reason.
      * @return {!ManagedPromise<?>} A new rejected promise.
      */
    def reject(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Nothing] = js.native
    def reject(opt_reason: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Nothing] = js.native
    /**
      * Creates a promise that is immediately resolved with the given value.
      *
      * @param {T=} opt_value The value to resolve.
      * @return {!ManagedPromise<T>} A promise resolved with the given value.
      * @template T
      */
    def resolve[T](): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
    def resolve[T](opt_value: T): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object Thenable extends js.Object {
    /**
      * Adds a property to a class prototype to allow runtime checks of whether
      * instances of that class implement the Thenable interface. This function
      * will also ensure the prototype's {@code then} function is exported from
      * compiled code.
      * @param {function(new: Thenable, ...?)} ctor The
      *     constructor whose prototype to modify.
      */
    def addImplementation(ctor: js.Function): scala.Unit = js.native
    /**
      * Checks if an object has been tagged for implementing the Thenable
      * interface as defined by {@link Thenable.addImplementation}.
      * @param {*} object The object to test.
      * @return {boolean} Whether the object is an implementation of the Thenable
      *     interface.
      */
    def isImplementation(`object`: js.Any): scala.Boolean = js.native
  }
  
  type IFulfilledCallback[T] = js.Function1[/* value */ js.UndefOr[T | IThenable[T] | Thenable[T]], scala.Unit]
  type IRejectedCallback = js.Function1[/* reason */ js.Any, scala.Unit]
}

