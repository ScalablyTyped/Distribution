package typings.slug

import typings.slug.slugMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pretty extends js.Object {
  var pretty: Mode
  var rfc3986: Mode
}

object Anon_Pretty {
  @scala.inline
  def apply(pretty: Mode, rfc3986: Mode): Anon_Pretty = {
    val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Pretty]
  }
}

