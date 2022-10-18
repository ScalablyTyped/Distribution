package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.reactQueryStrings.continue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueAction
  extends StObject
     with Action[Any, Any] {
  
  var `type`: continue
}
object ContinueAction {
  
  inline def apply(): ContinueAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("continue")
    __obj.asInstanceOf[ContinueAction]
  }
  
  extension [Self <: ContinueAction](x: Self) {
    
    inline def setType(value: continue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
