package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`2`
import typings.rtpParser.rtpParserNumbers.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  var channels: `2`
  var clockRate: `44100`
  var mediaType: A
  var name: L16
}

object Anon10 {
  @scala.inline
  def apply(channels: `2`, clockRate: `44100`, mediaType: A, name: L16): Anon10 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon10]
  }
}

