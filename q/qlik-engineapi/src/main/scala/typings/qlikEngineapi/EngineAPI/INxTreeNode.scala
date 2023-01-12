package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxTreeNode extends StObject {
  
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.undefined
  
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.undefined
  
  /**
    * Element number
    */
  var qElemNo: Double
  
  /**
    * A generated number applicable to this page only. Used so that children can easily identify who their parents are.
    */
  var qNodeNr: Double
  
  /**
    * The children of this node in the tree structure.
    */
  var qNodes: INxTreeNode
  
  /**
    * The qNodeNr of this node's parent for the current page.
    */
  var qParentNode: Double
  
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: Double
  
  /**
    * The text version of the value, if available.
    */
  var qText: String
  
  /**
    * Type of the cell.
    */
  var qType: NxTreeNodeType
  
  /**
    * The measures for this node.
    */
  var qValues: INxTreeValue
}
object INxTreeNode {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: INxTreeNode] (val x: Self) extends AnyVal {
    
    inline def setQAttrDims(value: INxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrDimsUndefined: Self = StObject.set(x, "qAttrDims", js.undefined)
    
    inline def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQAttrExpsUndefined: Self = StObject.set(x, "qAttrExps", js.undefined)
    
    inline def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    inline def setQNodeNr(value: Double): Self = StObject.set(x, "qNodeNr", value.asInstanceOf[js.Any])
    
    inline def setQNodes(value: INxTreeNode): Self = StObject.set(x, "qNodes", value.asInstanceOf[js.Any])
    
    inline def setQParentNode(value: Double): Self = StObject.set(x, "qParentNode", value.asInstanceOf[js.Any])
    
    inline def setQRow(value: Double): Self = StObject.set(x, "qRow", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: NxTreeNodeType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQValues(value: INxTreeValue): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
  }
}
