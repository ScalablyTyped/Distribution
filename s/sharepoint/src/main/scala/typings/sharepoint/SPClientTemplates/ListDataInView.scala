package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataInView extends StObject {
  
  var FilterFields: String = js.native
  
  var FilterLink: String = js.native
  
  var FirstRow: Double = js.native
  
  /** Either "0" or "1" */
  var ForceNoHierarchy: String = js.native
  
  var HierarchyHasIndention: String = js.native
  
  var LastRow: Double = js.native
  
  /** Link to the next page  (not defined if not available) */
  var NextHref: String = js.native
  
  /** Link to the previous page (not defined if not available) */
  var PrevHref: String = js.native
  
  var Row: js.Array[Item] = js.native
  
  var SortDir: String = js.native
  
  var SortField: String = js.native
}
object ListDataInView {
  
  @scala.inline
  def apply(
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
  implicit class ListDataInViewMutableBuilder[Self <: ListDataInView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFields(value: String): Self = StObject.set(x, "FilterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLink(value: String): Self = StObject.set(x, "FilterLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRow(value: Double): Self = StObject.set(x, "FirstRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceNoHierarchy(value: String): Self = StObject.set(x, "ForceNoHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyHasIndention(value: String): Self = StObject.set(x, "HierarchyHasIndention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRow(value: Double): Self = StObject.set(x, "LastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextHref(value: String): Self = StObject.set(x, "NextHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevHref(value: String): Self = StObject.set(x, "PrevHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: js.Array[Item]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVarargs(value: Item*): Self = StObject.set(x, "Row", js.Array(value :_*))
    
    @scala.inline
    def setSortDir(value: String): Self = StObject.set(x, "SortDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "SortField", value.asInstanceOf[js.Any])
  }
}
