package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.oidc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcAuthorizer extends js.Object {
  var allowUnauthenticated: js.UndefOr[Boolean] = js.undefined
  var authorizationEndpoint: String
  var clientId: String
  var clientSecret: js.UndefOr[String] = js.undefined
  var issuer: String
  var requestExtraParams: js.UndefOr[Prompt] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var sessionCookieName: js.UndefOr[String] = js.undefined
  var sessionTimeout: js.UndefOr[Double | String] = js.undefined
  var tokenEndpoint: String
  var `type`: oidc
  var useExistingClientSecret: js.UndefOr[Boolean] = js.undefined
  var userInfoEndpoint: String
}

object OidcAuthorizer {
  @scala.inline
  def apply(
    authorizationEndpoint: String,
    clientId: String,
    issuer: String,
    tokenEndpoint: String,
    `type`: oidc,
    userInfoEndpoint: String,
    allowUnauthenticated: js.UndefOr[Boolean] = js.undefined,
    clientSecret: String = null,
    requestExtraParams: Prompt = null,
    scope: String = null,
    sessionCookieName: String = null,
    sessionTimeout: Double | String = null,
    useExistingClientSecret: js.UndefOr[Boolean] = js.undefined
  ): OidcAuthorizer = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnauthenticated)) __obj.updateDynamic("allowUnauthenticated")(allowUnauthenticated.get.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (requestExtraParams != null) __obj.updateDynamic("requestExtraParams")(requestExtraParams.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useExistingClientSecret)) __obj.updateDynamic("useExistingClientSecret")(useExistingClientSecret.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcAuthorizer]
  }
}

