package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionParams[T] extends StObject {
  
  var row: T
  
  var rowIdx: Double
}
object SelectionParams {
  
  @scala.inline
  def apply[T](row: T, rowIdx: Double): SelectionParams[T] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionParams[T]]
  }
  
  @scala.inline
  implicit class SelectionParamsMutableBuilder[Self <: SelectionParams[?], T] (val x: Self & SelectionParams[T]) extends AnyVal {
    
    @scala.inline
    def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
  }
}
