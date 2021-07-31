package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter extends StObject {
  
  /**
    * The parameter name.
    */
  var name: String
  
  /**
    * The array of strings.
    */
  var values: js.Array[String]
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
