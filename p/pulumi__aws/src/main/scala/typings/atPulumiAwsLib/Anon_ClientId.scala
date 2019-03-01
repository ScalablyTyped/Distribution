package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var providerName: js.UndefOr[java.lang.String] = js.undefined
  var serverSideTokenCheck: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClientId {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    providerName: java.lang.String = null,
    serverSideTokenCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ClientId = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    if (!js.isUndefined(serverSideTokenCheck)) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck)
    __obj.asInstanceOf[Anon_ClientId]
  }
}

