package typings
package atPulumiAwsLib.pinpointGcmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmChannelArgs extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  val apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object GcmChannelArgs {
  @scala.inline
  def apply(
    apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): GcmChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmChannelArgs]
  }
}

