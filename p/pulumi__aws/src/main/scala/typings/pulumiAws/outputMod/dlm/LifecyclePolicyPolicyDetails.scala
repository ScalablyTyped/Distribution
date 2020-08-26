package typings.pulumiAws.outputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetails extends js.Object {
  /**
    * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
    */
  var resourceTypes: js.Array[String] = js.native
  /**
    * See the `schedule` configuration block.
    */
  var schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule] = js.native
  /**
    * A map of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
    */
  var targetTags: StringDictionary[String] = js.native
}

object LifecyclePolicyPolicyDetails {
  @scala.inline
  def apply(
    resourceTypes: js.Array[String],
    schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule],
    targetTags: StringDictionary[String]
  ): LifecyclePolicyPolicyDetails = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
  }
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsOps[Self <: LifecyclePolicyPolicyDetails] (val x: Self) extends AnyVal {
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
    def setResourceTypesVarargs(value: String*): Self = this.set("resourceTypes", js.Array(value :_*))
    @scala.inline
    def setResourceTypes(value: js.Array[String]): Self = this.set("resourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedulesVarargs(value: LifecyclePolicyPolicyDetailsSchedule*): Self = this.set("schedules", js.Array(value :_*))
    @scala.inline
    def setSchedules(value: js.Array[LifecyclePolicyPolicyDetailsSchedule]): Self = this.set("schedules", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetTags(value: StringDictionary[String]): Self = this.set("targetTags", value.asInstanceOf[js.Any])
  }
  
}

