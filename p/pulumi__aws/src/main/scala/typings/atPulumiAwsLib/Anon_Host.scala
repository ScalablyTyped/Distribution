package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: java.lang.String
  var statusCode: java.lang.String
}

object Anon_Host {
  @scala.inline
  def apply(
    host: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    query: java.lang.String,
    statusCode: java.lang.String
  ): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_Host]
  }
}

