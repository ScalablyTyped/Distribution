package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognitoAuthenticateOidc extends js.Object {
  var authenticateCognito: js.UndefOr[Input[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]] = js.undefined
  var authenticateOidc: js.UndefOr[
    Input[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret]
  ] = js.undefined
  var fixedResponse: js.UndefOr[Input[Anon_ContentTypeMessageBodyStatusCode]] = js.undefined
  var order: js.UndefOr[Input[Double]] = js.undefined
  var redirect: js.UndefOr[Input[Anon_HostPathPort]] = js.undefined
  var targetGroupArn: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_AuthenticateCognitoAuthenticateOidc {
  @scala.inline
  def apply(
    `type`: Input[String],
    authenticateCognito: Input[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest] = null,
    authenticateOidc: Input[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret] = null,
    fixedResponse: Input[Anon_ContentTypeMessageBodyStatusCode] = null,
    order: Input[Double] = null,
    redirect: Input[Anon_HostPathPort] = null,
    targetGroupArn: Input[String] = null
  ): Anon_AuthenticateCognitoAuthenticateOidc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito.asInstanceOf[js.Any])
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc.asInstanceOf[js.Any])
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticateCognitoAuthenticateOidc]
  }
}

