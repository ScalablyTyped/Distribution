package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateOptions extends StObject {
  
  /**
    * Validate only and not trigger UI and Field status update
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ValidateOptions {
  
  inline def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateOptions] (val x: Self) extends AnyVal {
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
