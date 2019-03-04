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
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims, qAttrExps = qAttrExps, qElemNumber = qElemNumber, qFrequency = qFrequency, qHighlightRanges = qHighlightRanges, qIsEmpty = qIsEmpty, qIsNull = qIsNull, qIsOtherCell = qIsOtherCell, qIsTotalCell = qIsTotalCell, qNum = qNum, qState = qState.asInstanceOf[js.Any], qText = qText)
  
    __obj.asInstanceOf[NxCell]
  }
}

