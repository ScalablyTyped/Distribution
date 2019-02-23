package typings
package atPulumiAwsLib.organizationsPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentState extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

