package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parsedDSN extends js.Object {
  var host: java.lang.String
  var path: java.lang.String
  var port: scala.Double
  var private_key: java.lang.String
  var project_id: java.lang.String
  var protocol: java.lang.String
  var public_key: java.lang.String
}

object parsedDSN {
  @scala.inline
  def apply(
    host: java.lang.String,
    path: java.lang.String,
    port: scala.Double,
    private_key: java.lang.String,
    project_id: java.lang.String,
    protocol: java.lang.String,
    public_key: java.lang.String
  ): parsedDSN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("private_key")(private_key)
    __obj.updateDynamic("project_id")(project_id)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("public_key")(public_key)
    __obj.asInstanceOf[parsedDSN]
  }
}

