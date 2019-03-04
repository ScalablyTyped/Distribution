package typings
package atPulumiAwsLib.iotThingPrincipalAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingPrincipalAttachmentArgs extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The name of the thing.
    */
  val thing: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ThingPrincipalAttachmentArgs {
  @scala.inline
  def apply(
    principal: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN],
    thing: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ThingPrincipalAttachmentArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thing = thing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThingPrincipalAttachmentArgs]
  }
}

