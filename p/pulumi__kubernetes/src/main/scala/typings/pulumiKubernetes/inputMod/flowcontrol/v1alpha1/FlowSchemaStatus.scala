package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
@js.native
trait FlowSchemaStatus extends js.Object {
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[FlowSchemaCondition]]]] = js.native
}

object FlowSchemaStatus {
  @scala.inline
  def apply(): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowSchemaStatus]
  }
  @scala.inline
  implicit class FlowSchemaStatusOps[Self <: FlowSchemaStatus] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: Input[FlowSchemaCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[FlowSchemaCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
  
}

