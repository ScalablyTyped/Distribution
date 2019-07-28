package typings.rdfDashJs.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable
  extends Quad_Graph
     with Quad_Object
     with Quad_Predicate
     with Quad_Subject
     with Term {
  /**
    * Contains the constant "Variable".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.Variable
  /**
    * The name of the variable *without* leading ? (example: a).
    */
  var value: String
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Variable" and the same `value`.
    */
  def equals(other: Term): Boolean
}

object Variable {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.Variable, value: String): Variable = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType, value = value)
  
    __obj.asInstanceOf[Variable]
  }
}

