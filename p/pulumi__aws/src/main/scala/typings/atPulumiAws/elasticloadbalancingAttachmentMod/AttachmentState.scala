package typings.atPulumiAws.elasticloadbalancingAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentState extends js.Object {
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[Input[String]] = js.undefined
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: js.UndefOr[Input[String]] = js.undefined
}

object AttachmentState {
  @scala.inline
  def apply(elb: Input[String] = null, instance: Input[String] = null): AttachmentState = {
    val __obj = js.Dynamic.literal()
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentState]
  }
}

