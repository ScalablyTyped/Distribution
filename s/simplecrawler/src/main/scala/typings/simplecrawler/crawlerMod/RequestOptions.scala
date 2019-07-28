package typings.simplecrawler.crawlerMod

import typings.node.httpMod.Agent
import typings.simplecrawler.Anon_Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: Agent | typings.node.httpsMod.Agent
  var headers: Anon_Accept
  var host: String
  var method: HTTPMethods
  var port: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent,
    headers: Anon_Accept,
    host: String,
    method: HTTPMethods,
    port: Int | Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers, host = host, method = method)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

