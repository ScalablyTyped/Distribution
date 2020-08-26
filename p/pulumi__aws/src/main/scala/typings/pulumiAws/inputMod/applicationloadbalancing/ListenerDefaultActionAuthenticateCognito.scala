package typings.pulumiAws.inputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionAuthenticateCognito extends js.Object {
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: Input[String] = js.native
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: Input[String] = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: Input[String] = js.native
}

object ListenerDefaultActionAuthenticateCognito {
  @scala.inline
  def apply(userPoolArn: Input[String], userPoolClientId: Input[String], userPoolDomain: Input[String]): ListenerDefaultActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
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
    def setUserPoolArn(value: Input[String]): Self = this.set("userPoolArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolClientId(value: Input[String]): Self = this.set("userPoolClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolDomain(value: Input[String]): Self = this.set("userPoolDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationRequestExtraParams(value: Input[StringDictionary[Input[String]]]): Self = this.set("authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("authenticationRequestExtraParams", js.undefined)
    @scala.inline
    def setOnUnauthenticatedRequest(value: Input[String]): Self = this.set("onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnauthenticatedRequest: Self = this.set("onUnauthenticatedRequest", js.undefined)
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSessionCookieName(value: Input[String]): Self = this.set("sessionCookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionCookieName: Self = this.set("sessionCookieName", js.undefined)
    @scala.inline
    def setSessionTimeout(value: Input[Double]): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
  
}

