package typings.rdfDashExt

import typings.rdfDashExt.libQuadMod.QuadExt
import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.`object`
import typings.rdfDashExt.rdfDashExtStrings.graph
import typings.rdfDashExt.rdfDashExtStrings.predicate
import typings.rdfDashExt.rdfDashExtStrings.subject
import typings.rdfDashExt.rdfDashExtStrings.toJSON
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Graph extends js.Object {
  var graph: ReturnType[PropType[PropType[QuadExt, typings.rdfDashExt.rdfDashExtStrings.graph], toJSON]]
  var `object`: ReturnType[
    PropType[PropType[QuadExt, typings.rdfDashExt.rdfDashExtStrings.`object`], toJSON]
  ]
  var predicate: ReturnType[
    PropType[PropType[QuadExt, typings.rdfDashExt.rdfDashExtStrings.predicate], toJSON]
  ]
  var subject: ReturnType[
    PropType[PropType[QuadExt, typings.rdfDashExt.rdfDashExtStrings.subject], toJSON]
  ]
}

object Anon_Graph {
  @scala.inline
  def apply(
    graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
    `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
    predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
    subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
  ): Anon_Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Graph]
  }
}

