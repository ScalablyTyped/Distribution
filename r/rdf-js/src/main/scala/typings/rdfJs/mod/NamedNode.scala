package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNode[Iri /* <: String */] extends js.Object {
  /**
    * Contains the constant "NamedNode".
    */
  var termType: typings.rdfJs.rdfJsStrings.NamedNode = js.native
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  var value: Iri = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  def equals(): Boolean = js.native
  def equals(other: Term): Boolean = js.native
}

