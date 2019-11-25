package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdfDashJs.rdfDashJsMod.NamedNode
  - typings.rdfDashJs.rdfDashJsMod.BlankNode
  - typings.rdfDashJs.rdfDashJsMod.Variable
*/
trait Quad_Subject extends js.Object

object Quad_Subject {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode, value: String): Quad_Subject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Subject]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode, value: String): Quad_Subject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Subject]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.Variable, value: String): Quad_Subject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Subject]
  }
}

