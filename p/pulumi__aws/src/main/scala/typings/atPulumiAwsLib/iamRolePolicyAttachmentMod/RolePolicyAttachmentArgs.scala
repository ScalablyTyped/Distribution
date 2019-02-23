package typings
package atPulumiAwsLib.iamRolePolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The role the policy should be applied to
    */
  val role: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role]
}

