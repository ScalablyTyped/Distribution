package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyCodeActionCommandResult extends StObject {
  
  var successMessage: java.lang.String
}
object ApplyCodeActionCommandResult {
  
  inline def apply(successMessage: java.lang.String): ApplyCodeActionCommandResult = {
    val __obj = js.Dynamic.literal(successMessage = successMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyCodeActionCommandResult]
  }
  
  extension [Self <: ApplyCodeActionCommandResult](x: Self) {
    
    inline def setSuccessMessage(value: java.lang.String): Self = StObject.set(x, "successMessage", value.asInstanceOf[js.Any])
  }
}
