package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDblClickEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var cell: Double
  
  var row: Double
}
object OnDblClickEventArgs {
  
  inline def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnDblClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDblClickEventArgs[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDblClickEventArgs[?], T /* <: SlickData */] (val x: Self & OnDblClickEventArgs[T]) extends AnyVal {
    
    inline def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
