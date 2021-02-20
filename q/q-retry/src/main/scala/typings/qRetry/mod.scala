package typings.qRetry

import typings.q.anon.Typeofq
import typings.q.mod.Deferred
import typings.q.mod.IPromise
import typings.q.mod.IWhenable
import typings.q.mod.Promise
import typings.q.mod.PromiseState
import typings.qRetry.mod.qAugmentingMod.IRetryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calling with nothing at all creates a void promise
    */
  @JSImport("q-retry", JSImport.Namespace)
  @js.native
  def apply(): Promise[Unit] = js.native
  @JSImport("q-retry", JSImport.Namespace)
  @js.native
  def apply[T](promise: T): Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  @JSImport("q-retry", JSImport.Namespace)
  @js.native
  def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
  
  @JSImport("q-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("q-retry", "Promise")
  @js.native
  def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, Unit], 
      Unit
    ]
  ): typings.q.mod.Promise[T] = js.native
  
  @JSImport("q-retry", "all")
  @js.native
  def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
  
  @JSImport("q-retry", "allResolved")
  @js.native
  def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
  
  @JSImport("q-retry", "allSettled")
  @js.native
  def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = js.native
  
  @JSImport("q-retry", "all")
  @js.native
  def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = js.native
  @JSImport("q-retry", "all")
  @js.native
  def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = js.native
  @JSImport("q-retry", "all")
  @js.native
  def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("q-retry", "all")
  @js.native
  def all_ABCDE[A, B, C, D, E](
    promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
  ): Promise[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("q-retry", "all")
  @js.native
  def all_ABCDEF[A, B, C, D, E, F](
    promises: IWhenable[
      js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
    ]
  ): Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @JSImport("q-retry", "async")
  @js.native
  def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q-retry", "defer")
  @js.native
  def defer[T](): Deferred[T] = js.native
  
  @JSImport("q-retry", "delay")
  @js.native
  def delay(ms: Double): Promise[Unit] = js.native
  @JSImport("q-retry", "delay")
  @js.native
  def delay[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
  @JSImport("q-retry", "delay")
  @js.native
  def delay[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
  
  @JSImport("q-retry", "denodeify")
  @js.native
  def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q-retry", "fbind")
  @js.native
  def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q-retry", "fcall")
  @js.native
  def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "invoke")
  @js.native
  def invoke[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "isFulfilled")
  @js.native
  def isFulfilled(promise: Promise[_]): Boolean = js.native
  
  @JSImport("q-retry", "isPending")
  @js.native
  def isPending(promiseOrObject: js.Any): Boolean = js.native
  @JSImport("q-retry", "isPending")
  @js.native
  def isPending(promiseOrObject: Promise[_]): Boolean = js.native
  
  @JSImport("q-retry", "isPromise")
  @js.native
  def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ Boolean = js.native
  
  @JSImport("q-retry", "isPromiseAlike")
  @js.native
  def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ Boolean = js.native
  
  @JSImport("q-retry", "isRejected")
  @js.native
  def isRejected(promise: Promise[_]): Boolean = js.native
  
  @JSImport("q-retry", "longStackSupport")
  @js.native
  def longStackSupport: Boolean = js.native
  @scala.inline
  def longStackSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longStackSupport")(x.asInstanceOf[js.Any])
  
  @JSImport("q-retry", "mcall")
  @js.native
  def mcall[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "nbind")
  @js.native
  def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q-retry", "nearer")
  @js.native
  def nearer[T](promise: Promise[T]): T = js.native
  
  @JSImport("q-retry", "nextTick")
  @js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSImport("q-retry", "nfapply")
  @js.native
  def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("q-retry", "nfbind")
  @js.native
  def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  @JSImport("q-retry", "nfcall")
  @js.native
  def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "ninvoke")
  @js.native
  def ninvoke[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "noConflict")
  @js.native
  def noConflict(): Typeofq = js.native
  
  @JSImport("q-retry", "npost")
  @js.native
  def npost[T](nodeModule: js.Any, functionName: String, args: js.Array[_]): Promise[T] = js.native
  
  @JSImport("q-retry", "nsend")
  @js.native
  def nsend[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "onerror")
  @js.native
  def onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
  @scala.inline
  def onerror_=(x: js.Function1[/* reason */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onerror")(x.asInstanceOf[js.Any])
  
  @JSImport("q-retry", "promised")
  @js.native
  def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  
  /* augmented module */
  object qAugmentingMod {
    
    @JSImport("q", "retry")
    @js.native
    def retry[U](process: js.Function0[IPromise[U] | U], limit: Double): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
    @JSImport("q", "retry")
    @js.native
    def retry[U](
      process: js.Function0[IPromise[U] | U],
      onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
      limit: Double
    ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
    @JSImport("q", "retry")
    @js.native
    def retry[U](
      process: js.Function0[IPromise[U] | U],
      onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
      options: js.UndefOr[IRetryOptions]
    ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
    @JSImport("q", "retry")
    @js.native
    def retry[U](process: js.Function0[IPromise[U] | U], options: js.UndefOr[IRetryOptions]): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
    
    @js.native
    trait IRetryOptions extends StObject {
      
      var interval: js.UndefOr[Double] = js.native
      
      var intervalMultiplier: js.UndefOr[Double] = js.native
      
      var limit: js.UndefOr[Double] = js.native
      
      var maxInterval: js.UndefOr[Double] = js.native
    }
    object IRetryOptions {
      
      @scala.inline
      def apply(): IRetryOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRetryOptions]
      }
      
      @scala.inline
      implicit class IRetryOptionsMutableBuilder[Self <: IRetryOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalMultiplier(value: Double): Self = StObject.set(x, "intervalMultiplier", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalMultiplierUndefined: Self = StObject.set(x, "intervalMultiplier", js.undefined)
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setMaxInterval(value: Double): Self = StObject.set(x, "maxInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxIntervalUndefined: Self = StObject.set(x, "maxInterval", js.undefined)
      }
    }
    
    @js.native
    trait Promise[T] extends StObject {
      
      def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U]): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
      def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], limit: Double): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
      def retry[U](
        process: js.Function1[/* value */ T, IPromise[U] | U],
        onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
      ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
      def retry[U](
        process: js.Function1[/* value */ T, IPromise[U] | U],
        onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
        limit: Double
      ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
      def retry[U](
        process: js.Function1[/* value */ T, IPromise[U] | U],
        onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
        options: IRetryOptions
      ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
      def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], options: IRetryOptions): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
    }
  }
  
  @JSImport("q-retry", "race")
  @js.native
  def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
  
  @JSImport("q-retry", "reject")
  @js.native
  def reject[T](): Promise[T] = js.native
  @JSImport("q-retry", "reject")
  @js.native
  def reject[T](reason: js.Any): Promise[T] = js.native
  
  @JSImport("q-retry", "resolve")
  @js.native
  def resolve[T](): Promise[T] = js.native
  @JSImport("q-retry", "resolve")
  @js.native
  def resolve[T](`object`: IWhenable[T]): Promise[T] = js.native
  
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](process: js.Function0[IPromise[U] | U]): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](process: js.Function0[IPromise[U] | U], limit: Double): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  @JSImport("q-retry", "retry")
  @js.native
  def retry[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  
  @JSImport("q-retry", "send")
  @js.native
  def send[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
  
  @JSImport("q-retry", "spread")
  @js.native
  def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("q-retry", "spread")
  @js.native
  def spread[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  
  @JSImport("q-retry", "timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double): Promise[T] = js.native
  @JSImport("q-retry", "timeout")
  @js.native
  def timeout[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
  
  @JSImport("q-retry", "when")
  @js.native
  def when(): Promise[Unit] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T](value: IWhenable[T]): Promise[T] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  @JSImport("q-retry", "when")
  @js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  
  @JSImport("q-retry", "try")
  @js.native
  def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
}
