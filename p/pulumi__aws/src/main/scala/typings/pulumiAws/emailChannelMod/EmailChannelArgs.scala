package typings.pulumiAws.emailChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The email address used to send emails from.
    */
  val fromAddress: Input[String] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: Input[String] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: Input[String] = js.native
}

object EmailChannelArgs {
  @scala.inline
  def apply(
    applicationId: Input[String],
    fromAddress: Input[String],
    identity: Input[String],
    roleArn: Input[String]
  ): EmailChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], fromAddress = fromAddress.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelArgs]
  }
  @scala.inline
  implicit class EmailChannelArgsOps[Self <: EmailChannelArgs] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromAddress(value: Input[String]): Self = this.set("fromAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Input[String]): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

