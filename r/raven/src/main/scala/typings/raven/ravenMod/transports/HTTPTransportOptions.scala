package typings.raven.ravenMod.transports

import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.raven.ravenStrings.GET
import typings.raven.ravenStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPTransportOptions extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var ca: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[POST | GET] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object HTTPTransportOptions {
  @scala.inline
  def apply(
    agent: Agent = null,
    ca: String = null,
    headers: OutgoingHttpHeaders = null,
    hostname: String = null,
    method: POST | GET = null,
    path: String = null,
    port: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): HTTPTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[HTTPTransportOptions]
  }
}

