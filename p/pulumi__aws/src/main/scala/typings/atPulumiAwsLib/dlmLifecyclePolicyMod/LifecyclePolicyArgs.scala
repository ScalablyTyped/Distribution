package typings
package atPulumiAwsLib.dlmLifecyclePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyArgs extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * See the `policy_details` configuration block. Max of 1.
    */
  val policyDetails: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Schedules]
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

