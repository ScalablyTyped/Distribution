package typings.rxDashLiteDashAggregates

import typings.rxDashCore.Rx.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  @js.native
  trait Observable[T] extends js.Object {
    def aggregate(accumulator: js.Function2[/* acc */ T, /* value */ T, T]): Observable[T] = js.native
    def aggregate[TAcc](seed: TAcc, accumulator: js.Function2[/* acc */ TAcc, /* value */ T, TAcc]): Observable[TAcc] = js.native
    def all(): Observable[Boolean] = js.native
    def all(predicate: js.Function1[/* value */ T, Boolean]): Observable[Boolean] = js.native
    def all(predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Observable[Boolean] = js.native
    def any(): Observable[Boolean] = js.native
    def any(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[Boolean] = js.native
    def any(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[Boolean] = js.native
    def average(): Observable[Double] = js.native
    def average(keySelector: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Double]): Observable[Double] = js.native
    def average(
      keySelector: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Double],
      thisArg: js.Any
    ): Observable[Double] = js.native
        // alias for all
    def contains(value: T): Observable[Boolean] = js.native
    def contains[TOther](value: TOther, comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, Boolean]): Observable[Boolean] = js.native
    def count(): Observable[Double] = js.native
    def count(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[Double] = js.native
    def count(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[Double] = js.native
    def elementAt(index: Double): Observable[T] = js.native
    def every(): Observable[Boolean] = js.native
    def every(predicate: js.Function1[/* value */ T, Boolean]): Observable[Boolean] = js.native
    def every(predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Observable[Boolean] = js.native
    def finalValue(): Observable[T] = js.native
    def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[T] = js.native
    def find(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[T] = js.native
    def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[Double] = js.native
    def findIndex(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[Double] = js.native
    def first(): Observable[T] = js.native
    def first(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[T] = js.native
    def first(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[T] = js.native
        // alias for any
    def isEmpty(): Observable[Boolean] = js.native
    def last(): Observable[T] = js.native
    def last(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[T] = js.native
    def last(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[T] = js.native
    def max(): Observable[Double] = js.native
    def max(comparer: js.Function2[/* value1 */ T, /* value2 */ T, Double]): Observable[Double] = js.native
    def maxBy(keySelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
    def maxBy[TKey](
      keySelector: js.Function1[/* item */ T, TKey],
      comparer: js.Function2[/* value1 */ TKey, /* value2 */ TKey, Double]
    ): Observable[T] = js.native
    def min(): Observable[T] = js.native
    def min(comparer: js.Function2[/* value1 */ T, /* value2 */ T, Double]): Observable[T] = js.native
    def minBy(keySelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
    def minBy[TKey](
      keySelector: js.Function1[/* item */ T, TKey],
      comparer: js.Function2[/* value1 */ TKey, /* value2 */ TKey, Double]
    ): Observable[T] = js.native
    def reduce(accumulator: js.Function2[/* acc */ T, /* value */ T, T]): Observable[T] = js.native
    def reduce[TAcc](accumulator: js.Function2[/* acc */ TAcc, /* value */ T, TAcc], seed: TAcc): Observable[TAcc] = js.native
    def sequenceEqual(second: js.Array[T]): Observable[Boolean] = js.native
    def sequenceEqual(second: IPromise[T]): Observable[Boolean] = js.native
    def sequenceEqual(second: Observable[T]): Observable[Boolean] = js.native
    def sequenceEqual[TOther](second: js.Array[TOther], comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, Double]): Observable[Boolean] = js.native
    def sequenceEqual[TOther](second: IPromise[TOther], comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, Double]): Observable[Boolean] = js.native
    def sequenceEqual[TOther](second: Observable[TOther], comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, Double]): Observable[Boolean] = js.native
    def single(): Observable[T] = js.native
    def single(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[T] = js.native
    def single(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[T] = js.native
    def some(): Observable[Boolean] = js.native
    def some(predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): Observable[Boolean] = js.native
    def some(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      thisArg: js.Any
    ): Observable[Boolean] = js.native
    def sum(): Observable[Double] = js.native
    def sum(keySelector: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Double]): Observable[Double] = js.native
    def sum(
      keySelector: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Double],
      thisArg: js.Any
    ): Observable[Double] = js.native
  }
  
}

