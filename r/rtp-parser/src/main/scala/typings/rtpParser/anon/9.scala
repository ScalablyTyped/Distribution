package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  var channels: typings.rtpParser.rtpParserNumbers.`1` = js.native
  var clockRate: `44100` = js.native
  var mediaType: A = js.native
  var name: L16 = js.native
}

object `9` {
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`1`, clockRate: `44100`, mediaType: A, name: L16): `9` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
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
    def setClockRate(value: `44100`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: A): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: L16): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

