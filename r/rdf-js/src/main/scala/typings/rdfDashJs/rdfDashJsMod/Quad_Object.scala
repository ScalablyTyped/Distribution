package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdfDashJs.rdfDashJsMod.NamedNode
  - typings.rdfDashJs.rdfDashJsMod.Literal
  - typings.rdfDashJs.rdfDashJsMod.BlankNode
  - typings.rdfDashJs.rdfDashJsMod.Variable
*/
trait Quad_Object extends js.Object

object Quad_Object {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode, value: String): Quad_Object = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Object]
  }
  @scala.inline
  def Literal(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typings.rdfDashJs.rdfDashJsStrings.Literal,
    value: String
  ): Quad_Object = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Object]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode, value: String): Quad_Object = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Object]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.Variable, value: String): Quad_Object = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Quad_Object]
  }
}

