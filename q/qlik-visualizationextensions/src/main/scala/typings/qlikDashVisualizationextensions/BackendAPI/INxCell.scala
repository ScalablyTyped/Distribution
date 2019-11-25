package typings.qlikDashVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxCell extends js.Object {
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeDimValues
  /**
    * Attribute expression values.
    */
  var qAttrExps: INxAttributeExpressionValues
  /**
    * Rank number of the value, starting from 0.
    * If the element number is a negative number, it means that the returned value is not an element number.
    * You can get the following negative values:
    *       # -1: the cell is a Total cell. It shows a total.
    *       # -2: the cell is collapsed. Applies to pivot tables.
    *       # -3: the cell belongs to the group Others.
    *       # -4: the cell is empty. Applies to pivot tables.
    */
  var qElemNumber: Double
  /**
    * Frequency of the value.
    * This parameter is optional.
    */
  var qFrequency: String
  /**
    * Search hits.
    * The search hits are highlighted.
    * This parameter is optional.
    */
  var qHighlightRanges: INxHighlightRanges
  /**
    * Is set to true, if qText and qNum are empty.
    * This parameter is optional. The default value is false.
    */
  var qIsEmpty: Boolean
  /**
    * Is set to true if the value is Null.
    */
  var qIsNull: Boolean
  /**
    * Is set to true if the cell belongs to the group Others.
    * Dimension values can be set as Others depending on what has been defined in OtherTotalSpecProp.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsOtherCell: Boolean
  /**
    * Is set to true if a total is displayed in the cell.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsTotalCell: Boolean
  /**
    * A value.
    * This parameter is optional.
    */
  var qNum: js.UndefOr[Double] = js.undefined
  /**
    * State of the value.
    * The default state for a measure is L.
    * L for Locked
    * S for Selected
    * O for Optional
    * D for Deselected
    * A for Alternative
    * X for eXcluded
    * XS for eXcluded Selected
    * XL for eXcluded Locked
    */
  var qState: StateType
  /**
    * Some text.
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.undefined
}

object INxCell {
  @scala.inline
  def apply(
    qAttrDims: INxAttributeDimValues,
    qAttrExps: INxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: INxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qState: StateType,
    qNum: Int | Double = null,
    qText: String = null
  ): INxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any])
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCell]
  }
}

