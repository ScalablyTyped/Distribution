package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxTreeDataOption extends StObject {
  
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
  
  inline def apply(MaxNbrOfNodes: Double, TreeLevels: INxPageTreeLevel, TreeNodes: js.Array[INxPageTreeNode]): INxTreeDataOption = {
    val __obj = js.Dynamic.literal(MaxNbrOfNodes = MaxNbrOfNodes.asInstanceOf[js.Any], TreeLevels = TreeLevels.asInstanceOf[js.Any], TreeNodes = TreeNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeDataOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxTreeDataOption] (val x: Self) extends AnyVal {
    
    inline def setMaxNbrOfNodes(value: Double): Self = StObject.set(x, "MaxNbrOfNodes", value.asInstanceOf[js.Any])
    
    inline def setTreeLevels(value: INxPageTreeLevel): Self = StObject.set(x, "TreeLevels", value.asInstanceOf[js.Any])
    
    inline def setTreeNodes(value: js.Array[INxPageTreeNode]): Self = StObject.set(x, "TreeNodes", value.asInstanceOf[js.Any])
    
    inline def setTreeNodesVarargs(value: INxPageTreeNode*): Self = StObject.set(x, "TreeNodes", js.Array(value*))
  }
}
