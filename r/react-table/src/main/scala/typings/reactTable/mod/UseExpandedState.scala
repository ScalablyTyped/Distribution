package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseExpandedState[D /* <: js.Object */] extends StObject {
  
  var expanded: Record[IdType[D], Boolean] = js.native
}
object UseExpandedState {
  
  @scala.inline
  def apply[D /* <: js.Object */](expanded: Record[IdType[D], Boolean]): UseExpandedState[D] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseExpandedState[D]]
  }
  
  @scala.inline
  implicit class UseExpandedStateMutableBuilder[Self <: UseExpandedState[_], D /* <: js.Object */] (val x: Self with UseExpandedState[D]) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Record[IdType[D], Boolean]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
