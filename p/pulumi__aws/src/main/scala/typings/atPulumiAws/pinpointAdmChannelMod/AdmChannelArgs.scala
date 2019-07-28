package typings.atPulumiAws.pinpointAdmChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdmChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: Input[String]
  /**
    * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientId: Input[String]
  /**
    * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientSecret: Input[String]
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object AdmChannelArgs {
  @scala.inline
  def apply(
    applicationId: Input[String],
    clientId: Input[String],
    clientSecret: Input[String],
    enabled: Input[Boolean] = null
  ): AdmChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdmChannelArgs]
  }
}

