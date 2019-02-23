package typings
package atPulumiAwsLib.iamRolePolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The role the policy should be applied to
    */
  val role: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role]] = js.undefined
}

