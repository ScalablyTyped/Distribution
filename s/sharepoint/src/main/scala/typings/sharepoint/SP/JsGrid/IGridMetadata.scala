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
  
  inline def apply(KeyColumnName: String): IGridMetadata = {
    val __obj = js.Dynamic.literal(KeyColumnName = KeyColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMetadata]
  }
  
  extension [Self <: IGridMetadata](x: Self) {
    
    inline def setGridOperationalConstantsFieldKeyMap(value: NumberDictionary[String]): Self = StObject.set(x, "GridOperationalConstantsFieldKeyMap", value.asInstanceOf[js.Any])
    
    inline def setGridOperationalConstantsFieldKeyMapUndefined: Self = StObject.set(x, "GridOperationalConstantsFieldKeyMap", js.undefined)
    
    inline def setGroupingLevel(value: Double): Self = StObject.set(x, "GroupingLevel", value.asInstanceOf[js.Any])
    
    inline def setGroupingLevelUndefined: Self = StObject.set(x, "GroupingLevel", js.undefined)
    
    inline def setGroupingPrefix(value: String): Self = StObject.set(x, "GroupingPrefix", value.asInstanceOf[js.Any])
    
    inline def setGroupingPrefixUndefined: Self = StObject.set(x, "GroupingPrefix", js.undefined)
    
    inline def setIsGanttEnabled(value: Boolean): Self = StObject.set(x, "IsGanttEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsGanttEnabledUndefined: Self = StObject.set(x, "IsGanttEnabled", js.undefined)
    
    inline def setIsHierarchyEnabled(value: Boolean): Self = StObject.set(x, "IsHierarchyEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsHierarchyEnabledUndefined: Self = StObject.set(x, "IsHierarchyEnabled", js.undefined)
    
    inline def setIsSorted(value: Boolean): Self = StObject.set(x, "IsSorted", value.asInstanceOf[js.Any])
    
    inline def setIsSortedUndefined: Self = StObject.set(x, "IsSorted", js.undefined)
    
    inline def setKeyColumnName(value: String): Self = StObject.set(x, "KeyColumnName", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyHash(value: String): Self = StObject.set(x, "RecordKeyHash", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyHashUndefined: Self = StObject.set(x, "RecordKeyHash", js.undefined)
    
    inline def setRecordKeyOrderChanged(value: js.Any): Self = StObject.set(x, "RecordKeyOrderChanged", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyOrderChangedUndefined: Self = StObject.set(x, "RecordKeyOrderChanged", js.undefined)
  }
}
