package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: Input[String]
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]]
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  }
}

