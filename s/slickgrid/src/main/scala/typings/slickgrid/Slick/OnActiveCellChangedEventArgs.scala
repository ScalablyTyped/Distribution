package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnActiveCellChangedEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var cell: Double
  
  var row: Double
}
object OnActiveCellChangedEventArgs {
  
  inline def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnActiveCellChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnActiveCellChangedEventArgs[T]]
  }
  
  extension [Self <: OnActiveCellChangedEventArgs[?], T /* <: SlickData */](x: Self & OnActiveCellChangedEventArgs[T]) {
    
    inline def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
