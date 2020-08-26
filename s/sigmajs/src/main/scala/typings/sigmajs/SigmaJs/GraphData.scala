package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphData extends js.Object {
  var edges: js.Array[Edge] = js.native
  var nodes: js.Array[Node] = js.native
}

object GraphData {
  @scala.inline
  def apply(edges: js.Array[Edge], nodes: js.Array[Node]): GraphData = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphData]
  }
  @scala.inline
  implicit class GraphDataOps[Self <: GraphData] (val x: Self) extends AnyVal {
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
    def setEdgesVarargs(value: Edge*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[Edge]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

