package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGlobalConfig extends js.Object {
  var host: String
  var identity: String
  var isSecure: Boolean
  var port: String
  var prefix: String
}

object GetGlobalConfig {
  @scala.inline
  def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): GetGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGlobalConfig]
  }
}

