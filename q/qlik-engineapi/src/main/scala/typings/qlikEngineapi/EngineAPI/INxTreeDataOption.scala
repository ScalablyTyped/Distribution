package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxTreeDataOption extends js.Object {
  /**
    * Maximum number of nodes in the tree. If this limit is exceeded, no nodes are returned. All nodes are counted.
    */
  var MaxNbrOfNodes: Double = js.native
  /**
    * Filters out complete dimensions from the fetched tree.
    */
  var TreeLevels: INxPageTreeLevel = js.native
  /**
    * Defines areas of the tree to be fetched. Areas must be defined left to right.
    */
  var TreeNodes: js.Array[INxPageTreeNode] = js.native
}

object INxTreeDataOption {
  @scala.inline
  def apply(MaxNbrOfNodes: Double, TreeLevels: INxPageTreeLevel, TreeNodes: js.Array[INxPageTreeNode]): INxTreeDataOption = {
    val __obj = js.Dynamic.literal(MaxNbrOfNodes = MaxNbrOfNodes.asInstanceOf[js.Any], TreeLevels = TreeLevels.asInstanceOf[js.Any], TreeNodes = TreeNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeDataOption]
  }
  @scala.inline
  implicit class INxTreeDataOptionOps[Self <: INxTreeDataOption] (val x: Self) extends AnyVal {
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
    def setMaxNbrOfNodes(value: Double): Self = this.set("MaxNbrOfNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeLevels(value: INxPageTreeLevel): Self = this.set("TreeLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeNodesVarargs(value: INxPageTreeNode*): Self = this.set("TreeNodes", js.Array(value :_*))
    @scala.inline
    def setTreeNodes(value: js.Array[INxPageTreeNode]): Self = this.set("TreeNodes", value.asInstanceOf[js.Any])
  }
  
}

