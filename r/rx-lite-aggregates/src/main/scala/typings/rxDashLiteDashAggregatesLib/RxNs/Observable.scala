package typings
package rxDashLiteDashAggregatesLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def aggregate(accumulator: js.Function2[/* acc */ T, /* value */ T, T]): Observable[T] = js.native
  def aggregate[TAcc](seed: TAcc, accumulator: js.Function2[/* acc */ TAcc, /* value */ T, TAcc]): Observable[TAcc] = js.native
  def all(): Observable[scala.Boolean] = js.native
  def all(predicate: js.Function1[/* value */ T, scala.Boolean]): Observable[scala.Boolean] = js.native
  def all(predicate: js.Function1[/* value */ T, scala.Boolean], thisArg: js.Any): Observable[scala.Boolean] = js.native
  def any(): Observable[scala.Boolean] = js.native
  def any(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[scala.Boolean] = js.native
  def any(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[scala.Boolean] = js.native
  def average(): Observable[scala.Double] = js.native
  def average(
    keySelector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Double]
  ): Observable[scala.Double] = js.native
  def average(
    keySelector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Double],
    thisArg: js.Any
  ): Observable[scala.Double] = js.native
      // alias for all
  def contains(value: T): Observable[scala.Boolean] = js.native
  def contains[TOther](value: TOther, comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, scala.Boolean]): Observable[scala.Boolean] = js.native
  def count(): Observable[scala.Double] = js.native
  def count(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[scala.Double] = js.native
  def count(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[scala.Double] = js.native
  def elementAt(index: scala.Double): Observable[T] = js.native
  def every(): Observable[scala.Boolean] = js.native
  def every(predicate: js.Function1[/* value */ T, scala.Boolean]): Observable[scala.Boolean] = js.native
  def every(predicate: js.Function1[/* value */ T, scala.Boolean], thisArg: js.Any): Observable[scala.Boolean] = js.native
  def finalValue(): Observable[T] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def findIndex(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[scala.Double] = js.native
  def findIndex(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[scala.Double] = js.native
  def first(): Observable[T] = js.native
  def first(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def first(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
      // alias for any
  def isEmpty(): Observable[scala.Boolean] = js.native
  def last(): Observable[T] = js.native
  def last(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def last(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def max(): Observable[scala.Double] = js.native
  def max(comparer: js.Function2[/* value1 */ T, /* value2 */ T, scala.Double]): Observable[scala.Double] = js.native
  def maxBy(keySelector: js.Function1[/* item */ T, scala.Double]): Observable[T] = js.native
  def maxBy[TKey](
    keySelector: js.Function1[/* item */ T, TKey],
    comparer: js.Function2[/* value1 */ TKey, /* value2 */ TKey, scala.Double]
  ): Observable[T] = js.native
  def min(): Observable[T] = js.native
  def min(comparer: js.Function2[/* value1 */ T, /* value2 */ T, scala.Double]): Observable[T] = js.native
  def minBy(keySelector: js.Function1[/* item */ T, scala.Double]): Observable[T] = js.native
  def minBy[TKey](
    keySelector: js.Function1[/* item */ T, TKey],
    comparer: js.Function2[/* value1 */ TKey, /* value2 */ TKey, scala.Double]
  ): Observable[T] = js.native
  def reduce(accumulator: js.Function2[/* acc */ T, /* value */ T, T]): Observable[T] = js.native
  def reduce[TAcc](accumulator: js.Function2[/* acc */ TAcc, /* value */ T, TAcc], seed: TAcc): Observable[TAcc] = js.native
  def sequenceEqual(second: js.Array[T]): Observable[scala.Boolean] = js.native
  def sequenceEqual(second: rxDashCoreLib.RxNs.IPromise[T]): Observable[scala.Boolean] = js.native
  def sequenceEqual(second: Observable[T]): Observable[scala.Boolean] = js.native
  def sequenceEqual[TOther](
    second: js.Array[TOther],
    comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, scala.Double]
  ): Observable[scala.Boolean] = js.native
  def sequenceEqual[TOther](
    second: rxDashCoreLib.RxNs.IPromise[TOther],
    comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, scala.Double]
  ): Observable[scala.Boolean] = js.native
  def sequenceEqual[TOther](
    second: Observable[TOther],
    comparer: js.Function2[/* value1 */ T, /* value2 */ TOther, scala.Double]
  ): Observable[scala.Boolean] = js.native
  def single(): Observable[T] = js.native
  def single(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[T] = js.native
  def single(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[T] = js.native
  def some(): Observable[scala.Boolean] = js.native
  def some(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean]
  ): Observable[scala.Boolean] = js.native
  def some(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Boolean],
    thisArg: js.Any
  ): Observable[scala.Boolean] = js.native
  def sum(): Observable[scala.Double] = js.native
  def sum(
    keySelector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Double]
  ): Observable[scala.Double] = js.native
  def sum(
    keySelector: js.Function3[/* value */ T, /* index */ scala.Double, /* source */ Observable[T], scala.Double],
    thisArg: js.Any
  ): Observable[scala.Double] = js.native
}

