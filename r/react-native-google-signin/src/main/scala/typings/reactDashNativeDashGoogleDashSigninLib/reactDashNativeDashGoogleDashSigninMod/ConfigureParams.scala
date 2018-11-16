package typings
package reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigureParams extends js.Object {
  /**
       * ANDROID ONLY. An account name that should be prioritized.
       */
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ANDROID ONLY. Specifies if the consent prompt should be shown at each login.
       */
  var forceConsentPrompt: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specifies a hosted domain restriction
       */
  var hostedDomain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If you want to specify the client ID of type iOS
       */
  var iosClientId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Must be true if you wish to access user APIs on behalf of the user from
       * your own server
       */
  var offlineAccess: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The Google API scopes to request access to. Default is email and profile.
       */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Web client ID from Developer Console. Required for offline access
       */
  var webClientId: js.UndefOr[java.lang.String] = js.undefined
}

