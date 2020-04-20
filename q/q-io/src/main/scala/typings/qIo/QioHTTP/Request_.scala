package typings.qIo.QioHTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request_ extends js.Object {
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

object Request_ {
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
  ): Request_ = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathInfo = pathInfo.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request_]
  }
}

