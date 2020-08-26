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
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterOps[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

