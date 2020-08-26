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
  def apply(): MaintenanceWindowTaskTaskInvocationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomationParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]): Self = this.set("automationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationParameters: Self = this.set("automationParameters", js.undefined)
    @scala.inline
    def setLambdaParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]): Self = this.set("lambdaParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaParameters: Self = this.set("lambdaParameters", js.undefined)
    @scala.inline
    def setRunCommandParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters]): Self = this.set("runCommandParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunCommandParameters: Self = this.set("runCommandParameters", js.undefined)
    @scala.inline
    def setStepFunctionsParameters(value: Input[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]): Self = this.set("stepFunctionsParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepFunctionsParameters: Self = this.set("stepFunctionsParameters", js.undefined)
  }
  
}

