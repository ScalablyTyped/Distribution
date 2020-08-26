package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphData[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  var focusedNodeId: js.UndefOr[String] = js.native
  var links: js.Array[L] = js.native
  var nodes: js.Array[N] = js.native
}

object GraphData {
  @scala.inline
  def apply[/* <: typings.reactD3Graph.mod.GraphNode */ N, /* <: typings.reactD3Graph.mod.GraphLink */ L](links: js.Array[L], nodes: js.Array[N]): GraphData[N, L] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphData[N, L]]
  }
  @scala.inline
  implicit class GraphDataOps[Self <: GraphData[_, _], /* <: typings.reactD3Graph.mod.GraphNode */ N, /* <: typings.reactD3Graph.mod.GraphLink */ L] (val x: Self with (GraphData[N, L])) extends AnyVal {
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
    def setLinksVarargs(value: L*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[L]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: N*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[N]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedNodeId(value: String): Self = this.set("focusedNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusedNodeId: Self = this.set("focusedNodeId", js.undefined)
  }
  
}

