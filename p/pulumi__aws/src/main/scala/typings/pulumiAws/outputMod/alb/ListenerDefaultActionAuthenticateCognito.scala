package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionAuthenticateCognito extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String = js.native
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String = js.native
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String = js.native
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double = js.native
  /**
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: String = js.native
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: String = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: String = js.native
}

object ListenerDefaultActionAuthenticateCognito {
  @scala.inline
  def apply(
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): ListenerDefaultActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionAuthenticateCognito]
  }
  @scala.inline
  implicit class ListenerDefaultActionAuthenticateCognitoOps[Self <: ListenerDefaultActionAuthenticateCognito] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnUnauthenticatedRequest(value: String): Self = this.set("onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionCookieName(value: String): Self = this.set("sessionCookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolArn(value: String): Self = this.set("userPoolArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolClientId(value: String): Self = this.set("userPoolClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolDomain(value: String): Self = this.set("userPoolDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = this.set("authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("authenticationRequestExtraParams", js.undefined)
  }
  
}

