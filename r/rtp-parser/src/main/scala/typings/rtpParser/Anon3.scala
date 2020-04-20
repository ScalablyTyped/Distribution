package typings.rtpParser

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.CelB
import typings.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: CelB
}

object Anon3 {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: CelB): Anon3 = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

