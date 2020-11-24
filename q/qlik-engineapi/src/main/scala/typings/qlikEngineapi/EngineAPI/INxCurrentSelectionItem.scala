package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxCurrentSelectionItem...
  */
@js.native
trait INxCurrentSelectionItem extends js.Object {
  
  /**
    * Name of the field that is selected.
    */
  var qField: String = js.native
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is a numeric.
    */
  var qIsNum: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is locked.
    */
  var qLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the fields that are not selected.
    */
  var qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo] = js.native
  
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Property that is set to a field. Is set to true if the field cannot be unselected.
    */
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the range of selected values.
    * Is empty if there is no range of selected values.
    */
  var qRangeInfo: js.Array[IRangeSelectInfo] = js.native
  
  /**
    * Label that, if defined, is displayed in current selections instead of the actual expression.
    */
  var qReadableName: String = js.native
  
  /**
    * Values that are selected.
    */
  var qSelected: String = js.native
  
  /**
    * Number of values that are selected.
    */
  var qSelectedCount: Double = js.native
  
  /**
    * Information about the fields that are selected.
    */
  var qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo] = js.native
  
  /**
    * Maximum values to show in the current selections.
    * >> The default value is 6.
    */
  var qSelectionThreshold: Double = js.native
  
  /**
    * Sort index of the field. Indexing starts from 0.
    */
  var qSortIndex: Double = js.native
  
  /**
    * Number of values in a particular state.
    */
  var qStateCounts: INxStateCounts = js.native
  
  /**
    * Optional parameter.
    * Text that was used for the search.
    * This parameter is filled when searching for a value and selecting it.
    */
  var qTextSearch: js.UndefOr[String] = js.native
  
  /**
    * Number of values in the field.
    */
  var qTotal: Double = js.native
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
  implicit class INxCurrentSelectionItemOps[Self <: INxCurrentSelectionItem] (val x: Self) extends AnyVal {
    
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
    def setQField(value: String): Self = this.set("qField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNotSelectedFieldSelectionInfoVarargs(value: INxFieldSelectionInfo*): Self = this.set("qNotSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQNotSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = this.set("qNotSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeInfoVarargs(value: IRangeSelectInfo*): Self = this.set("qRangeInfo", js.Array(value :_*))
    
    @scala.inline
    def setQRangeInfo(value: js.Array[IRangeSelectInfo]): Self = this.set("qRangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReadableName(value: String): Self = this.set("qReadableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelected(value: String): Self = this.set("qSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedCount(value: Double): Self = this.set("qSelectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedFieldSelectionInfoVarargs(value: INxFieldSelectionInfo*): Self = this.set("qSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = this.set("qSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectionThreshold(value: Double): Self = this.set("qSelectionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndex(value: Double): Self = this.set("qSortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: INxStateCounts): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTotal(value: Double): Self = this.set("qTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNum(value: Boolean): Self = this.set("qIsNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQIsNum: Self = this.set("qIsNum", js.undefined)
    
    @scala.inline
    def setQLocked(value: Boolean): Self = this.set("qLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQLocked: Self = this.set("qLocked", js.undefined)
    
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = this.set("qOneAndOnlyOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQOneAndOnlyOne: Self = this.set("qOneAndOnlyOne", js.undefined)
    
    @scala.inline
    def setQTextSearch(value: String): Self = this.set("qTextSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQTextSearch: Self = this.set("qTextSearch", js.undefined)
  }
}
