package typings.promise

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.promise.promiseStrings.fulfilled
import typings.promise.promiseStrings.rejected
import typings.std.Awaited
import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("promise", JSImport.Namespace)
  @js.native
  val ^ : ThenPromiseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("promise", JSImport.Namespace)
  @js.native
  open class Class[T] protected ()
    extends StObject
       with ThenPromise[T] {
    /**
      * Creates a new ThenPromise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Any
          ]) = this()
  }
  
  trait PromiseFulfilledResult[T]
    extends StObject
       with PromiseSettledResult[T] {
    
    var status: fulfilled
    
    var value: T
  }
  object PromiseFulfilledResult {
    
    inline def apply[T](value: T): PromiseFulfilledResult[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseFulfilledResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseFulfilledResult[?], T] (val x: Self & PromiseFulfilledResult[T]) extends AnyVal {
      
      inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseRejectedResult
    extends StObject
       with PromiseSettledResult[Any] {
    
    var reason: Any
    
    var status: rejected
  }
  object PromiseRejectedResult {
    
    inline def apply(reason: Any): PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[PromiseRejectedResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.promise.mod.PromiseFulfilledResult[T]
    - typings.promise.mod.PromiseRejectedResult
  */
  trait PromiseSettledResult[T] extends StObject
  object PromiseSettledResult {
    
    inline def PromiseFulfilledResult[T](value: T): typings.promise.mod.PromiseFulfilledResult[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.promise.mod.PromiseFulfilledResult[T]]
    }
    
    inline def PromiseRejectedResult(reason: Any): typings.promise.mod.PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.promise.mod.PromiseRejectedResult]
    }
  }
  
  @js.native
  trait ThenPromise[T]
    extends StObject
       with Promise[T] {
    
    // Extensions specific to then/promise
    /**
      * Attaches callbacks for the resolution and/or rejection of the ThenPromise, without returning a new promise.
      * @param onfulfilled The callback to execute when the ThenPromise is resolved.
      * @param onrejected The callback to execute when the ThenPromise is rejected.
      */
    def done(): Unit = js.native
    def done(onfulfilled: js.Function1[/* value */ T, Any]): Unit = js.native
    def done(onfulfilled: js.Function1[/* value */ T, Any], onrejected: js.Function1[/* reason */ Any, Any]): Unit = js.native
    def done(onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, Any]): Unit = js.native
    def done(onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, Any]): Unit = js.native
    
    /**
      * Calls a node.js style callback.  If none is provided, the promise is returned.
      */
    def nodeify(): ThenPromise[T] = js.native
    def nodeify(callback: js.Function2[/* err */ js.Error, /* value */ T, Unit]): Unit = js.native
    def nodeify(callback: Unit): ThenPromise[T] = js.native
  }
  
  @js.native
  trait ThenPromiseConstructor
    extends StObject
       with /**
    * Creates a new ThenPromise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Any
          ], 
          ThenPromise[js.Object]
        ] {
    
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T](values: js.Array[T | PromiseLike[T]]): ThenPromise[js.Array[T]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): ThenPromise[js.Tuple2[T1, T2]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): ThenPromise[js.Tuple3[T1, T2, T3]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4](
      values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
    ): ThenPromise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5]
        ]
    ): ThenPromise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6]
        ]
    ): ThenPromise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7]
        ]
    ): ThenPromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8]
        ]
    ): ThenPromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9]
        ]
    ): ThenPromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9], 
          T10 | PromiseLike[T10]
        ]
    ): ThenPromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T](values: js.Array[T | PromiseLike[T]]): ThenPromise[js.Array[PromiseSettledResult[T]]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): ThenPromise[js.Tuple2[PromiseSettledResult[T1], PromiseSettledResult[T2]]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): ThenPromise[
        js.Tuple3[PromiseSettledResult[T1], PromiseSettledResult[T2], PromiseSettledResult[T3]]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4](
      values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
    ): ThenPromise[
        js.Tuple4[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5]
        ]
    ): ThenPromise[
        js.Tuple5[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6]
        ]
    ): ThenPromise[
        js.Tuple6[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5], 
          PromiseSettledResult[T6]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7]
        ]
    ): ThenPromise[
        js.Tuple7[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5], 
          PromiseSettledResult[T6], 
          PromiseSettledResult[T7]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8]
        ]
    ): ThenPromise[
        js.Tuple8[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5], 
          PromiseSettledResult[T6], 
          PromiseSettledResult[T7], 
          PromiseSettledResult[T8]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9]
        ]
    ): ThenPromise[
        js.Tuple9[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5], 
          PromiseSettledResult[T6], 
          PromiseSettledResult[T7], 
          PromiseSettledResult[T8], 
          PromiseSettledResult[T9]
        ]
      ] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all
      * of the provided Promises resolve or reject.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9], 
          T10 | PromiseLike[T10]
        ]
    ): ThenPromise[
        js.Tuple10[
          PromiseSettledResult[T1], 
          PromiseSettledResult[T2], 
          PromiseSettledResult[T3], 
          PromiseSettledResult[T4], 
          PromiseSettledResult[T5], 
          PromiseSettledResult[T6], 
          PromiseSettledResult[T7], 
          PromiseSettledResult[T8], 
          PromiseSettledResult[T9], 
          PromiseSettledResult[T10]
        ]
      ] = js.native
    
    /**
      * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
      * @param values An array or iterable of Promises.
      * @returns A new Promise.
      */
    def any[T /* <: js.Array[Any] */](values: T): js.Promise[
        Awaited[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ] = js.native
    /**
      * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
      * @param values An array or iterable of Promises.
      * @returns A new Promise.
      */
    def any[T](values: js.Iterable[T | PromiseLike[T]]): js.Promise[Awaited[T]] = js.native
    
    // Extensions specific to then/promise
    def denodeify(fn: js.Function): js.Function1[/* repeated */ Any, ThenPromise[Any]] = js.native
    
    def nodeify(fn: js.Function): js.Function = js.native
    
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T](values: js.Array[T | PromiseLike[T]]): ThenPromise[T] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): ThenPromise[T1 | T2] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): ThenPromise[T1 | T2 | T3] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4](
      values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
    ): ThenPromise[T1 | T2 | T3 | T4] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | PromiseLike[T1], 
          T2 | PromiseLike[T2], 
          T3 | PromiseLike[T3], 
          T4 | PromiseLike[T4], 
          T5 | PromiseLike[T5], 
          T6 | PromiseLike[T6], 
          T7 | PromiseLike[T7], 
          T8 | PromiseLike[T8], 
          T9 | PromiseLike[T9], 
          T10 | PromiseLike[T10]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected ThenPromise.
      */
    def reject(reason: Any): ThenPromise[scala.Nothing] = js.native
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected ThenPromise.
      */
    @JSName("reject")
    def reject_T[T](reason: Any): ThenPromise[T] = js.native
    
    /**
      * Creates a new resolved promise .
      * @returns A resolved promise.
      */
    def resolve(): ThenPromise[Unit] = js.native
    /**
      * Creates a new resolved promise for the provided value.
      * @param value A promise.
      * @returns A promise whose internal state matches the provided promise.
      */
    def resolve[T](value: T): ThenPromise[T] = js.native
    def resolve[T](value: PromiseLike[T]): ThenPromise[T] = js.native
  }
  
  type _To = ThenPromiseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ThenPromiseConstructor = ^
}
