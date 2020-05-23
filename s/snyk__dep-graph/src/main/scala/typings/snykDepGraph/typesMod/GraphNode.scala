package typings.snykDepGraph.typesMod

import typings.snykDepGraph.anon.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends js.Object {
  var deps: js.Array[NodeId]
  var info: js.UndefOr[NodeInfo] = js.undefined
  var nodeId: String
  var pkgId: String
}

object GraphNode {
  @scala.inline
  def apply(deps: js.Array[NodeId], nodeId: String, pkgId: String, info: NodeInfo = null): GraphNode = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], pkgId = pkgId.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
}

