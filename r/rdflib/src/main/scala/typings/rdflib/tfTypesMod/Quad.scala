package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quad[S /* <: Term */, P /* <: Term */, O /* <: Term */, G /* <: Term */] extends js.Object {
  var graph: G = js.native
  var `object`: O = js.native
  var predicate: P = js.native
  var subject: S = js.native
  def equals(other: BaseQuad): Boolean = js.native
}

object Quad {
  @scala.inline
  def apply[/* <: typings.rdflib.tfTypesMod.Term */ S, /* <: typings.rdflib.tfTypesMod.Term */ P, /* <: typings.rdflib.tfTypesMod.Term */ O, /* <: typings.rdflib.tfTypesMod.Term */ G](equals: BaseQuad => Boolean, graph: G, `object`: O, predicate: P, subject: S): Quad[S, P, O, G] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quad[S, P, O, G]]
  }
  @scala.inline
  implicit class QuadOps[Self <: Quad[_, _, _, _], /* <: typings.rdflib.tfTypesMod.Term */ S, /* <: typings.rdflib.tfTypesMod.Term */ P, /* <: typings.rdflib.tfTypesMod.Term */ O, /* <: typings.rdflib.tfTypesMod.Term */ G] (val x: Self with (Quad[S, P, O, G])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquals(value: BaseQuad => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGraph(value: G): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: O): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: P): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: S): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

