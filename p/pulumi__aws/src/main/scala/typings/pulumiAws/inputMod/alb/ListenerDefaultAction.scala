package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultAction extends StObject {
  
  var authenticateCognito: js.UndefOr[Input[ListenerDefaultActionAuthenticateCognito]] = js.undefined
  
  var authenticateOidc: js.UndefOr[Input[ListenerDefaultActionAuthenticateOidc]] = js.undefined
  
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[Input[ListenerDefaultActionFixedResponse]] = js.undefined
  
  /**
    * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `targetGroupArn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `targetGroupArn`.
    */
  var forward: js.UndefOr[Input[ListenerDefaultActionForward]] = js.undefined
  
  var order: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[Input[ListenerDefaultActionRedirect]] = js.undefined
  
  /**
    * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
    */
  var targetGroupArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: Input[String]
}
object ListenerDefaultAction {
  
  inline def apply(`type`: Input[String]): ListenerDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultAction]
  }
  
  extension [Self <: ListenerDefaultAction](x: Self) {
    
    inline def setAuthenticateCognito(value: Input[ListenerDefaultActionAuthenticateCognito]): Self = StObject.set(x, "authenticateCognito", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateCognitoUndefined: Self = StObject.set(x, "authenticateCognito", js.undefined)
    
    inline def setAuthenticateOidc(value: Input[ListenerDefaultActionAuthenticateOidc]): Self = StObject.set(x, "authenticateOidc", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateOidcUndefined: Self = StObject.set(x, "authenticateOidc", js.undefined)
    
    inline def setFixedResponse(value: Input[ListenerDefaultActionFixedResponse]): Self = StObject.set(x, "fixedResponse", value.asInstanceOf[js.Any])
    
    inline def setFixedResponseUndefined: Self = StObject.set(x, "fixedResponse", js.undefined)
    
    inline def setForward(value: Input[ListenerDefaultActionForward]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setOrder(value: Input[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRedirect(value: Input[ListenerDefaultActionRedirect]): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
