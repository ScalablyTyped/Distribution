package typings
package reactableLib.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThProperties extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var column: java.lang.String
}

object ThProperties {
  @scala.inline
  def apply(column: java.lang.String, className: java.lang.String = null): ThProperties = {
    val __obj = js.Dynamic.literal(column = column)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ThProperties]
  }
}

