package typings.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationEnvironment extends StObject {
  
  /**
    * Variable name.
    */
  var key: String
  
  /**
    * Set visibility of the variable value to `true` or `false`.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Variable value.
    */
  var value: String
}
object ApplicationEnvironment {
  
  @scala.inline
  def apply(key: String, value: String): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
  
  @scala.inline
  implicit class ApplicationEnvironmentMutableBuilder[Self <: ApplicationEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
