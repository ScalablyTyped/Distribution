package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHeaderContextMenuEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var column: Column[T]
}
object OnHeaderContextMenuEventArgs {
  
  inline def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T]): OnHeaderContextMenuEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHeaderContextMenuEventArgs[T]]
  }
  
  extension [Self <: OnHeaderContextMenuEventArgs[?], T /* <: SlickData */](x: Self & OnHeaderContextMenuEventArgs[T]) {
    
    inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
