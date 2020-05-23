package typings.rdfExt.anon

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.quadMod.QuadExt
import typings.rdfExt.rdfExtStrings.`object`
import typings.rdfExt.rdfExtStrings.graph
import typings.rdfExt.rdfExtStrings.predicate
import typings.rdfExt.rdfExtStrings.subject
import typings.rdfExt.rdfExtStrings.toJSON
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var graph: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.graph], toJSON]]
  var `object`: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.`object`], toJSON]]
  var predicate: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.predicate], toJSON]]
  var subject: ReturnType[PropType[PropType[QuadExt, typings.rdfExt.rdfExtStrings.subject], toJSON]]
}

object Graph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

