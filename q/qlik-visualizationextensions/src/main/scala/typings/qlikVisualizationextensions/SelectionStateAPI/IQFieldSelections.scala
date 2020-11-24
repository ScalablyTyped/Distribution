package typings.qlikVisualizationextensions.SelectionStateAPI

import typings.qlikVisualizationextensions.FieldAPI.IQField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQFieldSelections extends js.Object {
  
  /**
    * Reference to the field.
    */
  var field: IQField = js.native
  
  /**
    * Selection state for a field.
    */
  var fieldName: String = js.native
  
  /**
    * Defines if the field is numeric.
    */
  var isNumeric: Boolean = js.native
  
  /**
    * Defines if the field is locked.
    */
  var locked: Boolean = js.native
  
  /**
    * Array with maximum of qSelectionThreshold values that are not selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var notSelectedValues: js.Array[Double] = js.native
  
  /**
    * Concatenated string of selected values if number of values are less
    * than the threshold, or if the string is of format "7 of 123".
    */
  var qSelected: String = js.native
  
  /**
    * Number of values that will be listed.
    */
  var qSelectionThreshold: Double = js.native
  
  /**
    * Sort index. Starting from 0.
    */
  var qSortIndex: Double = js.native
  
  /**
    * Object with number of values in different states.
    */
  var qStateCounts: js.Any = js.native
  
  /**
    * Number of selected values.
    */
  var selectedCount: Double = js.native
  
  /**
    * Array with maximum of qSelectionThreshold values that are selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var selectedValues: js.Array[Double] = js.native
  
  /**
    * Total number of values in the field.
    */
  var totalCount: Double = js.native
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
  
  @scala.inline
  implicit class IQFieldSelectionsOps[Self <: IQFieldSelections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: IQField): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumeric(value: Boolean): Self = this.set("isNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSelectedValuesVarargs(value: Double*): Self = this.set("notSelectedValues", js.Array(value :_*))
    
    @scala.inline
    def setNotSelectedValues(value: js.Array[Double]): Self = this.set("notSelectedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelected(value: String): Self = this.set("qSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectionThreshold(value: Double): Self = this.set("qSelectionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndex(value: Double): Self = this.set("qSortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: js.Any): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCount(value: Double): Self = this.set("selectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValuesVarargs(value: Double*): Self = this.set("selectedValues", js.Array(value :_*))
    
    @scala.inline
    def setSelectedValues(value: js.Array[Double]): Self = this.set("selectedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
}
