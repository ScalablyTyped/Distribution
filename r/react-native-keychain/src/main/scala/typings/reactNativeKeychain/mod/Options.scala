package typings.reactNativeKeychain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var accessControl: js.UndefOr[ACCESS_CONTROL] = js.native
  var accessGroup: js.UndefOr[String] = js.native
  var accessible: js.UndefOr[ACCESSIBLE] = js.native
  var authenticationPrompt: js.UndefOr[String | AuthenticationPrompt] = js.native
  var authenticationType: js.UndefOr[AUTHENTICATION_TYPE] = js.native
  var rules: js.UndefOr[SECURITY_RULES] = js.native
  var securityLevel: js.UndefOr[SECURITY_LEVEL] = js.native
  var service: js.UndefOr[String] = js.native
  var storage: js.UndefOr[STORAGE_TYPE] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAccessControl(value: ACCESS_CONTROL): Self = this.set("accessControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControl: Self = this.set("accessControl", js.undefined)
    @scala.inline
    def setAccessGroup(value: String): Self = this.set("accessGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessGroup: Self = this.set("accessGroup", js.undefined)
    @scala.inline
    def setAccessible(value: ACCESSIBLE): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setAuthenticationPrompt(value: String | AuthenticationPrompt): Self = this.set("authenticationPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationPrompt: Self = this.set("authenticationPrompt", js.undefined)
    @scala.inline
    def setAuthenticationType(value: AUTHENTICATION_TYPE): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    @scala.inline
    def setRules(value: SECURITY_RULES): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSecurityLevel(value: SECURITY_LEVEL): Self = this.set("securityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityLevel: Self = this.set("securityLevel", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setStorage(value: STORAGE_TYPE): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

