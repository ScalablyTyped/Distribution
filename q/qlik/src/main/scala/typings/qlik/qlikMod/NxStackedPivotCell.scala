package typings.qlik.qlikMod

import typings.qlik.qlikStrings.E
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.R
import typings.qlik.qlikStrings.T
import typings.qlik.qlikStrings.U
import typings.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxStackedPivotCell extends js.Object {
  var qAttrDims: NxAttributeDimValues
  var qAttrExps: NxAttributeExpressionValues
  var qCanCollapse: Boolean
  var qCanExpand: Boolean
  var qDown: Double
  var qElemNo: Double
  var qMaxPos: Double
  var qMinNeg: Double
  var qRow: Double
  var qSubNodes: js.Array[NxStackedPivotCell]
  var qText: String
  var qType: V | E | N | T | P | R | U
  var qUp: Double
  var qValue: Double
}

object NxStackedPivotCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[NxStackedPivotCell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qCanCollapse = qCanCollapse, qCanExpand = qCanExpand, qDown = qDown, qElemNo = qElemNo, qMaxPos = qMaxPos, qMinNeg = qMinNeg, qRow = qRow, qSubNodes = qSubNodes, qText = qText, qType = qType.asInstanceOf[js.Any], qUp = qUp, qValue = qValue)
  
    __obj.asInstanceOf[NxStackedPivotCell]
  }
}

