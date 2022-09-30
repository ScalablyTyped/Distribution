package typings.reactQuery.queryMod

import typings.reactQuery.reactQueryStrings.pause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseAction
  extends StObject
     with Action[Any, Any] {
  
  var `type`: pause
}
object PauseAction {
  
  inline def apply(): PauseAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[PauseAction]
  }
  
  extension [Self <: PauseAction](x: Self) {
    
    inline def setType(value: pause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
