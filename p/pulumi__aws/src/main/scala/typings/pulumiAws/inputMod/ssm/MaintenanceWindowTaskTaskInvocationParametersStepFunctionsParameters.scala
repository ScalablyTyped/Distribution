package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var input: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the STEP_FUNCTION task.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters {
  @scala.inline
  def apply(input: Input[String] = null, name: Input[String] = null): MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]
  }
}

