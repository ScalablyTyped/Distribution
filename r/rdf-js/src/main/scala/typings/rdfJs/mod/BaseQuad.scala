package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQuad extends js.Object {
  /**
    * The named graph.
    * @see Quad_Graph
    */
  var graph: Term = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  var `object`: Term = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  var predicate: Term = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  var subject: Term = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  def equals(): Boolean = js.native
  def equals(other: BaseQuad): Boolean = js.native
}

