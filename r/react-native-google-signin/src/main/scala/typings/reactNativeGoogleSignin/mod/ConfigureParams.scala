package typings.reactNativeGoogleSignin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureParams extends js.Object {
  /**
    * ANDROID ONLY. An account name that should be prioritized.
    */
  var accountName: js.UndefOr[String] = js.native
  /**
    * ANDROID ONLY. Specifies if the consent prompt should be shown at each login.
    */
  var forceConsentPrompt: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a hosted domain restriction
    */
  var hostedDomain: js.UndefOr[String] = js.native
  /**
    * If you want to specify the client ID of type iOS
    */
  var iosClientId: js.UndefOr[String] = js.native
  /**
    * Must be true if you wish to access user APIs on behalf of the user from
    * your own server
    */
  var offlineAccess: js.UndefOr[Boolean] = js.native
  /**
    * The Google API scopes to request access to. Default is email and profile.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Web client ID from Developer Console. Required for offline access
    */
  var webClientId: js.UndefOr[String] = js.native
}

object ConfigureParams {
  @scala.inline
  def apply(): ConfigureParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureParams]
  }
  @scala.inline
  implicit class ConfigureParamsOps[Self <: ConfigureParams] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setForceConsentPrompt(value: Boolean): Self = this.set("forceConsentPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceConsentPrompt: Self = this.set("forceConsentPrompt", js.undefined)
    @scala.inline
    def setHostedDomain(value: String): Self = this.set("hostedDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedDomain: Self = this.set("hostedDomain", js.undefined)
    @scala.inline
    def setIosClientId(value: String): Self = this.set("iosClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosClientId: Self = this.set("iosClientId", js.undefined)
    @scala.inline
    def setOfflineAccess(value: Boolean): Self = this.set("offlineAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfflineAccess: Self = this.set("offlineAccess", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setWebClientId(value: String): Self = this.set("webClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebClientId: Self = this.set("webClientId", js.undefined)
  }
  
}

