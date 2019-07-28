package typings.promise.promiseMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThenPromiseConstructor
  extends /**
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
  def denodeify(fn: js.Function): js.Function1[/* repeated */ js.Any, ThenPromise[_]] = js.native
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

