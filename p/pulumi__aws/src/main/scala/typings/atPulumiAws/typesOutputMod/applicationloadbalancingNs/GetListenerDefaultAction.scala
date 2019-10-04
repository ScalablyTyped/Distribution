package typings.atPulumiAws.typesOutputMod.applicationloadbalancingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerDefaultAction extends js.Object {
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
    val __obj = js.Dynamic.literal(authenticateCognitos = authenticateCognitos, authenticateOidcs = authenticateOidcs, fixedResponses = fixedResponses, order = order, redirects = redirects, targetGroupArn = targetGroupArn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetListenerDefaultAction]
  }
}

