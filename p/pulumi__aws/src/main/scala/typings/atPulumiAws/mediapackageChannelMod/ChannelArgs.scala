package typings.atPulumiAws.mediapackageChannelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelArgs extends js.Object {
  /**
    * A unique identifier describing the channel
    */
  val channelId: Input[String]
  /**
    * A description of the channel
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ChannelArgs {
  @scala.inline
  def apply(
    channelId: Input[String],
    description: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ChannelArgs = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelArgs]
  }
}

