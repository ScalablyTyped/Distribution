package typings
package rdfDashJsLib.rdfDashJsMod

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

object Variable {
  @scala.inline
  def apply(
    equals: js.Function1[Term, scala.Boolean],
    termType: rdfDashJsLib.rdfDashJsLibStrings.Variable,
    value: java.lang.String
  ): Variable = {
    val __obj = js.Dynamic.literal(equals = equals, termType = termType, value = value)
  
    __obj.asInstanceOf[Variable]
  }
}

