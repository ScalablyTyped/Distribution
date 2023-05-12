package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndex[T] extends StObject {
  
  var row: T
  
  var rowIndex: Double
}
object RowIndex {
  
  inline def apply[T](row: T, rowIndex: Double): RowIndex[T] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowIndex[?], T] (val x: Self & RowIndex[T]) extends AnyVal {
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
