package typings
package streamjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stream")
@js.native
class Stream[T] () extends js.Object {
  def allMatch(predicate: streamjsLib.StreamNs.Predicate[T]): scala.Boolean = js.native
  def allMatch(regexp: stdLib.RegExp): scala.Boolean = js.native
  def allMatch(sample: streamjsLib.StreamNs.Sample): scala.Boolean = js.native
  def anyMatch(predicate: streamjsLib.StreamNs.Predicate[T]): scala.Boolean = js.native
  def anyMatch(regexp: stdLib.RegExp): scala.Boolean = js.native
  def anyMatch(sample: streamjsLib.StreamNs.Sample): scala.Boolean = js.native
  def average(): scala.Double = js.native
  def average(path: java.lang.String): scala.Double = js.native
  def avg(): scala.Double = js.native
  def avg(path: java.lang.String): scala.Double = js.native
  def collect(collector: streamjsLib.StreamNs.Collector[T]): T = js.native
  def count(): scala.Double = js.native
  def distinct(): Stream[T] = js.native
  def dropWhile(predicate: streamjsLib.StreamNs.Predicate[T]): Stream[T] = js.native
  def dropWhile(regexp: stdLib.RegExp): Stream[java.lang.String] = js.native
  def dropWhile(sample: streamjsLib.StreamNs.Sample): Stream[T] = js.native
  def each(consumer: streamjsLib.StreamNs.Consumer[T]): scala.Unit = js.native
  def filter(predicate: streamjsLib.StreamNs.Predicate[T]): Stream[T] = js.native
  def filter(regexp: stdLib.RegExp): Stream[java.lang.String] = js.native
  def filter(sample: streamjsLib.StreamNs.Sample): Stream[T] = js.native
  def findAny(): streamjsLib.StreamNs.Optional[T] = js.native
  def findFirst(): streamjsLib.StreamNs.Optional[T] = js.native
  def flatMap[U](mapper: streamjsLib.StreamNs.Function[T, js.Array[U]]): Stream[U] = js.native
  def forEach(consumer: streamjsLib.StreamNs.Consumer[T]): scala.Unit = js.native
  def groupBy(mapper: streamjsLib.StreamNs.Function[T, java.lang.String]): streamjsLib.StreamNs.GroupingResult[T] = js.native
  def groupBy(path: java.lang.String): streamjsLib.StreamNs.GroupingResult[T] = js.native
  def groupingBy(mapper: streamjsLib.StreamNs.Function[T, java.lang.String]): streamjsLib.StreamNs.GroupingResult[T] = js.native
  def groupingBy(path: java.lang.String): streamjsLib.StreamNs.GroupingResult[T] = js.native
  def indexBy(keyMapper: streamjsLib.StreamNs.Function[T, java.lang.String]): streamjsLib.StreamNs.Map[T] = js.native
  def indexBy(
    keyMapper: streamjsLib.StreamNs.Function[T, java.lang.String],
    mergeFunction: streamjsLib.StreamNs.Accumulator[T]
  ): streamjsLib.StreamNs.Map[T] = js.native
  def iterator(): streamjsLib.StreamNs.Iterator[T] = js.native
  def join(): java.lang.String = js.native
  def join(delimiter: java.lang.String): java.lang.String = js.native
  def join(options: streamjsLib.StreamNs.JoinOptions): java.lang.String = js.native
  def joining(): java.lang.String = js.native
  def joining(delimiter: java.lang.String): java.lang.String = js.native
  def joining(options: streamjsLib.StreamNs.JoinOptions): java.lang.String = js.native
  def limit(limit: scala.Double): Stream[T] = js.native
  def map[U](mapper: streamjsLib.StreamNs.Function[T, U]): Stream[U] = js.native
  def max(): streamjsLib.StreamNs.Optional[T] = js.native
  def max(comparator: streamjsLib.StreamNs.Comparator[T]): streamjsLib.StreamNs.Optional[T] = js.native
  def max(path: java.lang.String): streamjsLib.StreamNs.Optional[T] = js.native
  def min(): streamjsLib.StreamNs.Optional[T] = js.native
  def min(comparator: streamjsLib.StreamNs.Comparator[T]): streamjsLib.StreamNs.Optional[T] = js.native
  def min(path: java.lang.String): streamjsLib.StreamNs.Optional[T] = js.native
  def noneMatch(predicate: js.Function1[/* elem */ T, scala.Boolean]): scala.Boolean = js.native
  def noneMatch(regexp: stdLib.RegExp): scala.Boolean = js.native
  def partitionBy(predicate: streamjsLib.StreamNs.Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitionBy(regexp: stdLib.RegExp): js.Array[js.Array[T]] = js.native
  def partitionBy(sample: streamjsLib.StreamNs.Sample): js.Array[js.Array[T]] = js.native
  def partitionBy(size: scala.Double): js.Array[js.Array[T]] = js.native
  def partitioningBy(predicate: streamjsLib.StreamNs.Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitioningBy(regexp: stdLib.RegExp): js.Array[js.Array[T]] = js.native
  def partitioningBy(sample: streamjsLib.StreamNs.Sample): js.Array[js.Array[T]] = js.native
  def partitioningBy(size: scala.Double): js.Array[js.Array[T]] = js.native
  def peek(consumer: streamjsLib.StreamNs.Consumer[T]): Stream[T] = js.native
  def reduce(accumulator: streamjsLib.StreamNs.Accumulator[T]): streamjsLib.StreamNs.Optional[T] = js.native
  def reduce(identity: T, accumulator: streamjsLib.StreamNs.Accumulator[T]): T = js.native
  def reverse(): Stream[T] = js.native
  def shuffle(): Stream[T] = js.native
  def size(): scala.Double = js.native
  def skip(n: scala.Double): Stream[T] = js.native
  def slice(begin: scala.Double, end: scala.Double): Stream[T] = js.native
  def sort(): Stream[T] = js.native
  def sort(comparator: streamjsLib.StreamNs.Comparator[T]): Stream[T] = js.native
  def sort(path: java.lang.String): Stream[T] = js.native
  def sorted(): Stream[T] = js.native
  def sorted(comparator: streamjsLib.StreamNs.Comparator[T]): Stream[T] = js.native
  def sorted(path: java.lang.String): Stream[T] = js.native
  def sum(): scala.Double = js.native
  def sum(path: java.lang.String): scala.Double = js.native
  def takeWhile(predicate: streamjsLib.StreamNs.Predicate[T]): Stream[T] = js.native
  def takeWhile(regexp: stdLib.RegExp): Stream[java.lang.String] = js.native
  def takeWhile(sample: streamjsLib.StreamNs.Sample): Stream[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toList(): js.Array[T] = js.native
  def toMap(keyMapper: streamjsLib.StreamNs.Function[T, java.lang.String]): streamjsLib.StreamNs.Map[T] = js.native
  def toMap(
    keyMapper: streamjsLib.StreamNs.Function[T, java.lang.String],
    mergeFunction: streamjsLib.StreamNs.Accumulator[T]
  ): streamjsLib.StreamNs.Map[T] = js.native
  def toMap(path: java.lang.String): streamjsLib.StreamNs.Map[T] = js.native
  def toMap(path: java.lang.String, mergeFunction: streamjsLib.StreamNs.Accumulator[T]): streamjsLib.StreamNs.Map[T] = js.native
}

/* static members */
@JSGlobal("Stream")
@js.native
object Stream extends js.Object {
  def from(str: java.lang.String): streamjsLib.Stream[java.lang.String] = js.native
  def from[T](elems: js.Array[T]): streamjsLib.Stream[T] = js.native
  def generate[T](supplier: streamjsLib.StreamNs.Supplier[T]): streamjsLib.Stream[T] = js.native
  def iterate[T](seed: T, fn: streamjsLib.StreamNs.Function[T, T]): streamjsLib.Stream[T] = js.native
  def of[T](elems: T*): streamjsLib.Stream[T] = js.native
  def range(startInclusive: scala.Double, endExclusive: scala.Double): streamjsLib.Stream[scala.Double] = js.native
  def rangeClosed(startInclusive: scala.Double, endInclusive: scala.Double): streamjsLib.Stream[scala.Double] = js.native
}

