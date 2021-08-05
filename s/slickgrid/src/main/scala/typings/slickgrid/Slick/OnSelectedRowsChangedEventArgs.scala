package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelectedRowsChangedEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var rows: js.Array[Double]
}
object OnSelectedRowsChangedEventArgs {
  
  inline def apply[T /* <: SlickData */](grid: Grid[T], rows: js.Array[Double]): OnSelectedRowsChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectedRowsChangedEventArgs[T]]
  }
  
  extension [Self <: OnSelectedRowsChangedEventArgs[?], T /* <: SlickData */](x: Self & OnSelectedRowsChangedEventArgs[T]) {
    
    inline def setRows(value: js.Array[Double]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Double*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
