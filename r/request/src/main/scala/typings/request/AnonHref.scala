package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var pathname: String
}

object AnonHref {
  @scala.inline
  def apply(href: String, pathname: String): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHref]
  }
}

