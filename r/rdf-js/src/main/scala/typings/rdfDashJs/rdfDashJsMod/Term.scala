package typings.rdfDashJs.rdfDashJsMod

import typings.rdfDashJs.rdfDashJsStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdfDashJs.rdfDashJsMod.NamedNode
  - typings.rdfDashJs.rdfDashJsMod.BlankNode
  - typings.rdfDashJs.rdfDashJsMod.Literal
  - typings.rdfDashJs.rdfDashJsMod.Variable
  - typings.rdfDashJs.rdfDashJsMod.DefaultGraph
*/
trait Term extends js.Object

object Term {
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode, value: String): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode, value: String): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.Variable, value: String): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  def Literal(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typings.rdfDashJs.rdfDashJsStrings.Literal,
    value: String
  ): Term = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  def DefaultGraph(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph, value: Empty): Term = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Term]
  }
}

