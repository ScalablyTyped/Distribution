package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rdflib.tfTypesMod.NamedNode
  - typings.rdflib.tfTypesMod.BlankNode
  - typings.rdflib.tfTypesMod.Variable
*/
trait QuadSubject extends js.Object

object QuadSubject {
  @scala.inline
  def NamedNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.NamedNode, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
  @scala.inline
  def BlankNode(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.BlankNode, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
  @scala.inline
  def Variable(equals: Term => Boolean, termType: typings.rdflib.rdflibStrings.Variable, value: String): QuadSubject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadSubject]
  }
}

