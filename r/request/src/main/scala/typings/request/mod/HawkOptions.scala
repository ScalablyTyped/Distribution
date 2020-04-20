package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HawkOptions extends js.Object {
  var credentials: js.Any
}

object HawkOptions {
  @scala.inline
  def apply(credentials: js.Any): HawkOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HawkOptions]
  }
}

