package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListenerDefaultAction extends StObject {
  
  var authenticateCognitos: js.Array[GetListenerDefaultActionAuthenticateCognito]
  
  var authenticateOidcs: js.Array[GetListenerDefaultActionAuthenticateOidc]
  
  var fixedResponses: js.Array[GetListenerDefaultActionFixedResponse]
  
  var order: Double
  
  var redirects: js.Array[GetListenerDefaultActionRedirect]
  
  var targetGroupArn: String
  
  var `type`: String
}
object GetListenerDefaultAction {
  
  @scala.inline
  def apply(
    authenticateCognitos: js.Array[GetListenerDefaultActionAuthenticateCognito],
    authenticateOidcs: js.Array[GetListenerDefaultActionAuthenticateOidc],
    fixedResponses: js.Array[GetListenerDefaultActionFixedResponse],
    order: Double,
    redirects: js.Array[GetListenerDefaultActionRedirect],
    targetGroupArn: String,
    `type`: String
  ): GetListenerDefaultAction = {
    val __obj = js.Dynamic.literal(authenticateCognitos = authenticateCognitos.asInstanceOf[js.Any], authenticateOidcs = authenticateOidcs.asInstanceOf[js.Any], fixedResponses = fixedResponses.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultAction]
  }
  
  @scala.inline
  implicit class GetListenerDefaultActionMutableBuilder[Self <: GetListenerDefaultAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateCognitos(value: js.Array[GetListenerDefaultActionAuthenticateCognito]): Self = StObject.set(x, "authenticateCognitos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateCognitosVarargs(value: GetListenerDefaultActionAuthenticateCognito*): Self = StObject.set(x, "authenticateCognitos", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticateOidcs(value: js.Array[GetListenerDefaultActionAuthenticateOidc]): Self = StObject.set(x, "authenticateOidcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateOidcsVarargs(value: GetListenerDefaultActionAuthenticateOidc*): Self = StObject.set(x, "authenticateOidcs", js.Array(value :_*))
    
    @scala.inline
    def setFixedResponses(value: js.Array[GetListenerDefaultActionFixedResponse]): Self = StObject.set(x, "fixedResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedResponsesVarargs(value: GetListenerDefaultActionFixedResponse*): Self = StObject.set(x, "fixedResponses", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirects(value: js.Array[GetListenerDefaultActionRedirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectsVarargs(value: GetListenerDefaultActionRedirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
