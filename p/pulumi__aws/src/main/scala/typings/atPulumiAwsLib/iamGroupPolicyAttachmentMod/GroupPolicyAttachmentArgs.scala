package typings
package atPulumiAwsLib.iamGroupPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyAttachmentArgs extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamGroupMod.Group]
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]
}

