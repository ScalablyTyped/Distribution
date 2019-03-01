package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCell extends js.Object {
  var qAttrDims: NxAttributeDimValues
  var qAttrExps: NxAttributeExpressionValues
  var qElemNumber: scala.Double
  var qFrequency: java.lang.String
  var qHighlightRanges: NxHighlightRanges
  var qIsEmpty: scala.Boolean
  var qIsNull: scala.Boolean
  var qIsOtherCell: scala.Boolean
  var qIsTotalCell: scala.Boolean
  var qNum: scala.Double
  var qState: qlikLib.qlikLibStrings.L | qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.O | qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.X | qlikLib.qlikLibStrings.XS | qlikLib.qlikLibStrings.XL
  var qText: java.lang.String
}

object NxCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: scala.Double,
    qFrequency: java.lang.String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: scala.Boolean,
    qIsNull: scala.Boolean,
    qIsOtherCell: scala.Boolean,
    qIsTotalCell: scala.Boolean,
    qNum: scala.Double,
    qState: qlikLib.qlikLibStrings.L | qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.O | qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.X | qlikLib.qlikLibStrings.XS | qlikLib.qlikLibStrings.XL,
    qText: java.lang.String
  ): NxCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttrDims")(qAttrDims)
    __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.updateDynamic("qElemNumber")(qElemNumber)
    __obj.updateDynamic("qFrequency")(qFrequency)
    __obj.updateDynamic("qHighlightRanges")(qHighlightRanges)
    __obj.updateDynamic("qIsEmpty")(qIsEmpty)
    __obj.updateDynamic("qIsNull")(qIsNull)
    __obj.updateDynamic("qIsOtherCell")(qIsOtherCell)
    __obj.updateDynamic("qIsTotalCell")(qIsTotalCell)
    __obj.updateDynamic("qNum")(qNum)
    __obj.updateDynamic("qState")(qState.asInstanceOf[js.Any])
    __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[NxCell]
  }
}

