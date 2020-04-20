package typings.rtpParser

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.reserved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon18 extends js.Object {
  var mediaType: A
  var name: reserved
}

object Anon18 {
  @scala.inline
  def apply(mediaType: A, name: reserved): Anon18 = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon18]
  }
}

