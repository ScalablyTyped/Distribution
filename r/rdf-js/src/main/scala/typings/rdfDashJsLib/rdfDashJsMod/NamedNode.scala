package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedNode
  extends Quad_Graph
     with Quad_Object
     with Quad_Predicate
     with Quad_Subject
     with Term {
  /**
    * Contains the constant "NamedNode".
    */
  var termType: rdfDashJsLib.rdfDashJsLibStrings.NamedNode
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  var value: java.lang.String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  def equals(other: Term): scala.Boolean
}

object NamedNode {
  @scala.inline
  def apply(
    equals: Term => scala.Boolean,
    termType: rdfDashJsLib.rdfDashJsLibStrings.NamedNode,
    value: java.lang.String
  ): NamedNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType, value = value)
  
    __obj.asInstanceOf[NamedNode]
  }
}

