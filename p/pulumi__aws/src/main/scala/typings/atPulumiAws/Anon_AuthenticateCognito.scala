package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognito extends js.Object {
  var authenticateCognito: js.UndefOr[Anon_AuthenticationRequestExtraParamsKey] = js.undefined
  var authenticateOidc: js.UndefOr[Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId] = js.undefined
  var fixedResponse: js.UndefOr[Anon_ContentTypeMessageBody] = js.undefined
  var order: Double
  var redirect: js.UndefOr[Anon_HostPath] = js.undefined
  var targetGroupArn: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_AuthenticateCognito {
  @scala.inline
  def apply(
    order: Double,
    `type`: String,
    authenticateCognito: Anon_AuthenticationRequestExtraParamsKey = null,
    authenticateOidc: Anon_AuthenticationRequestExtraParamsAuthorizationEndpointClientId = null,
    fixedResponse: Anon_ContentTypeMessageBody = null,
    redirect: Anon_HostPath = null,
    targetGroupArn: String = null
  ): Anon_AuthenticateCognito = {
    val __obj = js.Dynamic.literal(order = order)
    __obj.updateDynamic("type")(`type`)
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito)
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc)
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[Anon_AuthenticateCognito]
  }
}

