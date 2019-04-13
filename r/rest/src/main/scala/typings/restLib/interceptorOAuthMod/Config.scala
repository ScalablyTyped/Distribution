package typings
package restLib.interceptorOAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var authorizationUrl: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var oAuthCallback: js.UndefOr[js.Function1[/* hash */ java.lang.String, scala.Unit]] = js.undefined
  var oAuthCallbackName: js.UndefOr[java.lang.String] = js.undefined
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var windowStrategy: js.UndefOr[js.Function1[/* url */ java.lang.String, DismissWindow]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    oAuthCallback: /* hash */ java.lang.String => scala.Unit = null,
    oAuthCallbackName: java.lang.String = null,
    redirectUrl: java.lang.String = null,
    scope: java.lang.String = null,
    token: java.lang.String = null,
    windowStrategy: /* url */ java.lang.String => DismissWindow = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (authorizationUrl != null) __obj.updateDynamic("authorizationUrl")(authorizationUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (oAuthCallback != null) __obj.updateDynamic("oAuthCallback")(js.Any.fromFunction1(oAuthCallback))
    if (oAuthCallbackName != null) __obj.updateDynamic("oAuthCallbackName")(oAuthCallbackName)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (token != null) __obj.updateDynamic("token")(token)
    if (windowStrategy != null) __obj.updateDynamic("windowStrategy")(js.Any.fromFunction1(windowStrategy))
    __obj.asInstanceOf[Config]
  }
}

