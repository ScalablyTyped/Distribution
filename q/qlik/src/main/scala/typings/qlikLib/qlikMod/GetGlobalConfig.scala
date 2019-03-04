package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGlobalConfig extends js.Object {
  var host: java.lang.String
  var identity: java.lang.String
  var isSecure: scala.Boolean
  var port: java.lang.String
  var prefix: java.lang.String
}

object GetGlobalConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    identity: java.lang.String,
    isSecure: scala.Boolean,
    port: java.lang.String,
    prefix: java.lang.String
  ): GetGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host, identity = identity, isSecure = isSecure, port = port, prefix = prefix)
  
    __obj.asInstanceOf[GetGlobalConfig]
  }
}

