package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: dynamic
}

object Name {
  @scala.inline
  def apply(name: dynamic): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

