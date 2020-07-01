package typings.reactCytoscapejs.anon

import typings.cytoscape.mod.ElementDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edges extends js.Object {
  var edges: js.Array[ElementDefinition]
  var nodes: js.Array[ElementDefinition]
}

object Edges {
  @scala.inline
  def apply(edges: js.Array[ElementDefinition], nodes: js.Array[ElementDefinition]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
}

