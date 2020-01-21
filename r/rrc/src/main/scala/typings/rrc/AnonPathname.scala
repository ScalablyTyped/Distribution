package typings.rrc

import typings.history.mod.Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathname extends js.Object {
  var pathname: Pathname
}

object AnonPathname {
  @scala.inline
  def apply(pathname: Pathname): AnonPathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPathname]
  }
}

