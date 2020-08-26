package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G729
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channels extends js.Object {
  var channels: typings.rtpParser.rtpParserNumbers.`1` = js.native
  var clockRate: `8000` = js.native
  var mediaType: A = js.native
  var name: G729 = js.native
}

object Channels {
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`1`, clockRate: `8000`, mediaType: A, name: G729): Channels = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channels]
  }
  @scala.inline
  implicit class ChannelsOps[Self <: Channels] (val x: Self) extends AnyVal {
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
    def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockRate(value: `8000`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: A): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: G729): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

