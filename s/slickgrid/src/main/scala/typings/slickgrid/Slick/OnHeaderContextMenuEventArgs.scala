package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHeaderContextMenuEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var column: Column[T] = js.native
}
object OnHeaderContextMenuEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderContextMenuEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderContextMenuEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnHeaderContextMenuEventArgsMutableBuilder[Self <: OnHeaderContextMenuEventArgs[_], T /* <: SlickData */] (val x: Self with OnHeaderContextMenuEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
