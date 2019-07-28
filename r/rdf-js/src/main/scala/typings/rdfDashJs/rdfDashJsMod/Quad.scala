package typings.rdfDashJs.rdfDashJsMod

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
    equals: BaseQuad => Boolean,
    graph: Quad_Graph,
    `object`: Quad_Object,
    predicate: Quad_Predicate,
    subject: Quad_Subject
  ): Quad = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), graph = graph, predicate = predicate, subject = subject)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Quad]
  }
}

