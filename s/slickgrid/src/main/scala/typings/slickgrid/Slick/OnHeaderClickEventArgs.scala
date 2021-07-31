package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHeaderClickEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var column: Column[T]
}
object OnHeaderClickEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderClickEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderClickEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnHeaderClickEventArgsMutableBuilder[Self <: OnHeaderClickEventArgs[?], T /* <: SlickData */] (val x: Self & OnHeaderClickEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
