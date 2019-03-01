package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotDimensioncell extends js.Object {
  var qAttrDims: js.Array[NxAttributeDimValues]
  var qAttrExps: js.Array[NxAttributeExpressionValues]
  var qCanCollapse: scala.Boolean
  var qCanExpand: scala.Boolean
  var qDown: scala.Double
  var qElemNo: scala.Double
  var qSubNodes: js.Array[NxPivotDimensioncell]
  var qText: java.lang.String
  var qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U
  var qUp: scala.Double
  var qValue: scala.Double
}

object NxPivotDimensioncell {
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: scala.Boolean,
    qCanExpand: scala.Boolean,
    qDown: scala.Double,
    qElemNo: scala.Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: java.lang.String,
    qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U,
    qUp: scala.Double,
    qValue: scala.Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttrDims")(qAttrDims)
    __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.updateDynamic("qCanCollapse")(qCanCollapse)
    __obj.updateDynamic("qCanExpand")(qCanExpand)
    __obj.updateDynamic("qDown")(qDown)
    __obj.updateDynamic("qElemNo")(qElemNo)
    __obj.updateDynamic("qSubNodes")(qSubNodes)
    __obj.updateDynamic("qText")(qText)
    __obj.updateDynamic("qType")(qType.asInstanceOf[js.Any])
    __obj.updateDynamic("qUp")(qUp)
    __obj.updateDynamic("qValue")(qValue)
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
}

