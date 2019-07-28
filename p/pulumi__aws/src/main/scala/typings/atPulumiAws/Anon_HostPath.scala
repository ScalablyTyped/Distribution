package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPath extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var statusCode: String
}

object Anon_HostPath {
  @scala.inline
  def apply(
    statusCode: String,
    host: String = null,
    path: String = null,
    port: String = null,
    protocol: String = null,
    query: String = null
  ): Anon_HostPath = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_HostPath]
  }
}

