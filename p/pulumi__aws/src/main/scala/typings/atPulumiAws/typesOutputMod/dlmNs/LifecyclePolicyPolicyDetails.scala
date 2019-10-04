package typings.atPulumiAws.typesOutputMod.dlmNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPolicyDetails extends js.Object {
  /**
    * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
    */
  var resourceTypes: js.Array[String]
  /**
    * See the `schedule` configuration block.
    */
  var schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule]
  /**
    * A mapping of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
    */
  var targetTags: StringDictionary[js.Any]
}

object LifecyclePolicyPolicyDetails {
  @scala.inline
  def apply(
    resourceTypes: js.Array[String],
    schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule],
    targetTags: StringDictionary[js.Any]
  ): LifecyclePolicyPolicyDetails = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes, schedules = schedules, targetTags = targetTags)
  
    __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
  }
}

