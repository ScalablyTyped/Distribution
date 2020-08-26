package typings.pulumiAws.elbAttachmentMod

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
  @scala.inline
  implicit class AttachmentArgsOps[Self <: AttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElb(value: Input[String]): Self = this.set("elb", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: Input[String]): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
  
}

