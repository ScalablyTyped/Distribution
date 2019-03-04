package typings
package rdfDashJsLib.rdfDashJsMod

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
  var termType: rdfDashJsLib.rdfDashJsLibStrings.BlankNode
  /**
    * Blank node name as a string, without any serialization specific prefixes,
    * e.g. when parsing,
    * if the data was sourced from Turtle, remove _:,
    * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
    */
  var value: java.lang.String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "BlankNode" and the same `value`.
    */
  def equals(other: Term): scala.Boolean
}

object BlankNode {
  @scala.inline
  def apply(
    equals: js.Function1[Term, scala.Boolean],
    termType: rdfDashJsLib.rdfDashJsLibStrings.BlankNode,
    value: java.lang.String
  ): BlankNode = {
    val __obj = js.Dynamic.literal(equals = equals, termType = termType, value = value)
  
    __obj.asInstanceOf[BlankNode]
  }
}

