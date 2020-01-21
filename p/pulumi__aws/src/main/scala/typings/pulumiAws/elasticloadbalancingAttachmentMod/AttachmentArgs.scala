package typings.pulumiAws.elasticloadbalancingAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentArgs extends js.Object {
  /**
    * The name of the ELB.
    */
  val elb: Input[String] = js.native
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: Input[String] = js.native
}

object AttachmentArgs {
  @scala.inline
  def apply(elb: Input[String], instance: Input[String]): AttachmentArgs = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentArgs]
  }
}

