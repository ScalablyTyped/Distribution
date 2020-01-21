package typings.pulumiAws.thingPrincipalAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingPrincipalAttachmentState extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: js.UndefOr[Input[ARN]] = js.native
  /**
    * The name of the thing.
    */
  val thing: js.UndefOr[Input[String]] = js.native
}

object ThingPrincipalAttachmentState {
  @scala.inline
  def apply(principal: Input[ARN] = null, thing: Input[String] = null): ThingPrincipalAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (thing != null) __obj.updateDynamic("thing")(thing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingPrincipalAttachmentState]
  }
}

