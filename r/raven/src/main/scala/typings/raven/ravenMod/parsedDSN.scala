package typings.raven.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parsedDSN extends js.Object {
  var host: String
  var path: String
  var port: Double
  var private_key: String
  var project_id: String
  var protocol: String
  var public_key: String
}

object parsedDSN {
  @scala.inline
  def apply(
    host: String,
    path: String,
    port: Double,
    private_key: String,
    project_id: String,
    protocol: String,
    public_key: String
  ): parsedDSN = {
    val __obj = js.Dynamic.literal(host = host, path = path, port = port, private_key = private_key, project_id = project_id, protocol = protocol, public_key = public_key)
  
    __obj.asInstanceOf[parsedDSN]
  }
}

