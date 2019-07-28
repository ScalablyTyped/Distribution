package typings.rdfDashJs.rdfDashJsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source[Q /* <: BaseQuad */] extends js.Object {
  /**
    * Returns a stream that processes all quads matching the pattern.
    *
    * @param subject   The optional exact subject or subject regex to match.
    * @param predicate The optional exact predicate or predicate regex to match.
    * @param object    The optional exact object or object regex to match.
    * @param graph     The optional exact graph or graph regex to match.
    * @return The resulting quad stream.
    */
  def `match`(): Stream[Q] = js.native
  def `match`(subject: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: Term, graph: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: Term, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: RegExp, graph: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: Term, `object`: RegExp, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: Term, graph: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: Term, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: RegExp): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: RegExp, graph: Term): Stream[Q] = js.native
  def `match`(subject: Term, predicate: RegExp, `object`: RegExp, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: Term, graph: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: Term, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: RegExp, graph: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: Term, `object`: RegExp, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: Term, graph: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: Term, graph: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: RegExp): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: RegExp, graph: Term): Stream[Q] = js.native
  def `match`(subject: RegExp, predicate: RegExp, `object`: RegExp, graph: RegExp): Stream[Q] = js.native
}

