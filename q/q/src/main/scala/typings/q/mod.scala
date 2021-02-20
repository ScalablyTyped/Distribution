package typings.q

import typings.q.anon.Typeofq
import typings.q.qStrings.fulfilled
import typings.q.qStrings.pending
import typings.q.qStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calling with nothing at all creates a void promise
    */
  @JSImport("q", JSImport.Namespace)
  @js.native
  def apply(): Promise[Unit] = js.native
  @JSImport("q", JSImport.Namespace)
  @js.native
  def apply[T](promise: T): Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  @JSImport("q", JSImport.Namespace)
  @js.native
  def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
  
  @JSImport("q", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Promise[T] extends StObject {
    
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
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Unit = js.native
    def done(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* reason */ js.Any, _]): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* reason */ js.Any, _],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Unit = js.native
    def done(
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: Null,
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Unit = js.native
    def done(onFulfilled: js.Function1[/* value */ T, _]): Unit = js.native
    def done(
      onFulfilled: js.Function1[/* value */ T, _],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Unit = js.native
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
    def done(
      onFulfilled: Null,
      onRejected: js.UndefOr[scala.Nothing],
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
    def `then`[U](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
    def `then`[U](onFulfill: js.UndefOr[scala.Nothing], onReject: js.Function1[/* error */ js.Any, IWhenable[U]]): Promise[U] = js.native
    def `then`[U](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: js.Function1[/* error */ js.Any, IWhenable[U]],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
    def `then`[U](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: Null,
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
    def `then`[U](onFulfill: js.Function1[/* value */ T, IWhenable[U]]): Promise[U] = js.native
    def `then`[U](
      onFulfill: js.Function1[/* value */ T, IWhenable[U]],
      onReject: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
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
    def `then`[U](
      onFulfill: Null,
      onReject: js.UndefOr[scala.Nothing],
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
    def then_UV[U, V](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U | V] = js.native
    @JSName("then")
    def then_UV[U, V](onFulfill: js.UndefOr[scala.Nothing], onReject: js.Function1[/* error */ js.Any, IWhenable[V]]): Promise[U | V] = js.native
    @JSName("then")
    def then_UV[U, V](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: js.Function1[/* error */ js.Any, IWhenable[V]],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U | V] = js.native
    @JSName("then")
    def then_UV[U, V](
      onFulfill: js.UndefOr[scala.Nothing],
      onReject: Null,
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U | V] = js.native
    @JSName("then")
    def then_UV[U, V](onFulfill: js.Function1[/* value */ T, IWhenable[U]]): Promise[U | V] = js.native
    @JSName("then")
    def then_UV[U, V](
      onFulfill: js.Function1[/* value */ T, IWhenable[U]],
      onReject: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U | V] = js.native
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
    def then_UV[U, V](
      onFulfill: Null,
      onReject: js.UndefOr[scala.Nothing],
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
  @JSImport("q", "Promise")
  @js.native
  def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, Unit], 
      Unit
    ]
  ): Promise[T] = js.native
  
  @JSImport("q", "all")
  @js.native
  def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
  
  @JSImport("q", "allResolved")
  @js.native
  def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
  
  @JSImport("q", "allSettled")
  @js.native
  def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = js.native
  
  @JSImport("q", "all")
  @js.native
  def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = js.native
  @JSImport("q", "all")
  @js.native
  def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = js.native
  @JSImport("q", "all")
  @js.native
  def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("q", "all")
  @js.native
  def all_ABCDE[A, B, C, D, E](
    promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
  ): Promise[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("q", "all")
  @js.native
  def all_ABCDEF[A, B, C, D, E, F](
    promises: IWhenable[
      js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
    ]
  ): Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @JSImport("q", "async")
  @js.native
  def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  
  @JSImport("q", "delay")
  @js.native
  def delay(ms: Double): Promise[Unit] = js.native
  @JSImport("q", "delay")
  @js.native
  def delay[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
  @JSImport("q", "delay")
  @js.native
  def delay[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
  
  @JSImport("q", "denodeify")
  @js.native
  def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "fbind")
  @js.native
  def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "fcall")
  @js.native
  def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "invoke")
  @js.native
  def invoke[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "isFulfilled")
  @js.native
  def isFulfilled(promise: Promise[_]): Boolean = js.native
  
  @JSImport("q", "isPending")
  @js.native
  def isPending(promiseOrObject: js.Any): Boolean = js.native
  @JSImport("q", "isPending")
  @js.native
  def isPending(promiseOrObject: Promise[_]): Boolean = js.native
  
  @JSImport("q", "isPromise")
  @js.native
  def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ Boolean = js.native
  
  @JSImport("q", "isPromiseAlike")
  @js.native
  def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ Boolean = js.native
  
  @JSImport("q", "isRejected")
  @js.native
  def isRejected(promise: Promise[_]): Boolean = js.native
  
  @JSImport("q", "longStackSupport")
  @js.native
  def longStackSupport: Boolean = js.native
  @scala.inline
  def longStackSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longStackSupport")(x.asInstanceOf[js.Any])
  
  @JSImport("q", "mcall")
  @js.native
  def mcall[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "nbind")
  @js.native
  def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "nearer")
  @js.native
  def nearer[T](promise: Promise[T]): T = js.native
  
  @JSImport("q", "nextTick")
  @js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSImport("q", "nfapply")
  @js.native
  def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("q", "nfbind")
  @js.native
  def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "nfcall")
  @js.native
  def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "ninvoke")
  @js.native
  def ninvoke[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "noConflict")
  @js.native
  def noConflict(): Typeofq = js.native
  
  @JSImport("q", "npost")
  @js.native
  def npost[T](nodeModule: js.Any, functionName: String, args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("q", "nsend")
  @js.native
  def nsend[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "onerror")
  @js.native
  def onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
  @scala.inline
  def onerror_=(x: js.Function1[/* reason */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onerror")(x.asInstanceOf[js.Any])
  
  @JSImport("q", "promised")
  @js.native
  def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q", "race")
  @js.native
  def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
  
  @JSImport("q", "reject")
  @js.native
  def reject[T](): Promise[T] = js.native
  @JSImport("q", "reject")
  @js.native
  def reject[T](reason: js.Any): Promise[T] = js.native
  
  @JSImport("q", "resolve")
  @js.native
  def resolve[T](): Promise[T] = js.native
  @JSImport("q", "resolve")
  @js.native
  def resolve[T](`object`: IWhenable[T]): Promise[T] = js.native
  
  @JSImport("q", "send")
  @js.native
  def send[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q", "spread")
  @js.native
  def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("q", "spread")
  @js.native
  def spread[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  
  @JSImport("q", "timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double): Promise[T] = js.native
  @JSImport("q", "timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
  
  @JSImport("q", "when")
  @js.native
  def when(): Promise[Unit] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T](value: IWhenable[T]): Promise[T] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("q", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  
  @js.native
  trait Deferred[T] extends StObject {
    
    /**
      * Returns a function suitable for passing to a Node.js API. That is, it has a signature (err, result) and will
      * reject deferred.promise with err if err is given, or fulfill it with result if that is given.
      */
    def makeNodeResolver(): js.Function2[/* reason */ js.Any, /* value */ T, Unit] = js.native
    
    /**
      * Calling notify with a value causes promise to be notified of progress with that value. That is, any onProgress
      * handlers registered with promise or promises derived from promise will be called with the progress value.
      */
    def notify(value: js.Any): Unit = js.native
    
    var promise: Promise[T] = js.native
    
    /**
      * Calling reject with a reason causes promise to be rejected with that reason.
      */
    def reject(): Unit = js.native
    def reject(reason: js.Any): Unit = js.native
    
    /**
      * Calling resolve with a pending promise causes promise to wait on the passed promise, becoming fulfilled with its
      * fulfillment value or rejected with its rejection reason (or staying pending forever, if the passed promise does).
      * Calling resolve with a rejected promise causes promise to be rejected with the passed promise's rejection reason.
      * Calling resolve with a fulfilled promise causes promise to be fulfilled with the passed promise's fulfillment value.
      * Calling resolve with a non-promise value causes promise to be fulfilled with that value.
      */
    def resolve(): Unit = js.native
    def resolve(value: IWhenable[T]): Unit = js.native
  }
  
  type IPromise[T] = js.Thenable[T]
  
  type IWhenable[T] = js.Thenable[T] | T
  
  @js.native
  trait PromiseState[T] extends StObject {
    
    var reason: js.UndefOr[js.Any] = js.native
    
    var state: fulfilled | rejected | pending = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  object PromiseState {
    
    @scala.inline
    def apply[T](state: fulfilled | rejected | pending): PromiseState[T] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseState[T]]
    }
    
    @scala.inline
    implicit class PromiseStateMutableBuilder[Self <: PromiseState[_], T] (val x: Self with PromiseState[T]) extends AnyVal {
      
      @scala.inline
      def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setState(value: fulfilled | rejected | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @JSImport("q", "try")
  @js.native
  def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
}
