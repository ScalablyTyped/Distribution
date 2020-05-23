package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdflib.tfTypesMod.NamedNode
  - typings.rdflib.tfTypesMod.BlankNode
  - typings.rdflib.tfTypesMod.Literal
  - typings.rdflib.tfTypesMod.Variable
  - typings.rdflib.tfTypesMod.Term
*/
trait QuadObject extends js.Object

object QuadObject {
  @scala.inline
  def Literal(
    datatype: NamedNode,
    equals: Term => Boolean,
    language: String,
    termType: typings.rdflib.rdflibStrings.Literal,
    value: String
  ): QuadObject = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.NamedNode, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.BlankNode, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  @scala.inline
  def Term(equals: typings.rdflib.tfTypesMod.Term => Boolean, termType: String, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.Variable, value: String): QuadObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadObject]
  }
}

