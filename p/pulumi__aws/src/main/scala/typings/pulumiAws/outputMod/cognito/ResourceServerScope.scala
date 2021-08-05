package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServerScope extends StObject {
  
  /**
    * The scope description.
    */
  var scopeDescription: String
  
  /**
    * The scope name.
    */
  var scopeName: String
}
object ResourceServerScope {
  
  inline def apply(scopeDescription: String, scopeName: String): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
  
  extension [Self <: ResourceServerScope](x: Self) {
    
    inline def setScopeDescription(value: String): Self = StObject.set(x, "scopeDescription", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
  }
}
