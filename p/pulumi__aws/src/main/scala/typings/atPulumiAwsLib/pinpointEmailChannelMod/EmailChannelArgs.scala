package typings
package atPulumiAwsLib.pinpointEmailChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The email address used to send emails from.
    */
  val fromAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

