package typings.reactable.reactableMod

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
    val __obj = js.Dynamic.literal(column = column)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ThProperties]
  }
}

