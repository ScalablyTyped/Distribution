package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedNode extends js.Object {
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

