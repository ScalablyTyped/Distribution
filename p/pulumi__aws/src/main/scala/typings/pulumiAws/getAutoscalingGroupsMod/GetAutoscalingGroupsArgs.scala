package typings.pulumiAws.getAutoscalingGroupsMod

import typings.pulumiAws.inputMod.GetAutoscalingGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoscalingGroupsArgs extends js.Object {
  /**
    * A filter used to scope the list e.g. by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
    */
  val filters: js.UndefOr[js.Array[GetAutoscalingGroupsFilter]] = js.native
}

object GetAutoscalingGroupsArgs {
  @scala.inline
  def apply(): GetAutoscalingGroupsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoscalingGroupsArgs]
  }
  @scala.inline
  implicit class GetAutoscalingGroupsArgsOps[Self <: GetAutoscalingGroupsArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetAutoscalingGroupsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetAutoscalingGroupsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

