package typings.pulumiAws.getAutoscalingGroupsMod

import typings.pulumiAws.outputMod.GetAutoscalingGroupsFilter
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
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[String] = js.native
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String, names: js.Array[String]): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
  @scala.inline
  implicit class GetAutoscalingGroupsResultOps[Self <: GetAutoscalingGroupsResult] (val x: Self) extends AnyVal {
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
    def setArnsVarargs(value: String*): Self = this.set("arns", js.Array(value :_*))
    @scala.inline
    def setArns(value: js.Array[String]): Self = this.set("arns", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetAutoscalingGroupsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetAutoscalingGroupsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

