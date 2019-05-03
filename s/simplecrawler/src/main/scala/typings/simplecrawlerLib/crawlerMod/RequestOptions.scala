package typings
package simplecrawlerLib.crawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent
  var headers: simplecrawlerLib.Anon_Accept
  var host: java.lang.String
  var method: HTTPMethods
  var port: js.UndefOr[scala.Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent,
    headers: simplecrawlerLib.Anon_Accept,
    host: java.lang.String,
    method: HTTPMethods,
    port: scala.Int | scala.Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers, host = host, method = method)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

