package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognitoAuthenticateOidc extends js.Object {
  var authenticateCognito: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]
  ] = js.undefined
  var authenticateOidc: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientIdClientSecret]
  ] = js.undefined
  var fixedResponse: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ContentTypeMessageBodyStatusCode]] = js.undefined
  var order: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var redirect: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_HostPathPort]] = js.undefined
  var targetGroupArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

