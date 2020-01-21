package typings.pulumiAws.channelMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mediapackage.ChannelHlsIngest
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelState extends js.Object {
  /**
    * The ARN of the channel
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A unique identifier describing the channel
    */
  val channelId: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the channel
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A single item list of HLS ingest information
    */
  val hlsIngests: js.UndefOr[Input[js.Array[Input[ChannelHlsIngest]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ChannelState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    channelId: Input[String] = null,
    description: Input[String] = null,
    hlsIngests: Input[js.Array[Input[ChannelHlsIngest]]] = null,
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

