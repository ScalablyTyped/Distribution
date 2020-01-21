package typings.solidReact.mod

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
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthButtonProps]
  }
}

