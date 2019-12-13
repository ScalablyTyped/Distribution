package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

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
  val conditions: js.Array[FlowSchemaCondition]
}

object FlowSchemaStatus {
  @scala.inline
  def apply(conditions: js.Array[FlowSchemaCondition]): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlowSchemaStatus]
  }
}

