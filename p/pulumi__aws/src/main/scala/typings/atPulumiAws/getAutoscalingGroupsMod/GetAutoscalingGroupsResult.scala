package typings.atPulumiAws.getAutoscalingGroupsMod

import typings.atPulumiAws.typesOutputMod.GetAutoscalingGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoscalingGroupsResult extends js.Object {
  /**
    * A list of the Autoscaling Groups Arns in the current region.
    */
  val arns: js.Array[String]
  val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[String]
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(
    arns: js.Array[String],
    id: String,
    names: js.Array[String],
    filters: js.Array[GetAutoscalingGroupsFilter] = null
  ): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal(arns = arns, id = id, names = names)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
}

