package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorCookies extends js.Object {
  val cookieEnabled: scala.Boolean
}

object NavigatorCookies {
  @scala.inline
  def apply(cookieEnabled: scala.Boolean): NavigatorCookies = {
    val __obj = js.Dynamic.literal(cookieEnabled = cookieEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorCookies]
  }
}

