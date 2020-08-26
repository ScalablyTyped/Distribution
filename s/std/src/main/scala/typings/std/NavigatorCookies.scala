package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorCookies extends js.Object {
  val cookieEnabled: scala.Boolean = js.native
}

object NavigatorCookies {
  @scala.inline
  def apply(cookieEnabled: scala.Boolean): NavigatorCookies = {
    val __obj = js.Dynamic.literal(cookieEnabled = cookieEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorCookies]
  }
  @scala.inline
  implicit class NavigatorCookiesOps[Self <: NavigatorCookies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookieEnabled(value: scala.Boolean): Self = this.set("cookieEnabled", value.asInstanceOf[js.Any])
  }
  
}

