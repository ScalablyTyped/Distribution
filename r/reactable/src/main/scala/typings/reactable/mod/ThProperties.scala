package typings.reactable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThProperties extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var column: String
}

object ThProperties {
  @scala.inline
  def apply(column: String, className: String = null): ThProperties = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThProperties]
  }
}

