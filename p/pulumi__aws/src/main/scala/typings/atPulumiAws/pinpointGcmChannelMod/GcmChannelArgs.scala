package typings.atPulumiAws.pinpointGcmChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcmChannelArgs extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  val apiKey: Input[String]
  /**
    * The application ID.
    */
  val applicationId: Input[String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object GcmChannelArgs {
  @scala.inline
  def apply(apiKey: Input[String], applicationId: Input[String], enabled: Input[Boolean] = null): GcmChannelArgs = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcmChannelArgs]
  }
}

