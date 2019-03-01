package typings
package atPulumiAwsLib.mediapackageChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelArgs extends js.Object {
  /**
    * A unique identifier describing the channel
    */
  val channelId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A description of the channel
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ChannelArgs {
  @scala.inline
  def apply(
    channelId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ChannelArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelArgs]
  }
}

