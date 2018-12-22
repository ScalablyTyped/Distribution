package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequence
  extends Operation[Cursor]
     with Writeable {
  def between(lower: js.Any, upper: js.Any): Sequence = js.native
  def between(lower: js.Any, upper: js.Any, index: Index): Sequence = js.native
  /**
           * Turn a query into a changefeed, an infinite stream of objects representing
           * changes to the query’s results as they occur. A changefeed may return changes
           * to a table or an individual document (a “point” changefeed). Commands such as
           * filter or `map` may be used before the changes command to transform or filter
           * the output, and many commands that operate on sequences can be chained after
           * `changes`.
           *
           * See: https://rethinkdb.com/api/javascript/changes/
           */
  def changes(): Sequence = js.native
  /**
           * Turn a query into a changefeed, an infinite stream of objects representing
           * changes to the query’s results as they occur. A changefeed may return changes
           * to a table or an individual document (a “point” changefeed). Commands such as
           * filter or `map` may be used before the changes command to transform or filter
           * the output, and many commands that operate on sequences can be chained after
           * `changes`.
           *
           * See: https://rethinkdb.com/api/javascript/changes/
           */
  def changes(opts: ChangesOptions): Sequence = js.native
  /**
           * Turn a sequence into an array or object, necessary when merging a sequence.
           *
           * See: https://www.rethinkdb.com/api/javascript/coerce_to/
           */
  @JSName("coerceTo")
  def coerceTo_array(key: rethinkdbLib.rethinkdbLibStrings.array): Expression[js.Array[_]] = js.native
  @JSName("coerceTo")
  def coerceTo_object(key: rethinkdbLib.rethinkdbLibStrings.`object`): Expression[js.Object] = js.native
  def concatMap(transform: ExpressionFunction[_]): Sequence = js.native
   // TODO: reduction object
  def contains(prop: java.lang.String): Expression[scala.Boolean] = js.native
  def count(): Expression[scala.Double] = js.native
  def distinct(): Sequence = js.native
  def eqJoin(leftAttribute: java.lang.String, rightSequence: Sequence): Sequence = js.native
  def eqJoin(leftAttribute: java.lang.String, rightSequence: Sequence, index: Index): Sequence = js.native
  def eqJoin(leftAttribute: ExpressionFunction[_], rightSequence: Sequence): Sequence = js.native
  def eqJoin(leftAttribute: ExpressionFunction[_], rightSequence: Sequence, index: Index): Sequence = js.native
  def filter(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): Sequence = js.native
  def filter(rql: Expression[scala.Boolean]): Sequence = js.native
  def filter(rql: ExpressionFunction[scala.Boolean]): Sequence = js.native
  def getField(prop: java.lang.String): Sequence = js.native
  def groupBy(aggregators: Aggregator*): Expression[js.Object] = js.native
  def groupedMapReduce(group: ExpressionFunction[_], map: ExpressionFunction[_], reduce: ReduceFunction[_]): Sequence = js.native
  def groupedMapReduce(group: ExpressionFunction[_], map: ExpressionFunction[_], reduce: ReduceFunction[_], base: js.Any): Sequence = js.native
  def indexesOf(obj: js.Any): Sequence = js.native
  // Join
  // these return left, right
  def innerJoin(sequence: Sequence, join: JoinFunction[scala.Boolean]): Sequence = js.native
  def isEmpty(): Expression[scala.Boolean] = js.native
  def limit(n: scala.Double): Sequence = js.native
  // Transform
  def map(transform: ExpressionFunction[_]): Sequence = js.native
  def merge(cb: ExpressionFunction[Expression[_]]): Sequence = js.native
  def merge(`object`: js.Object): Sequence = js.native
  def nth(n: scala.Double): Expression[_] = js.native
  def orderBy(keys: (Sort | java.lang.String)*): Sequence = js.native
  def outerJoin(sequence: Sequence, join: JoinFunction[scala.Boolean]): Sequence = js.native
  // Manipulation
  def pluck(props: java.lang.String*): Sequence = js.native
  // Aggregate
  def reduce(r: ReduceFunction[_]): Expression[_] = js.native
  // Aggregate
  def reduce(r: ReduceFunction[_], base: js.Any): Expression[_] = js.native
  def sample(n: scala.Double): Sequence = js.native
  def skip(n: scala.Double): Sequence = js.native
  def slice(start: scala.Double): Sequence = js.native
  def slice(start: scala.Double, end: scala.Double): Sequence = js.native
  def union(sequence: Sequence): Sequence = js.native
  def withFields(selectors: js.Any*): Sequence = js.native
  def without(props: java.lang.String*): Sequence = js.native
  def zip(): Sequence = js.native
}

