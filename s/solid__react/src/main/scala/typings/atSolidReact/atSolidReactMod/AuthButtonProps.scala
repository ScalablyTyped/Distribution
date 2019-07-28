package typings.atSolidReact.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthButtonProps extends LoginButtonProps {
  var login: String
  var logout: String
}

object AuthButtonProps {
  @scala.inline
  def apply(login: String, logout: String, popup: String, className: String = null): AuthButtonProps = {
    val __obj = js.Dynamic.literal(login = login, logout = logout, popup = popup)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[AuthButtonProps]
  }
}

