package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateSortColumn[T /* <: js.Object */] extends StObject {
  
  var state: SortColumn[T]
}
object StateSortColumn {
  
  inline def apply[T /* <: js.Object */](state: SortColumn[T]): StateSortColumn[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateSortColumn[T]]
  }
  
  extension [Self <: StateSortColumn[?], T /* <: js.Object */](x: Self & StateSortColumn[T]) {
    
    inline def setState(value: SortColumn[T]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
