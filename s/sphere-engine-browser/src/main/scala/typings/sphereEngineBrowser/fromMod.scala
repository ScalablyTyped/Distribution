package typings.sphereEngineBrowser

import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromMod {
  
  @JSImport("from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a new query for the elements of one or more arrays or other iterable objects.
    * @param sources One or more arrays or iterable objects to query.
    */
  inline def default[T](sources: js.Iterable[T]*): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Query[T]]
  
  /**
    * Represents a sequence of values with optional query transformations applied. Queries can be
    * enumerated using `for..of` or additional query operations can be chained to produce a new
    * query.
    */
  @JSImport("from", "Query")
  @js.native
  open class Query[T] ()
    extends StObject
       with Iterable[T] {
    
    def aggregate[R](reducer: js.Function2[/* accumulator */ R, /* value */ T, R], seed: R): R = js.native
    
    /**
      * Run the query and check if every result satisfies the given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      * @returns `true` if all results match, `false` if not. `true` in case of an empty query.
      */
    def all(predicate: js.Function1[/* value */ T, Boolean]): Boolean = js.native
    
    /**
      * Run the query and check if every result is one of a fixed set of values.
      * @param values An `Iterable` containing the allowed values.
      * @returns `true` if all results match, `false` if not. `true` in case of an empty query.
      */
    def allIn(values: js.Iterable[T]): Boolean = js.native
    
    /**
      * Run the query and check if at least one result satisfies the given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      * @returns `true` if any result matches, `false` if not. `false` in case of an empty query.
      */
    def any(predicate: js.Function1[/* value */ T, Boolean]): Boolean = js.native
    
    /**
      * Run the query and check if at least one result is one of a fixed set of values.
      * @param values An `Iterable` containing the set of values to match.
      * @returns `true` if any result matches, `false` if not. `false` in case of an empty query.
      */
    def anyIn(values: js.Iterable[T]): Boolean = js.native
    
    /**
      * Run the query and check if at least one result is equal to a specific value.
      * @param value The value or object reference to match.
      * @returns `true` if any result matches, `false` if not. `false` in case of an empty query.
      */
    def anyIs(value: T): Boolean = js.native
    
    /**
      * Extend the query with a sorting operation that sorts the values in ascending order
      * according to the result of calling a key-selection function for each value.
      * @param keySelector A key selector function. It takes a query result and returns a string,
      *                    a number, or a Boolean value to be used as a key for sorting.
      */
    def ascending(): Query[T] = js.native
    def ascending(keySelector: js.Function1[/* value */ T, String | Double | Boolean]): Query[T] = js.native
    
    /**
      * Extend the query with an operation that calls a user-supplied function for each result
      * before passing it on as-is.
      * @param iteratee A callback function. It takes a query result as input and its return
      *                 value is ignored.
      */
    def besides(iteratee: js.Function1[/* value */ T, Unit]): Query[T] = js.native
    
    /**
      * Extend the query by appending the elements of one or more `Iterable` objects to the
      * results.
      * @param sources One or more `Iterable`s whose contents will be appended.
      * @return A new query for the transformed sequence.
      */
    def concat(sources: js.Iterable[T]*): Query[T] = js.native
    
    /**
      * Run the query and count the number of results it produces.
      * @returns The number of values produced by the query.
      */
    def count(): Double = js.native
    
    /**
      * Run the query and count the number of results per unique string key.
      * @param keySelector A key selector function. It takes a query result and returns a string
      *                    to be used as a key for grouping.
      * @returns An object with properties corresponding to each key. The value of each property
      *          is the number of results with that key.
      */
    def countBy(keySelector: js.Function1[/* value */ T, String]): Record[String, Double] = js.native
    
    /**
      * Extend the query with a sorting operation that sorts the values in descending order
      * according to the result of calling a key-selection function for each value.
      * @param keySelector A key selector function. It takes a query result and returns a string,
      *                    a number, or a Boolean value to be used as a key for sorting.
      */
    def descending(): Query[T] = js.native
    def descending(keySelector: js.Function1[/* value */ T, String | Double | Boolean]): Query[T] = js.native
    
    def distinct(): Query[T] = js.native
    def distinct(predicate: js.Function1[/* value */ T, String]): Query[T] = js.native
    
    /**
      * Run the query and get the query result at a given position in the sequence.
      * @param index Position within the sequence, starting at 0.
      * @returns The value at the given position if present; `undefined` if the index exceeds the
      *          number of results.
      */
    def elementAt(index: Double): js.UndefOr[T] = js.native
    
    /**
      * Run the query and get the first result that satisfies the given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      */
    def first(): js.UndefOr[T] = js.native
    def first(predicate: js.Function1[/* value */ T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Run the query and call a function for each result.
      * @param iteratee A callback function. It takes a query result as input and its return
      *                 value is ignored.
      */
    def forEach(iteratee: js.Function1[/* value */ T, Unit]): Unit = js.native
    
    def groupBy(keySelector: js.Function1[/* value */ T, String]): Record[String, js.Array[T]] = js.native
    
    def join[U, R](
      joinSource: js.Iterable[U],
      predicate: js.Function2[/* left */ T, /* right */ U, Boolean],
      selector: js.Function2[/* left */ T, /* right */ U, R]
    ): Query[R] = js.native
    
    /**
      * Run the query and get the last result that satisfies the given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      */
    def last(): js.UndefOr[T] = js.native
    def last(predicate: js.Function1[/* value */ T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Run the query and get a new query for the values produced. Memoized queries always return
      * the same results, even if the original source is modified.
      * @returns A new query for the memoized sequence.
      */
    def memoize(): Query[T] = js.native
    
    /**
      * Extend the query with an operation that appends additional values to the query results.
      * @param values Value(s) to inject into the query.
      */
    def plus(values: T*): Query[T] = js.native
    
    /**
      * Remove all values from the original array source found in the given list of values.
      * @param values The value(s) to be removed.
      * @throws If the query is memoized, has a non-array source, or any transformation happened
      *         before `pull`, throws a `TypeError`.
      */
    def pull(values: T*): Unit = js.native
    
    /**
      * Extend the query with a sampling operation that takes a given number of random results.
      * Unlike `sample`, this can select the same result more than once.
      * @param count Number of random results to take.
      * @returns A new query for the sampled sequence.
      */
    def random(count: Double): Query[T] = js.native
    
    /**
      * Remove all values from the original array source that satisfy a given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      * @throws If the query is memoized, has a non-array source, or any transformation happened
      *         before `remove`, a `TypeError` will be thrown.
      */
    def remove(predicate: js.Function1[/* value */ T, Boolean]): Unit = js.native
    
    /**
      * Extend the query with a reversal operation that passes results through last-to-first.
      * @returns A new query for the inverted sequence.
      */
    def reverse(): Query[T] = js.native
    
    /**
      * Extend the query with a sampling operation that takes a given number of equal-probability
      * random samples from the results.
      * @param count Number of samples to take.
      * @returns A new query for the sampled sequence.
      */
    def sample(count: Double): Query[T] = js.native
    
    /**
      * Extend the query with a mapping operation that transforms values using a selector
      * function.
      * @param selector A selector function. It takes a query result and returns a new value.
      * @returns A new query for the transformed results.
      */
    def select[R](selector: js.Function1[/* value */ T, R]): Query[R] = js.native
    
    /**
      * Extend the query with a mapping operation that maps each incoming result to a list of
      * new values.
      * @param selector A selector function. It takes a query result and returns an array of new
      *                 values.
      * @returns A new query for the transformed results.
      */
    def selectMany[R](selector: js.Function1[/* value */ T, js.Iterable[R]]): Query[R] = js.native
    
    /**
      * Extend the query with a randomizing operation that passes through results in a random
      * order using a Fisher-Yates shuffle.
      * @returns A new query for the randomized sequence.
      */
    def shuffle(): Query[T] = js.native
    
    /**
      * Run the query and get the single result that satisfies the given predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      * @returns The matching value, if there is one; otherwise, `undefined`.
      * @throws An `Error` is thrown if more than one match is found.
      */
    def single(): js.UndefOr[T] = js.native
    def single(predicate: js.Function1[/* value */ T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Extend the query with a filtering operation that discards a given number of results at
      * the beginning of the sequence.
      * @param count The number of results to discard.
      */
    def skip(count: Double): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that discards a given number of results at
      * the end of the sequence.
      * @param count The number of results to discard.
      */
    def skipLast(count: Double): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that discards results until the first time a
      * given predicate function is not satisifed.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      */
    def skipWhile(predicate: js.Function1[/* value */ T, Boolean]): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that keeps only a finite number of results
      * from the beginning of the sequence.
      * @param count The number of results to keep.
      */
    def take(count: Double): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that keeps only a finite number of results
      * from the end of the sequence.
      * @param count The number of results to keep.
      */
    def takeLast(count: Double): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that discards all results after the first
      * time a given predicate function is not satisfied.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      */
    def takeWhile(predicate: js.Function1[/* value */ T, Boolean]): Query[T] = js.native
    
    /**
      * Extend the query with an operation that collects all incoming results into an array and
      * produces a new list of values.
      * @param transform A transformer function that takes an array of all results and returns an
      *                  iterable for the new set of results.
      */
    def thru[R](transform: js.Function1[/* values */ js.Array[T], js.Iterable[R]]): Query[R] = js.native
    
    /**
      * Run the query and get an array of the results produced.
      */
    def toArray(): js.Array[T] = js.native
    
    def update(selector: js.Function1[/* value */ T, String]): Unit = js.native
    
    /**
      * Extend the query with a filter operation that keeps only those values satisfying a given
      * predicate function.
      * @param predicate A Boolean predicate function. It takes a query result and returns `true`
      *                  if the value matches, or `false` if it doesn't.
      * @returns A new query for the filtered results.
      */
    def where(predicate: js.Function1[/* value */ T, Boolean]): Query[T] = js.native
    
    /**
      * Extend the query with a filtering operation that removes all results found in a fixed set
      * of values.
      * @param values Array of values to exclude.
      */
    def without(values: T*): Query[T] = js.native
    
    def zip[U](zipSource: js.Iterable[U]): Query[js.Tuple2[T, U]] = js.native
    def zip[U, R](zipSource: js.Iterable[U], selector: js.Function2[/* left */ T, /* right */ U, R]): Query[R] = js.native
  }
}
