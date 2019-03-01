package typings
package atPulumiAwsLib.pinpointAdmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdmChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientSecret: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object AdmChannelState {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clientSecret: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): AdmChannelState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdmChannelState]
  }
}

