package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleAction extends js.Object {
  
  /**
    * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
    */
  var authenticateCognito: js.UndefOr[Input[ListenerRuleActionAuthenticateCognito]] = js.native
  
  /**
    * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
    */
  var authenticateOidc: js.UndefOr[Input[ListenerRuleActionAuthenticateOidc]] = js.native
  
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerRuleActionFixedResponse]] = js.native
  
  /**
    * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `targetGroupArn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `targetGroupArn`.
    */
  var forward: js.UndefOr[Input[ListenerRuleActionForward]] = js.native
  
  var order: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerRuleActionRedirect]] = js.native
  
  /**
    * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String] = js.native
}
object ListenerRuleAction {
  
  @scala.inline
  def apply(`type`: Input[String]): ListenerRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleAction]
  }
  
  @scala.inline
  implicit class ListenerRuleActionOps[Self <: ListenerRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateCognito(value: Input[ListenerRuleActionAuthenticateCognito]): Self = this.set("authenticateCognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticateCognito: Self = this.set("authenticateCognito", js.undefined)
    
    @scala.inline
    def setAuthenticateOidc(value: Input[ListenerRuleActionAuthenticateOidc]): Self = this.set("authenticateOidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticateOidc: Self = this.set("authenticateOidc", js.undefined)
    
    @scala.inline
    def setFixedResponse(value: Input[ListenerRuleActionFixedResponse]): Self = this.set("fixedResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedResponse: Self = this.set("fixedResponse", js.undefined)
    
    @scala.inline
    def setForward(value: Input[ListenerRuleActionForward]): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    
    @scala.inline
    def setOrder(value: Input[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRedirect(value: Input[ListenerRuleActionRedirect]): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: Input[String]): Self = this.set("targetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("targetGroupArn", js.undefined)
  }
}
