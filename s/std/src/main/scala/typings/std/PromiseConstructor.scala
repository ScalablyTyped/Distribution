package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseConstructor
  extends /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used to resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      js.Promise[js.Object]
    ] {
  @JSName(scala.scalajs.js.Symbol.species)
  val species: PromiseConstructor = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[TAll](values: Iterable[TAll | js.Thenable[TAll]]): js.Promise[js.Array[TAll]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7]
    ]
  ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8]
    ]
  ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9]
    ]
  ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9], 
      T10 | js.Thenable[T10]
    ]
  ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  def race[T](values: js.Array[T]): js.Promise[T] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An iterable of Promises.
    * @returns A new Promise.
    */
  def race[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  def reject[T](): js.Promise[T] = js.native
  def reject[T](reason: js.Any): js.Promise[T] = js.native
  /**
    * Creates a new resolved promise .
    * @returns A resolved promise.
    */
  def resolve(): js.Promise[Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  def resolve[T](value: T): js.Promise[T] = js.native
  def resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
}

