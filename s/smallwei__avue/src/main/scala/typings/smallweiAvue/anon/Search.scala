package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search[T] extends StObject {
  
  var disabled: Boolean
  
  var row: T
  
  var search: T
  
  var size: typings.smallweiAvue.Size
}
object Search {
  
  inline def apply[T](disabled: Boolean, row: T, search: T, size: typings.smallweiAvue.Size): Search[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Search[?], T] (val x: Self & Search[T]) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: T): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
