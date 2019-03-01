package typings
package atPulumiAwsLib.elasticloadbalancingAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentArgs extends js.Object {
  /**
    * The name of the ELB.
    */
  val elb: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AttachmentArgs {
  @scala.inline
  def apply(
    elb: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instance: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): AttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentArgs]
  }
}

