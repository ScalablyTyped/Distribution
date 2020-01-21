package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.L
import typings.qlik.qlikStrings.O
import typings.qlik.qlikStrings.S
import typings.qlik.qlikStrings.X
import typings.qlik.qlikStrings.XL
import typings.qlik.qlikStrings.XS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCell extends js.Object {
  var qAttrDims: NxAttributeDimValues
  var qAttrExps: NxAttributeExpressionValues
  var qElemNumber: Double
  var qFrequency: String
  var qHighlightRanges: NxHighlightRanges
  var qIsEmpty: Boolean
  var qIsNull: Boolean
  var qIsOtherCell: Boolean
  var qIsTotalCell: Boolean
  var qNum: Double
  var qState: L | S | O | D | A | X | XS | XL
  var qText: String
}

object NxCell {
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qNum: Double,
    qState: L | S | O | D | A | X | XS | XL,
    qText: String
  ): NxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxCell]
  }
}

