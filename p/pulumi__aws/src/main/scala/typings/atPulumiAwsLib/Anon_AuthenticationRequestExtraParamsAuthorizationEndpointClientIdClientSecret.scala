package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var authorizationEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var clientSecret: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var issuer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var onUnauthenticatedRequest: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sessionCookieName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sessionTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var tokenEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var userInfoEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret {
  @scala.inline
  def apply(
    authorizationEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    clientSecret: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    issuer: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tokenEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userInfoEndpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    authenticationRequestExtraParams: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    onUnauthenticatedRequest: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scope: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sessionCookieName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sessionTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret]
  }
}

