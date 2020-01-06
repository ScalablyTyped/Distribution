package typings.atPulumiAws.typesInputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
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
    * A mapping of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
    */
  var tagsToAdd: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyPolicyDetailsSchedule {
  @scala.inline
  def apply(
    createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule],
    name: Input[String],
    retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule],
    copyTags: Input[Boolean] = null,
    tagsToAdd: Input[StringDictionary[_]] = null
  ): LifecyclePolicyPolicyDetailsSchedule = {
    val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    if (copyTags != null) __obj.updateDynamic("copyTags")(copyTags.asInstanceOf[js.Any])
    if (tagsToAdd != null) __obj.updateDynamic("tagsToAdd")(tagsToAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
  }
}

