package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: String
  /**
    * The array of strings.
    */
  var values: js.Array[String]
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  }
}

