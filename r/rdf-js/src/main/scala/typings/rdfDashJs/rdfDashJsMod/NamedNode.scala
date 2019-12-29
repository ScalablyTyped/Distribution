package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNode
  extends Quad_Graph
     with Quad_Object
     with Quad_Predicate
     with Quad_Subject
     with Term {
  /**
    * Contains the constant "NamedNode".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode = js.native
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  var value: String = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  def equals(other: Term): Boolean = js.native
}

