package typings.socks.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a remote host
  */
trait SocksRemoteHost extends js.Object {
  var host: String
  var port: Double
}

object SocksRemoteHost {
  @scala.inline
  def apply(host: String, port: Double): SocksRemoteHost = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[SocksRemoteHost]
  }
}

