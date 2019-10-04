package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParameters extends js.Object {
  /**
    * The parameters for an AUTOMATION task type. Documented below.
    */
  var automationParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] = js.undefined
  /**
    * The parameters for a LAMBDA task type. Documented below.
    */
  var lambdaParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters] = js.undefined
  /**
    * The parameters for a RUN_COMMAND task type. Documented below.
    */
  var runCommandParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters] = js.undefined
  /**
    * The parameters for a STEP_FUNCTIONS task type. Documented below.
    */
  var stepFunctionsParameters: js.UndefOr[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters] = js.undefined
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
    if (automationParameters != null) __obj.updateDynamic("automationParameters")(automationParameters)
    if (lambdaParameters != null) __obj.updateDynamic("lambdaParameters")(lambdaParameters)
    if (runCommandParameters != null) __obj.updateDynamic("runCommandParameters")(runCommandParameters)
    if (stepFunctionsParameters != null) __obj.updateDynamic("stepFunctionsParameters")(stepFunctionsParameters)
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
}

