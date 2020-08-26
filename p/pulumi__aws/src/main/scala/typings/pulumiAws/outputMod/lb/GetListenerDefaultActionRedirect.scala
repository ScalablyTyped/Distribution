package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionRedirect extends js.Object {
  var host: String = js.native
  var path: String = js.native
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  var port: String = js.native
  var protocol: String = js.native
  var query: String = js.native
  var statusCode: String = js.native
}

object GetListenerDefaultActionRedirect {
  @scala.inline
  def apply(host: String, path: String, port: String, protocol: String, query: String, statusCode: String): GetListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionRedirect]
  }
  @scala.inline
  implicit class GetListenerDefaultActionRedirectOps[Self <: GetListenerDefaultActionRedirect] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

