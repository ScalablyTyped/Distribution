package typings
package atPulumiAwsLib.pinpointGcmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmChannelState extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  val apiKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object GcmChannelState {
  @scala.inline
  def apply(
    apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): GcmChannelState = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmChannelState]
  }
}

