package typings
package atPulumiAwsLib.pinpointSmsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

