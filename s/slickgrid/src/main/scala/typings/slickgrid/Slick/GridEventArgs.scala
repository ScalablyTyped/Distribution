package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridEventArgs[T /* <: SlickData */] extends StObject {
  
  var grid: Grid[T] = js.native
}
object GridEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T]): GridEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridEventArgs[T]]
  }
  
  @scala.inline
  implicit class GridEventArgsMutableBuilder[Self <: GridEventArgs[_], T /* <: SlickData */] (val x: Self with GridEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
