package typings.scopedHttpClient.mod

import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ClientRequestArgs {
  var encoding: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var httpAgent: js.UndefOr[Agent | Boolean] = js.undefined
  var httpsAgent: js.UndefOr[Agent | Boolean] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
  var slashes: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean = null,
    auth: js.UndefOr[Null | String] = js.undefined,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    defaultPort: Double | String = null,
    encoding: String = null,
    family: js.UndefOr[Double] = js.undefined,
    hash: String = null,
    headers: OutgoingHttpHeaders = null,
    host: js.UndefOr[Null | String] = js.undefined,
    hostname: js.UndefOr[Null | String] = js.undefined,
    httpAgent: Agent | Boolean = null,
    httpsAgent: Agent | Boolean = null,
    localAddress: String = null,
    maxHeaderSize: js.UndefOr[Double] = js.undefined,
    method: String = null,
    path: js.UndefOr[Null | String] = js.undefined,
    pathname: String = null,
    port: js.UndefOr[Null | Double | String] = js.undefined,
    protocol: js.UndefOr[Null | String] = js.undefined,
    query: js.Any = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    slashes: js.Any = null,
    socketPath: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(hostname)) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderSize)) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(protocol)) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.get.asInstanceOf[js.Any])
    if (slashes != null) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

