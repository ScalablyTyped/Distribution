package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`11025`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsClockRateMediaType extends js.Object {
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  var clockRate: `11025`
  var mediaType: A
  var name: DVI4
}

object ChannelsClockRateMediaType {
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`1`, clockRate: `11025`, mediaType: A, name: DVI4): ChannelsClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsClockRateMediaType]
  }
}

