package typings.atPulumiAws.typesOutputMod.alb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleActionAuthenticateCognito extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double
  /**
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: String
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: String
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: String
}

object ListenerRuleActionAuthenticateCognito {
  @scala.inline
  def apply(
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String,
    authenticationRequestExtraParams: StringDictionary[js.Any] = null
  ): ListenerRuleActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams)
    __obj.asInstanceOf[ListenerRuleActionAuthenticateCognito]
  }
}

