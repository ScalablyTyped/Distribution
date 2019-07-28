package typings.rest.interceptorOAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var authorizationUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var oAuthCallback: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.undefined
  var oAuthCallbackName: js.UndefOr[String] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var windowStrategy: js.UndefOr[js.Function1[/* url */ String, DismissWindow]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    authorizationUrl: String = null,
    clientId: String = null,
    oAuthCallback: /* hash */ String => Unit = null,
    oAuthCallbackName: String = null,
    redirectUrl: String = null,
    scope: String = null,
    token: String = null,
    windowStrategy: /* url */ String => DismissWindow = null
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

