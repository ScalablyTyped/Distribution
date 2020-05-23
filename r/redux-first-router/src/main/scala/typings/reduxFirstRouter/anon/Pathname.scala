package typings.reduxFirstRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pathname extends js.Object {
  var pathname: String
}

object Pathname {
  @scala.inline
  def apply(pathname: String): Pathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
}

