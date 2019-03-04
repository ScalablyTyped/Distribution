package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxStackedPivotCell extends js.Object {
  var qAttrDims: NxAttributeDimValues
  var qAttrExps: NxAttributeExpressionValues
  var qCanCollapse: scala.Boolean
  var qCanExpand: scala.Boolean
  var qDown: scala.Double
  var qElemNo: scala.Double
  var qMaxPos: scala.Double
  var qMinNeg: scala.Double
  var qRow: scala.Double
  var qSubNodes: js.Array[NxStackedPivotCell]
  var qText: java.lang.String
  var qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U
  var qUp: scala.Double
  var qValue: scala.Double
}

object NxStackedPivotCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qCanCollapse: scala.Boolean,
    qCanExpand: scala.Boolean,
    qDown: scala.Double,
    qElemNo: scala.Double,
    qMaxPos: scala.Double,
    qMinNeg: scala.Double,
    qRow: scala.Double,
    qSubNodes: js.Array[NxStackedPivotCell],
    qText: java.lang.String,
    qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U,
    qUp: scala.Double,
    qValue: scala.Double
  ): NxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qCanCollapse = qCanCollapse, qCanExpand = qCanExpand, qDown = qDown, qElemNo = qElemNo, qMaxPos = qMaxPos, qMinNeg = qMinNeg, qRow = qRow, qSubNodes = qSubNodes, qText = qText, qType = qType.asInstanceOf[js.Any], qUp = qUp, qValue = qValue)
  
    __obj.asInstanceOf[NxStackedPivotCell]
  }
}

