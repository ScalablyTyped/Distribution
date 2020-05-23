package typings.rdflib.tfTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuad extends js.Object {
  var graph: Term
  var `object`: Term
  var predicate: Term
  var subject: Term
}

object BaseQuad {
  @scala.inline
  def apply(graph: Term, `object`: Term, predicate: Term, subject: Term): BaseQuad = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuad]
  }
}

