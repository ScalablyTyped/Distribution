package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest extends js.Object {
  var authenticationRequestExtraParams: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var onUnauthenticatedRequest: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sessionCookieName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sessionTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var userPoolArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var userPoolClientId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var userPoolDomain: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest {
  @scala.inline
  def apply(
    userPoolArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userPoolClientId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userPoolDomain: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    authenticationRequestExtraParams: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    onUnauthenticatedRequest: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scope: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sessionCookieName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sessionTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userPoolArn")(userPoolArn.asInstanceOf[js.Any])
    __obj.updateDynamic("userPoolClientId")(userPoolClientId.asInstanceOf[js.Any])
    __obj.updateDynamic("userPoolDomain")(userPoolDomain.asInstanceOf[js.Any])
    if (authenticationRequestExtraParams != null) __obj.updateDynamic("authenticationRequestExtraParams")(authenticationRequestExtraParams.asInstanceOf[js.Any])
    if (onUnauthenticatedRequest != null) __obj.updateDynamic("onUnauthenticatedRequest")(onUnauthenticatedRequest.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sessionCookieName != null) __obj.updateDynamic("sessionCookieName")(sessionCookieName.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthenticationRequestExtraParamsKeyOnUnauthenticatedRequest]
  }
}

