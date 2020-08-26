package typings.qIo.QioHTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var agent: js.Any = js.native
  var body: js.Any = js.native
  var headers: Headers = js.native
  var host: String = js.native
  var method: String = js.native
  var node: js.Any = js.native
  var path: String = js.native
  var pathInfo: String = js.native
  var port: Double = js.native
  var remoteHost: String = js.native
  var remotePort: Double = js.native
  var scheme: String = js.native
  var scriptName: String = js.native
  var url: String = js.native
  var version: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathInfo = pathInfo.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathInfo(value: String): Self = this.set("pathInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteHost(value: String): Self = this.set("remoteHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: Double): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptName(value: String): Self = this.set("scriptName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionVarargs(value: String*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: js.Array[String]): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

