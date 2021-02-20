package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column[T] extends StObject {
  
  var column: js.Any = js.native
  
  var row: T = js.native
  
  var searchText: String = js.native
  
  var value: js.Any = js.native
}
object Column {
  
  @scala.inline
  def apply[T](column: js.Any, row: T, searchText: String, value: js.Any): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column[_], T] (val x: Self with Column[T]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
