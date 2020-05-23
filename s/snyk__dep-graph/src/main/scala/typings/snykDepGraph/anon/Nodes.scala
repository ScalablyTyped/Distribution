package typings.snykDepGraph.anon

import typings.snykDepGraph.typesMod.GraphNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodes extends js.Object {
  var nodes: js.Array[GraphNode]
  var rootNodeId: String
}

object Nodes {
  @scala.inline
  def apply(nodes: js.Array[GraphNode], rootNodeId: String): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootNodeId = rootNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
}

