package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByState[D /* <: js.Object */] extends StObject {
  
  var groupBy: js.Array[IdType[D]] = js.native
}
object UseGroupByState {
  
  @scala.inline
  def apply[D /* <: js.Object */](groupBy: js.Array[IdType[D]]): UseGroupByState[D] = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByState[D]]
  }
  
  @scala.inline
  implicit class UseGroupByStateMutableBuilder[Self <: UseGroupByState[_], D /* <: js.Object */] (val x: Self with UseGroupByState[D]) extends AnyVal {
    
    @scala.inline
    def setGroupBy(value: js.Array[IdType[D]]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByVarargs(value: IdType[D]*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
  }
}
