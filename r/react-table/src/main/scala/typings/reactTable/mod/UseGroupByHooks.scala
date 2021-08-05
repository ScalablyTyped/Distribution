package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseGroupByHooks[D /* <: js.Object */] extends StObject {
  
  var getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]
}
object UseGroupByHooks {
  
  inline def apply[D /* <: js.Object */](getGroupByToggleProps: js.Array[HeaderGroupPropGetter[D]]): UseGroupByHooks[D] = {
    val __obj = js.Dynamic.literal(getGroupByToggleProps = getGroupByToggleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByHooks[D]]
  }
  
  extension [Self <: UseGroupByHooks[?], D /* <: js.Object */](x: Self & UseGroupByHooks[D]) {
    
    inline def setGetGroupByToggleProps(value: js.Array[HeaderGroupPropGetter[D]]): Self = StObject.set(x, "getGroupByToggleProps", value.asInstanceOf[js.Any])
    
    inline def setGetGroupByTogglePropsVarargs(value: HeaderGroupPropGetter[D]*): Self = StObject.set(x, "getGroupByToggleProps", js.Array(value :_*))
  }
}
