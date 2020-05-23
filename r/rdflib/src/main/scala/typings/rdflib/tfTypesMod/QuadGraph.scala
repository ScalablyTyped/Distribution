package typings.rdflib.tfTypesMod

import typings.rdflib.rdflibStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdflib.tfTypesMod.NamedNode
  - typings.rdflib.tfTypesMod.DefaultGraph
  - typings.rdflib.tfTypesMod.BlankNode
  - typings.rdflib.tfTypesMod.Variable
*/
trait QuadGraph extends js.Object

object QuadGraph {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.NamedNode, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def DefaultGraph(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.DefaultGraph, value: _empty): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.BlankNode, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.Variable, value: String): QuadGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadGraph]
  }
}

