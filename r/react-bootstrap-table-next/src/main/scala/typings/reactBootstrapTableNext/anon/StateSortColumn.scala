package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateSortColumn[T /* <: js.Object */] extends StObject {
  
  var state: SortColumn[T] = js.native
}
object StateSortColumn {
  
  @scala.inline
  def apply[T /* <: js.Object */](state: SortColumn[T]): StateSortColumn[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSortColumn[T]]
  }
  
  @scala.inline
  implicit class StateSortColumnMutableBuilder[Self <: StateSortColumn[_], T /* <: js.Object */] (val x: Self with StateSortColumn[T]) extends AnyVal {
    
    @scala.inline
    def setState(value: SortColumn[T]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
