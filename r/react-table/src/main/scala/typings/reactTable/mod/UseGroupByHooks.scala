package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByHooks[D /* <: js.Object */] extends StObject {
  
  var getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]] = js.native
}
object UseGroupByHooks {
  
  @scala.inline
  def apply[D /* <: js.Object */](getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
  
  @scala.inline
  implicit class UseGroupByHooksMutableBuilder[Self <: UseGroupByHooks[_], D /* <: js.Object */] (val x: Self with UseGroupByHooks[D]) extends AnyVal {
    
    @scala.inline
    def setGetGroupByToggleProps(value: js.Array[HeaderGroupPropGetter[D]]): Self = StObject.set(x, "getGroupByToggleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGroupByTogglePropsVarargs(value: HeaderGroupPropGetter[D]*): Self = StObject.set(x, "getGroupByToggleProps", js.Array(value :_*))
  }
}
