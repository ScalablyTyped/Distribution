package typings.simplecrawler.crawlerMod

import typings.node.httpMod.Agent
import typings.simplecrawler.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var agent: Agent | typings.node.httpsMod.Agent = js.native
  var headers: Dictkey = js.native
  var host: String = js.native
  var method: HTTPMethods = js.native
  var port: js.UndefOr[Double] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(agent: Agent | typings.node.httpsMod.Agent, headers: Dictkey, host: String, method: HTTPMethods): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Dictkey): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: HTTPMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

