package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type. Documented below.
    */
  var automationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]] = js.native
  /**
    * The parameters for a LAMBDA task type. Documented below.
    */
  var lambdaParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]] = js.native
  /**
    * The parameters for a RUN_COMMAND task type. Documented below.
    */
  var runCommandParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]] = js.native
  /**
    * The parameters for a STEP_FUNCTIONS task type. Documented below.
    */
  var stepFunctionsParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParameters {
  @scala.inline
  def apply(
    automationParameters: Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] = null,
    lambdaParameters: Input[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters] = null,
    runCommandParameters: Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] = null,
    stepFunctionsParameters: Input[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters] = null
  ): MaintenanceWindowTaskTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    if (automationParameters != null) __obj.updateDynamic("automationParameters")(automationParameters.asInstanceOf[js.Any])
    if (lambdaParameters != null) __obj.updateDynamic("lambdaParameters")(lambdaParameters.asInstanceOf[js.Any])
    if (runCommandParameters != null) __obj.updateDynamic("runCommandParameters")(runCommandParameters.asInstanceOf[js.Any])
    if (stepFunctionsParameters != null) __obj.updateDynamic("stepFunctionsParameters")(stepFunctionsParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
}

