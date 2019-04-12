package typings
package atSolidReactLib.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthButtonProps extends LoginButtonProps {
  var login: java.lang.String
  var logout: java.lang.String
}

object AuthButtonProps {
  @scala.inline
  def apply(
    login: java.lang.String,
    logout: java.lang.String,
    popup: java.lang.String,
    className: java.lang.String = null
  ): AuthButtonProps = {
    val __obj = js.Dynamic.literal(login = login, logout = logout, popup = popup)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[AuthButtonProps]
  }
}

