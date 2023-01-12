package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseExpandedState[D /* <: js.Object */] extends StObject {
  
  var expanded: Record[IdType[D], Boolean]
}
object UseExpandedState {
  
  inline def apply[D /* <: js.Object */](expanded: Record[IdType[D], Boolean]): UseExpandedState[D] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedState[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseExpandedState[?], D /* <: js.Object */] (val x: Self & UseExpandedState[D]) extends AnyVal {
    
    inline def setExpanded(value: Record[IdType[D], Boolean]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
