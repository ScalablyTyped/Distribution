package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDefaultAction extends js.Object {
  var authenticateCognito: js.UndefOr[ListenerDefaultActionAuthenticateCognito] = js.undefined
  var authenticateOidc: js.UndefOr[ListenerDefaultActionAuthenticateOidc] = js.undefined
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[ListenerDefaultActionFixedResponse] = js.undefined
  var order: Double
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[ListenerDefaultActionRedirect] = js.undefined
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: String
}

object ListenerDefaultAction {
  @scala.inline
  def apply(
    order: Double,
    `type`: String,
    authenticateCognito: ListenerDefaultActionAuthenticateCognito = null,
    authenticateOidc: ListenerDefaultActionAuthenticateOidc = null,
    fixedResponse: ListenerDefaultActionFixedResponse = null,
    redirect: ListenerDefaultActionRedirect = null,
    targetGroupArn: String = null
  ): ListenerDefaultAction = {
    val __obj = js.Dynamic.literal(order = order)
    __obj.updateDynamic("type")(`type`)
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito)
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc)
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[ListenerDefaultAction]
  }
}

