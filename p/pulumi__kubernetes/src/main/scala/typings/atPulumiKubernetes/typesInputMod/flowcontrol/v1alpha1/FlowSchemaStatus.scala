package typings.atPulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
trait FlowSchemaStatus extends js.Object {
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[FlowSchemaCondition]]]] = js.undefined
}

object FlowSchemaStatus {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[FlowSchemaCondition]]] = null): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaStatus]
  }
}

