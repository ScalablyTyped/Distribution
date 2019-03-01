package typings
package qDashIoLib.QioHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var agent: js.Any
  var body: js.Any
  var headers: Headers
  var host: java.lang.String
  var method: java.lang.String
  var node: js.Any
  var path: java.lang.String
  var pathInfo: java.lang.String
  var port: scala.Double
  var remoteHost: java.lang.String
  var remotePort: scala.Double
  var scheme: java.lang.String
  var scriptName: java.lang.String
  var url: java.lang.String
  var version: js.Array[java.lang.String]
}

object Request {
  @scala.inline
  def apply(
    agent: js.Any,
    body: js.Any,
    headers: Headers,
    host: java.lang.String,
    method: java.lang.String,
    node: js.Any,
    path: java.lang.String,
    pathInfo: java.lang.String,
    port: scala.Double,
    remoteHost: java.lang.String,
    remotePort: scala.Double,
    scheme: java.lang.String,
    scriptName: java.lang.String,
    url: java.lang.String,
    version: js.Array[java.lang.String]
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agent")(agent)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("pathInfo")(pathInfo)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("remoteHost")(remoteHost)
    __obj.updateDynamic("remotePort")(remotePort)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("scriptName")(scriptName)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Request]
  }
}

