package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters extends StObject {
  
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var input: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the STEP_FUNCTION task.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters {
  
  inline def apply(): MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]
  }
  
  extension [Self <: MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters](x: Self) {
    
    inline def setInput(value: Input[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
