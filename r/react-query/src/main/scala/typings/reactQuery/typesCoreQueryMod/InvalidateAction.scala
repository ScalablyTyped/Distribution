package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.reactQueryStrings.invalidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateAction
  extends StObject
     with Action[Any, Any] {
  
  var `type`: invalidate
}
object InvalidateAction {
  
  inline def apply(): InvalidateAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("invalidate")
    __obj.asInstanceOf[InvalidateAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidateAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: invalidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
