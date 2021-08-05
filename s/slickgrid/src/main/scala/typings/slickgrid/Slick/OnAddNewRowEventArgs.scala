package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAddNewRowEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var column: Column[T]
  
  var item: T
}
object OnAddNewRowEventArgs {
  
  inline def apply[T /* <: SlickData */](column: Column[T], grid: Grid[T], item: T): OnAddNewRowEventArgs[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAddNewRowEventArgs[T]]
  }
  
  extension [Self <: OnAddNewRowEventArgs[?], T /* <: SlickData */](x: Self & OnAddNewRowEventArgs[T]) {
    
    inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
