package typings.qlikVisualizationextensions.SelectionStateAPI

import typings.qlikVisualizationextensions.FieldAPI.IQField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQFieldSelections extends js.Object {
  /**
    * Reference to the field.
    */
  var field: IQField
  /**
    * Selection state for a field.
    */
  var fieldName: String
  /**
    * Defines if the field is numeric.
    */
  var isNumeric: Boolean
  /**
    * Defines if the field is locked.
    */
  var locked: Boolean
  /**
    * Array with maximum of qSelectionThreshold values that are not selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var notSelectedValues: js.Array[Double]
  /**
    * Concatenated string of selected values if number of values are less
    * than the threshold, or if the string is of format "7 of 123".
    */
  var qSelected: String
  /**
    * Number of values that will be listed.
    */
  var qSelectionThreshold: Double
  /**
    * Sort index. Starting from 0.
    */
  var qSortIndex: Double
  /**
    * Object with number of values in different states.
    */
  var qStateCounts: js.Any
  /**
    * Number of selected values.
    */
  var selectedCount: Double
  /**
    * Array with maximum of qSelectionThreshold values that are selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var selectedValues: js.Array[Double]
  /**
    * Total number of values in the field.
    */
  var totalCount: Double
}

object IQFieldSelections {
  @scala.inline
  def apply(
    field: IQField,
    fieldName: String,
    isNumeric: Boolean,
    locked: Boolean,
    notSelectedValues: js.Array[Double],
    qSelected: String,
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: js.Any,
    selectedCount: Double,
    selectedValues: js.Array[Double],
    totalCount: Double
  ): IQFieldSelections = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], isNumeric = isNumeric.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], notSelectedValues = notSelectedValues.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], selectedCount = selectedCount.asInstanceOf[js.Any], selectedValues = selectedValues.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQFieldSelections]
  }
}

