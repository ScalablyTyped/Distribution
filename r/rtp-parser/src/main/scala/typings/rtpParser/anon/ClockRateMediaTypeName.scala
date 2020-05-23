package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.nv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockRateMediaTypeName extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: nv
}

object ClockRateMediaTypeName {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: nv): ClockRateMediaTypeName = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockRateMediaTypeName]
  }
}

