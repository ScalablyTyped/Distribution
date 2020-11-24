package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchMatchProps[T /* <: js.Object */] extends js.Object {
  
  var column: ColumnDescription[T, _] = js.native
  
  var row: T = js.native
  
  var searchText: String = js.native
  
  var value: String = js.native
}
object SearchMatchProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](column: ColumnDescription[T, _], row: T, searchText: String, value: String): SearchMatchProps[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMatchProps[T]]
  }
  
  @scala.inline
  implicit class SearchMatchPropsOps[Self <: SearchMatchProps[_], T /* <: js.Object */] (val x: Self with SearchMatchProps[T]) extends AnyVal {
    
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
    def setColumn(value: ColumnDescription[T, _]): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: T): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
