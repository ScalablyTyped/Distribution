package typings
package reactDashAppLib.reactDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var to: java.lang.String
}

object LinkProps {
  @scala.inline
  def apply(to: java.lang.String, className: java.lang.String = null, onClick: js.Function0[scala.Unit] = null): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[LinkProps]
  }
}

