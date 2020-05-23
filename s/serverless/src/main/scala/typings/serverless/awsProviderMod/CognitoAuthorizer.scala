package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.cognito
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthorizer extends js.Object {
  var allowUnauthenticated: js.UndefOr[Boolean] = js.undefined
  var requestExtraParams: js.UndefOr[Prompt] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var sessionCookieName: js.UndefOr[String] = js.undefined
  var sessionTimeout: js.UndefOr[Double | String] = js.undefined
  var `type`: cognito
  var userPoolArn: String
  var userPoolClientId: String
  var userPoolDomain: String
}

object CognitoAuthorizer {
  @scala.inline
  def apply(
    `type`: cognito,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String,
    allowUnauthenticated: js.UndefOr[Boolean] = js.undefined,
    requestExtraParams: Prompt = null,
    scope: String = null,
    sessionCookieName: String = null,
    sessionTimeout: Double | String = null
  ): CognitoAuthorizer = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnauthenticated)) __obj.updateDynamic("allowUnauthenticated")(allowUnauthenticated.get.asInstanceOf[js.Any])
    if (requestExtraParams != null) __obj.updateDynamic("requestExtraParams")(requestExtraParams.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoAuthorizer]
  }
}

