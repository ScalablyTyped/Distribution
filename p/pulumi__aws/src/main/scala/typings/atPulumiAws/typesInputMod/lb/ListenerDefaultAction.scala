package typings.atPulumiAws.typesInputMod.lb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultAction extends js.Object {
  var authenticateCognito: js.UndefOr[Input[ListenerDefaultActionAuthenticateCognito]] = js.native
  var authenticateOidc: js.UndefOr[Input[ListenerDefaultActionAuthenticateOidc]] = js.native
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerDefaultActionFixedResponse]] = js.native
  var order: js.UndefOr[Input[Double]] = js.native
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerDefaultActionRedirect]] = js.native
  /**
    * The ARN of the Target Group to which to route traffic. Required if `type` is `forward`.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String] = js.native
}

object ListenerDefaultAction {
  @scala.inline
  def apply(
    `type`: Input[String],
    authenticateCognito: Input[ListenerDefaultActionAuthenticateCognito] = null,
    authenticateOidc: Input[ListenerDefaultActionAuthenticateOidc] = null,
    fixedResponse: Input[ListenerDefaultActionFixedResponse] = null,
    order: Input[Double] = null,
    redirect: Input[ListenerDefaultActionRedirect] = null,
    targetGroupArn: Input[String] = null
  ): ListenerDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (authenticateCognito != null) __obj.updateDynamic("authenticateCognito")(authenticateCognito.asInstanceOf[js.Any])
    if (authenticateOidc != null) __obj.updateDynamic("authenticateOidc")(authenticateOidc.asInstanceOf[js.Any])
    if (fixedResponse != null) __obj.updateDynamic("fixedResponse")(fixedResponse.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultAction]
  }
}

