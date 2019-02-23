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

