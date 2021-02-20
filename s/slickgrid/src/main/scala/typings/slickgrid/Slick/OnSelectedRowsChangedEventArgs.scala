package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSelectedRowsChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var rows: js.Array[Double] = js.native
}
object OnSelectedRowsChangedEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], rows: js.Array[Double]): OnSelectedRowsChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectedRowsChangedEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnSelectedRowsChangedEventArgsMutableBuilder[Self <: OnSelectedRowsChangedEventArgs[_], T /* <: SlickData */] (val x: Self with OnSelectedRowsChangedEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[Double]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Double*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
