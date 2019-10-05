package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleAction extends js.Object {
  /**
    * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
    */
  var authenticateCognito: js.UndefOr[ListenerRuleActionAuthenticateCognito] = js.undefined
  /**
    * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
    */
  var authenticateOidc: js.UndefOr[ListenerRuleActionAuthenticateOidc] = js.undefined
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[ListenerRuleActionFixedResponse] = js.undefined
  var order: Double
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[ListenerRuleActionRedirect] = js.undefined
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: String
}

object ListenerRuleAction {
  @scala.inline
  def apply(
    order: Double,
    `type`: String,
    authenticateCognito: ListenerRuleActionAuthenticateCognito = null,
    authenticateOidc: ListenerRuleActionAuthenticateOidc = null,
    fixedResponse: ListenerRuleActionFixedResponse = null,
    redirect: ListenerRuleActionRedirect = null,
    targetGroupArn: String = null
  ): ListenerRuleAction = {
    val __obj = js.Dynamic.literal(order = order)
    __obj.updateDynamic("type")(`type`)
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito)
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc)
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[ListenerRuleAction]
  }
}

