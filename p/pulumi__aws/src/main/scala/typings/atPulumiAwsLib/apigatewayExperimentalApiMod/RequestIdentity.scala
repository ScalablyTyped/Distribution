package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestIdentity extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var caller: js.UndefOr[java.lang.String] = js.undefined
  var cognitoAuthenticationProvider: js.UndefOr[java.lang.String] = js.undefined
  var cognitoAuthenticationType: js.UndefOr[java.lang.String] = js.undefined
  var cognitoIdentityId: js.UndefOr[java.lang.String] = js.undefined
  var cognitoIdentityPoolId: js.UndefOr[java.lang.String] = js.undefined
  var sourceIp: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var userArn: js.UndefOr[java.lang.String] = js.undefined
}

object RequestIdentity {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    apiKey: java.lang.String = null,
    caller: java.lang.String = null,
    cognitoAuthenticationProvider: java.lang.String = null,
    cognitoAuthenticationType: java.lang.String = null,
    cognitoIdentityId: java.lang.String = null,
    cognitoIdentityPoolId: java.lang.String = null,
    sourceIp: java.lang.String = null,
    user: java.lang.String = null,
    userAgent: java.lang.String = null,
    userArn: java.lang.String = null
  ): RequestIdentity = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (caller != null) __obj.updateDynamic("caller")(caller)
    if (cognitoAuthenticationProvider != null) __obj.updateDynamic("cognitoAuthenticationProvider")(cognitoAuthenticationProvider)
    if (cognitoAuthenticationType != null) __obj.updateDynamic("cognitoAuthenticationType")(cognitoAuthenticationType)
    if (cognitoIdentityId != null) __obj.updateDynamic("cognitoIdentityId")(cognitoIdentityId)
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId)
    if (sourceIp != null) __obj.updateDynamic("sourceIp")(sourceIp)
    if (user != null) __obj.updateDynamic("user")(user)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    __obj.asInstanceOf[RequestIdentity]
  }
}

