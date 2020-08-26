package typings.reduxAuthWrapper.mod

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthConfig extends js.Object {
  var AuthenticatingComponent: js.UndefOr[ReactType[_]] = js.native
  var wrapperDisplayName: js.UndefOr[String] = js.native
}

object AuthConfig {
  @scala.inline
  def apply(): AuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthConfig]
  }
  @scala.inline
  implicit class AuthConfigOps[Self <: AuthConfig] (val x: Self) extends AnyVal {
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
    def setAuthenticatingComponent(value: ReactType[_]): Self = this.set("AuthenticatingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticatingComponent: Self = this.set("AuthenticatingComponent", js.undefined)
    @scala.inline
    def setWrapperDisplayName(value: String): Self = this.set("wrapperDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperDisplayName: Self = this.set("wrapperDisplayName", js.undefined)
  }
  
}

