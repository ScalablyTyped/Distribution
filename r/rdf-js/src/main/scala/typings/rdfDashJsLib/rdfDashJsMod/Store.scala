package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[Q /* <: BaseQuad */]
  extends Source[Quad]
     with Sink[Quad] {
  def deleteGraph(graph: java.lang.String): nodeLib.eventsMod.EventEmitter = js.native
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
  def deleteGraph_graph(graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any): nodeLib.eventsMod.EventEmitter = js.native
  /**
    * Removes all streamed quads.
    *
    * The end and error events are used like described in the Stream interface.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  def remove(stream: Stream[Q]): nodeLib.eventsMod.EventEmitter = js.native
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
  def removeMatches(): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: stdLib.RegExp, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: stdLib.RegExp, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: Term, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: Term, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: stdLib.RegExp, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: Term, predicate: stdLib.RegExp, `object`: stdLib.RegExp, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: Term, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: Term, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: stdLib.RegExp, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: Term, `object`: stdLib.RegExp, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: Term, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: Term, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: stdLib.RegExp, graph: Term): nodeLib.eventsMod.EventEmitter = js.native
  def removeMatches(subject: stdLib.RegExp, predicate: stdLib.RegExp, `object`: stdLib.RegExp, graph: stdLib.RegExp): nodeLib.eventsMod.EventEmitter = js.native
}

