package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxTreeNode extends js.Object {
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
  @scala.inline
  def apply(
    qElemNo: Double,
    qNodeNr: Double,
    qNodes: INxTreeNode,
    qParentNode: Double,
    qRow: Double,
    qText: String,
    qType: NxTreeNodeType,
    qValues: INxTreeValue,
    qAttrDims: INxAttributeDimValues = null,
    qAttrExps: INxAttributeExpressionValues = null
  ): INxTreeNode = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qNodeNr = qNodeNr.asInstanceOf[js.Any], qNodes = qNodes.asInstanceOf[js.Any], qParentNode = qParentNode.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    if (qAttrDims != null) __obj.updateDynamic("qAttrDims")(qAttrDims.asInstanceOf[js.Any])
    if (qAttrExps != null) __obj.updateDynamic("qAttrExps")(qAttrExps.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeNode]
  }
}

