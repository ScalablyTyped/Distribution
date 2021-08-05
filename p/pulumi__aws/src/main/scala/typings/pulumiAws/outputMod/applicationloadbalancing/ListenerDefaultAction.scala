package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultAction extends StObject {
  
  var authenticateCognito: js.UndefOr[ListenerDefaultActionAuthenticateCognito] = js.undefined
  
  var authenticateOidc: js.UndefOr[ListenerDefaultActionAuthenticateOidc] = js.undefined
  
  /**
    * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
    */
  var fixedResponse: js.UndefOr[ListenerDefaultActionFixedResponse] = js.undefined
  
  /**
    * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `targetGroupArn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `targetGroupArn`.
    */
  var forward: js.UndefOr[ListenerDefaultActionForward] = js.undefined
  
  var order: Double
  
  /**
    * Information for creating a redirect action. Required if `type` is `redirect`.
    */
  var redirect: js.UndefOr[ListenerDefaultActionRedirect] = js.undefined
  
  /**
    * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
    */
  var `type`: String
}
object ListenerDefaultAction {
  
  inline def apply(order: Double, `type`: String): ListenerDefaultAction = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultAction]
  }
  
  extension [Self <: ListenerDefaultAction](x: Self) {
    
    inline def setAuthenticateCognito(value: ListenerDefaultActionAuthenticateCognito): Self = StObject.set(x, "authenticateCognito", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateCognitoUndefined: Self = StObject.set(x, "authenticateCognito", js.undefined)
    
    inline def setAuthenticateOidc(value: ListenerDefaultActionAuthenticateOidc): Self = StObject.set(x, "authenticateOidc", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateOidcUndefined: Self = StObject.set(x, "authenticateOidc", js.undefined)
    
    inline def setFixedResponse(value: ListenerDefaultActionFixedResponse): Self = StObject.set(x, "fixedResponse", value.asInstanceOf[js.Any])
    
    inline def setFixedResponseUndefined: Self = StObject.set(x, "fixedResponse", js.undefined)
    
    inline def setForward(value: ListenerDefaultActionForward): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: ListenerDefaultActionRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
