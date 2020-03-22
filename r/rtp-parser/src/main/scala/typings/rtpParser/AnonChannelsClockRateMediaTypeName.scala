package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`1`
import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G728
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelsClockRateMediaTypeName extends js.Object {
  var channels: `1`
  var clockRate: `8000`
  var mediaType: A
  var name: G728
}

object AnonChannelsClockRateMediaTypeName {
  @scala.inline
  def apply(channels: `1`, clockRate: `8000`, mediaType: A, name: G728): AnonChannelsClockRateMediaTypeName = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannelsClockRateMediaTypeName]
  }
}

