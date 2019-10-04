package typings.atPulumiAws.typesInputMod.ssmNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var input: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parameter name.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
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

