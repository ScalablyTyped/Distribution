package typings.pulumiAws.thingPrincipalAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingPrincipalAttachmentArgs extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: Input[ARN] = js.native
  /**
    * The name of the thing.
    */
  val thing: Input[String] = js.native
}

object ThingPrincipalAttachmentArgs {
  @scala.inline
  def apply(principal: Input[ARN], thing: Input[String]): ThingPrincipalAttachmentArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thing = thing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingPrincipalAttachmentArgs]
  }
  @scala.inline
  implicit class ThingPrincipalAttachmentArgsOps[Self <: ThingPrincipalAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: Input[ARN]): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setThing(value: Input[String]): Self = this.set("thing", value.asInstanceOf[js.Any])
  }
  
}

