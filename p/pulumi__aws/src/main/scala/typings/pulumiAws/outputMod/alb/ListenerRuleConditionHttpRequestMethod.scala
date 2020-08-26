package typings.pulumiAws.outputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionHttpRequestMethod extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: js.Array[String] = js.native
}

object ListenerRuleConditionHttpRequestMethod {
  @scala.inline
  def apply(values: js.Array[String]): ListenerRuleConditionHttpRequestMethod = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHttpRequestMethod]
  }
  @scala.inline
  implicit class ListenerRuleConditionHttpRequestMethodOps[Self <: ListenerRuleConditionHttpRequestMethod] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

