package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortColumn[T /* <: SlickData */] extends StObject {
  
  var sortAsc: Boolean = js.native
  
  var sortCol: Column[T] = js.native
}
object SortColumn {
  
  @scala.inline
  def apply[T /* <: SlickData */](sortAsc: Boolean, sortCol: Column[T]): SortColumn[T] = {
    val __obj = js.Dynamic.literal(sortAsc = sortAsc.asInstanceOf[js.Any], sortCol = sortCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortColumn[T]]
  }
  
  @scala.inline
  implicit class SortColumnMutableBuilder[Self <: SortColumn[_], T /* <: SlickData */] (val x: Self with SortColumn[T]) extends AnyVal {
    
    @scala.inline
    def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCol(value: Column[T]): Self = StObject.set(x, "sortCol", value.asInstanceOf[js.Any])
  }
}
