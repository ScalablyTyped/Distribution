package typings
package atPulumiAwsLib.pinpointSmsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

