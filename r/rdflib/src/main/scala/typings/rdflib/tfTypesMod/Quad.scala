package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quad[S /* <: Term */, P /* <: Term */, O /* <: Term */, G /* <: Term */] extends js.Object {
  var graph: G
  var `object`: O
  var predicate: P
  var subject: S
  def equals(other: BaseQuad): Boolean
}

object Quad {
  @scala.inline
  def apply[S, P, O, G](equals: BaseQuad => Boolean, graph: G, `object`: O, predicate: P, subject: S): Quad[S, P, O, G] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quad[S, P, O, G]]
  }
}

