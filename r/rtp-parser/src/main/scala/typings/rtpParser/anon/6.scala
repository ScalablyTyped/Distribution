package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.MPA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `6` extends js.Object {
  var clockRate: `90000`
  var mediaType: A
  var name: MPA
}

object `6` {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: A, name: MPA): `6` = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
}

