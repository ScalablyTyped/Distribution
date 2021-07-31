package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxCurrentSelectionItem extends StObject {
  
  var qField: String
  
  var qIsNum: js.UndefOr[Boolean] = js.undefined
  
  var qLocked: js.UndefOr[Boolean] = js.undefined
  
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined
  
  var qRangeInfo: js.Array[RangeSelectInfo]
  
  var qSelected: String
  
  var qSelectedCount: Double
  
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  
  var qSelectionThreshold: Double
  
  var qSortIndex: Double
  
  var qStateCounts: NxStateCounts
  
  var qTextSearch: js.UndefOr[String] = js.undefined
  
  var qTotal: Double
}
object NxCurrentSelectionItem {
  
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qRangeInfo: js.Array[RangeSelectInfo],
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: NxStateCounts,
    qTotal: Double
  ): NxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
  
  @scala.inline
  implicit class NxCurrentSelectionItemMutableBuilder[Self <: NxCurrentSelectionItem] (val x: Self) extends AnyVal {
    
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
    def setQNotSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = StObject.set(x, "qNotSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNotSelectedFieldSelectionInfoVarargs(value: NxFieldSelectionInfo*): Self = StObject.set(x, "qNotSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = StObject.set(x, "qOneAndOnlyOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOneAndOnlyOneUndefined: Self = StObject.set(x, "qOneAndOnlyOne", js.undefined)
    
    @scala.inline
    def setQRangeInfo(value: js.Array[RangeSelectInfo]): Self = StObject.set(x, "qRangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeInfoVarargs(value: RangeSelectInfo*): Self = StObject.set(x, "qRangeInfo", js.Array(value :_*))
    
    @scala.inline
    def setQSelected(value: String): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedCount(value: Double): Self = StObject.set(x, "qSelectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = StObject.set(x, "qSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectedFieldSelectionInfoVarargs(value: NxFieldSelectionInfo*): Self = StObject.set(x, "qSelectedFieldSelectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQSelectionThreshold(value: Double): Self = StObject.set(x, "qSelectionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndex(value: Double): Self = StObject.set(x, "qSortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: NxStateCounts): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextSearch(value: String): Self = StObject.set(x, "qTextSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextSearchUndefined: Self = StObject.set(x, "qTextSearch", js.undefined)
    
    @scala.inline
    def setQTotal(value: Double): Self = StObject.set(x, "qTotal", value.asInstanceOf[js.Any])
  }
}
