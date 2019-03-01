package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

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
  var qElemNumber: scala.Double
  /**
    * Frequency of the value.
    * This parameter is optional.
    */
  var qFrequency: java.lang.String
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
  var qIsEmpty: scala.Boolean
  /**
    * Is set to true if the value is Null.
    */
  var qIsNull: scala.Boolean
  /**
    * Is set to true if the cell belongs to the group Others.
    * Dimension values can be set as Others depending on what has been defined in OtherTotalSpecProp.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsOtherCell: scala.Boolean
  /**
    * Is set to true if a total is displayed in the cell.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsTotalCell: scala.Boolean
  /**
    * A value.
    * This parameter is optional.
    */
  var qNum: js.UndefOr[scala.Double] = js.undefined
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
  var qText: js.UndefOr[java.lang.String] = js.undefined
}

object INxCell {
  @scala.inline
  def apply(
    qAttrDims: INxAttributeDimValues,
    qAttrExps: INxAttributeExpressionValues,
    qElemNumber: scala.Double,
    qFrequency: java.lang.String,
    qHighlightRanges: INxHighlightRanges,
    qIsEmpty: scala.Boolean,
    qIsNull: scala.Boolean,
    qIsOtherCell: scala.Boolean,
    qIsTotalCell: scala.Boolean,
    qState: StateType,
    qNum: scala.Int | scala.Double = null,
    qText: java.lang.String = null
  ): INxCell = {
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
    __obj.updateDynamic("qState")(qState)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[INxCell]
  }
}

