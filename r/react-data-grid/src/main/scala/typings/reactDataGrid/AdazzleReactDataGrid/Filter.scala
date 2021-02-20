package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some filter to be applied to the grid's contents
  */
@js.native
trait Filter extends StObject {
  
  /**
    * The key of the column being filtered.
    */
  var columnKey: String = js.native
  
  /**
    * The term to filter by.
    */
  var filterTerm: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(columnKey: String, filterTerm: String): Filter = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTerm(value: String): Self = StObject.set(x, "filterTerm", value.asInstanceOf[js.Any])
  }
}
