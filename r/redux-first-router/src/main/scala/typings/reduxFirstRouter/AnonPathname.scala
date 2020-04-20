package typings.reduxFirstRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathname extends js.Object {
  var pathname: String
}

object AnonPathname {
  @scala.inline
  def apply(pathname: String): AnonPathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathname]
  }
}

