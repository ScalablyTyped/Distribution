package typings
package atPulumiAwsLib.pinpointAdmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdmChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientSecret: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

