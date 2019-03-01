package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticateCognitos extends js.Object {
  var authenticateCognitos: js.Array[Anon_AuthenticationRequestExtraParams]
  var authenticateOidcs: js.Array[Anon_AuthenticationRequestExtraParamsAuthorizationEndpoint]
  var fixedResponses: js.Array[Anon_ContentType]
  var order: scala.Double
  var redirects: js.Array[Anon_Host]
  var targetGroupArn: java.lang.String
  var `type`: java.lang.String
}

object Anon_AuthenticateCognitos {
  @scala.inline
  def apply(
    authenticateCognitos: js.Array[Anon_AuthenticationRequestExtraParams],
    authenticateOidcs: js.Array[Anon_AuthenticationRequestExtraParamsAuthorizationEndpoint],
    fixedResponses: js.Array[Anon_ContentType],
    order: scala.Double,
    redirects: js.Array[Anon_Host],
    targetGroupArn: java.lang.String,
    `type`: java.lang.String
  ): Anon_AuthenticateCognitos = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("authenticateCognitos")(authenticateCognitos)
    __obj.updateDynamic("authenticateOidcs")(authenticateOidcs)
    __obj.updateDynamic("fixedResponses")(fixedResponses)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("redirects")(redirects)
    __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[Anon_AuthenticateCognitos]
  }
}

