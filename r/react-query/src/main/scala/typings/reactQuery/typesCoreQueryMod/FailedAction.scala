package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.reactQueryStrings.failed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedAction
  extends StObject
     with Action[Any, Any] {
  
  var `type`: failed
}
object FailedAction {
  
  inline def apply(): FailedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("failed")
    __obj.asInstanceOf[FailedAction]
  }
  
  extension [Self <: FailedAction](x: Self) {
    
    inline def setType(value: failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
