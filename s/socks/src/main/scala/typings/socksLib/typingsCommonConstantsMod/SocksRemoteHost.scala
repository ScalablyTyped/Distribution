package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a remote host
  */
trait SocksRemoteHost extends js.Object {
  var host: java.lang.String
  var port: scala.Double
}

object SocksRemoteHost {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): SocksRemoteHost = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[SocksRemoteHost]
  }
}

