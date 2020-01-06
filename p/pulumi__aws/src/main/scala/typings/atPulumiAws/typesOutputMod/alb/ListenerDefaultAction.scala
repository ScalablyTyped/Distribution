package typings.atPulumiAws.typesOutputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultAction extends js.Object {
  var authenticateCognito: js.UndefOr[ListenerDefaultActionAuthenticateCognito] = js.native
  var authenticateOidc: js.UndefOr[ListenerDefaultActionAuthenticateOidc] = js.native
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[ListenerDefaultActionFixedResponse] = js.native
  var order: Double = js.native
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[ListenerDefaultActionRedirect] = js.native
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[String] = js.native
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito.asInstanceOf[js.Any])
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc.asInstanceOf[js.Any])
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultAction]
  }
}

