package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row[T] extends StObject {
  
  var row: T
  
  var search: T
  
  var size: typings.smallweiAvue.Size
}
object Row {
  
  inline def apply[T](row: T, search: T, size: typings.smallweiAvue.Size): Row[T] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row[?], T] (val x: Self & Row[T]) extends AnyVal {
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: T): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
