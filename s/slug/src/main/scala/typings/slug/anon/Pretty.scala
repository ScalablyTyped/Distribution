package typings.slug.anon

import typings.slug.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pretty extends js.Object {
  var pretty: Mode
  var rfc3986: Mode
}

object Pretty {
  @scala.inline
  def apply(pretty: Mode, rfc3986: Mode): Pretty = {
    val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pretty]
  }
}

