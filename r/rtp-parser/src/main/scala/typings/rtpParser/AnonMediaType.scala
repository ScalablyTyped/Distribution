package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.AV
import typings.rtpParser.rtpParserStrings.MP2T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaType extends js.Object {
  var clockRate: `90000`
  var mediaType: AV
  var name: MP2T
}

object AnonMediaType {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: AV, name: MP2T): AnonMediaType = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaType]
  }
}

