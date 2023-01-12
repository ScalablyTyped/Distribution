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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridEventArgs[?], T /* <: SlickData */] (val x: Self & GridEventArgs[T]) extends AnyVal {
    
    inline def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
