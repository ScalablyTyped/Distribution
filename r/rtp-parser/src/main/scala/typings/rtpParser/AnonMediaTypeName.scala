package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.H261
import typings.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaTypeName extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: H261
}

object AnonMediaTypeName {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: H261): AnonMediaTypeName = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaTypeName]
  }
}

