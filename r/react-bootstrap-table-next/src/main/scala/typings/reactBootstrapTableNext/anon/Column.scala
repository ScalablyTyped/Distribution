package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column[T] extends StObject {
  
  var column: js.Any
  
  var row: T
  
  var searchText: String
  
  var value: js.Any
}
object Column {
  
  inline def apply[T](column: js.Any, row: T, searchText: String, value: js.Any): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
  
  extension [Self <: Column[?], T](x: Self & Column[T]) {
    
    inline def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
