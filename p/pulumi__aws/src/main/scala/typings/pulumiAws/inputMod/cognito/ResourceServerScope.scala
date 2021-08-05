package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServerScope extends StObject {
  
  /**
    * The scope description.
    */
  var scopeDescription: Input[String]
  
  /**
    * The scope name.
    */
  var scopeName: Input[String]
}
object ResourceServerScope {
  
  inline def apply(scopeDescription: Input[String], scopeName: Input[String]): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
  
  extension [Self <: ResourceServerScope](x: Self) {
    
    inline def setScopeDescription(value: Input[String]): Self = StObject.set(x, "scopeDescription", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: Input[String]): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}
