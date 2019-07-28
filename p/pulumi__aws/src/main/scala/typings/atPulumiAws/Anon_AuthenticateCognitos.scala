package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognitos extends js.Object {
  var authenticateCognitos: js.Array[Anon_AuthenticationRequestExtraParams]
  var authenticateOidcs: js.Array[Anon_AuthenticationRequestExtraParamsAuthorizationEndpoint]
  var fixedResponses: js.Array[Anon_ContentType]
  var order: Double
  var redirects: js.Array[Anon_Host]
  var targetGroupArn: String
  var `type`: String
}

object Anon_AuthenticateCognitos {
  @scala.inline
  def apply(
    authenticateCognitos: js.Array[Anon_AuthenticationRequestExtraParams],
    authenticateOidcs: js.Array[Anon_AuthenticationRequestExtraParamsAuthorizationEndpoint],
    fixedResponses: js.Array[Anon_ContentType],
    order: Double,
    redirects: js.Array[Anon_Host],
    targetGroupArn: String,
    `type`: String
  ): Anon_AuthenticateCognitos = {
    val __obj = js.Dynamic.literal(authenticateCognitos = authenticateCognitos, authenticateOidcs = authenticateOidcs, fixedResponses = fixedResponses, order = order, redirects = redirects, targetGroupArn = targetGroupArn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AuthenticateCognitos]
  }
}

