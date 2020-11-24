package typings.pulumiAws.outputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyPolicyDetailsSchedule extends js.Object {
  
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var copyTags: Boolean = js.native
  
  /**
    * See the `createRule` block. Max of 1 per schedule.
    */
  var createRule: LifecyclePolicyPolicyDetailsScheduleCreateRule = js.native
  
  /**
    * A name for the schedule.
    */
  var name: String = js.native
  
  /**
    * See the `retainRule` block. Max of 1 per schedule.
    */
  var retainRule: LifecyclePolicyPolicyDetailsScheduleRetainRule = js.native
  
  /**
    * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
    */
  var tagsToAdd: js.UndefOr[StringDictionary[String]] = js.native
}
object LifecyclePolicyPolicyDetailsSchedule {
  
  @scala.inline
  def apply(
    copyTags: Boolean,
    createRule: LifecyclePolicyPolicyDetailsScheduleCreateRule,
    name: String,
    retainRule: LifecyclePolicyPolicyDetailsScheduleRetainRule
  ): LifecyclePolicyPolicyDetailsSchedule = {
    val __obj = js.Dynamic.literal(copyTags = copyTags.asInstanceOf[js.Any], createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
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
    def setCopyTags(value: Boolean): Self = this.set("copyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRule(value: LifecyclePolicyPolicyDetailsScheduleCreateRule): Self = this.set("createRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainRule(value: LifecyclePolicyPolicyDetailsScheduleRetainRule): Self = this.set("retainRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToAdd(value: StringDictionary[String]): Self = this.set("tagsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsToAdd: Self = this.set("tagsToAdd", js.undefined)
  }
}
