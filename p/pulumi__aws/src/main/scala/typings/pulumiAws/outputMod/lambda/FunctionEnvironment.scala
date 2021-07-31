package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionEnvironment extends StObject {
  
  /**
    * A map that defines environment variables for the Lambda function.
    */
  var variables: js.UndefOr[StringDictionary[String]] = js.undefined
}
object FunctionEnvironment {
  
  @scala.inline
  def apply(): FunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEnvironment]
  }
  
  @scala.inline
  implicit class FunctionEnvironmentMutableBuilder[Self <: FunctionEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
