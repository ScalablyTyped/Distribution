package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridEventArgs[T /* <: SlickData */] extends StObject {
  
  var grid: Grid[T]
}
object GridEventArgs {
  
  inline def apply[T /* <: SlickData */](grid: Grid[T]): GridEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridEventArgs[T]]
  }
  
  extension [Self <: GridEventArgs[?], T /* <: SlickData */](x: Self & GridEventArgs[T]) {
    
    inline def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
