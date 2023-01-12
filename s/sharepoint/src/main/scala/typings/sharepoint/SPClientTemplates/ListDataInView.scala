package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataInView extends StObject {
  
  var FilterFields: String
  
  var FilterLink: String
  
  var FirstRow: Double
  
  /** Either "0" or "1" */
  var ForceNoHierarchy: String
  
  var HierarchyHasIndention: String
  
  var LastRow: Double
  
  /** Link to the next page  (not defined if not available) */
  var NextHref: String
  
  /** Link to the previous page (not defined if not available) */
  var PrevHref: String
  
  var Row: js.Array[Item]
  
  var SortDir: String
  
  var SortField: String
}
object ListDataInView {
  
  inline def apply(
    FilterFields: String,
    FilterLink: String,
    FirstRow: Double,
    ForceNoHierarchy: String,
    HierarchyHasIndention: String,
    LastRow: Double,
    NextHref: String,
    PrevHref: String,
    Row: js.Array[Item],
    SortDir: String,
    SortField: String
  ): ListDataInView = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], FilterLink = FilterLink.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], ForceNoHierarchy = ForceNoHierarchy.asInstanceOf[js.Any], HierarchyHasIndention = HierarchyHasIndention.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], NextHref = NextHref.asInstanceOf[js.Any], PrevHref = PrevHref.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], SortDir = SortDir.asInstanceOf[js.Any], SortField = SortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataInView] (val x: Self) extends AnyVal {
    
    inline def setFilterFields(value: String): Self = StObject.set(x, "FilterFields", value.asInstanceOf[js.Any])
    
    inline def setFilterLink(value: String): Self = StObject.set(x, "FilterLink", value.asInstanceOf[js.Any])
    
    inline def setFirstRow(value: Double): Self = StObject.set(x, "FirstRow", value.asInstanceOf[js.Any])
    
    inline def setForceNoHierarchy(value: String): Self = StObject.set(x, "ForceNoHierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyHasIndention(value: String): Self = StObject.set(x, "HierarchyHasIndention", value.asInstanceOf[js.Any])
    
    inline def setLastRow(value: Double): Self = StObject.set(x, "LastRow", value.asInstanceOf[js.Any])
    
    inline def setNextHref(value: String): Self = StObject.set(x, "NextHref", value.asInstanceOf[js.Any])
    
    inline def setPrevHref(value: String): Self = StObject.set(x, "PrevHref", value.asInstanceOf[js.Any])
    
    inline def setRow(value: js.Array[Item]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowVarargs(value: Item*): Self = StObject.set(x, "Row", js.Array(value*))
    
    inline def setSortDir(value: String): Self = StObject.set(x, "SortDir", value.asInstanceOf[js.Any])
    
    inline def setSortField(value: String): Self = StObject.set(x, "SortField", value.asInstanceOf[js.Any])
  }
}
