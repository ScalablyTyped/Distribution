package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlankNode
  extends Quad_Graph
     with Quad_Object
     with Quad_Subject
     with Term {
  /**
    * Contains the constant "BlankNode".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode = js.native
  /**
    * Blank node name as a string, without any serialization specific prefixes,
    * e.g. when parsing,
    * if the data was sourced from Turtle, remove _:,
    * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
    */
  var value: String = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "BlankNode" and the same `value`.
    */
  def equals(other: Term): Boolean = js.native
}

