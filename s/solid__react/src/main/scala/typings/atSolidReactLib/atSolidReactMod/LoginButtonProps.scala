package typings
package atSolidReactLib.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginButtonProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var popup: java.lang.String
}

object LoginButtonProps {
  @scala.inline
  def apply(popup: java.lang.String, className: java.lang.String = null): LoginButtonProps = {
    val __obj = js.Dynamic.literal(popup = popup)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[LoginButtonProps]
  }
}

