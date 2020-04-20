package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServerAddressByClientCIDR helps the client to determine the server address that they should
  * use, depending on the clientCIDR that they match.
  */
trait ServerAddressByClientCIDR extends js.Object {
  /**
    * The CIDR with which clients can match their IP to figure out the server address that they
    * should use.
    */
  val clientCIDR: String
  /**
    * Address of this server, suitable for a client that matches the above CIDR. This can be a
    * hostname, hostname:port, IP or IP:port.
    */
  val serverAddress: String
}

object ServerAddressByClientCIDR {
  @scala.inline
  def apply(clientCIDR: String, serverAddress: String): ServerAddressByClientCIDR = {
    val __obj = js.Dynamic.literal(clientCIDR = clientCIDR.asInstanceOf[js.Any], serverAddress = serverAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerAddressByClientCIDR]
  }
}

