package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.GSM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `17` extends js.Object {
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  var clockRate: `8000`
  var mediaType: A
  var name: GSM
}

object `17` {
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`1`, clockRate: `8000`, mediaType: A, name: GSM): `17` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
}

