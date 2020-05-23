package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.reserved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `18` extends js.Object {
  var mediaType: A
  var name: reserved
}

object `18` {
  @scala.inline
  def apply(mediaType: A, name: reserved): `18` = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
}

