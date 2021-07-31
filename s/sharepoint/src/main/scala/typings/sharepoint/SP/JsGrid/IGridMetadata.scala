package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridMetadata extends StObject {
  
  var GridOperationalConstantsFieldKeyMap: js.UndefOr[NumberDictionary[String]] = js.undefined
  
  var GroupingLevel: js.UndefOr[Double] = js.undefined
  
  var GroupingPrefix: js.UndefOr[String] = js.undefined
  
  var IsGanttEnabled: js.UndefOr[Boolean] = js.undefined
  
  var IsHierarchyEnabled: js.UndefOr[Boolean] = js.undefined
  
  var IsSorted: js.UndefOr[Boolean] = js.undefined
  
  var KeyColumnName: String
  
  var RecordKeyHash: js.UndefOr[String] = js.undefined
  
  var RecordKeyOrderChanged: js.UndefOr[js.Any] = js.undefined
}
object IGridMetadata {
  
  @scala.inline
  def apply(KeyColumnName: String): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMetadata]
  }
  
  @scala.inline
  implicit class IGridMetadataMutableBuilder[Self <: IGridMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridOperationalConstantsFieldKeyMap(value: NumberDictionary[String]): Self = StObject.set(x, "GridOperationalConstantsFieldKeyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOperationalConstantsFieldKeyMapUndefined: Self = StObject.set(x, "GridOperationalConstantsFieldKeyMap", js.undefined)
    
    @scala.inline
    def setGroupingLevel(value: Double): Self = StObject.set(x, "GroupingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingLevelUndefined: Self = StObject.set(x, "GroupingLevel", js.undefined)
    
    @scala.inline
    def setGroupingPrefix(value: String): Self = StObject.set(x, "GroupingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingPrefixUndefined: Self = StObject.set(x, "GroupingPrefix", js.undefined)
    
    @scala.inline
    def setIsGanttEnabled(value: Boolean): Self = StObject.set(x, "IsGanttEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGanttEnabledUndefined: Self = StObject.set(x, "IsGanttEnabled", js.undefined)
    
    @scala.inline
    def setIsHierarchyEnabled(value: Boolean): Self = StObject.set(x, "IsHierarchyEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHierarchyEnabledUndefined: Self = StObject.set(x, "IsHierarchyEnabled", js.undefined)
    
    @scala.inline
    def setIsSorted(value: Boolean): Self = StObject.set(x, "IsSorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortedUndefined: Self = StObject.set(x, "IsSorted", js.undefined)
    
    @scala.inline
    def setKeyColumnName(value: String): Self = StObject.set(x, "KeyColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeyHash(value: String): Self = StObject.set(x, "RecordKeyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeyHashUndefined: Self = StObject.set(x, "RecordKeyHash", js.undefined)
    
    @scala.inline
    def setRecordKeyOrderChanged(value: js.Any): Self = StObject.set(x, "RecordKeyOrderChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeyOrderChangedUndefined: Self = StObject.set(x, "RecordKeyOrderChanged", js.undefined)
  }
}
