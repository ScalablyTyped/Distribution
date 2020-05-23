package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var agent: js.UndefOr[String] = js.undefined
  var bigint: js.UndefOr[String] = js.undefined
  var core: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var solrVersion: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: String = null,
    bigint: String = null,
    core: String = null,
    host: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    solrVersion: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (bigint != null) __obj.updateDynamic("bigint")(bigint.asInstanceOf[js.Any])
    if (core != null) __obj.updateDynamic("core")(core.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (solrVersion != null) __obj.updateDynamic("solrVersion")(solrVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

