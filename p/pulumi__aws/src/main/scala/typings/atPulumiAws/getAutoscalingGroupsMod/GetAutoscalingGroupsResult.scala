package typings.atPulumiAws.getAutoscalingGroupsMod

import typings.atPulumiAws.typesOutputMod.GetAutoscalingGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoscalingGroupsResult extends js.Object {
  /**
    * A list of the Autoscaling Groups Arns in the current region.
    */
  val arns: js.Array[String] = js.native
  val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[String] = js.native
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(
    arns: js.Array[String],
    id: String,
    names: js.Array[String],
    filters: js.Array[GetAutoscalingGroupsFilter] = null
  ): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
}

