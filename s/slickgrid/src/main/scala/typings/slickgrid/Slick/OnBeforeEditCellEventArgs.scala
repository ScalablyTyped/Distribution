package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeforeEditCellEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var cell: Double
  
  var column: Column[T]
  
  var item: T
  
  var row: Double
}
object OnBeforeEditCellEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, column: Column[T], grid: Grid[T], item: T, row: Double): OnBeforeEditCellEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeEditCellEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnBeforeEditCellEventArgsMutableBuilder[Self <: OnBeforeEditCellEventArgs[?], T /* <: SlickData */] (val x: Self & OnBeforeEditCellEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
