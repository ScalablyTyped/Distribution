package typings.atPulumiAws.getAutoscalingGroupsMod

import typings.atPulumiAws.typesInputMod.GetAutoscalingGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoscalingGroupsArgs extends js.Object {
  /**
    * A filter used to scope the list e.g. by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
    */
  val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.undefined
}

object GetAutoscalingGroupsArgs {
  @scala.inline
  def apply(filters: js.Array[GetAutoscalingGroupsFilter] = null): GetAutoscalingGroupsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetAutoscalingGroupsArgs]
  }
}

