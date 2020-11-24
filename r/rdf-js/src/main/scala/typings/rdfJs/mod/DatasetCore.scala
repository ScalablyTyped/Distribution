package typings.rdfJs.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetCore[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends js.Object {
  
  /**
    * Adds the specified quad to the dataset.
    *
    * Existing quads, as defined in `Quad.equals`, will be ignored.
    */
  def add(quad: InQuad): this.type = js.native
  
  /**
    * Removes the specified quad from the dataset.
    */
  def delete(quad: InQuad): this.type = js.native
  
  /**
    * Determines whether a dataset includes a certain quad.
    */
  def has(quad: InQuad): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[OutQuad, _, js.UndefOr[scala.Nothing]]] = js.native
  
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
  def `match`(
    subject: js.UndefOr[Term | Null],
    predicate: js.UndefOr[Term | Null],
    `object`: js.UndefOr[Term | Null],
    graph: js.UndefOr[Term | Null]
  ): DatasetCore[OutQuad, InQuad] = js.native
  
  /**
    * A non-negative integer that specifies the number of quads in the set.
    */
  val size: Double = js.native
}
