package typings.rethinkdb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rethinkdb.rethinkdbStrings.`object`
import typings.rethinkdb.rethinkdbStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence
  extends StObject
     with Operation[Cursor]
     with Writeable {
  
  def between(lower: Any, upper: Any): Sequence = js.native
  def between(lower: Any, upper: Any, index: Index): Sequence = js.native
  
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
  def changes(opts: ChangesOptions): Sequence = js.native
  
  /**
    * Turn a sequence into an array or object, necessary when merging a sequence.
    *
    * See: https://www.rethinkdb.com/api/javascript/coerce_to/
    */
  @JSName("coerceTo")
  def coerceTo_array(key: array): Expression[js.Array[Any]] = js.native
  @JSName("coerceTo")
  def coerceTo_object(key: `object`): Expression[js.Object] = js.native
  
  def concatMap(transform: ExpressionFunction[Any]): Sequence = js.native
  
  // TODO: reduction object
  def contains(prop: String): Expression[Boolean] = js.native
  
  def count(): Expression[Double] = js.native
  
  def distinct(): Sequence = js.native
  def distinct(opts: typings.rethinkdb.anon.Index): Sequence = js.native
  
  def eqJoin(leftAttribute: String, rightSequence: Sequence): Sequence = js.native
  def eqJoin(leftAttribute: String, rightSequence: Sequence, index: Index): Sequence = js.native
  def eqJoin(leftAttribute: ExpressionFunction[Any], rightSequence: Sequence): Sequence = js.native
  def eqJoin(leftAttribute: ExpressionFunction[Any], rightSequence: Sequence, index: Index): Sequence = js.native
  
  def filter(obj: StringDictionary[Any]): Sequence = js.native
  def filter(rql: Expression[Boolean]): Sequence = js.native
  def filter(rql: ExpressionFunction[Boolean]): Sequence = js.native
  
  def getField(prop: String): Sequence = js.native
  
  def groupBy(aggregators: Aggregator*): Expression[js.Object] = js.native
  
  def groupedMapReduce(group: ExpressionFunction[Any], map: ExpressionFunction[Any], reduce: ReduceFunction[Any]): Sequence = js.native
  def groupedMapReduce(
    group: ExpressionFunction[Any],
    map: ExpressionFunction[Any],
    reduce: ReduceFunction[Any],
    base: Any
  ): Sequence = js.native
  
  def indexesOf(obj: Any): Sequence = js.native
  
  // Join
  // these return left, right
  def innerJoin(sequence: Sequence, join: JoinFunction[Boolean]): Sequence = js.native
  
  def isEmpty(): Expression[Boolean] = js.native
  
  def limit(n: Double): Sequence = js.native
  
  // Transform
  def map(transform: ExpressionFunction[Any]): Sequence = js.native
  
  def merge(cb: ExpressionFunction[Expression[Any]]): Sequence = js.native
  def merge(`object`: js.Object): Sequence = js.native
  
  def nth(n: Double): Expression[Any] = js.native
  
  def orderBy(keys: (Sort | String)*): Sequence = js.native
  
  def outerJoin(sequence: Sequence, join: JoinFunction[Boolean]): Sequence = js.native
  
  // Manipulation
  def pluck(props: String*): Sequence = js.native
  
  // Aggregate
  def reduce(r: ReduceFunction[Any]): Expression[Any] = js.native
  def reduce(r: ReduceFunction[Any], base: Any): Expression[Any] = js.native
  
  def sample(n: Double): Sequence = js.native
  
  def skip(n: Double): Sequence = js.native
  
  def slice(start: Double): Sequence = js.native
  def slice(start: Double, end: Double): Sequence = js.native
  
  def union(sequence: Sequence): Sequence = js.native
  
  def withFields(selectors: Any*): Sequence = js.native
  
  def without(props: String*): Sequence = js.native
  
  def zip(): Sequence = js.native
}
