package typings.reactD3Graph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphData[N /* <: GraphNode */, L /* <: GraphLink */] extends js.Object {
  var focusedNodeId: js.UndefOr[String] = js.undefined
  var links: js.Array[L]
  var nodes: js.Array[N]
}

object GraphData {
  @scala.inline
  def apply[N, L](links: js.Array[L], nodes: js.Array[N], focusedNodeId: String = null): GraphData[N, L] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    if (focusedNodeId != null) __obj.updateDynamic("focusedNodeId")(focusedNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphData[N, L]]
  }
}

