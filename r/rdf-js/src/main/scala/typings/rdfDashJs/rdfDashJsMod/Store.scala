package typings.rdfDashJs.rdfDashJsMod

import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[Q /* <: BaseQuad */]
  extends Source[Q]
     with Sink[Q] {
  def deleteGraph(graph: String): EventEmitter = js.native
  /**
    * Deletes the given named graph.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * @see Stream
    *
    * @param graph The graph term or string to match.
    * @return The resulting event emitter.
    */
  @JSName("deleteGraph")
  def deleteGraph_graph(graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any): EventEmitter = js.native
  /**
    * Removes all streamed quads.
    *
    * The end and error events are used like described in the Stream interface.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def remove(stream: Stream[Q]): EventEmitter = js.native
  /**
    * All quads matching the pattern will be removed.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * @see Stream
    *
    * @param subject   The optional exact subject or subject regex to match.
    * @param predicate The optional exact predicate or predicate regex to match.
    * @param object    The optional exact object or object regex to match.
    * @param graph     The optional exact graph or graph regex to match.
    * @return The resulting event emitter.
    */
  def removeMatches(): EventEmitter = js.native
  def removeMatches(subject: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: RegExp, graph: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: RegExp, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: Term, graph: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: Term, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: RegExp): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: RegExp, graph: Term): EventEmitter = js.native
  def removeMatches(subject: Term, predicate: RegExp, `object`: RegExp, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: Term, graph: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: Term, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: RegExp, graph: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: Term, `object`: RegExp, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: Term, graph: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: Term, graph: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: RegExp): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: RegExp, graph: Term): EventEmitter = js.native
  def removeMatches(subject: RegExp, predicate: RegExp, `object`: RegExp, graph: RegExp): EventEmitter = js.native
}

