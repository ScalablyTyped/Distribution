package typings.atPulumiAws.typesInputMod.lbNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleAction extends js.Object {
  /**
    * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
    */
  var authenticateCognito: js.UndefOr[Input[ListenerRuleActionAuthenticateCognito]] = js.undefined
  /**
    * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
    */
  var authenticateOidc: js.UndefOr[Input[ListenerRuleActionAuthenticateOidc]] = js.undefined
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerRuleActionFixedResponse]] = js.undefined
  var order: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerRuleActionRedirect]] = js.undefined
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String]
}

object ListenerRuleAction {
  @scala.inline
  def apply(
    `type`: Input[String],
    authenticateCognito: Input[ListenerRuleActionAuthenticateCognito] = null,
    authenticateOidc: Input[ListenerRuleActionAuthenticateOidc] = null,
    fixedResponse: Input[ListenerRuleActionFixedResponse] = null,
    order: Input[Double] = null,
    redirect: Input[ListenerRuleActionRedirect] = null,
    targetGroupArn: Input[String] = null
  ): ListenerRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito.asInstanceOf[js.Any])
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc.asInstanceOf[js.Any])
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleAction]
  }
}

