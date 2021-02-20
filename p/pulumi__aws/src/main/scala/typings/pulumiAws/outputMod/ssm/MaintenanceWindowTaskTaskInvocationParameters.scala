package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParameters extends StObject {
  
  /**
    * The parameters for an AUTOMATION task type. Documented below.
    */
  var automationParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] = js.native
  
  /**
    * The parameters for a LAMBDA task type. Documented below.
    */
  var lambdaParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters] = js.native
  
  /**
    * The parameters for a RUN_COMMAND task type. Documented below.
    */
  var runCommandParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] = js.native
  
  /**
    * The parameters for a STEP_FUNCTIONS task type. Documented below.
    */
  var stepFunctionsParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters] = js.native
}
object MaintenanceWindowTaskTaskInvocationParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationParameters(value: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters): Self = StObject.set(x, "automationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationParametersUndefined: Self = StObject.set(x, "automationParameters", js.undefined)
    
    @scala.inline
    def setLambdaParameters(value: MaintenanceWindowTaskTaskInvocationParametersLambdaParameters): Self = StObject.set(x, "lambdaParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaParametersUndefined: Self = StObject.set(x, "lambdaParameters", js.undefined)
    
    @scala.inline
    def setRunCommandParameters(value: MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters): Self = StObject.set(x, "runCommandParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCommandParametersUndefined: Self = StObject.set(x, "runCommandParameters", js.undefined)
    
    @scala.inline
    def setStepFunctionsParameters(value: MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters): Self = StObject.set(x, "stepFunctionsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepFunctionsParametersUndefined: Self = StObject.set(x, "stepFunctionsParameters", js.undefined)
  }
}
