package typings.quadstore.mod

import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.quadstore.quadstoreStrings.graph
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.QuadGraph
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("quadstore", "RdfStore")
@js.native
class RdfStore[Q /* <: BaseQuad */] protected () extends quadstore[graph, Q, Term] {
  def this(abstractLevelDOWN: AbstractLevelDOWN[_, _], opts: js.Any) = this()
  
  def deleteGraph(graph: QuadGraph): EventEmitter = js.native
  
  def `match`(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
  
  def remove(source: ReadableStream): Unit = js.native
  def remove(source: ReadableStream, opts: js.Any): Unit = js.native
  
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): ReadableStream = js.native
}
