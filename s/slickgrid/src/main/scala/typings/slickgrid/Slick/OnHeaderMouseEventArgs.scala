package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHeaderMouseEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var column: Column[T] = js.native
}
object OnHeaderMouseEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderMouseEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderMouseEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnHeaderMouseEventArgsMutableBuilder[Self <: OnHeaderMouseEventArgs[_], T /* <: SlickData */] (val x: Self with OnHeaderMouseEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
