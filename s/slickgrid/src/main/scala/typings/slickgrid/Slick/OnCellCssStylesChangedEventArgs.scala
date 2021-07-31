package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCellCssStylesChangedEventArgs[T /* <: SlickData */]
  extends StObject
     with GridEventArgs[T] {
  
  var hash: CellCssStylesHash
  
  var key: String
}
object OnCellCssStylesChangedEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](grid: Grid[T], hash: CellCssStylesHash, key: String): OnCellCssStylesChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellCssStylesChangedEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnCellCssStylesChangedEventArgsMutableBuilder[Self <: OnCellCssStylesChangedEventArgs[?], T /* <: SlickData */] (val x: Self & OnCellCssStylesChangedEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setHash(value: CellCssStylesHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
