package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScrollEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var scrollLeft: Double
  
  var scrollTop: Double
}
object OnScrollEventArgs {
  
  inline def apply[T /* <: SlickData */](grid: Grid[T], scrollLeft: Double, scrollTop: Double): OnScrollEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnScrollEventArgs[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnScrollEventArgs[?], T /* <: SlickData */] (val x: Self & OnScrollEventArgs[T]) extends AnyVal {
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
