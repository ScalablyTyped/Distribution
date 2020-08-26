package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQuad extends js.Object {
  var graph: Term = js.native
  var `object`: Term = js.native
  var predicate: Term = js.native
  var subject: Term = js.native
}

object BaseQuad {
  @scala.inline
  def apply(graph: Term, `object`: Term, predicate: Term, subject: Term): BaseQuad = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuad]
  }
  @scala.inline
  implicit class BaseQuadOps[Self <: BaseQuad] (val x: Self) extends AnyVal {
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
    def setGraph(value: Term): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Term): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: Term): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Term): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

