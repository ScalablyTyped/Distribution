package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter extends StObject {
  
  /**
    * The parameter name.
    */
  var name: Input[String]
  
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]]
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter {
  
  inline def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  }
  
  extension [Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
