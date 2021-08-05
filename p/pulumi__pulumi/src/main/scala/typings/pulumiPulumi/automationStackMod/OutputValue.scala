package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputValue extends StObject {
  
  var secret: Boolean
  
  var value: js.Any
}
object OutputValue {
  
  inline def apply(secret: Boolean, value: js.Any): OutputValue = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValue]
  }
  
  extension [Self <: OutputValue](x: Self) {
    
    inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
