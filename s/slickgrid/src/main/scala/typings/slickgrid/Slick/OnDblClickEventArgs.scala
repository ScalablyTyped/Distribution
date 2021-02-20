package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDblClickEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var cell: Double = js.native
  
  var row: Double = js.native
}
object OnDblClickEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](cell: Double, grid: Grid[T], row: Double): OnDblClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDblClickEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnDblClickEventArgsMutableBuilder[Self <: OnDblClickEventArgs[_], T /* <: SlickData */] (val x: Self with OnDblClickEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
