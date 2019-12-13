package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset[Q /* <: BaseQuad */] extends DatasetCore[Q] {
  def addAll(quads: js.Array[Q]): this.type = js.native
  /**
    * Imports the quads into this dataset.
    *
    * This method differs from `Dataset.union` in that it adds all `quads` to the current instance, rather than
    * combining `quads` and the current instance to create a new instance.
    */
  def addAll(quads: Dataset[Q]): this.type = js.native
  /**
    * Returns `true` if the current instance is a superset of the given dataset; differently put: if the given dataset
    * is a subset of, is contained in the current dataset.
    *
    * Blank Nodes will be normalized.
    */
  def contains(other: Dataset[Q]): Boolean = js.native
  /**
    * This method removes the quads in the current instance that match the given arguments.
    *
    * The logic described in {@link https://rdf.js.org/dataset-spec/#quad-matching|Quad Matching} is applied for each
    * quad in this dataset to select the quads which will be deleted.
    *
    * @param subject   The optional exact subject to match.
    * @param predicate The optional exact predicate to match.
    * @param object    The optional exact object to match.
    * @param graph     The optional exact graph to match.
    */
  def deleteMatches(): this.type = js.native
  def deleteMatches(subject: Term): this.type = js.native
  def deleteMatches(subject: Term, predicate: Term): this.type = js.native
  def deleteMatches(subject: Term, predicate: Term, `object`: Term): this.type = js.native
  def deleteMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): this.type = js.native
  /**
    * Returns a new dataset that contains all quads from the current dataset, not included in the given dataset.
    */
  def difference(other: Dataset[Q]): this.type = js.native
  /**
    * Returns true if the current instance contains the same graph structure as the given dataset.
    *
    * Blank Nodes will be normalized.
    */
  def equals(other: Dataset[Q]): Boolean = js.native
  /**
    * Universal quantification method, tests whether every quad in the dataset passes the test implemented by the
    * provided `iteratee`.
    *
    * This method immediately returns boolean `false` once a quad that does not pass the test is found.
    *
    * This method always returns boolean `true` on an empty dataset.
    *
    * This method is aligned with `Array.prototype.every()` in ECMAScript-262.
    */
  def every(iteratee: QuadFilterIteratee[Q]): Boolean = js.native
  /**
    * Creates a new dataset with all the quads that pass the test implemented by the provided `iteratee`.
    *
    * This method is aligned with Array.prototype.filter() in ECMAScript-262.
    */
  def filter(iteratee: QuadFilterIteratee[Q]): this.type = js.native
  /**
    * Executes the provided `iteratee` once on each quad in the dataset.
    *
    * This method is aligned with `Array.prototype.forEach()` in ECMAScript-262.
    */
  def forEach(iteratee: QuadRunIteratee[Q]): Unit = js.native
  /**
    * Imports all quads from the given stream into the dataset.
    *
    * The stream events `end` and `error` are wrapped in a Promise.
    */
  def `import`(stream: Stream[Q]): js.Promise[this.type] = js.native
  /**
    * Returns a new dataset containing alls quads from the current dataset that are also included in the given dataset.
    */
  def intersection(other: Dataset[Q]): this.type = js.native
  /**
    * Returns a new dataset containing all quads returned by applying `iteratee` to each quad in the current dataset.
    */
  def map(iteratee: QuadMapIteratee[Q]): this.type = js.native
  /**
    * This method calls the `iteratee` on each `quad` of the `Dataset`. The first time the `iteratee` is called, the
    * `accumulator` value is the `initialValue` or, if not given, equals to the first quad of the `Dataset`. The return
    * value of the `iteratee` is used as `accumulator` value for the next calls.
    *
    * This method returns the return value of the last `iteratee` call.
    *
    * This method is aligned with `Array.prototype.reduce()` in ECMAScript-262.
    */
  def reduce[A](iteratee: QuadReduceIteratee[A, Q]): A = js.native
  def reduce[A](iteratee: QuadReduceIteratee[A, Q], initialValue: A): A = js.native
  /**
    * Existential quantification method, tests whether some quads in the dataset pass the test implemented by the
    * provided `iteratee`.
    *
    * This method immediately returns boolean `true` once a quad that passes the test is found.
    *
    * This method is aligned with `Array.prototype.some()` in ECMAScript-262.
    */
  def some(iteratee: QuadFilterIteratee[Q]): Boolean = js.native
  /**
    * Returns the set of quads within the dataset as a host language native sequence, for example an `Array` in
    * ECMAScript-262.
    *
    * Since a `Dataset` is an unordered set, the order of the quads within the returned sequence is arbitrary.
    */
  def toArray(): js.Array[Q] = js.native
  /**
    * Returns an N-Quads string representation of the dataset, preprocessed with
    * {@link https://json-ld.github.io/normalization/spec/|RDF Dataset Normalization} algorithm.
    */
  def toCanonical(): String = js.native
  /**
    * Returns a stream that contains all quads of the dataset.
    */
  def toStream(): Stream[Q] = js.native
  /**
    * Returns a new `Dataset` that is a concatenation of this dataset and the quads given as an argument.
    */
  def union(quads: Dataset[Q]): this.type = js.native
}

