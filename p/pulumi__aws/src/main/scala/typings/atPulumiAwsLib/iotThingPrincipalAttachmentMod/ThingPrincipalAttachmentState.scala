package typings
package atPulumiAwsLib.iotThingPrincipalAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingPrincipalAttachmentState extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The name of the thing.
    */
  val thing: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ThingPrincipalAttachmentState {
  @scala.inline
  def apply(
    principal: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    thing: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ThingPrincipalAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (thing != null) __obj.updateDynamic("thing")(thing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingPrincipalAttachmentState]
  }
}

