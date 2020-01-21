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
}

