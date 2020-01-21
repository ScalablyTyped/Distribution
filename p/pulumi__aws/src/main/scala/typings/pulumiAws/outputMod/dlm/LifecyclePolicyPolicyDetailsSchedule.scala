package typings.pulumiAws.outputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * A mapping of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
    */
  var tagsToAdd: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object LifecyclePolicyPolicyDetailsSchedule {
  @scala.inline
  def apply(
    copyTags: Boolean,
    createRule: LifecyclePolicyPolicyDetailsScheduleCreateRule,
    name: String,
    retainRule: LifecyclePolicyPolicyDetailsScheduleRetainRule,
    tagsToAdd: StringDictionary[js.Any] = null
  ): LifecyclePolicyPolicyDetailsSchedule = {
    val __obj = js.Dynamic.literal(copyTags = copyTags.asInstanceOf[js.Any], createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
  }
}

