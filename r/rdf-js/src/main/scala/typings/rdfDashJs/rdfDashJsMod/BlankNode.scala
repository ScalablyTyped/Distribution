package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlankNode
  extends Quad_Graph
     with Quad_Object
     with Quad_Subject
     with Term {
  /**
    * Contains the constant "BlankNode".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode
  /**
    * Blank node name as a string, without any serialization specific prefixes,
    * e.g. when parsing,
    * if the data was sourced from Turtle, remove _:,
    * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
    */
  var value: String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "BlankNode" and the same `value`.
    */
  def equals(other: Term): Boolean
}

object BlankNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode, value: String): BlankNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlankNode]
  }
}

