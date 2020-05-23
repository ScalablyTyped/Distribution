package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  var mediaType: V
  var name: unassigned
}

object `4` {
  @scala.inline
  def apply(mediaType: V, name: unassigned): `4` = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
}

