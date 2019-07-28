package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  /**
  		 * A sugar method, equivalent to promise.then(undefined, onRejected).
  		 */
  def `catch`[U](onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]): Promise[U] = js.native
  /**
  		 * Returns a promise that will have the same result as promise, but will only be fulfilled or rejected after at least
  		 * ms milliseconds have passed.
  		 */
  def delay(ms: Double): Promise[T] = js.native
  def delete[U](propertyName: String): Promise[U] = js.native
  /**
  		 * Much like then, but with different behavior around unhandled rejection. If there is an unhandled rejection,
  		 * either because promise is rejected and no onRejected callback was provided, or because onFulfilled or onRejected
  		 * threw an error or returned a rejected promise, the resulting rejection reason is thrown as an exception in a
  		 * future turn of the event loop.
  		 * This method should be used to terminate chains of promises that will not be passed elsewhere. Since exceptions
  		 * thrown in then callbacks are consumed and transformed into rejections, exceptions at the end of the chain are
  		 * easy to accidentally, silently ignore. By arranging for the exception to be thrown in a future turn of the
  		 * event loop, so that it won't be caught, it causes an onerror event on the browser window, or an uncaughtException
  		 * event on Node.js's process object.
  		 * Exceptions thrown by done will have long stack traces, if Q.longStackSupport is set to true. If Q.onerror is set,
  		 * exceptions will be delivered there instead of thrown in a future turn.
  		 * The Golden Rule of done vs. then usage is: either return your promise to someone else, or if the chain ends
  		 * with you, call done to terminate it. Terminating with catch is not sufficient because the catch handler may
  		 * itself throw an error.
  		 */
  def done(): Unit = js.native
  def done(onFulfilled: js.Function1[/* value */ T, _]): Unit = js.native
  def done(onFulfilled: js.Function1[/* value */ T, _], onRejected: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  def done(
    onFulfilled: js.Function1[/* value */ T, _],
    onRejected: js.Function1[/* reason */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Unit = js.native
  def done(
    onFulfilled: js.Function1[/* value */ T, _],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Unit = js.native
  def done(onFulfilled: Null, onRejected: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  def done(
    onFulfilled: Null,
    onRejected: js.Function1[/* reason */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Unit = js.native
  def done(onFulfilled: Null, onRejected: Null, onProgress: js.Function1[/* progress */ js.Any, _]): Unit = js.native
  /**
  		 * Alias for catch() (for non-ES5 browsers)
  		 */
  def fail[U](onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]): Promise[U] = js.native
  /**
  		 * Returns a promise for the result of calling a function, with the given array of arguments. Essentially equivalent to
  		 *
  		 * @example
  		 * promise.then(function (f) {
  		 *     return f.apply(undefined, args);
  		 * });
  		 */
  def fapply[U](args: js.Array[_]): Promise[U] = js.native
  /**
  		 * Returns a promise for the result of calling a function, with the given variadic arguments. Has the same return
  		 * value/thrown exception translation as explained above for fbind.
  		 * In its static form, it is aliased as Q.try, since it has semantics similar to a try block (but handling both
  		 * synchronous exceptions and asynchronous rejections). This allows code like
  		 *
  		 * @example
  		 * Q.try(function () {
  		 *     if (!isConnectedToCloud()) {
  		 *         throw new Error("The cloud is down!");
  		 *     }
  		 *     return syncToCloud();
  		 * })
  		 * .catch(function (error) {
  		 *     console.error("Couldn't sync to the cloud", error);
  		 * });
  		 */
  def fcall[U](args: js.Any*): Promise[U] = js.native
  /**
  		 * Alias for finally() (for non-ES5 browsers)
  		 */
  def fin(finallyCallback: js.Function0[_]): Promise[T] = js.native
  /**
  		 * Like a finally clause, allows you to observe either the fulfillment or rejection of a promise, but to do so
  		 * without modifying the final value. This is useful for collecting resources regardless of whether a job succeeded,
  		 * like closing a database connection, shutting a server down, or deleting an unneeded key from an object.
  		 * finally returns a promise, which will become resolved with the same fulfillment value or rejection reason
  		 * as promise. However, if callback returns a promise, the resolution of the returned promise will be delayed
  		 * until the promise returned from callback is finished. Furthermore, if the returned promise rejects, that
  		 * rejection will be passed down the chain instead of the previous result.
  		 */
  def `finally`(finallyCallback: js.Function0[_]): Promise[T] = js.native
  /**
  		 * Returns a promise to get the named property of an object. Essentially equivalent to
  		 *
  		 * @example
  		 * promise.then(function (o) { return o[propertyName]; });
  		 */
  def get[U](propertyName: String): Promise[U] = js.native
  /**
  		 * Returns a "state snapshot" object, which will be in one of three forms:
  		 *
  		 * - { state: "pending" }
  		 * - { state: "fulfilled", value: <fulfllment value> }
  		 * - { state: "rejected", reason: <rejection reason> }
  		 */
  def inspect(): PromiseState[T] = js.native
  /**
  		 * Returns a promise for the result of calling the named method of an object with the given variadic arguments.
  		 * The object itself is this in the function, just like a synchronous method call.
  		 */
  def invoke[U](methodName: String, args: js.Any*): Promise[U] = js.native
  /**
  		 * Returns whether a given promise is in the fulfilled state. When the static version is used on non-promises, the
  		 * result is always true.
  		 */
  def isFulfilled(): Boolean = js.native
  /**
  		 * Returns whether a given promise is in the pending state. When the static version is used on non-promises, the
  		 * result is always false.
  		 */
  def isPending(): Boolean = js.native
  /**
  		 * Returns whether a given promise is in the rejected state. When the static version is used on non-promises, the
  		 * result is always false.
  		 */
  def isRejected(): Boolean = js.native
  /**
  		 * Returns a promise for an array of the property names of an object. Essentially equivalent to
  		 *
  		 * @example
  		 * promise.then(function (o) { return Object.keys(o); });
  		 */
  def keys(): Promise[js.Array[String]] = js.native
  /**
  		 * If callback is a function, assumes it's a Node.js-style callback, and calls it as either callback(rejectionReason)
  		 * when/if promise becomes rejected, or as callback(null, fulfillmentValue) when/if promise becomes fulfilled.
  		 * If callback is not a function, simply returns promise.
  		 */
  def nodeify(callback: js.Function2[/* reason */ js.Any, /* value */ js.Any, Unit]): Promise[T] = js.native
  /**
  		 * Returns a promise for the result of calling the named method of an object with the given array of arguments.
  		 * The object itself is this in the function, just like a synchronous method call. Essentially equivalent to
  		 *
  		 * @example
  		 * promise.then(function (o) { return o[methodName].apply(o, args); });
  		 */
  def post[U](methodName: String, args: js.Array[_]): Promise[U] = js.native
  /**
  		 * A sugar method, equivalent to promise.then(undefined, undefined, onProgress).
  		 */
  def progress(onProgress: js.Function1[/* progress */ js.Any, _]): Promise[T] = js.native
  def set[U](propertyName: String, value: js.Any): Promise[U] = js.native
  /**
  		 * Like then, but "spreads" the array into a variadic fulfillment handler. If any of the promises in the array are
  		 * rejected, instead calls onRejected with the first rejected promise's rejection reason.
  		 * This is especially useful in conjunction with all
  		 */
  def spread[U](onFulfill: js.Function1[/* repeated */ js.Any, IWhenable[U]]): Promise[U] = js.native
  def spread[U](
    onFulfill: js.Function1[/* repeated */ js.Any, IWhenable[U]],
    onReject: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  /**
  		 * Attaches a handler that will observe the value of the promise when it becomes fulfilled, returning a promise for
  		 * that same value, perhaps deferred but not replaced by the promise returned by the onFulfilled handler.
  		 */
  def tap(onFulfilled: js.Function1[/* value */ T, _]): Promise[T] = js.native
  /**
  		 * The then method from the Promises/A+ specification, with an additional progress handler.
  		 */
  def `then`[U](): Promise[U] = js.native
  def `then`[U](onFulfill: js.Function1[/* value */ T, IWhenable[U]]): Promise[U] = js.native
  def `then`[U](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: js.Function1[/* error */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  def `then`[U](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: js.Function1[/* error */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  def `then`[U](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  def `then`[U](onFulfill: Null, onReject: js.Function1[/* error */ js.Any, IWhenable[U]]): Promise[U] = js.native
  def `then`[U](
    onFulfill: Null,
    onReject: js.Function1[/* error */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  def `then`[U](onFulfill: Null, onReject: Null, onProgress: js.Function1[/* progress */ js.Any, _]): Promise[U] = js.native
  /**
  		 * A sugar method, equivalent to promise.then(function () { throw reason; }).
  		 */
  def thenReject[U](): Promise[U] = js.native
  def thenReject[U](reason: js.Any): Promise[U] = js.native
  /**
  		 * A sugar method, equivalent to promise.then(function () { return value; }).
  		 */
  def thenResolve[U](value: U): Promise[U] = js.native
  @JSName("then")
  def then_UV[U, V](): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](onFulfill: js.Function1[/* value */ T, IWhenable[U]]): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: js.Function1[/* error */ js.Any, IWhenable[V]]
  ): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: js.Function1[/* error */ js.Any, IWhenable[V]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](
    onFulfill: js.Function1[/* value */ T, IWhenable[U]],
    onReject: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](onFulfill: Null, onReject: js.Function1[/* error */ js.Any, IWhenable[V]]): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](
    onFulfill: Null,
    onReject: js.Function1[/* error */ js.Any, IWhenable[V]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U | V] = js.native
  @JSName("then")
  def then_UV[U, V](onFulfill: Null, onReject: Null, onProgress: js.Function1[/* progress */ js.Any, _]): Promise[U | V] = js.native
  /**
  		 * Returns a promise that will have the same result as promise, except that if promise is not fulfilled or rejected
  		 * before ms milliseconds, the returned promise will be rejected with an Error with the given message. If message
  		 * is not supplied, the message will be "Timed out after " + ms + " ms".
  		 */
  def timeout(ms: Double): Promise[T] = js.native
  def timeout(ms: Double, message: String): Promise[T] = js.native
}

