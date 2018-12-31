package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /**
    * Contains the constant "Variable".
    */
  var termType: rdfDashJsLib.rdfDashJsLibStrings.Variable
  /**
    * The name of the variable *without* leading ? (example: a).
    */
  var value: java.lang.String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Variable" and the same `value`.
    */
  def equals(other: Term): scala.Boolean
}

