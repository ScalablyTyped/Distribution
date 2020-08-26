package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: String = js.native
  /**
    * The array of strings.
    */
  var values: js.Array[String] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterOps[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

