package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultGraph
  extends Quad_Graph
     with Term {
  /**
    * Contains the constant "DefaultGraph".
    */
  var termType: rdfDashJsLib.rdfDashJsLibStrings.DefaultGraph
  /**
    * Contains an empty string as constant value.
    */
  var value: rdfDashJsLib.rdfDashJsLibStrings.Empty
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  def equals(other: Term): scala.Boolean
}

object DefaultGraph {
  @scala.inline
  def apply(
    equals: js.Function1[Term, scala.Boolean],
    termType: rdfDashJsLib.rdfDashJsLibStrings.DefaultGraph,
    value: rdfDashJsLib.rdfDashJsLibStrings.Empty
  ): DefaultGraph = {
    val __obj = js.Dynamic.literal(equals = equals, termType = termType, value = value)
  
    __obj.asInstanceOf[DefaultGraph]
  }
}

