package typings.qlikVisualizationextensions

import typings.angular.mod.IPromise
import typings.qlikVisualizationextensions.FieldAPI.IQField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionStateAPI {
  
  trait IQFieldSelections extends StObject {
    
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
    var qStateCounts: Any
    
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
    
    inline def apply(
      field: IQField,
      fieldName: String,
      isNumeric: Boolean,
      locked: Boolean,
      notSelectedValues: js.Array[Double],
      qSelected: String,
      qSelectionThreshold: Double,
      qSortIndex: Double,
      qStateCounts: Any,
      selectedCount: Double,
      selectedValues: js.Array[Double],
      totalCount: Double
    ): IQFieldSelections = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], isNumeric = isNumeric.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], notSelectedValues = notSelectedValues.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], selectedCount = selectedCount.asInstanceOf[js.Any], selectedValues = selectedValues.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQFieldSelections]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IQFieldSelections] (val x: Self) extends AnyVal {
      
      inline def setField(value: IQField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setIsNumeric(value: Boolean): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setNotSelectedValues(value: js.Array[Double]): Self = StObject.set(x, "notSelectedValues", value.asInstanceOf[js.Any])
      
      inline def setNotSelectedValuesVarargs(value: Double*): Self = StObject.set(x, "notSelectedValues", js.Array(value*))
      
      inline def setQSelected(value: String): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
      
      inline def setQSelectionThreshold(value: Double): Self = StObject.set(x, "qSelectionThreshold", value.asInstanceOf[js.Any])
      
      inline def setQSortIndex(value: Double): Self = StObject.set(x, "qSortIndex", value.asInstanceOf[js.Any])
      
      inline def setQStateCounts(value: Any): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
      
      inline def setSelectedCount(value: Double): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
      
      inline def setSelectedValues(value: js.Array[Double]): Self = StObject.set(x, "selectedValues", value.asInstanceOf[js.Any])
      
      inline def setSelectedValuesVarargs(value: Double*): Self = StObject.set(x, "selectedValues", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait IQSelectionState extends StObject {
    
    /**
      * Number of back steps available.
      */
    var backCount: Double
    
    /**
      * Cleara all selections in this state.
      * @param lockedAlso - Use to also clear locked fields.
      * @return - A promise of a Qlik engine reply.
      */
    def clearAll(lockedAlso: Boolean): IPromise[Any]
    
    /**
      * Number of forward steps available. OnData notification will be triggered after each update.
      */
    var forwardCount: Double
    
    /**
      * Locks all selections in this state.
      * @return - A promise of a Qlik engine reply.
      */
    def lockAll(): IPromise[Any]
    
    /**
      * Selections
      */
    var selections: IQFieldSelections
    
    /**
      * State name. $ for default state.
      */
    var stateName: String
    
    /**
      * Unlocks all selections in this state.
      * @return - A promise of a Qlik engine reply.
      */
    def unlockAll(): IPromise[Any]
  }
  object IQSelectionState {
    
    inline def apply(
      backCount: Double,
      clearAll: Boolean => IPromise[Any],
      forwardCount: Double,
      lockAll: () => IPromise[Any],
      selections: IQFieldSelections,
      stateName: String,
      unlockAll: () => IPromise[Any]
    ): IQSelectionState = {
      val __obj = js.Dynamic.literal(backCount = backCount.asInstanceOf[js.Any], clearAll = js.Any.fromFunction1(clearAll), forwardCount = forwardCount.asInstanceOf[js.Any], lockAll = js.Any.fromFunction0(lockAll), selections = selections.asInstanceOf[js.Any], stateName = stateName.asInstanceOf[js.Any], unlockAll = js.Any.fromFunction0(unlockAll))
      __obj.asInstanceOf[IQSelectionState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IQSelectionState] (val x: Self) extends AnyVal {
      
      inline def setBackCount(value: Double): Self = StObject.set(x, "backCount", value.asInstanceOf[js.Any])
      
      inline def setClearAll(value: Boolean => IPromise[Any]): Self = StObject.set(x, "clearAll", js.Any.fromFunction1(value))
      
      inline def setForwardCount(value: Double): Self = StObject.set(x, "forwardCount", value.asInstanceOf[js.Any])
      
      inline def setLockAll(value: () => IPromise[Any]): Self = StObject.set(x, "lockAll", js.Any.fromFunction0(value))
      
      inline def setSelections(value: IQFieldSelections): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setStateName(value: String): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
      
      inline def setUnlockAll(value: () => IPromise[Any]): Self = StObject.set(x, "unlockAll", js.Any.fromFunction0(value))
    }
  }
}
