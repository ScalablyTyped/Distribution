package typings
package atPulumiAwsLib.pinpointBaiduChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduChannelArgs extends js.Object {
  /**
    * Platform credential API key from Baidu.
    */
  val apiKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Platform credential Secret key from Baidu.
    */
  val secretKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

