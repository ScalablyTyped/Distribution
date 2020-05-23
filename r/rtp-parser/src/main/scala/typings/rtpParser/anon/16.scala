package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G723
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `16` extends js.Object {
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  var clockRate: `8000`
  var mediaType: A
  var name: G723
}

object `16` {
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`1`, clockRate: `8000`, mediaType: A, name: G723): `16` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
}

