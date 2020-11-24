package typings.q

import typings.q.mod.Deferred
import typings.q.mod.IPromise
import typings.q.mod.IWhenable
import typings.q.mod.Promise
import typings.q.mod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Typeofq extends js.Object {
    
    /**
      * Calling with nothing at all creates a void promise
      */
    def apply(): Promise[Unit] = js.native
    def apply[T](promise: T): Promise[T] = js.native
    /**
      * If value is a Q promise, returns the promise.
      * If value is a promise from another library it is coerced into a Q promise (where possible).
      * If value is not a promise, returns a promise that is fulfilled with value.
      */
    def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
    
    def Promise[T](
      resolver: js.Function3[
          /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
          /* notify */ js.Function1[/* progress */ js.Any, Unit], 
          Unit
        ]
    ): typings.q.mod.Promise[T] = js.native
    
    def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
    
    def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
    
    def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = js.native
    
    @JSName("all")
    def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = js.native
    @JSName("all")
    def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = js.native
    @JSName("all")
    def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = js.native
    @JSName("all")
    def all_ABCDE[A, B, C, D, E](
      promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
    ): Promise[js.Tuple5[A, B, C, D, E]] = js.native
    @JSName("all")
    def all_ABCDEF[A, B, C, D, E, F](
      promises: IWhenable[
          js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
        ]
    ): Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
    
    def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def defer[T](): Deferred[T] = js.native
    
    def delay(ms: Double): Promise[Unit] = js.native
    def delay[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
    def delay[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
    
    def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
    
    def invoke[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
    
    def isFulfilled(promise: Promise[_]): Boolean = js.native
    
    def isPending(promiseOrObject: js.Any): Boolean = js.native
    def isPending(promiseOrObject: Promise[_]): Boolean = js.native
    
    def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ Boolean = js.native
    
    def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ Boolean = js.native
    
    def isRejected(promise: Promise[_]): Boolean = js.native
    
    var longStackSupport: Boolean = js.native
    
    def mcall[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
    
    def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def nearer[T](promise: Promise[T]): T = js.native
    
    def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    
    def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): Promise[T] = js.native
    
    def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
    
    def ninvoke[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
    
    def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Q */ js.Any = js.native
    
    def npost[T](nodeModule: js.Any, functionName: String, args: js.Array[_]): Promise[T] = js.native
    
    def nsend[T](nodeModule: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
    
    def onerror(reason: js.Any): Unit = js.native
    @JSName("onerror")
    var onerror_Original: js.Function1[/* reason */ js.Any, Unit] = js.native
    
    def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
    
    def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
    
    def reject[T](): Promise[T] = js.native
    def reject[T](reason: js.Any): Promise[T] = js.native
    
    def resolve[T](): Promise[T] = js.native
    def resolve[T](`object`: IWhenable[T]): Promise[T] = js.native
    
    def send[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
    
    def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
    def spread[T, U](
      promises: js.Array[IWhenable[T]],
      onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
      onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
    ): Promise[U] = js.native
    
    def timeout[T](promise: Promise[T], ms: Double): Promise[T] = js.native
    def timeout[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
    
    def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
    
    def when(): Promise[Unit] = js.native
    def when[T](value: IWhenable[T]): Promise[T] = js.native
    def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
    def when[T, U](
      value: IWhenable[T],
      onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
      onRejected: js.UndefOr[scala.Nothing],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
    def when[T, U](
      value: IWhenable[T],
      onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
      onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
    ): Promise[U] = js.native
    def when[T, U](
      value: IWhenable[T],
      onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
      onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
    def when[T, U](
      value: IWhenable[T],
      onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
      onRejected: Null,
      onProgress: js.Function1[/* progress */ js.Any, _]
    ): Promise[U] = js.native
  }
}
