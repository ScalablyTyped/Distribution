package typings.atPulumiAws.typesInputMod.alb

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionAuthenticateOidc extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: Input[String] = js.native
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: Input[String] = js.native
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: Input[String] = js.native
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: Input[String] = js.native
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.native
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: Input[String] = js.native
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: Input[String] = js.native
}

object ListenerDefaultActionAuthenticateOidc {
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
  ): ListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionAuthenticateOidc]
  }
}

