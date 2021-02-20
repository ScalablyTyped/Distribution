package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxTreeNode extends StObject {
  
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.native
  
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.native
  
  /**
    * Element number
    */
  var qElemNo: Double = js.native
  
  /**
    * A generated number applicable to this page only. Used so that children can easily identify who their parents are.
    */
  var qNodeNr: Double = js.native
  
  /**
    * The children of this node in the tree structure.
    */
  var qNodes: INxTreeNode = js.native
  
  /**
    * The qNodeNr of this node's parent for the current page.
    */
  var qParentNode: Double = js.native
  
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: Double = js.native
  
  /**
    * The text version of the value, if available.
    */
  var qText: String = js.native
  
  /**
    * Type of the cell.
    */
  var qType: NxTreeNodeType = js.native
  
  /**
    * The measures for this node.
    */
  var qValues: INxTreeValue = js.native
}
object INxTreeNode {
  
  @scala.inline
  def apply(
    qElemNo: Double,
    qNodeNr: Double,
    qNodes: INxTreeNode,
    qParentNode: Double,
    qRow: Double,
    qText: String,
    qType: NxTreeNodeType,
    qValues: INxTreeValue
  ): INxTreeNode = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qNodeNr = qNodeNr.asInstanceOf[js.Any], qNodes = qNodes.asInstanceOf[js.Any], qParentNode = qParentNode.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeNode]
  }
  
  @scala.inline
  implicit class INxTreeNodeMutableBuilder[Self <: INxTreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttrDims(value: INxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimsUndefined: Self = StObject.set(x, "qAttrDims", js.undefined)
    
    @scala.inline
    def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExpsUndefined: Self = StObject.set(x, "qAttrExps", js.undefined)
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNodeNr(value: Double): Self = StObject.set(x, "qNodeNr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNodes(value: INxTreeNode): Self = StObject.set(x, "qNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQParentNode(value: Double): Self = StObject.set(x, "qParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRow(value: Double): Self = StObject.set(x, "qRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: NxTreeNodeType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValues(value: INxTreeValue): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
  }
}
