package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: Input[String] = js.native
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter {
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  }
}

