package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var authorizationEndpoint: Input[String]
  var clientId: Input[String]
  var clientSecret: Input[String]
  var issuer: Input[String]
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.undefined
  var scope: js.UndefOr[Input[String]] = js.undefined
  var sessionCookieName: js.UndefOr[Input[String]] = js.undefined
  var sessionTimeout: js.UndefOr[Input[Double]] = js.undefined
  var tokenEndpoint: Input[String]
  var userInfoEndpoint: Input[String]
}

object Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret {
  @scala.inline
  def apply(
    authorizationEndpoint: Input[String],
    clientId: Input[String],
    clientSecret: Input[String],
    issuer: Input[String],
    tokenEndpoint: Input[String],
    userInfoEndpoint: Input[String],
    authenticationRequestExtraParams: Input[StringDictionary[_]] = null,
    onUnauthenticatedRequest: Input[String] = null,
    scope: Input[String] = null,
    sessionCookieName: Input[String] = null,
    sessionTimeout: Input[Double] = null
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

