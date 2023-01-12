package typings.schematicsAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumError extends StObject {
  
  var maximumError: js.UndefOr[String] = js.undefined
  
  var maximumWarning: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object MaximumError {
  
  inline def apply(`type`: String): MaximumError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaximumError] (val x: Self) extends AnyVal {
    
    inline def setMaximumError(value: String): Self = StObject.set(x, "maximumError", value.asInstanceOf[js.Any])
    
    inline def setMaximumErrorUndefined: Self = StObject.set(x, "maximumError", js.undefined)
    
    inline def setMaximumWarning(value: String): Self = StObject.set(x, "maximumWarning", value.asInstanceOf[js.Any])
    
    inline def setMaximumWarningUndefined: Self = StObject.set(x, "maximumWarning", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
