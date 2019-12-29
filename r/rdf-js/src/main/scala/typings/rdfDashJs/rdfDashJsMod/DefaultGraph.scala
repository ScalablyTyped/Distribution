package typings.rdfDashJs.rdfDashJsMod

import typings.rdfDashJs.rdfDashJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultGraph
  extends Quad_Graph
     with Term {
  /**
    * Contains the constant "DefaultGraph".
    */
  var termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph = js.native
  /**
    * Contains an empty string as constant value.
    */
  var value: _empty = js.native
  def equals(): Boolean = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  def equals(other: Term): Boolean = js.native
}

