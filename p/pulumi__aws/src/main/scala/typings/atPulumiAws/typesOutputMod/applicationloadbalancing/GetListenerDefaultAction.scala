package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

