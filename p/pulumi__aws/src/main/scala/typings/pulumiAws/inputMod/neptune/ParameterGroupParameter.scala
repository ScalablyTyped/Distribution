package typings.pulumiAws.inputMod.neptune

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupParameter extends js.Object {
  /**
    * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Neptune parameter.
    */
  var name: Input[String] = js.native
  /**
    * The value of the Neptune parameter.
    */
  var value: Input[String] = js.native
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupParameter]
  }
  @scala.inline
  implicit class ParameterGroupParameterOps[Self <: ParameterGroupParameter] (val x: Self) extends AnyVal {
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
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplyMethod(value: Input[String]): Self = this.set("applyMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyMethod: Self = this.set("applyMethod", js.undefined)
  }
  
}

