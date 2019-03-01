package typings
package atPulumiAwsLib.iotPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentState extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy]
  ] = js.undefined
  /**
    * The identity to which the policy is attached.
    */
  val target: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
}

object PolicyAttachmentState {
  @scala.inline
  def apply(
    policy: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy] = null,
    target: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null
  ): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentState]
  }
}

