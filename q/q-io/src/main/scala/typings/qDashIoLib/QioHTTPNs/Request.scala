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
    val __obj = js.Dynamic.literal(agent = agent, body = body, headers = headers, host = host, method = method, node = node, path = path, pathInfo = pathInfo, port = port, remoteHost = remoteHost, remotePort = remotePort, scheme = scheme, scriptName = scriptName, url = url, version = version)
  
    __obj.asInstanceOf[Request]
  }
}

