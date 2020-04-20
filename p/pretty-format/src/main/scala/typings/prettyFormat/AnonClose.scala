package typings.prettyFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: String
  var open: String
}

object AnonClose {
  @scala.inline
  def apply(close: String, open: String): AnonClose = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

