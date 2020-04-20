package typings.sqlBricks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaceholder extends js.Object {
  var placeholder: String
}

object AnonPlaceholder {
  @scala.inline
  def apply(placeholder: String): AnonPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaceholder]
  }
}

