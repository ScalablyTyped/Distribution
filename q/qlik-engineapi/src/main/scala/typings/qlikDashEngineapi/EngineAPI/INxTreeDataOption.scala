package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxTreeDataOption extends js.Object {
  /**
    * Maximum number of nodes in the tree. If this limit is exceeded, no nodes are returned. All nodes are counted.
    */
  var MaxNbrOfNodes: Double
  /**
    * Filters out complete dimensions from the fetched tree.
    */
  var TreeLevels: INxPageTreeLevel
  /**
    * Defines areas of the tree to be fetched. Areas must be defined left to right.
    */
  var TreeNodes: js.Array[INxPageTreeNode]
}

object INxTreeDataOption {
  @scala.inline
  def apply(MaxNbrOfNodes: Double, TreeLevels: INxPageTreeLevel, TreeNodes: js.Array[INxPageTreeNode]): INxTreeDataOption = {
    val __obj = js.Dynamic.literal(MaxNbrOfNodes = MaxNbrOfNodes.asInstanceOf[js.Any], TreeLevels = TreeLevels.asInstanceOf[js.Any], TreeNodes = TreeNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxTreeDataOption]
  }
}

