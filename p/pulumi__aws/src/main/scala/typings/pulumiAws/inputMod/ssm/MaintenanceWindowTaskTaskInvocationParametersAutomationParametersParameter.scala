package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter extends StObject {
  
  /**
    * The parameter name.
    */
  var name: Input[String]
  
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]]
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
  
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
