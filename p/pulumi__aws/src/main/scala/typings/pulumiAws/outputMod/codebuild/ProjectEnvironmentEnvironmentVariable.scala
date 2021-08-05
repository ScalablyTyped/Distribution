package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectEnvironmentEnvironmentVariable extends StObject {
  
  /**
    * The environment variable's name or key.
    */
  var name: String
  
  /**
    * The type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`, and `SECRETS_MANAGER`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The environment variable's value.
    */
  var value: String
}
object ProjectEnvironmentEnvironmentVariable {
  
  inline def apply(name: String, value: String): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
  
  extension [Self <: ProjectEnvironmentEnvironmentVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
