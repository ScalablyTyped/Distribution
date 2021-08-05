package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionEnvironment extends StObject {
  
  var variables: StringDictionary[String]
}
object GetFunctionEnvironment {
  
  inline def apply(variables: StringDictionary[String]): GetFunctionEnvironment = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionEnvironment]
  }
  
  extension [Self <: GetFunctionEnvironment](x: Self) {
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
