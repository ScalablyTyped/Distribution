package typings.promise

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
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
  class Class[T] protected ()
    extends StObject
       with ThenPromise[T] {
    /**
      * Creates a new ThenPromise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            js.Any
          ]) = this()
  }
  
  /**
    * Represents the completion of an asynchronous operation
    */
  @js.native
  trait ThenPromise[T] extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the ThenPromise.
      * @param onrejected The callback to execute when the ThenPromise is rejected.
      * @returns A ThenPromise for the completion of the callback.
      */
    def `catch`[TResult](): ThenPromise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]]): ThenPromise[T | TResult] = js.native
    
    // Extensions specific to then/promise
    /**
      * Attaches callbacks for the resolution and/or rejection of the ThenPromise, without returning a new promise.
      * @param onfulfilled The callback to execute when the ThenPromise is resolved.
      * @param onrejected The callback to execute when the ThenPromise is rejected.
      */
    def done(): Unit = js.native
    def done(onfulfilled: js.Function1[/* value */ T, js.Any]): Unit = js.native
    def done(
      onfulfilled: js.Function1[/* value */ T, js.Any],
      onrejected: js.Function1[/* reason */ js.Any, js.Any]
    ): Unit = js.native
    def done(onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, js.Any]): Unit = js.native
    def done(onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, js.Any]): Unit = js.native
    
    /**
      * Calls a node.js style callback.  If none is provided, the promise is returned.
      */
    def nodeify(): ThenPromise[T] = js.native
    def nodeify(callback: js.Function2[/* err */ Error, /* value */ T, Unit]): Unit = js.native
    def nodeify(callback: Unit): ThenPromise[T] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the ThenPromise.
      * @param onfulfilled The callback to execute when the ThenPromise is resolved.
      * @param onrejected The callback to execute when the ThenPromise is rejected.
      * @returns A ThenPromise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): ThenPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]]): ThenPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]
    ): ThenPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): ThenPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): ThenPromise[TResult1 | TResult2] = js.native
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
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | Thenable[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            js.Any
          ], 
          ThenPromise[js.Object]
        ] {
    
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T](values: js.Array[T | Thenable[T]]): ThenPromise[js.Array[T]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2](values: js.Tuple2[T1 | Thenable[T1], T2 | Thenable[T2]]): ThenPromise[js.Tuple2[T1, T2]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3](values: js.Tuple3[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3]]): ThenPromise[js.Tuple3[T1, T2, T3]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4](values: js.Tuple4[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3], T4 | Thenable[T4]]): ThenPromise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /**
      * Creates a ThenPromise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any ThenPromise is rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9], 
          T10 | Thenable[T10]
        ]
    ): ThenPromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    // Extensions specific to then/promise
    def denodeify(fn: js.Function): js.Function1[/* repeated */ js.Any, ThenPromise[js.Any]] = js.native
    
    def nodeify(fn: js.Function): js.Function = js.native
    
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T](values: js.Array[T | Thenable[T]]): ThenPromise[T] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2](values: js.Tuple2[T1 | Thenable[T1], T2 | Thenable[T2]]): ThenPromise[T1 | T2] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3](values: js.Tuple3[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3]]): ThenPromise[T1 | T2 | T3] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4](values: js.Tuple4[T1 | Thenable[T1], T2 | Thenable[T2], T3 | Thenable[T3], T4 | Thenable[T4]]): ThenPromise[T1 | T2 | T3 | T4] = js.native
    /**
      * Creates a ThenPromise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new ThenPromise.
      */
    def race[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9]
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
          T1 | Thenable[T1], 
          T2 | Thenable[T2], 
          T3 | Thenable[T3], 
          T4 | Thenable[T4], 
          T5 | Thenable[T5], 
          T6 | Thenable[T6], 
          T7 | Thenable[T7], 
          T8 | Thenable[T8], 
          T9 | Thenable[T9], 
          T10 | Thenable[T10]
        ]
    ): ThenPromise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected ThenPromise.
      */
    def reject(reason: js.Any): ThenPromise[scala.Nothing] = js.native
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected ThenPromise.
      */
    @JSName("reject")
    def reject_T[T](reason: js.Any): ThenPromise[T] = js.native
    
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
    def resolve[T](value: Thenable[T]): ThenPromise[T] = js.native
  }
  
  @js.native
  trait Thenable[T] extends StObject {
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the ThenPromise.
      * @param onfulfilled The callback to execute when the ThenPromise is resolved.
      * @param onrejected The callback to execute when the ThenPromise is rejected.
      * @returns A ThenPromise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): Thenable[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]]): Thenable[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]
    ): Thenable[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): Thenable[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): Thenable[TResult1 | TResult2] = js.native
  }
  
  type _To = ThenPromiseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ThenPromiseConstructor = ^
}
