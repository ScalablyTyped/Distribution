package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectEnvironmentEnvironmentVariable extends StObject {
  
  /**
    * The environment variable's name or key.
    */
  var name: Input[String]
  
  /**
    * The type of environment variable. Valid values: `PARAMETER_STORE`, `PLAINTEXT`, and `SECRETS_MANAGER`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The environment variable's value.
    */
  var value: Input[String]
}
object ProjectEnvironmentEnvironmentVariable {
  
  inline def apply(name: Input[String], value: Input[String]): ProjectEnvironmentEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentEnvironmentVariable]
  }
  
  extension [Self <: ProjectEnvironmentEnvironmentVariable](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
