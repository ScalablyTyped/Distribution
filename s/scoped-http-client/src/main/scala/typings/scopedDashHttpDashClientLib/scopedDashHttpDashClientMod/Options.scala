package typings
package scopedDashHttpDashClientLib.scopedDashHttpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodeLib.httpMod.ClientRequestArgs {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var httpAgent: js.UndefOr[nodeLib.httpMod.Agent | scala.Boolean] = js.undefined
  var httpsAgent: js.UndefOr[nodeLib.httpMod.Agent | scala.Boolean] = js.undefined
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
  var slashes: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _defaultAgent: nodeLib.httpMod.Agent = null,
    agent: nodeLib.httpMod.Agent | scala.Boolean = null,
    auth: java.lang.String = null,
    createConnection: js.Function2[
      /* options */ nodeLib.httpMod.ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ nodeLib.Error, /* socket */ nodeLib.netMod.Socket, scala.Unit], 
      nodeLib.netMod.Socket
    ] = null,
    defaultPort: scala.Double | java.lang.String = null,
    encoding: java.lang.String = null,
    family: scala.Int | scala.Double = null,
    hash: java.lang.String = null,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    httpAgent: nodeLib.httpMod.Agent | scala.Boolean = null,
    httpsAgent: nodeLib.httpMod.Agent | scala.Boolean = null,
    localAddress: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    pathname: java.lang.String = null,
    port: scala.Double | java.lang.String = null,
    protocol: java.lang.String = null,
    query: js.Any = null,
    setHost: js.UndefOr[scala.Boolean] = js.undefined,
    slashes: js.Any = null,
    socketPath: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (createConnection != null) __obj.updateDynamic("createConnection")(createConnection)
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (slashes != null) __obj.updateDynamic("slashes")(slashes)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

