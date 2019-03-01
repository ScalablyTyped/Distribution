package typings
package rdfDashJsLib.rdfDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quad extends BaseQuad {
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: Quad_Graph
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: Quad_Object
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: Quad_Predicate
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: Quad_Subject
}

object Quad {
  @scala.inline
  def apply(
    equals: js.Function1[BaseQuad, scala.Boolean],
    graph: Quad_Graph,
    `object`: Quad_Object,
    predicate: Quad_Predicate,
    subject: Quad_Subject
  ): Quad = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("predicate")(predicate)
    __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Quad]
  }
}

