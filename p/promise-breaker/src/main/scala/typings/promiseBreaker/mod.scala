package typings.promiseBreaker

import org.scalablytyped.runtime.Shortcut
import typings.promiseBreaker.mod.PromiseBreaker.BrokenFn0
import typings.promiseBreaker.mod.PromiseBreaker.BrokenFn1
import typings.promiseBreaker.mod.PromiseBreaker.BrokenFn2
import typings.promiseBreaker.mod.PromiseBreaker.BrokenFn3
import typings.promiseBreaker.mod.PromiseBreaker.Callback
import typings.promiseBreaker.mod.PromiseBreaker.MakeBreakOptions
import typings.promiseBreaker.mod.PromiseBreaker.PromiseBreaker
import typings.std.PromiseConstructor
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-breaker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default extends Shortcut {
    
    @JSImport("promise-breaker", JSImport.Default)
    @js.native
    val ^ : PromiseBreaker = js.native
    
    type _To = PromiseBreaker
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: PromiseBreaker = ^
  }
  
  inline def addCallback[R](done: Null, promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addCallback[R](done: Null, promise: js.Promise[R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addCallback[R](done: Unit, promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addCallback[R](done: Unit, promise: js.Promise[R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addCallback[R](done: Callback[R], promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addCallback[R](done: Callback[R], promise: js.Promise[R]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(done.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def addPromise[R](done: Null, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPromise")(done.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addPromise[R](done: Unit, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPromise")(done.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def addPromise[R](done: Callback[R], asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPromise")(done.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  inline def apply(fn: js.Function): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def apply(fn: js.Function, thisArg: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(fn: js.Function, thisArg: Any, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def apply(fn: js.Function, thisArg: Any, args: js.Array[Any], done: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], args.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fn: js.Function, thisArg: Any, args: Unit, done: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], args.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fn: js.Function, thisArg: Unit, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def call(fn: js.Function, thisArg: Any, parameters: Any*): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")((scala.List(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).`++`(parameters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Any]]
  inline def call(fn: js.Function, thisArg: Unit, parameters: Any*): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")((scala.List(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).`++`(parameters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Any]]
  
  inline def callWithCb(fn: js.Function, thisArg: Any, parametersAndCallback: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithCb")((scala.List(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).`++`(parametersAndCallback.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def make[R](asyncFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(asyncFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, js.Promise[R]]]
  inline def make[R](options: MakeBreakOptions, asyncFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(options.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, js.Promise[R]]]
  inline def make[T1, R](asyncFn: js.Function2[/* p1 */ T1, /* cb */ Callback[R], Unit]): BrokenFn1[T1, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(asyncFn.asInstanceOf[js.Any]).asInstanceOf[BrokenFn1[T1, R]]
  inline def make[T1, R](options: MakeBreakOptions, asyncFn: js.Function2[/* p1 */ T1, /* cb */ Callback[R], Unit]): BrokenFn1[T1, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(options.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[BrokenFn1[T1, R]]
  inline def make[T1, T2, R](asyncFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* cb */ Callback[R], Unit]): BrokenFn2[T1, T2, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(asyncFn.asInstanceOf[js.Any]).asInstanceOf[BrokenFn2[T1, T2, R]]
  inline def make[T1, T2, R](
    options: MakeBreakOptions,
    asyncFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* cb */ Callback[R], Unit]
  ): BrokenFn2[T1, T2, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(options.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[BrokenFn2[T1, T2, R]]
  inline def make[T1, T2, T3, R](asyncFn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* cb */ Callback[R], Unit]): BrokenFn3[T1, T2, T3, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(asyncFn.asInstanceOf[js.Any]).asInstanceOf[BrokenFn3[T1, T2, T3, R]]
  inline def make[T1, T2, T3, R](
    options: MakeBreakOptions,
    asyncFn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* cb */ Callback[R], Unit]
  ): BrokenFn3[T1, T2, T3, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(options.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[BrokenFn3[T1, T2, T3, R]]
  
  inline def make_R_BrokenFn0[R](asyncFn: js.Function1[/* cb */ Callback[R], Unit]): BrokenFn0[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(asyncFn.asInstanceOf[js.Any]).asInstanceOf[BrokenFn0[R]]
  inline def make_R_BrokenFn0[R](options: MakeBreakOptions, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): BrokenFn0[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(options.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[BrokenFn0[R]]
  
  object PromiseBreaker {
    
    @js.native
    trait BrokenFn0[R] extends StObject {
      
      def apply(): js.Promise[R] = js.native
      def apply(cb: Callback[R]): Unit = js.native
    }
    
    @js.native
    trait BrokenFn1[T1, R] extends StObject {
      
      def apply(p1: T1): js.Promise[R] = js.native
      def apply(p1: T1, cb: Callback[R]): Unit = js.native
    }
    
    @js.native
    trait BrokenFn2[T1, T2, R] extends StObject {
      
      def apply(p1: T1, p2: T2): js.Promise[R] = js.native
      def apply(p1: T1, p2: T2, cb: Callback[R]): Unit = js.native
    }
    
    @js.native
    trait BrokenFn3[T1, T2, T3, R] extends StObject {
      
      def apply(p1: T1, p2: T2, p3: T3): js.Promise[R] = js.native
      def apply(p1: T1, p2: T2, p3: T3, cb: Callback[R]): Unit = js.native
    }
    
    type Callback[R] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[R], Unit]
    
    trait MakeBreakOptions extends StObject {
      
      var args: js.UndefOr[Double] = js.undefined
    }
    object MakeBreakOptions {
      
      inline def apply(): MakeBreakOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MakeBreakOptions]
      }
      
      extension [Self <: MakeBreakOptions](x: Self) {
        
        inline def setArgs(value: Double): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      }
    }
    
    @js.native
    trait PromiseBreaker
      extends StObject
         with PromiseBreakerInstance {
      
      def withPromise(promiseImpl: PromiseConstructor): typings.promiseBreaker.mod.PromiseBreaker.PromiseBreaker = js.native
    }
    
    @js.native
    trait PromiseBreakerInstance extends StObject {
      
      def addCallback[R](done: Null, promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = js.native
      def addCallback[R](done: Null, promise: js.Promise[R]): js.Promise[R] = js.native
      def addCallback[R](done: Unit, promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = js.native
      def addCallback[R](done: Unit, promise: js.Promise[R]): js.Promise[R] = js.native
      def addCallback[R](done: Callback[R], promise: js.Function0[js.Promise[R] | R]): js.Promise[R] = js.native
      def addCallback[R](done: Callback[R], promise: js.Promise[R]): js.Promise[R] = js.native
      
      def addPromise[R](done: Null, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = js.native
      def addPromise[R](done: Unit, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = js.native
      def addPromise[R](done: Callback[R], asyncFn: js.Function1[/* cb */ Callback[R], Unit]): js.Promise[R] = js.native
      
      @JSName("apply")
      def apply(fn: js.Function): js.Promise[Any] = js.native
      @JSName("apply")
      def apply(fn: js.Function, thisArg: Any): js.Promise[Any] = js.native
      @JSName("apply")
      def apply(fn: js.Function, thisArg: Any, args: js.Array[Any]): js.Promise[Any] = js.native
      @JSName("apply")
      def apply(fn: js.Function, thisArg: Any, args: js.Array[Any], done: js.Function): Unit = js.native
      @JSName("apply")
      def apply(fn: js.Function, thisArg: Any, args: Unit, done: js.Function): Unit = js.native
      @JSName("apply")
      def apply(fn: js.Function, thisArg: Unit, args: js.Array[Any]): js.Promise[Any] = js.native
      
      def break[R](options: MakeBreakOptions, promiseFn: js.Function0[PromiseLike[R]]): BrokenFn0[R] = js.native
      def break[R](options: MakeBreakOptions, promiseFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = js.native
      def break[R](promiseFn: js.Function0[PromiseLike[R]]): BrokenFn0[R] = js.native
      def break[R](promiseFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = js.native
      def break[T1, T2, R](options: MakeBreakOptions, promiseFn: js.Function2[/* p1 */ T1, /* p2 */ T2, PromiseLike[R]]): BrokenFn2[T1, T2, R] = js.native
      def break[T1, T2, R](promiseFn: js.Function2[/* p1 */ T1, /* p2 */ T2, PromiseLike[R]]): BrokenFn2[T1, T2, R] = js.native
      def break[T1, T2, T3, R](
        options: MakeBreakOptions,
        promiseFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, PromiseLike[R]]
      ): BrokenFn3[T1, T2, T3, R] = js.native
      def break[T1, T2, T3, R](promiseFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, PromiseLike[R]]): BrokenFn3[T1, T2, T3, R] = js.native
      @JSName("break")
      def break_T1R_BrokenFn1[T1, R](options: MakeBreakOptions, promiseFn: js.Function1[/* p1 */ T1, PromiseLike[R]]): BrokenFn1[T1, R] = js.native
      @JSName("break")
      def break_T1R_BrokenFn1[T1, R](promiseFn: js.Function1[/* p1 */ T1, PromiseLike[R]]): BrokenFn1[T1, R] = js.native
      
      def call(fn: js.Function, thisArg: Any, parameters: Any*): js.Promise[Any] = js.native
      def call(fn: js.Function, thisArg: Unit, parameters: Any*): js.Promise[Any] = js.native
      
      def callWithCb(fn: js.Function, thisArg: Any, parametersAndCallback: Any*): Unit = js.native
      
      def make[R](asyncFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = js.native
      def make[R](options: MakeBreakOptions, asyncFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, js.Promise[R]] = js.native
      def make[T1, R](asyncFn: js.Function2[/* p1 */ T1, /* cb */ Callback[R], Unit]): BrokenFn1[T1, R] = js.native
      def make[T1, R](options: MakeBreakOptions, asyncFn: js.Function2[/* p1 */ T1, /* cb */ Callback[R], Unit]): BrokenFn1[T1, R] = js.native
      def make[T1, T2, R](asyncFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* cb */ Callback[R], Unit]): BrokenFn2[T1, T2, R] = js.native
      def make[T1, T2, R](
        options: MakeBreakOptions,
        asyncFn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* cb */ Callback[R], Unit]
      ): BrokenFn2[T1, T2, R] = js.native
      def make[T1, T2, T3, R](asyncFn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* cb */ Callback[R], Unit]): BrokenFn3[T1, T2, T3, R] = js.native
      def make[T1, T2, T3, R](
        options: MakeBreakOptions,
        asyncFn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* cb */ Callback[R], Unit]
      ): BrokenFn3[T1, T2, T3, R] = js.native
      @JSName("make")
      def make_R_BrokenFn0[R](asyncFn: js.Function1[/* cb */ Callback[R], Unit]): BrokenFn0[R] = js.native
      @JSName("make")
      def make_R_BrokenFn0[R](options: MakeBreakOptions, asyncFn: js.Function1[/* cb */ Callback[R], Unit]): BrokenFn0[R] = js.native
    }
  }
}
