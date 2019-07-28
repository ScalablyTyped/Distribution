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
    val __obj = js.Dynamic.literal(host = host, identity = identity, isSecure = isSecure, port = port, prefix = prefix)
  
    __obj.asInstanceOf[GetGlobalConfig]
  }
}

