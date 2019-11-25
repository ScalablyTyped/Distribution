package typings.rdfDashJs.rdfDashJsMod

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
  var termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  var value: String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  def equals(other: Term): Boolean
}

object NamedNode {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode, value: String): NamedNode = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedNode]
  }
}

