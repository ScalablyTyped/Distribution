package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable
  extends QuadGraph
     with QuadObject
     with QuadPredicate
     with QuadSubject
     with Term {
  /**
    * Contains the constant "Variable".
    */
  var termType: typings.rdfJs.rdfJsStrings.Variable = js.native
  /**
    * The name of the variable *without* leading ? (example: a).
    */
  var value: String = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Variable" and the same `value`.
    */
  def equals(other: Term): Boolean = js.native
}

