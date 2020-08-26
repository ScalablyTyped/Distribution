package typings.pulumiAws.outputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionRedirect extends js.Object {
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  var port: js.UndefOr[String] = js.native
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
    */
  var statusCode: String = js.native
}

object ListenerRuleActionRedirect {
  @scala.inline
  def apply(statusCode: String): ListenerRuleActionRedirect = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionRedirect]
  }
  @scala.inline
  implicit class ListenerRuleActionRedirectOps[Self <: ListenerRuleActionRedirect] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

