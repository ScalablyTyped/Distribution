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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttrDims")(qAttrDims)
    __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.updateDynamic("qCanCollapse")(qCanCollapse)
    __obj.updateDynamic("qCanExpand")(qCanExpand)
    __obj.updateDynamic("qDown")(qDown)
    __obj.updateDynamic("qElemNo")(qElemNo)
    __obj.updateDynamic("qMaxPos")(qMaxPos)
    __obj.updateDynamic("qMinNeg")(qMinNeg)
    __obj.updateDynamic("qRow")(qRow)
    __obj.updateDynamic("qSubNodes")(qSubNodes)
    __obj.updateDynamic("qText")(qText)
    __obj.updateDynamic("qType")(qType.asInstanceOf[js.Any])
    __obj.updateDynamic("qUp")(qUp)
    __obj.updateDynamic("qValue")(qValue)
    __obj.asInstanceOf[NxStackedPivotCell]
  }
}

