package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxCurrentSelectionItem...
  */
trait INxCurrentSelectionItem extends StObject {
  
  /**
    * Name of the field that is selected.
    */
  var qField: String
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is a numeric.
    */
  var qIsNum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is locked.
    */
  var qLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the fields that are not selected.
    */
  var qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Property that is set to a field. Is set to true if the field cannot be unselected.
    */
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the range of selected values.
    * Is empty if there is no range of selected values.
    */
  var qRangeInfo: js.Array[IRangeSelectInfo]
  
  /**
    * Label that, if defined, is displayed in current selections instead of the actual expression.
    */
  var qReadableName: String
  
  /**
    * Values that are selected.
    */
  var qSelected: String
  
  /**
    * Number of values that are selected.
    */
  var qSelectedCount: Double
  
  /**
    * Information about the fields that are selected.
    */
  var qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo]
  
  /**
    * Maximum values to show in the current selections.
    * >> The default value is 6.
    */
  var qSelectionThreshold: Double
  
  /**
    * Sort index of the field. Indexing starts from 0.
    */
  var qSortIndex: Double
  
  /**
    * Number of values in a particular state.
    */
  var qStateCounts: INxStateCounts
  
  /**
    * Optional parameter.
    * Text that was used for the search.
    * This parameter is filled when searching for a value and selecting it.
    */
  var qTextSearch: js.UndefOr[String] = js.undefined
  
  /**
    * Number of values in the field.
    */
  var qTotal: Double
}
object INxCurrentSelectionItem {
  
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qRangeInfo: js.Array[IRangeSelectInfo],
    qReadableName: String,
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: INxStateCounts,
    qTotal: Double
  ): INxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qReadableName = qReadableName.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCurrentSelectionItem]
  }
  
  @scala.inline
  implicit class INxCurrentSelectionItemMutableBuilder[Self <: INxCurrentSelectionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQField(value: String): Self = StObject.set(x, "qField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNum(value: Boolean): Self = StObject.set(x, "qIsNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNumUndefined: Self = StObject.set(x, "qIsNum", js.undefined)
    
    @scala.inline
    def setQLocked(value: Boolean): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLockedUndefined: Self = StObject.set(x, "qLocked", js.undefined)
    
    @scala.inline
    def setQNotSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = StObject.set(x, "qNotSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNotSelectedFieldSelectionInfoVarargs(value: INxFieldSelectionInfo*): Self = StObject.set(x, "qNotSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = StObject.set(x, "qOneAndOnlyOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOneAndOnlyOneUndefined: Self = StObject.set(x, "qOneAndOnlyOne", js.undefined)
    
    @scala.inline
    def setQRangeInfo(value: js.Array[IRangeSelectInfo]): Self = StObject.set(x, "qRangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeInfoVarargs(value: IRangeSelectInfo*): Self = StObject.set(x, "qRangeInfo", js.Array(value :_*))
    
    @scala.inline
    def setQReadableName(value: String): Self = StObject.set(x, "qReadableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelected(value: String): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedCount(value: Double): Self = StObject.set(x, "qSelectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = StObject.set(x, "qSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedFieldSelectionInfoVarargs(value: INxFieldSelectionInfo*): Self = StObject.set(x, "qSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQSelectionThreshold(value: Double): Self = StObject.set(x, "qSelectionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndex(value: Double): Self = StObject.set(x, "qSortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: INxStateCounts): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextSearch(value: String): Self = StObject.set(x, "qTextSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextSearchUndefined: Self = StObject.set(x, "qTextSearch", js.undefined)
    
    @scala.inline
    def setQTotal(value: Double): Self = StObject.set(x, "qTotal", value.asInstanceOf[js.Any])
  }
}
