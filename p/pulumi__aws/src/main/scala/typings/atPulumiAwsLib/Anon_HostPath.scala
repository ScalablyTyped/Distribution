package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPath extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: java.lang.String
}

object Anon_HostPath {
  @scala.inline
  def apply(
    statusCode: java.lang.String,
    host: java.lang.String = null,
    path: java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    query: java.lang.String = null
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

