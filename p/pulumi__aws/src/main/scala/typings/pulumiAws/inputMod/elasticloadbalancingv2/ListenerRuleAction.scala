package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleAction extends StObject {
  
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
  implicit class ListenerRuleActionMutableBuilder[Self <: ListenerRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateCognito(value: Input[ListenerRuleActionAuthenticateCognito]): Self = StObject.set(x, "authenticateCognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateCognitoUndefined: Self = StObject.set(x, "authenticateCognito", js.undefined)
    
    @scala.inline
    def setAuthenticateOidc(value: Input[ListenerRuleActionAuthenticateOidc]): Self = StObject.set(x, "authenticateOidc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateOidcUndefined: Self = StObject.set(x, "authenticateOidc", js.undefined)
    
    @scala.inline
    def setFixedResponse(value: Input[ListenerRuleActionFixedResponse]): Self = StObject.set(x, "fixedResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedResponseUndefined: Self = StObject.set(x, "fixedResponse", js.undefined)
    
    @scala.inline
    def setForward(value: Input[ListenerRuleActionForward]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    @scala.inline
    def setOrder(value: Input[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setRedirect(value: Input[ListenerRuleActionRedirect]): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
