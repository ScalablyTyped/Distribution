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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ChannelState {
  @scala.inline
  def apply(): ChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelState]
  }
  @scala.inline
  implicit class ChannelStateOps[Self <: ChannelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setChannelId(value: Input[String]): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHlsIngestsVarargs(value: Input[ChannelHlsIngest]*): Self = this.set("hlsIngests", js.Array(value :_*))
    @scala.inline
    def setHlsIngests(value: Input[js.Array[Input[ChannelHlsIngest]]]): Self = this.set("hlsIngests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsIngests: Self = this.set("hlsIngests", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

