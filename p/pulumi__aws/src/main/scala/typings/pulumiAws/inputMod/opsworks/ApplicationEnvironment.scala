package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationEnvironment extends StObject {
  
  /**
    * Variable name.
    */
  var key: Input[String] = js.native
  
  /**
    * Set visibility of the variable value to `true` or `false`.
    */
  var secure: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Variable value.
    */
  var value: Input[String] = js.native
}
object ApplicationEnvironment {
  
  @scala.inline
  def apply(key: Input[String], value: Input[String]): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
  
  @scala.inline
  implicit class ApplicationEnvironmentMutableBuilder[Self <: ApplicationEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Input[Boolean]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
