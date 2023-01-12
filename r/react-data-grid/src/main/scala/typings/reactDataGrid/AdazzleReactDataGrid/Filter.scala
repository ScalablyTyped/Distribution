package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some filter to be applied to the grid's contents
  */
trait Filter extends StObject {
  
  /**
    * The key of the column being filtered.
    */
  var columnKey: String
  
  /**
    * The term to filter by.
    */
  var filterTerm: String
}
object Filter {
  
  inline def apply(columnKey: String, filterTerm: String): Filter = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setFilterTerm(value: String): Self = StObject.set(x, "filterTerm", value.asInstanceOf[js.Any])
  }
}
