package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends js.Object {
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
      ]
    ]
  ] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  @scala.inline
  def apply(
    documentVersion: Input[String] = null,
    parameters: Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
      ]
    ] = null
  ): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
}

