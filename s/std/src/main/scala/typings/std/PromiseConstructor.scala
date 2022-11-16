package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait PromiseConstructor
  extends StObject
     with /**
  * Creates a new Promise.
  * @param executor A callback used to initialize the promise. This callback is passed two arguments:
  * a resolve callback used to resolve the promise with a value or the result of another promise,
  * and a reject callback used to reject the promise with a provided reason or error.
  */
/* standard es2015.promise */
Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      js.Promise[js.Object]
    ] {
  
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  /* standard es2015.promise */
  def all[T /* <: js.Array[Any] */](values: T): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.Awaited<T[P]>} */ js.Any
  ] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all of the provided Promises
    * resolve, or rejected when any Promise is rejected.
    * @param values An iterable of Promises.
    * @returns A new Promise.
    */
  /* standard es2015.iterable */
  def all[T](values: js.Iterable[T | PromiseLike[T]]): js.Promise[js.Array[Awaited[T]]] = js.native
  
  /**
    * Creates a Promise that is resolved with an array of results when all
    * of the provided Promises resolve or reject.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  /* standard es2020.promise */
  def allSettled[T /* <: js.Array[Any] */](values: T): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof T ]: std.PromiseSettledResult<std.Awaited<T[P]>>} */ js.Any
  ] = js.native
  /**
    * Creates a Promise that is resolved with an array of results when all
    * of the provided Promises resolve or reject.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  /* standard es2020.promise */
  def allSettled[T](values: js.Iterable[T | PromiseLike[T]]): js.Promise[js.Array[PromiseSettledResult[Awaited[T]]]] = js.native
  
  /**
    * The any function returns a promise that is fulfilled by the first given promise to be fulfilled, or rejected with an AggregateError containing an array of rejection reasons if all of the given promises are rejected. It resolves all elements of the passed iterable to promises as it runs this algorithm.
    * @param values An array or iterable of Promises.
    * @returns A new Promise.
    */
  /* standard es2021.promise */
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
  /* standard es2021.promise */
  def any[T](values: js.Iterable[T | PromiseLike[T]]): js.Promise[Awaited[T]] = js.native
  
  // see: lib.es2015.iterable.d.ts
  // all<T>(values: Iterable<T | PromiseLike<T>>): Promise<Awaited<T>[]>;
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An array of Promises.
    * @returns A new Promise.
    */
  /* standard es2015.promise */
  def race[T /* <: js.Array[Any] */](values: T): js.Promise[
    Awaited[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ] = js.native
  /**
    * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
    * or rejected.
    * @param values An iterable of Promises.
    * @returns A new Promise.
    */
  /* standard es2015.iterable */
  def race[T](values: js.Iterable[T | PromiseLike[T]]): js.Promise[Awaited[T]] = js.native
  
  // see: lib.es2015.iterable.d.ts
  // race<T>(values: Iterable<T | PromiseLike<T>>): Promise<Awaited<T>>;
  /**
    * Creates a new rejected promise for the provided reason.
    * @param reason The reason the promise was rejected.
    * @returns A new rejected Promise.
    */
  /* standard es2015.promise */
  def reject[T](): js.Promise[T] = js.native
  def reject[T](reason: Any): js.Promise[T] = js.native
  
  /**
    * Creates a new resolved promise.
    * @returns A resolved promise.
    */
  /* standard es2015.promise */
  def resolve(): js.Promise[Unit] = js.native
  /**
    * Creates a new resolved promise for the provided value.
    * @param value A promise.
    * @returns A promise whose internal state matches the provided promise.
    */
  /* standard es2015.promise */
  def resolve[T](value: T): js.Promise[Awaited[T]] = js.native
  def resolve[T](value: PromiseLike[T]): js.Promise[Awaited[T]] = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.species)
  val species: PromiseConstructor = js.native
}
