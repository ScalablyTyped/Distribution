package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`1`
import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G723
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16 extends js.Object {
  var channels: `1`
  var clockRate: `8000`
  var mediaType: A
  var name: G723
}

object Anon16 {
  @scala.inline
  def apply(channels: `1`, clockRate: `8000`, mediaType: A, name: G723): Anon16 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon16]
  }
}

