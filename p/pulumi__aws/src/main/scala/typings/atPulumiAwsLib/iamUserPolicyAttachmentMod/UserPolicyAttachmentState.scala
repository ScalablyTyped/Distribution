package typings
package atPulumiAwsLib.iamUserPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The user the policy should be applied to
    */
  val user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.iamUserMod.User]] = js.undefined
}

