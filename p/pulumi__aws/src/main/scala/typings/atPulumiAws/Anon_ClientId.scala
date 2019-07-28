package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var providerName: js.UndefOr[String] = js.undefined
  var serverSideTokenCheck: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClientId {
  @scala.inline
  def apply(
    clientId: String = null,
    providerName: String = null,
    serverSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  ): Anon_ClientId = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    if (!js.isUndefined(serverSideTokenCheck)) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck)
    __obj.asInstanceOf[Anon_ClientId]
  }
}

