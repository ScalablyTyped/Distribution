package typings
package atPulumiAwsLib.iamUserPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The user the policy should be applied to
    */
  val user: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamUserMod.User]
}

