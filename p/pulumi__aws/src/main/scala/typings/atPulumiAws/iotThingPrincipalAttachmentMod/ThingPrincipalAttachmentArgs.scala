package typings.atPulumiAws.iotThingPrincipalAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingPrincipalAttachmentArgs extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: Input[ARN]
  /**
    * The name of the thing.
    */
  val thing: Input[String]
}

object ThingPrincipalAttachmentArgs {
  @scala.inline
  def apply(principal: Input[ARN], thing: Input[String]): ThingPrincipalAttachmentArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thing = thing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThingPrincipalAttachmentArgs]
  }
}

