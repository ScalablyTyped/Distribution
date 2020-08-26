package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerPredicate extends js.Object {
  /**
    * A list of the conditions that determine when the trigger will fire. Defined below.
    */
  var conditions: Input[js.Array[Input[TriggerPredicateCondition]]] = js.native
  /**
    * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
    */
  var logical: js.UndefOr[Input[String]] = js.native
}

object TriggerPredicate {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[TriggerPredicateCondition]]]): TriggerPredicate = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicate]
  }
  @scala.inline
  implicit class TriggerPredicateOps[Self <: TriggerPredicate] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: Input[TriggerPredicateCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[TriggerPredicateCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogical(value: Input[String]): Self = this.set("logical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogical: Self = this.set("logical", js.undefined)
  }
  
}

