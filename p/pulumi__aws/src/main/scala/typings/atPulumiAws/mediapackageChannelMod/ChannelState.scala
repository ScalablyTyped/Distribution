package typings.atPulumiAws.mediapackageChannelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_IngestEndpointsAnonPasswordUrl
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelState extends js.Object {
  /**
    * The ARN of the channel
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A unique identifier describing the channel
    */
  val channelId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A description of the channel
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A single item list of HLS ingest information
    */
  val hlsIngests: js.UndefOr[Input[js.Array[Input[Anon_IngestEndpointsAnonPasswordUrl]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ChannelState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    channelId: Input[String] = null,
    description: Input[String] = null,
    hlsIngests: Input[js.Array[Input[Anon_IngestEndpointsAnonPasswordUrl]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ChannelState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hlsIngests != null) __obj.updateDynamic("hlsIngests")(hlsIngests.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelState]
  }
}

