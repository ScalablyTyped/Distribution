package typings.rdfDashJs.rdfDashJsMod

import typings.rdfDashJs.rdfDashJsStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdfDashJs.rdfDashJsMod.DefaultGraph
  - typings.rdfDashJs.rdfDashJsMod.NamedNode
  - typings.rdfDashJs.rdfDashJsMod.BlankNode
  - typings.rdfDashJs.rdfDashJsMod.Variable
*/
trait Quad_Graph extends js.Object

object Quad_Graph {
  @scala.inline
  def DefaultGraph(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph, value: Empty): Quad_Graph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Graph]
  }
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode, value: String): Quad_Graph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Graph]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode, value: String): Quad_Graph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Graph]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.Variable, value: String): Quad_Graph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Graph]
  }
}

