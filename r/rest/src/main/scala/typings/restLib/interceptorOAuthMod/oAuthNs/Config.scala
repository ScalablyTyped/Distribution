package typings
package restLib.interceptorOAuthMod.oAuthNs

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

