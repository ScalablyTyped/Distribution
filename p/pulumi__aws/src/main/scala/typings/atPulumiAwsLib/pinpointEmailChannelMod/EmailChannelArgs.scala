package typings
package atPulumiAwsLib.pinpointEmailChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelArgs extends js.Object {
  val applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  val fromAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val identity: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

