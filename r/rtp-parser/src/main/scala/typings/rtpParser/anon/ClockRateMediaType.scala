package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.MPV
import typings.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockRateMediaType extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: MPV
}

object ClockRateMediaType {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: MPV): ClockRateMediaType = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockRateMediaType]
  }
}

