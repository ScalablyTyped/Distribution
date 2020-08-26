package typings.setCookieParser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var expires: js.UndefOr[Date] = js.native
  var httpOnly: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var name: String = js.native
  var path: js.UndefOr[String] = js.native
  var sameSite: js.UndefOr[String] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var value: String = js.native
}

object Cookie {
  @scala.inline
  def apply(name: String, value: String): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSameSite(value: String): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}

