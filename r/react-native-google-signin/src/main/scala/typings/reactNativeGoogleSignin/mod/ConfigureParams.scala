package typings.reactNativeGoogleSignin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureParams extends js.Object {
  /**
    * ANDROID ONLY. An account name that should be prioritized.
    */
  var accountName: js.UndefOr[String] = js.undefined
  /**
    * ANDROID ONLY. Specifies if the consent prompt should be shown at each login.
    */
  var forceConsentPrompt: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a hosted domain restriction
    */
  var hostedDomain: js.UndefOr[String] = js.undefined
  /**
    * If you want to specify the client ID of type iOS
    */
  var iosClientId: js.UndefOr[String] = js.undefined
  /**
    * Must be true if you wish to access user APIs on behalf of the user from
    * your own server
    */
  var offlineAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * The Google API scopes to request access to. Default is email and profile.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Web client ID from Developer Console. Required for offline access
    */
  var webClientId: js.UndefOr[String] = js.undefined
}

object ConfigureParams {
  @scala.inline
  def apply(
    accountName: String = null,
    forceConsentPrompt: js.UndefOr[Boolean] = js.undefined,
    hostedDomain: String = null,
    iosClientId: String = null,
    offlineAccess: js.UndefOr[Boolean] = js.undefined,
    scopes: js.Array[String] = null,
    webClientId: String = null
  ): ConfigureParams = {
    val __obj = js.Dynamic.literal()
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceConsentPrompt)) __obj.updateDynamic("forceConsentPrompt")(forceConsentPrompt.asInstanceOf[js.Any])
    if (hostedDomain != null) __obj.updateDynamic("hostedDomain")(hostedDomain.asInstanceOf[js.Any])
    if (iosClientId != null) __obj.updateDynamic("iosClientId")(iosClientId.asInstanceOf[js.Any])
    if (!js.isUndefined(offlineAccess)) __obj.updateDynamic("offlineAccess")(offlineAccess.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (webClientId != null) __obj.updateDynamic("webClientId")(webClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureParams]
  }
}

