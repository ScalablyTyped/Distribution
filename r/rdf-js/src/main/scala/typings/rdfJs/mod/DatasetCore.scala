package typings.rdfJs.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetCore[Q /* <: BaseQuad */] extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Q, _, js.UndefOr[scala.Nothing]]] = js.native
  /**
    * A non-negative integer that specifies the number of quads in the set.
    */
  val size: Double = js.native
  /**
    * Adds the specified quad to the dataset.
    *
    * Existing quads, as defined in `Quad.equals`, will be ignored.
    */
  def add(quad: Q): this.type = js.native
  /**
    * Removes the specified quad from the dataset.
    */
  def delete(quad: Q): this.type = js.native
  /**
    * Determines whether a dataset includes a certain quad.
    */
  def has(quad: Q): Boolean = js.native
  /**
    * Returns a new dataset that is comprised of all quads in the current instance matching the given arguments.
    *
    * The logic described in {@link https://rdf.js.org/dataset-spec/#quad-matching|Quad Matching} is applied for each
    * quad in this dataset to check if it should be included in the output dataset.
    *
    * This method always returns a new DatasetCore, even if that dataset contains no quads.
    *
    * Since a `DatasetCore` is an unordered set, the order of the quads within the returned sequence is arbitrary.
    *
    * @param subject   The optional exact subject to match.
    * @param predicate The optional exact predicate to match.
    * @param object    The optional exact object to match.
    * @param graph     The optional exact graph to match.
    */
  def `match`(): this.type = js.native
  def `match`(subject: Null, predicate: Null, `object`: Null, graph: Term): this.type = js.native
  def `match`(subject: Null, predicate: Null, `object`: Term): this.type = js.native
  def `match`(subject: Null, predicate: Null, `object`: Term, graph: Term): this.type = js.native
  def `match`(subject: Null, predicate: Term): this.type = js.native
  def `match`(subject: Null, predicate: Term, `object`: Null, graph: Term): this.type = js.native
  def `match`(subject: Null, predicate: Term, `object`: Term): this.type = js.native
  def `match`(subject: Null, predicate: Term, `object`: Term, graph: Term): this.type = js.native
  def `match`(subject: Term): this.type = js.native
  def `match`(subject: Term, predicate: Null, `object`: Null, graph: Term): this.type = js.native
  def `match`(subject: Term, predicate: Null, `object`: Term): this.type = js.native
  def `match`(subject: Term, predicate: Null, `object`: Term, graph: Term): this.type = js.native
  def `match`(subject: Term, predicate: Term): this.type = js.native
  def `match`(subject: Term, predicate: Term, `object`: Null, graph: Term): this.type = js.native
  def `match`(subject: Term, predicate: Term, `object`: Term): this.type = js.native
  def `match`(subject: Term, predicate: Term, `object`: Term, graph: Term): this.type = js.native
}

