package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParameters extends js.Object {
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
  def apply(
    automationParameters: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = null,
    lambdaParameters: MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = null,
    runCommandParameters: MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters = null,
    stepFunctionsParameters: MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters = null
  ): MaintenanceWindowTaskTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    if (automationParameters != null) __obj.updateDynamic("automationParameters")(automationParameters.asInstanceOf[js.Any])
    if (lambdaParameters != null) __obj.updateDynamic("lambdaParameters")(lambdaParameters.asInstanceOf[js.Any])
    if (runCommandParameters != null) __obj.updateDynamic("runCommandParameters")(runCommandParameters.asInstanceOf[js.Any])
    if (stepFunctionsParameters != null) __obj.updateDynamic("stepFunctionsParameters")(stepFunctionsParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
}

