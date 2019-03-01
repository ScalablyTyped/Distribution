package typings
package qlikDashVisualizationextensionsLib.SelectionStateAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQFieldSelections extends js.Object {
  /**
    * Reference to the field.
    */
  var field: qlikDashVisualizationextensionsLib.FieldAPINs.IQField
  /**
    * Selection state for a field.
    */
  var fieldName: java.lang.String
  /**
    * Defines if the field is numeric.
    */
  var isNumeric: scala.Boolean
  /**
    * Defines if the field is locked.
    */
  var locked: scala.Boolean
  /**
    * Array with maximum of qSelectionThreshold values that are not selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var notSelectedValues: js.Array[scala.Double]
  /**
    * Concatenated string of selected values if number of values are less
    * than the threshold, or if the string is of format "7 of 123".
    */
  var qSelected: java.lang.String
  /**
    * Number of values that will be listed.
    */
  var qSelectionThreshold: scala.Double
  /**
    * Sort index. Starting from 0.
    */
  var qSortIndex: scala.Double
  /**
    * Object with number of values in different states.
    */
  var qStateCounts: js.Any
  /**
    * Number of selected values.
    */
  var selectedCount: scala.Double
  /**
    * Array with maximum of qSelectionThreshold values that are selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var selectedValues: js.Array[scala.Double]
  /**
    * Total number of values in the field.
    */
  var totalCount: scala.Double
}

object IQFieldSelections {
  @scala.inline
  def apply(
    field: qlikDashVisualizationextensionsLib.FieldAPINs.IQField,
    fieldName: java.lang.String,
    isNumeric: scala.Boolean,
    locked: scala.Boolean,
    notSelectedValues: js.Array[scala.Double],
    qSelected: java.lang.String,
    qSelectionThreshold: scala.Double,
    qSortIndex: scala.Double,
    qStateCounts: js.Any,
    selectedCount: scala.Double,
    selectedValues: js.Array[scala.Double],
    totalCount: scala.Double
  ): IQFieldSelections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("isNumeric")(isNumeric)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("notSelectedValues")(notSelectedValues)
    __obj.updateDynamic("qSelected")(qSelected)
    __obj.updateDynamic("qSelectionThreshold")(qSelectionThreshold)
    __obj.updateDynamic("qSortIndex")(qSortIndex)
    __obj.updateDynamic("qStateCounts")(qStateCounts)
    __obj.updateDynamic("selectedCount")(selectedCount)
    __obj.updateDynamic("selectedValues")(selectedValues)
    __obj.updateDynamic("totalCount")(totalCount)
    __obj.asInstanceOf[IQFieldSelections]
  }
}

