package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuad extends js.Object {
  /**
    * The named graph.
    * @see Quad_Graph
    */
  var graph: Term
  /**
    * The object.
    * @see Quad_Object
    */
  var `object`: Term
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  var predicate: Term
  /**
    * The subject.
    * @see Quad_Subject
    */
  var subject: Term
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  def equals(other: BaseQuad): scala.Boolean
}

object BaseQuad {
  @scala.inline
  def apply(
    equals: js.Function1[BaseQuad, scala.Boolean],
    graph: Term,
    `object`: Term,
    predicate: Term,
    subject: Term
  ): BaseQuad = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("predicate")(predicate)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[BaseQuad]
  }
}

