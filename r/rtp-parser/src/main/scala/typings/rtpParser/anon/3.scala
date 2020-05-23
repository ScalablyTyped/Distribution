package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.CelB
import typings.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: CelB
}

object `3` {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: CelB): `3` = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

