package typings.pulumiAws.outputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetListenerDefaultAction extends js.Object {
  
  var authenticateCognitos: js.Array[GetListenerDefaultActionAuthenticateCognito] = js.native
  
  var authenticateOidcs: js.Array[GetListenerDefaultActionAuthenticateOidc] = js.native
  
  var fixedResponses: js.Array[GetListenerDefaultActionFixedResponse] = js.native
  
  var order: Double = js.native
  
  var redirects: js.Array[GetListenerDefaultActionRedirect] = js.native
  
  var targetGroupArn: String = js.native
  
  var `type`: String = js.native
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
  implicit class GetListenerDefaultActionOps[Self <: GetListenerDefaultAction] (val x: Self) extends AnyVal {
    
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
    def setAuthenticateCognitosVarargs(value: GetListenerDefaultActionAuthenticateCognito*): Self = this.set("authenticateCognitos", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticateCognitos(value: js.Array[GetListenerDefaultActionAuthenticateCognito]): Self = this.set("authenticateCognitos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateOidcsVarargs(value: GetListenerDefaultActionAuthenticateOidc*): Self = this.set("authenticateOidcs", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticateOidcs(value: js.Array[GetListenerDefaultActionAuthenticateOidc]): Self = this.set("authenticateOidcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedResponsesVarargs(value: GetListenerDefaultActionFixedResponse*): Self = this.set("fixedResponses", js.Array(value :_*))
    
    @scala.inline
    def setFixedResponses(value: js.Array[GetListenerDefaultActionFixedResponse]): Self = this.set("fixedResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectsVarargs(value: GetListenerDefaultActionRedirect*): Self = this.set("redirects", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[GetListenerDefaultActionRedirect]): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArn(value: String): Self = this.set("targetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
