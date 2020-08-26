package typings.pulumiAws.inputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetailsSchedule extends js.Object {
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var copyTags: js.UndefOr[Input[Boolean]] = js.native
  /**
    * See the `createRule` block. Max of 1 per schedule.
    */
  var createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule] = js.native
  /**
    * A name for the schedule.
    */
  var name: Input[String] = js.native
  /**
    * See the `retainRule` block. Max of 1 per schedule.
    */
  var retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule] = js.native
  /**
    * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
    */
  var tagsToAdd: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object LifecyclePolicyPolicyDetailsSchedule {
  @scala.inline
  def apply(
    createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule],
    name: Input[String],
    retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  ): LifecyclePolicyPolicyDetailsSchedule = {
    val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
  }
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsScheduleOps[Self <: LifecyclePolicyPolicyDetailsSchedule] (val x: Self) extends AnyVal {
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
    def setCreateRule(value: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule]): Self = this.set("createRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetainRule(value: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]): Self = this.set("retainRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyTags(value: Input[Boolean]): Self = this.set("copyTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTags: Self = this.set("copyTags", js.undefined)
    @scala.inline
    def setTagsToAdd(value: Input[StringDictionary[Input[String]]]): Self = this.set("tagsToAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagsToAdd: Self = this.set("tagsToAdd", js.undefined)
  }
  
}

