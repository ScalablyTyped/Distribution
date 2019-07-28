package typings.qDashIo.QioHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var agent: js.Any
  var body: js.Any
  var headers: Headers
  var host: String
  var method: String
  var node: js.Any
  var path: String
  var pathInfo: String
  var port: Double
  var remoteHost: String
  var remotePort: Double
  var scheme: String
  var scriptName: String
  var url: String
  var version: js.Array[String]
}

object Request {
  @scala.inline
  def apply(
    agent: js.Any,
    body: js.Any,
    headers: Headers,
    host: String,
    method: String,
    node: js.Any,
    path: String,
    pathInfo: String,
    port: Double,
    remoteHost: String,
    remotePort: Double,
    scheme: String,
    scriptName: String,
    url: String,
    version: js.Array[String]
  ): Request = {
    val __obj = js.Dynamic.literal(agent = agent, body = body, headers = headers, host = host, method = method, node = node, path = path, pathInfo = pathInfo, port = port, remoteHost = remoteHost, remotePort = remotePort, scheme = scheme, scriptName = scriptName, url = url, version = version)
  
    __obj.asInstanceOf[Request]
  }
}

