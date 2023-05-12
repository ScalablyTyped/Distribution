package typings.smallweiAvue.anon

import typings.smallweiAvue.TableColumnCtx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnColumnIndex[T] extends StObject {
  
  var column: TableColumnCtx[T]
  
  var columnIndex: Double
  
  var row: T
  
  var rowIndex: Double
}
object ColumnColumnIndex {
  
  inline def apply[T](column: TableColumnCtx[T], columnIndex: Double, row: T, rowIndex: Double): ColumnColumnIndex[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnColumnIndex[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnColumnIndex[?], T] (val x: Self & ColumnColumnIndex[T]) extends AnyVal {
    
    inline def setColumn(value: TableColumnCtx[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
