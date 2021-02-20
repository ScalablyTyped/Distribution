package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactBootstrapTableNext.anon.Comparator
import typings.reactBootstrapTableNext.anon.DataField
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableChangeState[T] extends StObject {
  
  var cellEdit: DataField = js.native
  
  var data: js.Array[T] = js.native
  
  var filters: StringDictionary[Comparator] = js.native
  
  var page: Double = js.native
  
  var sizePerPage: Double = js.native
  
  var sortField: String = js.native
  
  var sortOrder: asc | desc = js.native
}
object TableChangeState {
  
  @scala.inline
  def apply[T](
    cellEdit: DataField,
    data: js.Array[T],
    filters: StringDictionary[Comparator],
    page: Double,
    sizePerPage: Double,
    sortField: String,
    sortOrder: asc | desc
  ): TableChangeState[T] = {
    val __obj = js.Dynamic.literal(cellEdit = cellEdit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangeState[T]]
  }
  
  @scala.inline
  implicit class TableChangeStateMutableBuilder[Self <: TableChangeState[_], T] (val x: Self with TableChangeState[T]) extends AnyVal {
    
    @scala.inline
    def setCellEdit(value: DataField): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: StringDictionary[Comparator]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
