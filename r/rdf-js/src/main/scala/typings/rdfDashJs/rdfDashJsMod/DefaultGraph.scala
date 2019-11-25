package typings.rdfDashJs.rdfDashJsMod

import typings.rdfDashJs.rdfDashJsStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultGraph
  extends Quad_Graph
     with Term {
  /**
    * Contains the constant "DefaultGraph".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph
  /**
    * Contains an empty string as constant value.
    */
  var value: Empty
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  def equals(other: Term): Boolean
}

object DefaultGraph {
  @scala.inline
  def apply(equals: Term => Boolean, termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph, value: Empty): DefaultGraph = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultGraph]
  }
}

