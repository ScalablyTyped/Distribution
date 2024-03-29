package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationEnvironment extends StObject {
  
  /**
    * Variable name.
    */
  var key: Input[String]
  
  /**
    * Set visibility of the variable value to `true` or `false`.
    */
  var secure: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Variable value.
    */
  var value: Input[String]
}
object ApplicationEnvironment {
  
  inline def apply(key: Input[String], value: Input[String]): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
  
  extension [Self <: ApplicationEnvironment](x: Self) {
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Input[Boolean]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
