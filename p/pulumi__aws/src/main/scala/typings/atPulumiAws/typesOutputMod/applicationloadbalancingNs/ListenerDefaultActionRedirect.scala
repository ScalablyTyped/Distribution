package typings.atPulumiAws.typesOutputMod.applicationloadbalancingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDefaultActionRedirect extends js.Object {
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  var port: js.UndefOr[String] = js.undefined
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: String
}

object ListenerDefaultActionRedirect {
  @scala.inline
  def apply(
    statusCode: String,
    host: String = null,
    path: String = null,
    port: String = null,
    protocol: String = null,
    query: String = null
  ): ListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[ListenerDefaultActionRedirect]
  }
}

