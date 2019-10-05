package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters extends js.Object {
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * The parameter name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters {
  @scala.inline
  def apply(input: String = null, name: String = null): MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]
  }
}

