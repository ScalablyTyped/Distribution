package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionSourceIp extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object ListenerRuleConditionSourceIp {
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]]): ListenerRuleConditionSourceIp = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionSourceIp]
  }
  @scala.inline
  implicit class ListenerRuleConditionSourceIpOps[Self <: ListenerRuleConditionSourceIp] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: Input[String]*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

