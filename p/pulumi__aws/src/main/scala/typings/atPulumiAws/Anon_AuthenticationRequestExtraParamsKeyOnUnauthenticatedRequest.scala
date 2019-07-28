package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.undefined
  var scope: js.UndefOr[Input[String]] = js.undefined
  var sessionCookieName: js.UndefOr[Input[String]] = js.undefined
  var sessionTimeout: js.UndefOr[Input[Double]] = js.undefined
  var userPoolArn: Input[String]
  var userPoolClientId: Input[String]
  var userPoolDomain: Input[String]
}

object Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest {
  @scala.inline
  def apply(
    userPoolArn: Input[String],
    userPoolClientId: Input[String],
    userPoolDomain: Input[String],
    authenticationRequestExtraParams: Input[StringDictionary[_]] = null,
    onUnauthenticatedRequest: Input[String] = null,
    scope: Input[String] = null,
    sessionCookieName: Input[String] = null,
    sessionTimeout: Input[Double] = null
  ): Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]
  }
}

