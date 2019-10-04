package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends js.Object {
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[String] = js.undefined
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  ] = js.undefined
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  @scala.inline
  def apply(
    documentVersion: String = null,
    parameters: js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter] = null
  ): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
}

