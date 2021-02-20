package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import typings.reactBootstrapTableNext.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortColumn[T /* <: js.Object */] extends StObject {
  
  var sortColumn: ColumnDescription[T, _] = js.native
  
  var sortOrder: SortOrder = js.native
}
object SortColumn {
  
  @scala.inline
  def apply[T /* <: js.Object */](sortColumn: ColumnDescription[T, _], sortOrder: SortOrder): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortColumn = sortColumn.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  
  @scala.inline
  implicit class SortColumnMutableBuilder[Self <: SortColumn[_], T /* <: js.Object */] (val x: Self with SortColumn[T]) extends AnyVal {
    
    @scala.inline
    def setSortColumn(value: ColumnDescription[T, _]): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
