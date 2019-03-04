package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognitoAuthenticateOidc extends js.Object {
  var authenticateCognito: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]
  ] = js.undefined
  var authenticateOidc: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret]
  ] = js.undefined
  var fixedResponse: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ContentTypeMessageBodyStatusCode]] = js.undefined
  var order: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var redirect: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_HostPathPort]] = js.undefined
  var targetGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AuthenticateCognitoAuthenticateOidc {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    authenticateCognito: atPulumiPulumiLib.outputMod.Input[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest] = null,
    authenticateOidc: atPulumiPulumiLib.outputMod.Input[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret] = null,
    fixedResponse: atPulumiPulumiLib.outputMod.Input[Anon_ContentTypeMessageBodyStatusCode] = null,
    order: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    redirect: atPulumiPulumiLib.outputMod.Input[Anon_HostPathPort] = null,
    targetGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

