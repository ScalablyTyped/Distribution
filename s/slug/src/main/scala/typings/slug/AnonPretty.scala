package typings.slug

import typings.slug.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPretty extends js.Object {
  var pretty: Mode
  var rfc3986: Mode
}

object AnonPretty {
  @scala.inline
  def apply(pretty: Mode, rfc3986: Mode): AnonPretty = {
    val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPretty]
  }
}

