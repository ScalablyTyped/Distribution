package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParams extends js.Object {
  var authenticationRequestExtraParams: org.scalablytyped.runtime.StringDictionary[js.Any]
  var onUnauthenticatedRequest: java.lang.String
  var scope: java.lang.String
  var sessionCookieName: java.lang.String
  var sessionTimeout: scala.Double
  var userPoolArn: java.lang.String
  var userPoolClientId: java.lang.String
  var userPoolDomain: java.lang.String
}

object Anon_AuthenticationRequestExtraParams {
  @scala.inline
  def apply(
    authenticationRequestExtraParams: org.scalablytyped.runtime.StringDictionary[js.Any],
    onUnauthenticatedRequest: java.lang.String,
    scope: java.lang.String,
    sessionCookieName: java.lang.String,
    sessionTimeout: scala.Double,
    userPoolArn: java.lang.String,
    userPoolClientId: java.lang.String,
    userPoolDomain: java.lang.String
  ): Anon_AuthenticationRequestExtraParams = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams, onUnauthenticatedRequest = onUnauthenticatedRequest, scope = scope, sessionCookieName = sessionCookieName, sessionTimeout = sessionTimeout, userPoolArn = userPoolArn, userPoolClientId = userPoolClientId, userPoolDomain = userPoolDomain)
  
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParams]
  }
}

